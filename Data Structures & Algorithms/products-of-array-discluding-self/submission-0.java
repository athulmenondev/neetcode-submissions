class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre= new int[nums.length];
        pre[0]=1;
        int pren=1;
        for(int i=1;i<nums.length;i++){
            pren=pren*nums[i-1];
            pre[i]=pren;
        }
        pren=1;
        for(int i=nums.length-2;i>=0;i--){
            pren=pren*nums[i+1];
            pre[i]=pre[i]*pren;
        }
        return pre;

    }
}  



/*
1 2 3  4   5
0 1 2  6   24


*/
