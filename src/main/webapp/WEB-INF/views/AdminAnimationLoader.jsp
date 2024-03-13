
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:if test="${empty usrName }">
	<c:redirect url="login" />
</c:if>

<div id="loading">
	<div
		class="loader simple-loader animate__animated animate__fadeOut d-none">
		<div class="loader-body"></div>
	</div>
</div>