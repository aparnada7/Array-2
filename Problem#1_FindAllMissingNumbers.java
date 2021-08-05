/*
 * Space complexity: O(1) no new data structure used, int List is returned
 * Time complexity: O(N) Traversing array
 * */
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //NUll [4,3,2,7,8,2,3,1]
        List<Integer> result = new ArrayList<>();
        if(nums== null || nums.length==0){
            return new ArrayList<>();
        }
        for(int i=0; i<nums.length; i++){
            // System.out.print("nums[i]:: "+nums[i]);
            int idx = Math.abs(nums[i])-1;
            // System.out.println(" Index:: "+idx);
            //Now we need to update all the positive elements/indexes
            if(nums[idx]>0) {
                nums[idx] = nums[idx]* -1;
                // System.out.println("nums["+idx+"] now:: "+nums[idx]);
            }
        }
        for(int i=0;i<nums.length; i++){
            if(nums[i]>0){
                result.add(i+1);
            }
        }
        
        return result;
        
    }
}