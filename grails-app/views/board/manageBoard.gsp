<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Manage Board</title>
</head>
<body>
	<g:form>
		<h1> You can manage the board here: </h1>
		<div>adminMessage:</div>
		<textarea rows="5" cols="50" name="message">${message}</textarea>
		<br/>
		<g:actionSubmit value="Update Message" action="updateMessage"/>
		<g:actionSubmit value="${pauseContinue} Game" action="pauseContinueGame"/>
		<g:actionSubmit value="Restart The Game" action="restartBoard" onclick="return confirm('This will reset the entire board!!Are you sure???')"/>
		<h3>Update Winners</h3>
		<table>
		<tr><td>First Row</td><td><input type="text" name="firstRow" value="${firstRow}"/></td></tr>
		<tr><td>Second Row</td><td><input type="text" name="secondRow" value="${secondRow}"/></td></tr>
		<tr><td>Third Row</td><td><input type="text" name="thirdRow" value="${thirdRow}"/></td></tr>
		<tr><td>Fastest Five</td><td><input type="text" name="fastestFive" value="${fastestFive}"/></td></tr>
		<tr><td>Full House 1</td><td><input type="text" name="fullHouse1" value="${fullHouse1}"/></td></tr>
		<tr><td>Full House 2</td><td><input type="text" name="fullHouse2" value="${fullHouse2}"/></td></tr>
		</table>
		<g:actionSubmit value="Update Winners" action="updateWinners"/>
	</g:form>
</body>
</html>