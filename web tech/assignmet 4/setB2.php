<?php
    
    function search($q)
    {
        $a=[1,2,3,4,6,7,8,5,4,6,5,3,4,5,6];
        foreach($a as $s)
        {
            if ($s==$q)
            {
                echo $s;
            }
        }
    } 
    search(5);

?>