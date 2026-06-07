class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<allowed.length(); i++){
            set.add(allowed.charAt(i));
        }
         int result = 0;
        for(int j=0; j<words.length; j++){
                String word = words[j];
                int count = 0;
               // here each string ch is checked does it is in the set
            for(int k=0; k<word.length(); k++){
                         char ch = word.charAt(k);
// if the ch is in the set then count++
                         if(set.contains(ch)){
                                count++;
                         } 
 // and if suppose count = 3 and word length = 3 then it is consistent
                         if(count == word.length()){
                             result ++;
                         }
            }
        
        }
        return result;
        }
       
    }
