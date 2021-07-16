package Leetcode;

import java.util.jar.JarEntry;

/**
 * @author JackChern @create 2021-07-16 15:36
 */
public class Leetcode {
}

//第一版本：用了额外的内存空间，并且写得很烂，还有很大的进步空间！！！
class Solution2 {
    public int removeDuplicates(int[] nums) {
        int[] nums1 = new int[nums.length];
        nums1[1] = nums1[1];
        int j = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums1[j] = nums[i + 1];
                j++;
            }
        }
        return j;
    }


    class Solution1 {
        public int removeDuplicates2(int[] nums) {
            if (nums == null) {
                return 0;
            }
            int i = 1;
            int j = 1;
            while (j < nums.length) {
                if (nums[j] != nums[j - 1]) {
                    nums[i] = nums[j];
                    i++;
                }
                j++;
            }
            return i;
        }
    }
}
