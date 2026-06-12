recursion -> when a function call itself
              until a specified condition is true

  printing count until 3
  
  class solution{
  public static void recursion(int count){
    if(count==3){
      return;
    }
    System.out.print(count);
    recursion(count+1);
  }
  public static void main(String args[]){
    int count = 0;
    recursion(count);
  }
}

  
