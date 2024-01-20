class Array{
    public static int collectArray(int[] array, int target){
        for (int i=0;i<array.length-1;i++){
           // System.out.println(arr[i]);
            if (array[i]+array[i+1] == target){
                System.out.print(i);
                System.out.print(" ");
                System.out.println(i+1);
            }
        }
        return -1;
    }


}
public class ArrayProblemSolved {
    public static void main(String[] args) {
        int []arr1 = {10,20,30,40,50,60,70};
        int result = Array.collectArray(arr1,110);
        System.out.println(result);
    }
}
//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        for (int i=0;i<nums.length-1;i++){
//            // System.out.println(arr[i]);
//            if (nums[i]+nums[i+1] == target){
//                // System.out.print(i);
//                // System.out.print(" ");
//                // System.out.println(i+1);
//                return new int[] {i,i+1};
//            }
//        }
//        return null;
//    }
//
//}
