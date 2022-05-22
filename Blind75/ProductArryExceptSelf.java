import java.util.Arrays;

public class ProductArryExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int left[] = new int[size];
        int right[] = new int[size];
        int result[] = new int[size];
        left[0] = right[size-1] = 1;
        
        for(int i =1; i < size; i++){
            left[i] = left[i-1] * nums[i-1];
        }
        for(int j = size -2; j >= 0; j--){
            right[j] = right[j+1] * nums[j+1];
        }
        for(int k =0; k < size; k++){
            result[k] = right[k] * left[k];
        }
        return result;
    }

    public static void main(String[] args) {
        ProductArryExceptSelf two = new ProductArryExceptSelf();
        System.out.println(Arrays.toString(two.productExceptSelf(new int[] {1,2,3,4})));
    }
}
