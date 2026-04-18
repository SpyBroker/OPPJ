read -p "Enter number for multiplication table:" n
echo "Multiplication table:"
for((i=1; i <= 10; i++))
do
	echo "$n x $i = $((n*i))"
done
