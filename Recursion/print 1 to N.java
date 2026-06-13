import java.util.Scanner;
class Main {
    public static void num(int n){
        if(n<1){
            return;
        }
        num(n-1); //(3,1), (2,1), (1,1) , (0,1)
        System.out.println(n);
    }
    
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       num(n);
    }
}
