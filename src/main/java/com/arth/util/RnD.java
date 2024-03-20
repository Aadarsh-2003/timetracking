package com.arth.util;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class RnD {
	
	LocalDate l = LocalDate.now();
	
	LocalDateTime lt = LocalDateTime.now();
	String DateAndTime = l+"T"+lt.getHour()+":"+lt.getMinute()+":"+lt.getSecond();
    

}
