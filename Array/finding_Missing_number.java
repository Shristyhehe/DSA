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

            for(int j = 0; j < arr.length; j++){

                if(i == arr[j]){
                    matching = true;
                    break;
                }
            }

            if(matching == false){
                System.out.println("Missing number is: " + i);
            }
        }
    }
}
