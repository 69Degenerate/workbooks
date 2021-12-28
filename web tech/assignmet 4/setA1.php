<?php
    $a=[47,50,46,50,84,76,65,51,84,31,48,74];
    sort($a);
    echo"tempereture:";
    print_r($a);
    $total=0;
    for($i=0;$i<count($a);$i++){
        $total=$total+$a[$i];
    }
    $av=$total/count($a);
    echo $av;

    $w_temp[]=array_slice($a,-5,5);
    $c_temp[]=array_slice($a,0,5);
    echo "\n\nwarm temperature:";
    print_r($w_temp);
    echo "\n\n cool temp";
    print_r($c_temp);
?>