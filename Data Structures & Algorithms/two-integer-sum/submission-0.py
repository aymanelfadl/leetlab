class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = {}

        for i, num in enumerate(nums):

            con = target - num

            if con in seen:
                return [seen[con], i]
            
            seen[num] = i
        