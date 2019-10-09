#!/bin/bash

find . -name "*.kt" | while read file; do

   # remove leading './'
    new="${file#"./"}"

    # replace all '.' with '_'
    new2="${new//\./_}"

    # restore last replacement back to '.'
    new3="${new2/_kt/.kt}"

    #echo "$file naar $new3" 
    mv $file $new3
done
