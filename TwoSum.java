import java.util.*;
public class TwoSum {
    public static void main (String[] args) {
        int [] data = new int [] {10, 20, 30, 40, 50};
        int number = 70;
        int [] printThis = twoSum(data, number);
        System.out.println(java.util.Arrays.toString(printThis));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2]; // make array of size 2
        HashMap<Integer, Integer> visited = new HashMap<Integer, Integer>(); // initialize HashMap
        for (int i = 0; i < nums.length; i++) { // loop thru the entire given nums array
            if (visited.containsKey(target - nums[i])) { 
                // .containsKey -> if contains the key -> returns T/F
                result[0] = visited.get(target - nums[i]); // return the value to which specified key is mapped
                result[1] = i;
                return result;
            } 
            visited.put(nums[i], i); // put the number, index
        }
        return result;
    }
}
