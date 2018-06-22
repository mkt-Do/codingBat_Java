public int[] rotateLeft3(int[] nums) {
  int[] rotateArr = new int[nums.length];
  for (int i = 0; i < nums.length; i++) {
    int index = i + 1;
    if (index == nums.length) {
      index = 0; 
    }
    rotateArr[i] = nums[index];
  }
  return rotateArr;
}


