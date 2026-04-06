import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.print("enter the no :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = (int)(Math.log10(n) + 1);
System.out.println("the total digits is:" + count);
    }
}


// here we have the time complexity as O(1);

//now another approach here we are using the division by 10  O(log N)
int n = sc.nextInt();
int count = 0;
while(n!=0){
  n = n/10;
  count++;
}
soutln(count);
