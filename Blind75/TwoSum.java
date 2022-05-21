import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> list = new HashMap<>();
        int diff;
        for(int i =0; i < nums.length; i++){
            diff = target - nums[i];
            if(list.containsKey(diff)){
                return new int[]{i,list.get(diff)};
            } else {
                list.put(nums[i], i);
            }
        }
         return new int[2];
    }
    public static void main(String[] args) {
        TwoSum two = new TwoSum();
        System.out.println(Arrays.toString(two.twoSum(new int[] {2,7,11,15}, 9)));
    }
}