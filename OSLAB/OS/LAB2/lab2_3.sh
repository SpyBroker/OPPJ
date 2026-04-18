read -p "Enter a multidigit number:" n
rev=0
num=$n
while [ $n -ne 0 ]
do
	rem=$((n%10))
	rev=$((rev*10 + rem))
	n=$((n/10))
done
echo "Reverse of $num is $rev."
