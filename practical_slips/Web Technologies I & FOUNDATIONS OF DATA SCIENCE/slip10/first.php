<!-- Write a menu driven program to perform the following stack and queue
related operations:[Hint: use Array_push(), Array_pop(), Array_shift(),
Array_unshift() ]
a) Insert an element in stack
b) Delete an element from stack
c) Display the contents of stack
d) Insert an element in queue
e) Delete an element from queue
f) Display the contents of queue -->

<?php
$a=[1,2,3,3,4];
$c=4;
switch ($c) {
    case '1':
        array_push($a,5);
        print_r($a);# code...
        break;
    case '2':
        array_pop($a);
        print_r($a);
        break;
    case '3':
        print_r($a);
        break;
    case '4':
        array_shift($a);
        print_r($a);
    
        break;
    case '5':
        array_unshift($a,5);
        print_r($a);
        break;
    case '6':
        print_r($a);
        break;
}
?>
