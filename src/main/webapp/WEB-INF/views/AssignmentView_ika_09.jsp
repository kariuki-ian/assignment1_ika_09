<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Assignment 1</title>
</head>
<body>
<h1>Admin Dashboard</h1>
<div>
	<h2><u>Employee Information</u> </h2>
	<h3>Employee name: ${employee.name}</h3>
	<p >Employee ID: ${employee.employeeID}</p>
	<p>Monthly Salary: $ ${employee.monthlySalary}</p>
	<p>Employee Ticket number: ${employee_ticket} </p>
</div>
<div>
	<h2><u>Assigned Customer Information</u> </h2>
	<h3>Customer name: ${customer.name}</h3>
	<p >Customer ID: ${customer.customerID}</p>
	<p >Store Credit: $ ${customer.storeCredit}</p>
	<p >Customer Ticket number: ${customer_ticket}</p>
</div>
</body>
</html>