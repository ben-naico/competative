import java.util.Arrays;

class LeetCode704 {

    public static int search (int[] nums , int target){
        int left = 0;
        int right = nums.length -1;
        while (left <=right) {
            int mid = (left+right)/2;
            if(nums[mid] > target){
                right = mid-1;
            }else if(target > nums[mid]){
                left = mid+1;
            } else {
                return mid;
                
            }
        }
        return -1;
    }

    public static void main(String[] arg){
        int[] arr = new int[]{-1,0,3,5,9,12};
        int tar = 9;
        System.out.println(search(arr,tar));
        
    }

}