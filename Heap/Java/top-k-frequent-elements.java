class Solution {
    class Pair {
        int number;
        int count;
        Pair(int n,int c){
            number=n;
            count=c;
        }
      
    }
    class PairCmp implements Comparator<Pair>{
          public int compare(Pair p1,Pair p2){
            return p1.count-p2.count;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        int ans[]=new int[k];
        if(nums.length==0 )
            return ans;
        
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Pair> pq= new PriorityQueue<>(Collections.reverseOrder(new PairCmp()));
        int count=0;
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            Pair p=new Pair(entry.getKey(),entry.getValue());
            pq.offer(p);
        }
        while(count<k){
            Pair p=pq.poll();
            ans[count++]=p.number;
        }
        return ans;
    }
}