class Finally1 {
  public static void main(String[] args) {
 
    try {
      int data= 25/0; 
    }
    catch (ArithmeticException e) {
      System.out.println(e);
    }
 
    finally {
      System.out.println("finally block will execute always.");
    }
  }
}