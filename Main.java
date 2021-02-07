java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner input= new Scanner ();
    System.out.println("Hello World, let's do some calculations!" + "\n" + "Enter the two numbers you want to add");
    int a= input.nextInt();
    int b= input.nextInt();
    System.out.println("You result is " a+b);
  }
}