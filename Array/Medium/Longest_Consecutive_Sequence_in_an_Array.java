TC  is O(N) and sc is O(N)

class Solution{
public int longestConsecutive(int arr[]){

 // Edge case: empty array

if(arr.length == 0){
return 0;
}
 // Store all unique elements
HashSet<Integer> set = new HashSet<>();
for(int nums: arr){
set.add(nums)
} 

//this is for total length of consecutive subsequence

int maxLength = 1;
 // Store all unique elements

for(int nums: set){

// If num-1 exists, num is not the start of a sequence 
if(set.contains(nums-1){
continue;
}

int count = 1;
int nextNumber = nums + 1;

 // num is the start of a sequence

// Keep extending the sequence 
while(set.contains(nextNumber){
count++;
nextNumber++;
}
// Update maximum length found so far
maxLength = Math.max(maxLength; Count);
}
return maxLength;
}

}







// example
Steps
Insert all elements into a HashSet.
Traverse the set.
If num-1 exists → skip.
Otherwise, num is the start.
Keep checking num+1, num+2, num+3 ...
Count sequence length.
Update maximum length.

