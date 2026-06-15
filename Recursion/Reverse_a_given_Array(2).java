/*For a primitive int[], Collections.reverse() does not work directly because Arrays.asList(arr) treats the entire int[] as a single element.

So for DSA problems with int[], your two-pointer swap approach is the standard solution.*/


import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for(int i =0;i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Collections.reverse(Arrays.asList(arr));
        System.out.print(Arrays.toString(arr));
    }
}
