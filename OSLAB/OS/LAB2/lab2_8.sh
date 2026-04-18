read -p "Enter the start and end of a range: " s e

for ((n=s; n<=e; n++))
do
    if [ $n -le 1 ]
    then
        continue
    fi

    p=1
    for ((i=2; i*i<=n; i++))
    do
        if [ $((n % i)) -eq 0 ]
	then
            p=0
            break
        fi
    done

    if [ $p -eq 1 ]
    then
        echo "$n"
    fi
done

