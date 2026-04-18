read -p "Enter a number:" n
sum=0
for ((i=1; i<=n/2; i++))
do
    if [ $((n % i)) -eq 0 ]
    then
        sum=$((sum + i))
    fi
done

if [ $sum -eq $n ]
then
    echo "$n is a Perfect Number"
else
    echo "$n is not a Perfect Number"
fi
