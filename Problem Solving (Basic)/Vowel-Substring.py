#COPYRIGHT BY @ SUMIT GOLE

import math
import os
import random
import re
import sys

# Complete the 'findSubstring' function below.
#
# The function is expected to return a STRING.
# The function accepts following parameters:
#  1. STRING s
#  2. INTEGER k
#

def findSubstring(s, k):
    # Write your code here
    n = len(s)
    vow = 0
    for i in range(k) :
        if s[i] in 'aeiou' :
            vow += 1
    max_vow = vow
    temp_str = s[:k]
    temp = vow
    for i in range(1 , n - k + 1) :
        if s[i-1] in 'aeiou' :
            temp -= 1
        if s[i+k-1] in 'aeiou' :
            temp += 1
        if max_vow < temp :
            max_vow = temp
            temp_str = s[i:i+k]
    if max_vow == 0 :
        return 'Not found!'
    return temp_str

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    k = int(input().strip())

    result = findSubstring(s, k)

    fptr.write(result + '\n')

    fptr.close()
