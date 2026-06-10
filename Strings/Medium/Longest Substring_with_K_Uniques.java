class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
     int left  =0;
     int count = 0;
     int max = -1;
     HashMap<Character, Integer> map = new HashMap<>();
     for(int right = 0; right<s.length(); right++){
         char ch = s.charAt(right);
         map.put(ch, map.getOrDefault(ch, 0) + 1);
             while(map.size()> k){
                 char sh = s.charAt(left);
                 int freq = map.get(sh);
                 freq--;
                 if(freq==0){
                     map.remove(sh);
                 }
                 else{
                     map.put(sh, freq);
                 }
                 left++;
             }
            
             if(map.size() == k){
                  max = Math.max(max,right-left +1);
             }
                
             }
           return max;   
     }
   
}
