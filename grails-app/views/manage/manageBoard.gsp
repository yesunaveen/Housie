<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FAQ</title>
</head>
<body>
	<g:form controller="Manage">
		<h1> You can manage the board here: </h1>
		<div>adminMessage:</div>
		<textarea rows="5" cols="50" id="message"></textarea>
		<g:actionSubmit value="Update Message on Board" action="updateMessage"/>
	</g:form>
</body>
</html>