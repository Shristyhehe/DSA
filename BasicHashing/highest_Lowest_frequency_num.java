//Highest and lowest Frequency num
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i] , map.getOrDefault(arr[i], 0) + 1);
        }
        
        int maxFreq = 0; // making the maxValue = 0
        int maxElement = -1; // no key found yet or you can do ans = 0 which means same as -1
        int minFreq = Integer.MAX_VALUE;
        int minElement = -1;
        for(HashMap.Entry<Integer, Integer> entry : map.entrySet()){
            // returning the highest frequency
            if(entry.getValue() > maxFreq){
                maxFreq = entry.getValue();
                maxElement = entry.getKey();
            }
             
              if(entry.getValue() < minFreq){
                minFreq = entry.getValue();
                minElement = entry.getKey();
            }
        }
        System.out.println("the highest frequency num is : " + maxElement);
         System.out.println("the lowest frequency num is : " + minElement);
    }
}
