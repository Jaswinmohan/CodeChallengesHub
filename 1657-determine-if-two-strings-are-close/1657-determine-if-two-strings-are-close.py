class Solution:
    def closeStrings(self, word1: str, word2: str) -> bool:
        a=Counter(word1)
        b=list(a.values())
        c=Counter(word2)
        d=list(c.values())
        b.sort();d.sort()
        e=list(a.keys())
        f=list(c.keys())
        e.sort();f.sort()
        if b==d and e==f:
            return True
        else:
            return False