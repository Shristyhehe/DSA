import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = 0;
        for(int i=0; i<arr.length; i++){
            left = i;
         right = arr.length - 1-i;
            if(left < right){
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
            }
        else{ //when left > right || left==right means array reverse ho chuka hai
            break;
        }
        }
  for(int i=0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
  }
    }
}
