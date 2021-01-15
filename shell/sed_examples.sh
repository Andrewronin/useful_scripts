#! /bin/bash

TEXT=" "
echo "$TEXT"

TEXT2=" "
echo "$TEXT2"

find * \( -type d -name .git -prune \) -o -type f -print0 | xargs -0 sed -i "s/$TEXT2/$TEXT/g"
