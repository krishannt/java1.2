import java.util.HashSet;

public class hashset2 {
    public boolean containsDuplicate(int[] nums) {
HashSet<Integer> set = new HashSet<>();
for(int i=0; i<nums.length; i++) {
if(set.contains(nums[i])) {
return true;
} else {
set.add(nums[i]);
}
}
return false;
}
}
