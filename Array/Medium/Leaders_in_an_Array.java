/*arr[n-1] is always a leader.
Store its value in a variable.
Add it to the result list.
Traverse from n-2 to 0.
For each element:
If arr[i] >= the stored leader value, it is a leader.
Add it to the list.
Update the stored value.
Reverse the list before returning.*/
so tc is O(N) we are traversing from array and sc is O(N) using list.
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int maxLeader = arr[arr.length - 1];
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[arr.length - 1]);
        for(int i= arr.length-2; i>=0; i--){
            if(arr[i] >= maxLeader){
                list.add(arr[i]);
                maxLeader = arr[i];
            }
        }
        Collections.reverse(list);
        return list;
        
    }
}
