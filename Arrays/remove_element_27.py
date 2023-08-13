class RemoveElement:
    def removeElement(nums, val):
        c = len(nums)
        i = 0
        while i < len(nums):
            if nums[i] == val:
                nums.pop(i)
                c -= 1
            else:
                i += 1

        return c