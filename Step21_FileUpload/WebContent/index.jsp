<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	//컨트롤러를 거치도록 리다일렉트 시켜준다. 
	String cPath=request.getContextPath();
	response.sendRedirect(cPath+"/home.do");
%>