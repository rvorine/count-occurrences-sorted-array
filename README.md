[![Instagram](https://img.shields.io/badge/Instagram-lacopydepastel-E4405F?style=for-the-badge&logo=instagram&logoColor=white)](https://instagram.com/lacopydepastel)
[![YouTube](https://img.shields.io/badge/YouTube-%40rvorine-FF0000?style=for-the-badge&logo=youtube&logoColor=white)](https://youtube.com/@rvorine)

# Count Occurrences of a Number in a Sorted Array

## Problem

Given a **sorted** array `nums` and a number `target`, return how many times `target` appears. Do it faster than a linear scan.

Example:

```
Input:  nums = [1,2,2,2,3,5], target = 2     Output: 3
Input:  nums = [1,2,3,5],     target = 4     Output: 0
Input:  nums = [7,7,7,7],     target = 7     Output: 4
```

## Solution

Binary search twice — **lower bound** and **upper bound**.

- `lowerBound(target)`: first index with `nums[i] >= target`.
- `upperBound(target)`: first index with `nums[i] > target`.

Equal values sit in one contiguous block `[lowerBound, upperBound)`, so the count is simply:

```
count = upperBound - lowerBound
```

Both searches use the half-open range `[lo, hi)`. The only difference is the comparison: `<` for lower bound, `<=` for upper bound. If `target` is missing, both return the same index and the count is `0`.

**Time:** O(log n) — two binary searches.
**Space:** O(1).

## Implementations

| Language | File |
|---|---|
| Python | [`python/count_occurrences.py`](python/count_occurrences.py) |
| Java | [`java/CountOccurrences.java`](java/CountOccurrences.java) |
| Kotlin | [`kotlin/CountOccurrences.kt`](kotlin/CountOccurrences.kt) |
| JavaScript | [`javascript/countOccurrences.js`](javascript/countOccurrences.js) |
| C# | [`csharp/CountOccurrences.cs`](csharp/CountOccurrences.cs) |
