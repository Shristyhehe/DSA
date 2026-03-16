class Main {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int sp=1; sp<=(n-i); sp++){
                System.out.print(" ");
            }
            for(int sp=1; sp<=(n-i); sp++){
                System.out.print(" ");
            }
             for(int j=1; j<=i; j++){
                System.out.print("*");
            }
               System.out.println("");
        }
        for(int j=1; j<=n; j++){
            for(int st=1; st<=(n-j+1); st++){
                System.out.print("*");
            }
            for(int sp=1; sp<=(j-1); sp++){
                System.out.print(" ");
            }
             for(int sp=1; sp<=(j-1); sp++){
                System.out.print(" ");
            }
             for(int st=1; st<=(n-j+1); st++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
      
