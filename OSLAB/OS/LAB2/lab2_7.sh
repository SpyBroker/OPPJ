n=1
for((n=1 ; n<=500 ; n++))
do
	num=$n
	arm=0

	while [ $num -ne 0 ]
	do
		rem=$((num%10))
		arm=$((arm+(rem*rem*rem)))
		num=$((num/10))
	done

	if [ $n -eq $arm ]
	then
		echo "$n"
	fi

done
