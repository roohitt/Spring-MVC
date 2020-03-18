<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>
<head>
<title>Form tags in spring</title>
</head>

<body>
		
	<form:form action="processForm" modelAttribute="student">
	
	First name: <form:input path="firstName"/>
	
	<br><br>
	
	Last Name: <form:input path="lastName"/>
	
	<br><br>
	
	<form:select path="country">
	<form:option value="Brazil" label="Brazil"/>
	<form:option value="France" label="France"/>
	<form:option value="Germany" label="Germany"/>
	<form:option value="India" label="India"/>
	</form:select>
	
	<br><br>
	
	<!-- items refers to collection of data -->
	
	<form:select path="state">
	<form:options items="${student.stateHashMap}"/>
	</form:select>
	
	<br><br>
	
	Favorite Language:
	
	JAVA   <form:radiobutton path="favoriteLanguage" value="JAVA"/>
	C#     <form:radiobutton path="favoriteLanguage" value="C#"/>
	Python <form:radiobutton path="favoriteLanguage" value="Python"/>
	C      <form:radiobutton path="favoriteLanguage" value="C"/>
		
	
	<br><br>
	
	Favorite Operating System:
	
	Linux   <form:checkbox path="favoriteOS" value="Linux"/>
	MAC OS   <form:checkbox path="favoriteOS" value="MAC OS"/>
	MS Windows   <form:checkbox path="favoriteOS" value="MS Windows"/>

		
	
	<br><br>
	
	<input type="submit" value="Submit"/>
	
	
	</form:form>

</body>

</html>