read -p "enter time in seconds:" sec
hours=$((sec / 3600))
minutes=$(((sec % 3600) / 60))
seconds=$((sec % 60))
echo "hour: $hours min: $minutes sec: $seconds"
