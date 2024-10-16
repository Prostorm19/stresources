<?php
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $username = $_POST['username'];
    $password = $_POST['password'];
    
    if (($username == "test") && ($password == "test")) {
        echo "Login successful!";
    } else {
        echo "Login failed!";
    }
}
?>