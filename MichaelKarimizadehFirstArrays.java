  import java.util.*;
  
  public class MichaelKarimizadehFirstArrays{
    public static void main(String[] args){
      //Exercise 1
      /*
      Random rnd=new Random();
      //The array below stores 20 int values
      int[] numbers=new int[20];
      numbers[8]=8;
      System.out.println(numbers[8]);
      //The for statment below displays all elements with a random values for each
      for (int counter=0; counter<numbers.length; counter++){
        numbers[counter]=rnd.nextInt(20)+1;
      }
      for (int counter=0; counter<numbers.length; counter++){
        numbers[counter]=rnd.nextInt(20)+1;
        System.out.println("numbers ["+counter+"] = "+numbers[counter]);
      }
      */

      //Exercise 2
      /*
      Scanner sc=new Scanner(System.in);
      String[] names=new String[]{"Jack  Black","Adam Sandler","Chris Rock","Will Farrell","Jim Carrey"};
      String[] numbers=new String[]{"416-568-8762","416-568-8763","416-568-8764","416-568-8765","416-568-8766"};
      System.out.println("\t\tMY FIVE...\n");
      for (int counter=1; counter<=names.length; counter++){
        System.out.println(counter+".    "+names[counter-1]);
      }
      System.out.print("\nPlease enter a number (1-5):");
      int counter=sc.nextInt();
      System.out.println("Calling "+names[counter-1]+" at "+numbers[counter-1]);
      */

      //Exercise 3
      /*
      int numStudents;
      Scanner sc=new Scanner(System.in);
      Scanner sc1=new Scanner(System.in);
      Scanner sc2=new Scanner(System.in);
      System.out.print("Enter the number of students:\t");
      numStudents=sc.nextInt();
      System.out.print("\n");
      String[] names=new String[numStudents];
      String[] studentNums=new String[numStudents];
      for (int counter=0; counter<numStudents; counter++){
        System.out.print("Enter student name:\t\t");
        names[counter]=sc1.nextLine();
        System.out.print("Enter student number:\t\t");
        studentNums[counter]=sc2.nextLine();
        System.out.print("\n");
      }
      System.out.println("\t\tSTUDENT ROSTER\n");
      System.out.println("NAME\t\t\t\tSTUDENT NUMBER");
      for (int counter=0; counter<numStudents; counter++){
        System.out.print(names[counter]+"\t\t\t");
        System.out.println(studentNums[counter]);
      }
      */
    }
  }