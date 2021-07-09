package com.zb.demo.web;

import java.util.Arrays;

/**
 * @Author: Tsl
 * @Description:
 * @Date: Created in 15:48  2021/4/23
 * @Modified By:
 */
public class NewTest {
    public static void main(String[] args) {
        int[] nums = new int[]{3,8,12,6,11,23,21,56,1};
        System.out.println("排序前");
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("Array自带排序方法sort()");
        System.out.println(Arrays.toString(nums));
        for (int i = 0;i < nums.length - 1;i++){
            for (int j = 0;j < nums.length - 1 - i;j++){
                if (nums[j] > nums[j+1]){
                    int a = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = a;
                }
            }
        }

        System.out.println("排序后");
        System.out.println(Arrays.toString(nums));


        System.out.println("降序：");
        for (int i = 0;i < nums.length - 1;i++){
            for (int j = 0;j < nums.length - 1 - i;j++){
                if (nums[j] < nums[j+1]){
                    int a = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = a;
                }
            }
        }
        // 排序后:
        System.out.println(Arrays.toString(nums));
        if (Arrays.toString(nums).equals("[56, 23, 21, 12, 11, 8, 6, 3, 1]")) {
            System.out.println("测试成功");
        } else {
            System.out.println("测试失败");
        }




        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        int[] nsNew = new int[10];
        // 排序前:
        System.out.println(Arrays.toString(ns));
        // TODO:
        Arrays.sort(ns);
        System.out.println(Arrays.toString(ns));
        for (int i = 0; i < ns.length; i++) {
            nsNew[i] = ns[ns.length - i -1 ];
        }
        // 排序后:
        System.out.println(Arrays.toString(nsNew));
        if (Arrays.toString(nsNew).equals("[96, 89, 73, 65, 50, 36, 28, 18, 12, 8]")) {
            System.out.println("测试成功");
        } else {
            System.out.println("测试失败");
        }
    }


}
