class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map= new HashMap<>();
        PriorityQueue<Integer> pq= new PriorityQueue<Integer>(
            (a,b)->map.get(a)-map.get(b)
        );

        
        for(int i:nums){
            if(!map.containsKey(i)){
                map.put(i,1);
            }else{
                map.put(i,map.get(i)+1);
            }
        }
        for(int i:map.keySet()){
            pq.add(i);
            if(pq.size()>k)
                pq.remove();
        }
        int[] fin= new int[k];
        for(int i=0;i<k;i++){
            fin[i]=pq.remove();
        }
        return fin;
    }
}
