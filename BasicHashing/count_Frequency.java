//O(n) -> tc

Space Complexity = O(1)

import java.util.Scanner;
import java.util.HashMap;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
       /* HashMap.Entry<K, V> is used to represent one key-value pair in a HashMap.
          HashMap<Integer, Integer> map = new HashMap<>();

                 map.put(10, 3);
                 map.put(5, 2);
                 map.put(15, 1);
                   Each of these pairs is a HashMap.Entry.
                      For example:
                    (10, 3) is one Entry.
                     map.entrySet() returns a set of all key-value pairs (entries) in the HashMap.*/
    for(HashMap.Entry<Integer, Integer> entry : map.entrySet()){
        System.out.println(entry.getKey() + " " + entry.getValue());
    }

    }
}
