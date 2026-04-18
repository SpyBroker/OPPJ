echo "Enter two numbers:"
read a b
product=0
for((i=1; i<=$b; i++))
do
	product=$(($a+$product))
done
echo "Product=$product"
