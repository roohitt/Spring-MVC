<html>
<head>
	<title>Hello World- Input Form</title>
</head>

<!-- The form tag library comes bundled in spring-webmvc.jar. The library descriptor is called spring-form.tld.
To use the tags from this library, add the following directive to the top of your JSP page: -->


<body>
	<form action ="processFormVersionThree" method = "GET">
		<input type ="text" name="studentName"
		 placeholder="Whats yur name?">
		 <input type="submit">
		
	</form>
</body>

</html>