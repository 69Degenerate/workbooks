<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>calc</title>
</head>
<body>
    <form action="d.php" method="POST">
        <input type="number" name="n1" value="
        <?php 
            if(isset($_POST["n1"])) echo $_POST["n1"]
        ?>">
        <br>
        <input type="number" name="n2" value="
        <?php 
        if(isset($_POST["n2"])) echo $_POST["n2"] 
            ?>">
        <br>
        <button type="submit" name="mod">Mod</button>
        <input type="number" name="sum" value="
        <?php 
            if(isset($_POST["mod"])) echo mod();   
        ?>">
        <br>
        <button type="submit" name="power">power</button>
        <input type="number" name="pow" value="
        <?php 
            if(isset($_POST["pow"])) echo power(); 
        ?>"><br>
        <button type="submit" name="sum">sum</button>
        <input type="number" name="sum1" value="
        <?php 
            if(isset($_POST["sum"])) echo sum();
        ?>"><br>
        <button type="submit" name="fact">factorial</button>
        <input type="number" name="fact1" value="
        <?php 
            if(isset($_POST["fact"])) echo fact(); 
        ?>"><br>


    </form>
        <?php
            function mod()
            {
                $a=$_POST["n1"];
                $b=$_POST["n2"];
                $c=$a%$b;
                return $c;
            }
            function power()
            {
                $a=$_POST["n1"];
                $b=$_POST["n2"];
                return pow($a,$b);
            }
            function sum()
            {
                $a=$_POST["n1"];
                $c=0;

                for($i=0;$i<=$a;$i++){
                    $c=$c+$i;
                }   
                return $c;
            }
            function fact()
            {
                $b=$_POST["n2"];

                $ft=1;
                for($i=1;$i<=$b;$i++)
                {
                    $ft=$ft*$i;
                }
                return $ft;
            }
        ?>
</body>
</html>