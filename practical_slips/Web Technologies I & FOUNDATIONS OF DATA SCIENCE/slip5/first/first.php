<!-- Write a program to read one file and display the contents of the file with
its size -->



<!DOCTYPE html>
<html>
<body>

<?php
$myfile = fopen("tx.txt", "r") or die("Unable to open file!");
echo fread($myfile,filesize("tx.txt"));
fclose($myfile);
?>

</body>
</html>
