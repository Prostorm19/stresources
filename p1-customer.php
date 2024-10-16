<?php 
$user=$_POST["user"]; 
$gift=$_POST["gift"]; 
if(($user=="0")||($gift=="0")) 
{ 
echo "Invalid Data"; 
} 
if($user=="1") 
{ 
if($gift=="1") 
{ 
echo "You are eligible for 20% discount"; 
} 
if($gift=="2") 
{ 
echo "You are eligible for 15% discount"; 
} 
} 
if($user=="2") 
{ 
if($gift=="1") 
{ 
echo "You are eligible for 20% discount"; 
} 
if($gift=="2") 
{ 
echo "You are not eligible for any discount"; 
} 
} 
?>
