class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> output = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                int value=map.get(nums1[i]);
                map.put(nums1[i],value+1);
            }
            else{
                map.put(nums1[i],1);    
            }  
        }
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])){
                int freq=map.get(nums2[i]);
                if(freq>0){
                    output.add(nums2[i]);
                    map.put(nums2[i],freq-1);   
                }
            }
        }
        int[] result=new int[output.size()];
        for(int i=0;i<output.size();i++){
            result[i]=output.get(i);
        }
        return result;
    }
}                        