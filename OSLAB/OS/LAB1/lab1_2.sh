echo "Enter two numbers:"
read a
read b
s=`expr $a + $b`
d=`expr $a - $b`
m=`expr $a \* $b`
div=`expr $a / $b`
echo "sum= $s"
echo "difference= $d"
echo "multiplication= $m"
echo "division= $div"
