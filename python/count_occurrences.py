def lower_bound(nums, target):
    """First index whose value is >= target."""
    lo, hi = 0, len(nums)
    while lo < hi:
        mid = (lo + hi) // 2
        if nums[mid] < target:
            lo = mid + 1
        else:
            hi = mid
    return lo


def upper_bound(nums, target):
    """First index whose value is > target."""
    lo, hi = 0, len(nums)
    while lo < hi:
        mid = (lo + hi) // 2
        if nums[mid] <= target:
            lo = mid + 1
        else:
            hi = mid
    return lo


def count_occurrences(nums, target):
    return upper_bound(nums, target) - lower_bound(nums, target)


if __name__ == "__main__":
    print(count_occurrences([1, 2, 2, 2, 3, 5], 2))  # 3
    print(count_occurrences([1, 2, 3, 5], 4))        # 0
    print(count_occurrences([7, 7, 7, 7], 7))        # 4
