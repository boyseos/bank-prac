<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>인덱스</title>
<script   src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
	<div>
		<h2>로그인</h2>
		<table border="4">
			<tr>
				<td>로그인</td>
				<td><input id="btn" type="button" value="Login"/></td>
			</tr>
			<tr>
				<td>회원가입</td>
				<td><a id="joinlink" href="#" >바로가기</a></td>
			</tr>
		</table>
	</div>
	<script>
	$('#btn').click(function(){
		location.assign('<%=request.getContextPath()%>/customer.do?page=login');
	});
	$('#joinlink').click(function(){
		location.assign('<%=request.getContextPath()%>/customer.do?page=join');
	});
	</script>
</body>
</html>