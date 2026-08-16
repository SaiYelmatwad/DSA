class Solution {
    public int appendCharacters(String s, String t) {
        int p1=0;
        int p2=0;
        int m=s.length();
        int n=t.length();
        while(p1<m && p2<n){
            if(s.charAt(p1)==t.charAt(p2)){
                p2++;
            }
            p1++;
        }
        return n-p2;
    }
}