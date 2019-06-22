class assign{
  
  public static void main(String []args){
  swap obj = new swap();
  obj.swaping(5,7);
  System.out.println("The value of a: "+a "and b:" +b); 
  
}
}

class swap{
   void swaping(int a, int b){
     a=a+b;
     b=a-b;
     a=a-b;
     System.out.println("After swaping a: "+a"and b: " +b);
}
}