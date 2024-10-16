<?php
    function calculateGCD($a, $b) {
        while ($b !== 0) {
            $temp = $b;
            $b = $a % $b;
            $a = $temp;
        }
        return $a;
    }

    if (isset($_POST['num1']) && isset($_POST['num2'])) {
        $num1 = (int)$_POST['num1'];
        $num2 = (int)$_POST['num2'];
        $gcd = calculateGCD($num1, $num2);
        echo "<p>The GCD of $num1 and $num2 is: $gcd</p>";
    } else {
        echo "<p>Invalid input. Please enter two numbers.</p>";
    }
?>
