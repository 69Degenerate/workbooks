<?php
    $a=["sofia"=>"31","jacob"=>"41","willium"=>"39","ramesh"=>"40"];
    print_r($a);
    $ac[]=asort($a);
    $d[]=rsort($a);
    $ack[]=ksort($a);
    $dk[]=krsort($a);
    print_r($ac);
    // echo "\n ascending by key $ack";
    // echo "\n descending $d";
    // echo "\n descending by key $dk";

?>