class Main {
    public static void main(String[] args) {
        int n = 7;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("4");
                }
                else if(i==2 || i==(n-1) || j==2 || j==(n-1)){
                    System.out.print("3");
                }
                else if(i==3 || i==(n-2) || j==3 || j==(n-2)){
                    System.out.print("2");
                }
                else{
                    System.out.print("1");
                }
            }
             System.out.println("");
        }
       
    }
}
