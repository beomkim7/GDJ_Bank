<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="./join" method="post" enctype="multipart/form-data">
		<div class="input-group mb-3">
			<label for="username">아이디</label> <input type="text" id="username"
				class="form-control" aria-label="Username"
				aria-describedby="basic-addon1" name="userName">
		</div>
		<div class="input-group mb-3">
			<label for="passwor">비밀번호</label> <input type="password"
				id="password" class="form-control"
				aria-label="Username" aria-describedby="basic-addon1" name="password">
		</div>
		<div class="input-group mb-3">
			<label for="realname">이름</label> <input type="text" id="realname"
				class="form-control" aria-label="Username"
				aria-describedby="basic-addon1" name="name">
		</div>
		<div class="input-group mb-3">
			<label for="email">이메일</label> <input type="email" id="email"
				class="form-control" aria-label="Username"
				aria-describedby="basic-addon1" name="email">
		</div>
		<div class="input-group mb-3">
			<label for="phone">전화번호</label> <input type="text" id="phone"
				class="form-control" aria-label="Username"
				aria-describedby="basic-addon1" name="phone">
		</div>
		<div class="input-group mb-3">
			<label for="address">주소</label> 
			<input type="text" id="address"	class="form-control" aria-label="Username"
				aria-describedby="basic-addon1" name="address">
		</div>
		<div class="input-group mb-3">
			<label for="avatar">avatar</label>
			<input type="file" id="avatar"	class="form-control" aria-label="Username"
				aria-describedby="basic-addon1" name="photo">
		</div>
		

		<button type="submit" class="btn btn-primary mb-3">가입</button>

	</form>

</body>
</html>