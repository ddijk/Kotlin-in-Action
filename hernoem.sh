#!/bin/bash

find . -name "*.kt" | while read file; do
#   mv $file ${file//\./_}
    new="${file#"./"}"
    new2="${new//\./_}"
    new3="${new2/_kt/.kt}"
    #echo "$file naar $new3" 
    mv $file $new3
done
