#!/bin/bash

find . -name "*.kt" | while read file; do
#   $new = $(sed -i '/e/E/g')
   echo "hernoem $file naar ${file//\./_}" 
done
