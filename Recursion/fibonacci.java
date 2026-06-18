using for loop

class Solution{
  public int fib(int n) {
    if(n==1){
      return 1;
    }
    int arr[] = new int[n+1];
    for(int i=0; i<arr.length; i++){
      arr[0] = 0;
      arr[1] = 1;
      arr[i] =  arr[i-1] + arr[i-2];
    }
    return arr[n];
  }
}

//using functional recursion
class Solution{
  public int fib(int n) {
    if(n==0) {
      return 0;
    }
    
    if(n==1){
      return 1;
    }
   return fib(n-1) + fib(n-2);
  }
}
