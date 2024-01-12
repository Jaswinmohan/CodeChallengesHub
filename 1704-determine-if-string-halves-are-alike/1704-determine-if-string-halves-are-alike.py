class Solution:
    def halvesAreAlike(self, s: str) -> bool:
        a=len(s)
        n=a//2
        f=s[0:n]
        e=s[n:a]
        count=0
        count2=0
        for i in range(len(f)):
            if f[i] in 'aeiouAEIOU':
                count=count+1
        for i in range(len(e)):
            if e[i] in 'aeiouAEIOU':
                count2=count2+1
        if count==count2:
            return True
        else:
            return False