class Main {
    public static void main(String[] args) {
        int n =5;
        for(int i=1; i<=n; i++){
            for(int sp=1; sp<=(n-i); sp++){
                System.out.print(" ");
            }
            for(int st=1; st<=(2*i-1); st++){
                System.out.print("*");
            }
           for(int sp=1; sp<=(n-i); sp++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
