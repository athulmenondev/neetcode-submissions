class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s= new HashSet<>();
        int l_c=0;
        for(int i=0;i<nums.length;i++){
            if(!s.contains(nums[i]))
                s.add(nums[i]);
        }

        for(int i:nums){
            if( s.contains(i-1)){
                continue;
            }
            int count=1;
            while(s.contains(i+1)){
                count++;
                i++;
            }

            if(l_c<count)
                l_c=count;
        }
        return l_c;
    }
}
