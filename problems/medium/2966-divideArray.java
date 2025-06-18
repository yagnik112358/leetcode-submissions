class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int ans[][] = new int[nums.length/3][3]; 
        for(int i=0;i<nums.length;i+=3){
            if(nums[i+2]-nums[i] > k){
                return new int[0][0];
            }

            for(int j=0;j<3;j++){
                //System.out.println(i/3 + " "+ j + " ");
                ans[i/3][j]= nums[i+j];
            }
        }
        return ans;

    }
}