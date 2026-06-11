The beauty of a substring is:

Beauty = (highest frequency) - (lowest frequency)

where you consider only the characters that appear in that substring

Time Complexity: O(n² * 26) ≈ O(n²)
Space Complexity: O(26) ≈ O(1) (for lowercase English letters).

  "aab"
i = 0
    j = 0 -> "a"    -> beauty -> add to sum
    j = 1 -> "aa"   -> beauty -> add to sum
    j = 2 -> "aab"  -> beauty -> add to sum

i = 1
    j = 1 -> "a"    -> beauty -> add to sum
    j = 2 -> "ab"   -> beauty -> add to sum

i = 2
    j = 2 -> "b"    -> beauty -> add to sum



you can solve it using hashmap or array[] because the lower aplhabet = 26 so array of [26]
  and in arr[0] a value be stored in arr[1] b value will be stored

//using HashMap
class solution{
  public int beautySum(String s){
    int sum =0;
   // the starting index of the substring

    for(int i=0; i<s.length; i++){
      // Frequency map for substrings starting at index i create krta hai new map when i++ 
      HashMap<Character, Integer> map = new HashMap<>();
      for(int j=0; j<s.length; j++){
        char ch = s.charAt(j);
        map.put(ch, map.getOrDefault(ch, 0) + 1);
        int max = 0;
        int min = Integer_MAX_VALUE;
         // Traverse all frequencies in the current substring
        for(int freq : map.values()){
        // Beauty = max frequency - min frequency

          max = Math.max(max, freq);
          min = Math.min(min, freq);
        }
        sum += max - min;
      }
    }
    return sum;
  }
}

// using arr[]

public int beautySum(String s) {
  int sum = 0;
for(int i=0; i<s.length; i++){
  int[] freq = new int[26];

 for(int j=i; j<s.length; j++){
   freq[s.charAt(j) - 'a']++;
      int max = 0;
int min = Integer.MAX_VALUE;
   for(int k=0; k<26; k++){
     if(freq[k] > 0) {
       max = Math.max(max, freq[k]);
       min = Math.min(min, freq[k]);
     }
   }
     sum += max-min;
   }
 }
return sum;
}

  
