<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form method="post" style="background-color: gray" action="">
		<div>
			<label for="name">Nom :</label> <input id="name" name="user_name">
		</div>
		<div>
			<label for="age">Age :</label> <input id="age" name="user_age">
		</div>
		<div>
			<label for="appt">Choissiez votre horaire:</label> <input type="time"
				id="appt" name="appt" min="09:00" max="23:00" required>
		</div>
		<div>
			<label for="email">Email :</label> <input type="email" id="email"
				name="user_email">
		</div>
		<div>
			<button>Valider</button>
		</div>
	</form>
</body>
</html>