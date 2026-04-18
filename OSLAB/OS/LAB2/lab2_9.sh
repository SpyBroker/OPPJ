read -p "Enter a multidigit number:" n
sum=0
num=$n
while [ $n -ne 0 ]
do
        rem=$((n%10))
        sum=$((sum + rem))
        n=$((n/10))
done
echo "Sum of all digits of $num = $sum."
