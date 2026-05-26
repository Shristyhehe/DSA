//xor approach(is there which is in notebook hint is given in the question)
//BRUTE FORCE APPRAOCH
//Time compplexity O(n2) and space complexity O(1)

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n - 1];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 1; i <= n; i++){

            boolean matching = false;

            for(int j = 0; j < arr.length; j++){ // if i and j is not true it will traverse all the elemnts of j

                if(i == arr[j]){
                    matching = true;
                    break;
                }
            }

            if(matching == false){  // means i not equals to j then that num is missing
                System.out.println("Missing number is: " + i);
            }
        }
    }
}

//Hashing approach Tc is O(n) and sc is O(n)
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // size or how many elements


        //eg if n = 6 then array size is 5 and array elemnts is 5(0 to 4)
        int arr[] = new int[n - 1]; 
       int hash[] = new int[n+1]

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        //array ka elemts dal re hashing pe and and jo elements honge woh hash k index pe jaa k 1 value hoga
      for(int i=0; i<arr.length; i++){
          hash[arr[i]] = 1;
      }
      //aab hum 1 to n tak dekheneg (oth index pe nhi)
      // if 1 to n pe koi hash index pe 0 except then that is the missing no
       for(int i=1; i<=n; i++){
           if(hash[i] == 0){
               System.out.println(i);
           }
       }
    }
}


//optimal approach 
//so time complexity is O(n)  and space is O(1)
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // size or how many elements


        //eg if n = 6 then array size is 5 and array elemnts is 5(0 to 4)
        int arr[] = new int[n - 1]; 
       

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int sum1=0;
        int sum2 =0; 
        for(int i=1; i<=n; i++){ // 1 to n sum
            sum1 = sum1 + i;
        }
        for(int j =0; j<arr.length; j++){ // sum of n-1 elemnts
            sum2 = sum2 + arr[j];
        }
        // the sum1 - sum 2 will give the missing no
        int temp = sum1 - sum2; 
        System.out.println("the missing no is : " + temp);
    }
}
