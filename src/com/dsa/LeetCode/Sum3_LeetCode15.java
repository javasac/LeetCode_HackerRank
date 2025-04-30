// Find all unique triplets such that sum is 0.
// nums = [-1, 0, 1, 2, -1, -4]
// [[-1, -1, 2], [-1, 0, 1]]
package com.dsa.LeetCode;
import java.util.*;

public class Sum3_LeetCode15
{
    List<List<Integer>> threeSum(int[] nums)
    {
        int sum = 0, j=0, k = 0;
        Set<List<Integer>> res = new HashSet<>();

        Arrays.sort(nums);
        if (nums.length < 3)
        {
            return new ArrayList<>();
        }

        for (int i=0; i<nums.length-2; i++)
        {
            j = i + 1;
            k = nums.length - 1;

            while (j < k)
            {
                List<Integer> list = new ArrayList<>();
                sum = nums[i] + nums[j] + nums[k];

                if (sum == 0)
                {
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    j++;
                    k--;
                    res.add(list);
                }
                else if (sum > 0)
                {
                    k--;
                }
                else
                {
                    j++;
                }
            }
        }
        return new ArrayList<List<Integer>>(res);
    }

    public static void main(String[] args)
    {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        Sum3_LeetCode15 sl = new Sum3_LeetCode15();

        List<List<Integer>> uni = sl.threeSum(nums);

        Iterator it = uni.listIterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
