<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../include/header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<!-- 예고편 동영상 -->
	<video style="margin-left: 100px;" width="800" height="450" controls autoplay>
		<source src="${vdo_ad}/${dto.preview}"type="video/mp4">
	</video>
</body>
</html>