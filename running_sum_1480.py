class RunningSum:

    #1480
    def runningSum(nums: [int]) -> [int]:
        for i in range(1, len(nums)):
            nums[i] = nums[i-1] + nums[i]
        return nums

    print(runningSum([1, 2, 3, 4]))