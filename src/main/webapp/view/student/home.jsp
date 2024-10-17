<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.List" %>
<%@ page import = "com.example.demo.model.Student" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Home</title>
</head>
<body>
	<h1>Our students</h1>
	
	<h2>Search students</h2>
	<form action="/student/search/prefix" class="search-bar">
	    <input type="text" name="prefix" placeholder="Search by name...">
	    <input type="submit" value="Search">
	    <br>
	</form>
	<form action="/student/search/roll" class="search-bar">
	    <input type="number" name="roll" placeholder="Search by Roll No.">
	    <input type="submit" value="Search">
	    <br>
	</form>
	
	<h2>Admit Students</h2>
	<form action="/student/add" method="post" class="add-form">
	    <input type="text" name="name" placeholder="Enter name"><br>
	    <input type="number" name="regnNum" placeholder="Enter registration no."><br>
	    <input type="text" name="language" placeholder="Enter language"><br>
	    <input type="submit" value="Admit Student"><br>
	    <br>
	</form>
	
	<h2>Rusticate Students</h2>
	<form action="/student/delete" method="post" class="delete-form">
	    <input type="number" name="roll" placeholder="Enter roll no."><br>
	    <input type="submit" value="Remove Student"><br>
	    <br>
	</form>
	
	<% List<Student> studentList = (List<Student>)request.getAttribute("studentList"); %>
	<% if (studentList == null || studentList.size() == 0) { %>
		<h3>No student is present!</h3>
	<% } else { %>
			<table>
				<tr>
					<th>Roll No.</th> 
					<th>Name</th> 
					<th>Registration No.</th> 
					<th>Language</th> 
				</tr>
				<% for (Student st : studentList) { %>
					<tr>
						<td><%= st.getRollNum() %></td>
						<td><%= st.getName() %></td>
						<td><%= st.getRegnNum() %></td>
						<td><%= st.getLanguage() %></td>
					</tr>
				<% } %>
			</table>
	<% } %>
</body>
</html>