class Solution:
    def isValid(self, s: str) -> bool:
        myMap = {
            '[': ']',
            '{': '}',
            '(': ')'
        }

        stack = []

        for c in s:
            if c in myMap:
                stack.append(c)
            else:
                if not stack:
                    return False

                last = stack.pop()

                if myMap[last] != c:
                    return False

        return not stack