class NumberOfSteps:

    #1342
    def numberOfSteps(num: int) -> int:
        c = 0
        while num != 0:
            if num%2 == 0:
                num /= 2
            else:
                num -= 1
            c += 1
        return c

    # Bitwise approach: Odd when rightmost bit is one,
    # Halve value by moving all bits right one space `>>`
    # Use a bitmask () of 000...01 and the `&` operator:
    def numberOfStepsBit(num: int) -> int:
        c = 0
        while num != 0:
            if num&1 == 0:
                num >>= 1
            else:
                num -= 1
            c += 1
        return c
        
    print(numberOfSteps(120))
    print(numberOfStepsBit(120))