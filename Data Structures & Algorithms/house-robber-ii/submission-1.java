class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1)
            return nums[0];

        return Math.max(
            rob(nums, 0, n-2), rob(nums, 1, n-1)
        );

        
        
    }

    public int rob(int[] nums, int start, int end){
        int n = end-start+1;
        int[] dp = new int[n];

        dp[0] = nums[start];

        if(start==end)
            return dp[0];

       
        dp[1] = Math.max(nums[start], nums[start+1]);

        for(int i=2; i<dp.length; i++)
            dp[i] = Math.max(nums[start+i]+dp[i-2], dp[i-1]);

        return dp[dp.length-1];
    }
}
