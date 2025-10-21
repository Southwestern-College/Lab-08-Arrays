# Lab: Arrays

## Objectives

- Create a Java class with static methods.
- Practice array traversal using loops.
- Recreate simplified versions of some methods from Java’s `Arrays` class.
- Write and test methods that process arrays using conditionals and iteration.

## Program Description

In Java, the `Arrays` class contains many static methods for working with arrays, such as converting them to strings, copying them, and comparing them.

In this lab, you will create your own simplified version of this class, which provides a few essential methods for one-dimensional integer arrays.

You’ll also add two additional methods to find the maximum and minimum elements in an array.

## Program Specifications

Create a class named `Arrays`.  
The class must include the following static methods:

| Return Type | Method | Description |
|--------------|---------|-------------|
| `String` | `toString(int[] arr)` | Returns a string representation of the array in the format `[1, 2, 3]`. |
| `int[]` | `copyOf(int[] arr, int newLength)` | Returns a new array that contains the first `newLength` elements of `arr`. If `newLength` is greater than `arr.length`, fill the remaining elements with zeros. |
| `boolean` | `equals(int[] a, int[] b)` | Returns `true` if both arrays have the same length and contain the same elements in the same order. |
| `int` | `max(int[] arr)` | Returns the largest element in the array. |
| `int` | `min(int[] arr)` | Returns the smallest element in the array. |

## Notes

- You may not use any methods from the built-in `Arrays` class.
- Use `for` loops to iterate through arrays.
- Assume all arrays passed to your methods are not null and contain at least one element.
- Focus on clarity and correctness rather than efficiency.

## Sample Test

Save the following tester as `TestMyArrays.java`.

```java
public class TestMyArrays {
    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 1, 5};
        int[] numsCopy = Arrays.copyOf(nums, 7);
        int[] numsShort = Arrays.copyOf(nums, 3);

        System.out.println("Array: " + Arrays.toString(nums));        // [3, 1, 4, 1, 5]
        System.out.println("Copy (longer): " + Arrays.toString(numsCopy));  // [3, 1, 4, 1, 5, 0, 0]
        System.out.println("Copy (shorter): " + Arrays.toString(numsShort)); // [3, 1, 4]
        System.out.println("Equal arrays: " + Arrays.equals(nums, numsCopy)); // false
        System.out.println("Max: " + Arrays.max(nums)); // 5
        System.out.println("Min: " + Arrays.min(nums)); // 1
    }
}
```

## Coding Standards

1. Follow the program specifications.
2. Use clear and consistent indentation.
3. Include JavaDoc comments for each method.
4. Remove any auto-generated comments.
5. Attribute yourself in the class-level JavaDoc (`@author`).
6. Ensure output is user-friendly and easy to read.

## Extension (Optional)

If you finish early, try adding one of these:

- `reverse(int[] arr)`: returns a new array with the elements in reverse order.
- `sum(int[] arr)`: returns the total of all array elements.
