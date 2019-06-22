// Swapping of two numbers

class swapingofNumbers{
  
//main method
  public static void main(String []args){
   swap obj = new swap();                                                //creation of object
   int a=5;
   int b =7; 
   obj.swaping(a,b);                                                     //function call through object
   System.out.println("The original value of a: "+a + " and b:" +b);     //print command
  
  }
}

//swapping class
class swap{
//method to swap two integers
   void swaping(int a, int b){
     a=a+b;
     b=a-b;
     a=a-b;
     System.out.println("After swaping a: "+a +" and b: " +b);
  }
}