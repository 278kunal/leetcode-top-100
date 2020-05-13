class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length<3)
            return new ArrayList<List<Integer>>();
        Arrays.sort(nums);
       HashSet<List<Integer>> resultSet=new HashSet<>();
       // List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++) {
            HashSet<Integer> numbers= new HashSet<>();
            for(int j=i+1;j<nums.length;j++) {
                ArrayList<Integer> sol=new ArrayList<>();
                int negSum=-(nums[i]+nums[j]);
                if(numbers.contains(negSum)) {
                    sol.add(negSum);
                    sol.add(nums[i]);
                    sol.add(nums[j]);
                    resultSet.add(sol);                    
                    //result.add(sol);
                }
                else
                    numbers.add(nums[j]);    
            } 
        }
       // return result.stream().distinct().collect(Collectors.toList());
        return new ArrayList<List<Integer>>(resultSet); //using hashset for duplicates
        
    }
    
}