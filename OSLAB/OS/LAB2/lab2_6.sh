read -p "Enter coefficient:" a
read -p "Enter exponent:" b
value=1
for((i=1; i<=$b; i++))
do
	value=$(($value*$a))
done
echo "Value: $value"
