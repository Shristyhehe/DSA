class Main {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i+1); j++){
                System.out.print("*");
            }
            for(int sp=1; sp<=(i-1); sp++){
                System.out.print(" ");
            }
            for(int sp=1; sp<=(i-1); sp++){
                System.out.print(" ");
            }
            for(int j=1; j<=(n-i+1); j++){
                System.out.print("*");
            }
            
               System.out.println("");
        }
        for(int j=1; j<=n; j++){
            for(int st=1; st<=j; st++){
                System.out.print("*");
            }
            for(int sp=1; sp<=(n-j); sp++){
                System.out.print(" ");
            }
             for(int sp=1; sp<=(n-j); sp++){
                System.out.print(" ");
            }
             for(int st=1; st<=j; st++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
      
