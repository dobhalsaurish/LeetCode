import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        
        int[] flatResult = new int[n * 3]; 
        int resultCount = 0;

        for (int i = 0; i < n - 2; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    if (resultCount + 3 > flatResult.length) {
                        flatResult = Arrays.copyOf(flatResult, flatResult.length * 2);
                    }
                    
                    flatResult[resultCount++] = nums[i];
                    flatResult[resultCount++] = nums[left];
                    flatResult[resultCount++] = nums[right];

                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        List<List<Integer>> finalResult = new ArrayList<>(resultCount / 3);
        for (int i = 0; i < resultCount; i += 3) {
            finalResult.add(Arrays.asList(flatResult[i], flatResult[i + 1], flatResult[i + 2]));
        }

        return finalResult;
    }
}
