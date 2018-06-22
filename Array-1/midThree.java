public int[] midThree(int[] nums) {
  if (nums.length < 3 || nums.length % 2 == 0) {
    return nums;
  }
  int mid = nums.length / 2;
  return new int[] { nums[mid - 1], nums[mid], nums[mid + 1] };
}

