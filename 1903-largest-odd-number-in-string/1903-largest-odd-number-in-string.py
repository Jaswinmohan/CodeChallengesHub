class Solution:
    def largestOddNumber(self, num: str) -> str:
        s=''
        for i in range(len(num)):
            c=int(num[i:i+1])
            if c%2!=0:
                s=i
        if str(s):
            res=num[0:s+1]
            return res
        else:
            return ''