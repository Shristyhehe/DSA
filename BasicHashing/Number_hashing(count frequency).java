import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array : ");
        int n = sc.nextInt();
        System.out.print("enter the elements in the array : ");
        int arr[] = new int[n];
        for(int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i=0; i<arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int hash[] = new int[max + 1];
        for(int i=0; i<arr.length; i++){
            hash[arr[i]]++;
        }
        for(int i=0; i<hash.length; i++){
            if(hash[i] > 0){
               System.out.println(i + hash[i]); 
            }
        }
        
    }
}
