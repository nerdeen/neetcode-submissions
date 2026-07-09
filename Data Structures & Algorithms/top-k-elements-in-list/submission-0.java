class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq=new HashMap<>();
        int maxOccurance=-1;
        for(int i=0;i<nums.length;i++){
            maxOccurance=Math.max(maxOccurance,freq.getOrDefault(nums[i], 0) + 1);
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer>[]buckets=new ArrayList[nums.length+1];
        for(int key:freq.keySet()){
            int frequency=freq.get(key);
            if (buckets[frequency]==null){
                buckets[frequency]=new ArrayList<>();
            }
            buckets[frequency].add(key);
        }

        int[]res=new int [k];
        int index=0;
        for(int i= buckets.length - 1;i>=0 && index < k;i--){
            if (buckets[i]!=null){
               for(int num:buckets[i]){
                res[index++]=num;
                if(index==k){
                    break;
                }
               }
            }
        }
        // while(index<k){
        //     for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
        //         if (entry.getValue().equals(maxOccurance)) {
        //             res[index]=entry.getKey();
        //             index++; 
        //         }
        //         maxOccurance--;
        //     }
        // }    
        return res; 
    }
}
