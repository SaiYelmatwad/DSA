lass Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(char i:stones.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(char j:jewels.toCharArray()){
            if (map.containsKey(j)) {
                count+=map.get(j);
            }
        }
        return count;    

    }
}