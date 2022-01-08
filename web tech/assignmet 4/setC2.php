<?php
$a=[1,2,3,3,4];
$a1=[4,5,6,7];
$a2=[7,,8,9,0];
$c=4;
switch ($c) {
    case '1':
        array_chunk($a,2);
        break;
    case '2':
        sort($a);
        break;
    case '3':
        function od($a){
            return ($a & 1);
        }
        $odd=array_filter($a,"od");
        print_r($odd);
        break;
    case '4':
        print_r(array_merge($a,$a1));
        break;
    case '5':
        print_r( array_intersect($a,$a1,$a2));
        break;
    case '6':
        print_r($a+$a1);
        break;
    case '7':
        print_r()
}
?>
