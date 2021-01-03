// Given an array of integers, return indices of the two numbers such that they add up to a specific target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

//Given nums = [2, 7, 11, 15], target = 9

class twoSumS {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i ++)
        {
            int first = nums[i];
            for (int j = i + 1; j < nums.length; j++)
            {
                int second = nums[j];
                if (first + second == target)
                {
                    result[0] = i;
                    result[1] = j;
                    break;
                    
                }
            }
        }
        return result;
    }
}