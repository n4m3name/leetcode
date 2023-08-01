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