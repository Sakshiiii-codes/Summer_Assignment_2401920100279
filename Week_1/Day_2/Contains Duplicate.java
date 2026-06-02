class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>  set = new HashSet<>();
        for ( int num : nums){
            if (set.contains(nums)){
                return true;
            }
            set.add(num);
       }
       return false;
      }
}
