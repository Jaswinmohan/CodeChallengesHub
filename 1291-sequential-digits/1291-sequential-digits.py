class Solution:
    def sequentialDigits(self, low: int, high: int) -> List[int]:
        a='123456789'
        l=low
        h=high
        k=len(a)
        b=len(str(l))
        m=[]
        while b!=k:
            for i in range(0,k-b+1):
                m.append(a[i:i+b])
            b=b+1
        m.append('123456789')
        n=[]
        for i in range(len(m)):
            if int(m[i])>=l and int(m[i])<=h:
                n.append(int(m[i]))
        return n