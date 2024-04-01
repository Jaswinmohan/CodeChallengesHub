class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        b=s.split()
        return len(b[-1])