class ExceptionEg5
{
  public static void main(String args[])
  {
      try
      {
        try
        {
            System.out.println("going to divide");
            int b=59/0;
         }
         catch(ArithmeticException e)
         {  
            System.out.println(e);
          }
        try
        {
            int a[]=new int[5];
            a[5]=4;
         }
        catch(ArrayIndexOutOfBoundsException e) 
        {
            System.out.println(e);}
            System.out.println("other statement");
        }
        catch(Exception e)
        {
          System.out.println("Exception handeled");}
          System.out.println("casual flow");
    }
}