<!DOCTYPE html>
<%@page import="org.example.housie.Board"%>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>HOUSIE</title>
    <style>
        .heading {color:black;font-size:500%}
		.bigNumber {color:red; font-size:700%}
    </style>
    <script type="text/JavaScript">
    <!--
        function timedRefresh(timeoutPeriod) {
	    setTimeout("location.reload(true);",timeoutPeriod);
        }
    //   -->
</script>
</head>
<body style="position:relative; min-height:100%; top:0px;" onload="JavaScript:timedRefresh(15000);">
    <table>
        <tr>
            <td valign="center" align="left" height="100%" width="33%">
            	<g:img dir="images" file="ellucian.jpg" height="50%" width="70%" alt="Ellucian"/>
            </td>
            <td valign="center" align="center" height="100%" width="33%">
                <label class="heading">HOUSIE!!!</label> 
            </td>
            <td valign="center" align="right" height="100%" width="33%">
            	<g:img dir="images" file="housie.jpg" height="50%" width="70%" alt="Housie"/>
            </td>
        </tr>
    </table>
    <hr/>
    <div align="right" >
    	<g:link controller="Faq" action="faq" target="_blank"><big><big><big><b>Rules And FAQs</b></big></big></big></g:link>
    </div>
    <div align="center" >
        <font size="7">New Number</font><br/>
        <label class="bigNumber">${newNumber}</label>
    </div>
    <table width="100%">
        <tr>
            <td align="center" valign="top" width="33%">
                <table border="1" cellpadding="8px" cellspacing="3px">
                    <g:each var="number" in="${(1..90)}">
                    	<g:if test="${number % 10 == 1}">
                    		<tr>
                    	</g:if>
                    	<td align="center" valign="center" bgcolor="${Board.numberColor( number )}"><font size="3">${number}</font></td>
                    	<g:if test="${number % 10 == 0}">
                    		</tr>
                    	</g:if>
                    </g:each>
                </table> 
            </td>
            <td align="center" valign="center"  width="33%">
            	<font size="6" color="blue">${adminMessage}</font>
            	<br><br>
            	<g:form action="manageBoard">
					<g:actionSubmit value="Manage Board"/>
				</g:form>
            </td>
            <td align="center" valign="top" width="33%">
            	<table>
            		<tr><td align="center"><h2>Category</h2></td><td align="center"><h2>Winner</h2></td></tr>
            		<tr><td colspan="2"><hr></td></tr>
					<tr><td><font size="5">First Row</font></td><td><input type="text" value="${firstRow}" disabled/></td></tr>
					<tr><td><font size="5">Second Row</font></td><td><input type="text" value="${secondRow}" disabled/></td></tr>
					<tr><td><font size="5">Third Row</font></td><td><input type="text" value="${thirdRow}" disabled/></td></tr>
					<tr><td><font size="5">Fastest Five</font></td><td><input type="text" value="${fastestFive}" disabled/></td></tr>
					<tr><td><font size="5">Full House 1</font></td><td><input type="text" value="${fullHouse1}" disabled/></td></tr>
					<tr><td><font size="5">Full House 2</font></td><td><input type="text" value="${fullHouse2}" disabled/></td></tr>
				</table>
            </td> 
        </tr>
    </table>
</body>
</html>