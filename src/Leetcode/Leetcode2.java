package Leetcode;

import java.lang.reflect.Array;
import java.security.PublicKey;
import java.util.Arrays;

/**
 * @author JackChern @create 2021-07-16 19:15
 * 合并两个有序数组
给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。

初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。你可以假设 nums1 的空间大小等于 m + n，这样它就有足够的空间保存来自 nums2 的元素。

作者：力扣 (LeetCode)
链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnumcr/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Leetcode2 {
}
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2,0,nums1,m,n);
        //真不了解这个方法！！！
        Arrays.sort(nums1);
        //没想到还能调用官方的方法！！！
        //这个学过了，但是不懂的怎么用！！
    }

}