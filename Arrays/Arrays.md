# Arrays

In java since python array methods comprehensive.

\+ Review: Time complexity
1. Constant *O(i)*
2. Linear *O(n)*
3. Log *O(log(n))*
4. Quadratic *O(n^2)*
5. Cubic *O(n^3)*

\+ Review: Attributes=data, methods=code

\+ Review: Static belongs to class, non-static belongs to each instance

## Array insertions

### Inserting at end
```
arr[len] = n;
len++;
```

### Inserting at start
Linear *O(N)* time complexity
```
for (int i = arr.length; i >= 0; i--) {
    arr[i + 1] = arr[i]; // Shift each element forwards
}
arr[0] = n;
len++;
```

### Inserting anywhere
Say we want to insert at index x:
```
for (int i = arr.length; i >= x; i--) {
    intArray[i + 1] = intArray[i];
}
intArray[x] = 30;
```

## Array deletions

### Deleting from end (queue)
Note that this will not work with the .length attribute
```
len--;
```

### Deleting from start
Linear *O(N)* time complexity
```
for (int i = 1; i < len; i++) {
    int_array[i - 1] = int_array[i]; // Shift each element backwards, overwriting first
}
length--;
```

### Deleting anywhere
Linear *O(K)* time complexity, where *K* is num elements ro right of element

To delete at index x:
```
for (int i = x+1; i < length; i++) {
    int_array[i - 1] = int_array[i]; // Shift each element one pos to left, 'overwriting' x
}
length--;
```

## Array search
```
public static boolean linearSearch(int[] array, int length, int element) {

    if (array == null || length == 0) {
        return false;
    }

    for (int i = 0; i < length; i++) {
        if (array[i] == element) {
            return true;
        }
    }

    return false;
}
```

\+ Note: Can traverse an array forwards, backwards, or BOTH!

### In-place operations
Works directly on array elements instead of creating a new array.

### Repeated deletion algorithm update
"Given a sorted array, remove the duplicates such that each element appears only once."

Original algorithm:
```
class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        for (int i = length - 2; i >= 0; i--) {
            if (nums[i] == nums[i + 1]) {
                for (int j = i + 1; j < length; j++) {
                    nums[j - 1] = nums[j];
                }
                length--;
            }
        }
        return length;
    }
}
```

Solution: Two-pointer technique
1. Read elements to ID duplicates; readPointer
2. Keep track of next position in front to write the next unique element we've found; writePointer
```
public int removeDuplicates(int[] nums) {
        
  // Check for edge cases.
  if (nums == null) {
      return 0;
  }
  
  // Use the two pointer technique to remove the duplicates in-place.
  // The first element shouldn't be touched; it's already in its correct place.
  int writePointer = 1;
  // Go through each element in the Array.
  for (int readPointer = 1; readPointer < nums.length; readPointer++) {
      // If the current element we're reading is *different* to the previous
      // element...
      if (nums[readPointer] != nums[readPointer - 1]) {
          // Copy it into the next position at the front, tracked by writePointer.
          nums[writePointer] = nums[readPointer];
          // And we need to now increment writePointer, because the next element
          // should be written one space over.
          writePointer++;
      }
  }
  
  // This turns out to be the correct length value.
  return writePointer;
}
```

\+ Note: In-place op's not always ideal, i.e. if original array values needed in future. Valuable since they reduce the space complexity of algo.



