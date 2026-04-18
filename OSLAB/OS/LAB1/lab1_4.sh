echo "Enter 3 different numbers:"
read a b c
s=$a
if [ $b -lt $s ]
then
	s=$b
	echo "smallest: $s"
elif [ $c -lt $s ]
then
	s=$c
	echo "smallest: $s"
else
	s=$a
	echo "smallest: $s"
fi
