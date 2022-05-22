import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> list = new HashMap<>();

        for(int i=0; i< nums.length; i++){
            if(list.containsKey(nums[i])){
                return true;
            } else {
                list.put(nums[i],i);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ContainsDuplicate two = new ContainsDuplicate();
        System.out.println(two.containsDuplicate(new int[] {1,2,3,1}));
    }
}
