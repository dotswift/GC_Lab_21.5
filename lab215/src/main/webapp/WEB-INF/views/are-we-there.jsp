<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Are we there yet?</title>
</head>
<body>

	<form action="/are-we-there-result">
		<p>
		 Word to repeat: <input name="word" />
		</p>
		<p>
		Number of times to Repeat: <input type="number" name="repeat" />
		</p>
		<p>
			<button type="submit">Repeat Words</button>
		</p>
	</form>

</body>
</html>