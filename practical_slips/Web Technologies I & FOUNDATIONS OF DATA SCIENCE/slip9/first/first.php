<!-- Write a PHP script for the following: Design a form to accept a string.
a. Write a function to find the length of given string without using built in
functions.
b. Write a function to count the total number of vowels i.e. (a,e,i,o,u) ) from
the string.
c. Convert the given string to lowercase and then to Title case.
d. Pad the given string with “*” from left and right both the sides.
e. Remove the leading whitespaces from the given string.
f. Find the reverse of given string.(use built-in functions)
Use radio buttons and the concept of function. Use ‘include’ construct or
‘require’ stmt.  -->


<?php
function vowels()
{
    $str=$_POST['str'];
    $vow=0;
    for ($i=0; $i <strlen($str) ; $i++) 
    { 
        switch ($str[$i])
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            $vow ++;
        }
    }
    echo "no. of vowel:" .$vow;
}
vowels();
echo "lenght" .strlen($str);
?>