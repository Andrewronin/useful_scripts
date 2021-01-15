#! /bin/bash

# Show all disk status
df -h

# Show Inode status
df -i

# Show 10 biggest files of the system
du -Sh / | sort -rh | head -10
# or
find / -printf '%s %p\n'| sort -nr | head -10