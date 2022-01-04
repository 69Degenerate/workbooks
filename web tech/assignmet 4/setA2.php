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
