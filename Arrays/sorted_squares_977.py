class SortedSquares:

    #977
    def sortedSquares(nums: [int]) -> [int]:
        for i in range(len(nums)):
            nums[i] *= nums[i]
        nums.sort()
        return nums

    print(sortedSquares([1, -5, 2, -6, 3, -7]))