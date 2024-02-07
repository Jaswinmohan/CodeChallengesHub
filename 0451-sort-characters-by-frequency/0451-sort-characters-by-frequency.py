class Solution:
    def frequencySort(self, s: str) -> str:
        a = Counter(s)
        b=''
        f=sorted(a.items(),key=lambda x:x[1])
        for i in f:
            b=b+i[0]*i[1]
        return b[::-1]