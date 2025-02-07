package Sample;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class FrequentElement {
	
	public int[] topKFrequent(int[] nums, int k) {

        if(k==nums.length){
            return nums;
        }
        Map<Integer, Integer> count = new HashMap<>();

        for(int n :nums){
            count.put(n, count.getOrDefault(0,n)+1);
        }

        Queue<Integer> heap = new PriorityQueue<>(
            (a,b)->count.get(a)-count.get(b)
        );

        for(int n: count.keySet()){
            heap.add(n);
            if(heap.size()>k){
                heap.poll();
            }
        }

        int[] ans =new int[k];

        for(int i=0; i<k; i++){
            ans[i]=heap.poll();
        }
        return ans;

        
    }

}
