class Solution {
    public int maxProduct(int[] nums) {
        int maxProd=nums[0];
        int maxProdUptoI=nums[0];
        int minProdUptoI=nums[0];
        for(int i=1;i<nums.length;i++) {
            if(nums[i]<0){
                int swapVar=maxProdUptoI;
                maxProdUptoI=minProdUptoI;
                minProdUptoI=swapVar;
            }  
            //System.out.println(maxProdUptoI+" "+minProdUptoI);
            maxProdUptoI=Math.max(nums[i],maxProdUptoI*nums[i]);
            minProdUptoI=Math.min(nums[i],minProdUptoI*nums[i]);
            maxProd=Math.max(maxProd,maxProdUptoI);
        }
        return maxProd;
    }    
}