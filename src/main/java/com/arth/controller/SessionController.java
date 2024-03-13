
package com.arth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.arth.bean.UserBean;
import com.arth.entity.UsersEntity;
import com.arth.repository.UsersRepository;
import com.arth.service.MailerService;

import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SessionController {

	@Autowired
	UsersRepository urRepo;

	@Autowired
	BCryptPasswordEncoder encodePass;
	
	@Autowired
	MailerService mailerService;

	@GetMapping("/") // url used for accessing
	public String welcome() {
		return "Login"; // jsp file name
	}

	@GetMapping("/signup") // url used for accessing
	public String signUp() {
		return "SignUp"; // jsp file name
	}

	@PostMapping("/saveuser") // url used for accessing
	public String saveUser(UsersEntity user, Model model) {

		if (!user.getPassword().equals(user.getConfirmPassword())) {
			model.addAttribute("conPassErr", "Password and Confirm password must be same");
			return "SignUp";
		}

		user.setRoleId(3);

		// get pass
		String plainPass = user.getPassword();

		// encrypt
		String encodedPassword = encodePass.encode(plainPass);

		// save encrypted data into database
		user.setPassword(encodedPassword);

		urRepo.save(user);
		mailerService.sendWelcomeMail(user.getEmail());
		return "redirect:/login"; // jsp file name

	}

	@GetMapping("/login") // url used for accessing
	public String login() {
		return "Login"; // jsp file name
	}

	@PostMapping("/authentication")
	public String authentication(UsersEntity user, Model model , HttpSession session) {

		UsersEntity loggedInUser = urRepo.findByEmail(user.getEmail());
		session.setAttribute("usrName", loggedInUser);
		session.setMaxInactiveInterval(60*30);

		if (loggedInUser == null) {
			model.addAttribute("Error", "Invalid Credentials");
			return "Login";
		} else if (encodePass.matches(user.getPassword(), loggedInUser.getPassword())) {

			if (loggedInUser.getRoleId() == 1) {
				return "AdminDashboard";
			} else if (loggedInUser.getRoleId() == 3) {
				return "DeveloperDashboard";
			} else if (loggedInUser.getRoleId() == 5) {
				return "ProjectManagerDashboard";
			} else {
				model.addAttribute("Er", "Something went wrong , try again");
				return "Login";
			}

		}
		model.addAttribute("Er", "Something went wrong , try again");
		return "Login";

	}

	@GetMapping("/forgetpassword") // url
	public String forgetPassword() {
		return "ForgetPassword"; // jsp
	}

	@PostMapping("/sendotpforrecoverpassword")
	public String sendOtpForRecoverPassword(UsersEntity user) {

		UsersEntity dbUser = urRepo.findByEmail(user.getEmail());

		if (dbUser == null) {

			return "RecoverPassword";
		} else {

			// generate otp
			int otp = (int)(Math.random()*1000000);

			// send otp to user via mail
			System.out.println("OTP -> " + otp);
			mailerService.sendMailForOTP(user.getEmail(), otp);

			// set otp in database
			dbUser.setOtp(otp);
			urRepo.save(dbUser);

			return "RecoverPassword";
		}
	}

	@PostMapping("/recoverpassword")
	public String recoverPassword(UsersEntity user, Model model) {

		UsersEntity dbUser = urRepo.findByEmail(user.getEmail());

		if (!user.getPassword().equals(user.getConfirmPassword())) {
			model.addAttribute("conPassErr", "Password and Confirm password must be same");
			return "RecoverPassword";
		} else {

			if (dbUser == null || dbUser.getOtp() == -1 || user.getOtp().intValue() != dbUser.getOtp().intValue()) {
				model.addAttribute("otpEmailError", "Invalid OTP or email");
				return "RecoverPassword";
			}else {
				
				// email and otp correct
				
				//take plain pass
				String plainPass = user.getPassword();
				
				//encrypt it
				String encPass =  encodePass.encode(plainPass);
				
				//save password into database
				dbUser.setPassword(encPass);
				dbUser.setOtp(-1);
				urRepo.save(dbUser);
				model.addAttribute("msg", "Password Updated Successfully");
				return "Login";
			}
		}
		
		}
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		
		session.invalidate();
		return"redirect:/login";
	}
	
	}



