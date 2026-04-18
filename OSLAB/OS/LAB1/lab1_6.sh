read -p "Enter an year(4-digit format):" y
if [ $[y % 4] -eq 0 ]
then
	echo "$y is a leap year."
else
	echo "$y is not a leap year."
fi
