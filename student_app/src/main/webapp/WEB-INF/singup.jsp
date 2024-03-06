<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Sign Up</title>
</head>
<body>
    <h2>Sign Up</h2>
        <form action="signup" method="post">
           
                <label for="username">Username:</label>
                <input type="text" id="username" name="username" required>
           
            
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" required>
           
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" required>
            
                <input type="submit" value="Sign Up">
           
        </form>
        <p>Already have an account? <a href="login.jsp">Login here</a></p>
                                    <a href="index.jsp">Back to Login</a>
   
</body>
</html>