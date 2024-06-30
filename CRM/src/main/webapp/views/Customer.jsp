<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Registration Management</title>
</head>
<body style="margin-top: 30px">

   <a href="/CRM/ShowForm">Register</a>

    <table border="1">

     <c:forEach var="customer" items="${Cdetails}" >
     
         
          <c:url var="updateLink" value="/updateForm"  >
                <c:param name="customerId" value="${customer.id}" ></c:param>
          </c:url>
          
          <c:url var="deleteLink" value="/deleteRecord" >
                <c:param name="customerId" value="${customer.id}" ></c:param>
          </c:url>
          
          
             <tr>
                 <td>${customer.firstName}</td>
                 <td>${customer.secondName}</td>
                 <td>${customer.city}</td>
                 <td> <a href="${updateLink}" >updateInfo</a> </td>
                 <td> <a href="${deleteLink}" >deleteInfo</a> </td>
             </tr>
          
          
     
     </c:forEach>
     
     </table>

</body>
</html>