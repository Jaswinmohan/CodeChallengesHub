class Solution:
    def totalMoney(self, n: int) -> int:
        a=0
        res=0
        for i in range(1,n+1):
            for j in range(i,i+7):
                if a<n:
                    res=res+j
                    a=a+1
        return res
        