class Solution:
    def numSquares(self, n: int) -> int:
        if round(n ** 0.5) ** 2 == n:
            return 1
        while n % 4 == 0:
            n //= 4
        if n % 8 == 7:
            return 4
        for i in range(1, int(n ** 0.5) + 1):
            square = i * i
            if round((n - square) ** 0.5) ** 2 == (n - square):
                return 2
        return 3
