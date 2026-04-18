echo "Enter a number:"
read N
sum=0
for((i=1; i<=$N; i++))
do
	sum=$((sum+i))
done
echo "Sum is $sum."
