import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> list = new HashMap<>();
        for(int i=0; i< nums.length; i++){
            if(list.containsKey(nums[i]) && Math.abs(i-list.get(nums[i])) <= k){
                return true;
            } else {
                list.put(nums[i], i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate2 two = new ContainsDuplicate2();
        System.out.println(two.containsNearbyDuplicate(new int[] {1,2,3,1}, 3));
    }
}
