read -p "Enter employee name:" name
read -p "Enter employee id:" id
read -p "Enter employee designation:" des
echo $name
echo $id
echo $des
echo "$name":"$id":"$des" >> emp.txt
