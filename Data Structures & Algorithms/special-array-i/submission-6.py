class Solution:
    def isArraySpecial(self, nums: List[int]) -> bool:
        l = 0

        while l < len(nums) - 1:
            r = l + 1

            if nums[l] % 2 == nums[r] % 2:
                return False

            l += 1

        return True