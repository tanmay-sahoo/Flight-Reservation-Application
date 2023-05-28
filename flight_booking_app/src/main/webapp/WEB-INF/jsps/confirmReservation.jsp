<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation</title>
</head>
<body>
<h2>Your Ticket Is Booked.</h2>

<h2>Passenger Details</h2>
LastName: ${passenger.lastName}</br>
FirstName: ${passenger.firstName}</br>
MiddleName: ${passenger.middleName}</br>
Email: ${passenger.email}</br>
Phone: ${passenger.phone}</br>

<input type="submit" value="Pay">
</body>
</html>