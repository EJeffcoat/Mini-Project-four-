import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
Scanner scan = new Scanner(System.in);
// This code is going to take my name, the year, and my birthyear to identify how old I am/ how old I will be this year.
System.out.println("What is your name?");
String name = scan.next();
System.out.println("What year is it?");
int currentYear = scan.nextInt();
System.out.println("What is your birth year?");
int birthYear = scan.nextInt();

  System.out.println(greeting(name));
  
  int age = getAge(birthYear, currentYear);
  System.out.println("Your age is " + age);
  }
  static int getAge (int birthYear, int currentYear)
{
int age = currentYear - birthYear;
return age;
}
static String greeting(String name)
{
  String hello = "Hello. Welcome back," + name;
  return hello; 

}

 static String ready(boolean dressedForWork)
 {
   if(dressedForWork)
   {
    return "You're good to go";
   }else{
      return "You're not ready yet";    
   }
 }

}
