<!-- Write a PHP script that inserts a new item in an array at any position.
(hint : use array_splice()) -->

<?php
$original = array( '1','2','3','4','5' );
echo 'Original array : '."\n";
foreach ($original as $x) 
{
    echo "$x ";
}
$inserted = '$';
array_splice( $original, 3, 0, $inserted ); 
echo " \n After inserting '$' the array is : "."\n";
foreach ($original as $x) 
{
    echo "$x ";
}
echo "\n"
?>