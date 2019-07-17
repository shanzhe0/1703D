<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/css.css" rel="stylesheet">
</head>
<body>
	
	
	<form action="${pageContext.request.contextPath }/liststore" method="post">
		请输入要搜索的店铺名称<input type="text" name="sname" value="${store.sname }">
		<input type="submit" value="搜索">
	</form>
	
	<table>
		<tr>
			<td>多选框</td>
			<td>编号</td>
			<td>店铺名称</td>
			<td>价格</td>
			<td>发布时间按</td>
			<td>店铺详情</td>
			<td>操作</td>
		</tr>
	
	<c:forEach items="${stroes.list }" var="s">
	<tr>
			<td>
				<input type="checkbox" name="ck" value="${s.sid }">
			</td>
			<td>${s.sid }</td>
			<td>${s.sname }</td>
			<td>${s.sprice }</td>
			<td>${s.sbate }</td>
			<td>
				<c:forEach items="${s.pops }" var="p">
					${p.pname }
				</c:forEach>
			</td>
			<td>操作</td>
	</tr>
	</c:forEach>
	
	</table>
	<c:if test="${stroes. hasPreviousPage }">
		<a href="${pageContext.request.contextPath }/liststore?page=1&rows=${stroes.pageSize}&sname=${stroe.sname}">首页</a>
		<a href="${pageContext.request.contextPath }/liststore?page=${stroes.prePage}&rows=${stroes.pageSize}&sname=${stroe.sname}">上一页</a>
	</c:if>
	<c:if test="${stroes.hasNextPage }">
		<a href="${pageContext.request.contextPath }/liststore?page=${stroes.nextPage }&rows=${stroes.pageSize}&sname=${stroe.sname}">下一页</a>
		<a href="${pageContext.request.contextPath }/liststore?page=${stroes.pages }&rows=${stroes.pageSize}&sname=${stroe.sname}">尾页</a>
	</c:if>
	当前第${menus.pageNum }页/共页
	

</body>
</html>