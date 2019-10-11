import java.util.*;
  
  public class MichaelKarimizadehMoreArrays{
    public static void main(String[] args){
      
      //Exercise 1
      /*
      Random rdm=new Random();
      int[] numbers=new int[10];
      int min=100;
      int max=1;
      for (int counter=0; counter<numbers.length; counter++){
        numbers[counter]=rdm.nextInt(100);
        System.out.println(numbers[counter]);
      }
      for (int counter=0; counter<numbers.length; counter ++){
        if (numbers[counter]>max){
          max=numbers[counter];
        }
      }
      for (int counter=0; counter<numbers.length; counter ++){
        if (numbers[counter]<min){
          min=numbers[counter];
        }
      }
      System.out.println("The largest number is "+max+" and the smallest number is "+min+".");
      */
      
      //Exercise 2
      /*
      int[] valA=new int[10];
      int[] valB=new int[10];
      Scanner sc=new Scanner(System.in);
      for (int counter=0; counter<valA.length; counter++){
      System.out.println("Enter a number");
        valA[counter]=sc.nextInt();
      }
      for (int counter=0; counter<valB.length; counter++){
        valB[counter]=25-valA[counter];
      }
      for (int counter=0; counter<valA.length; counter++){
        System.out.println("Value A is "+valA[counter]+" and value B is "+valB[counter]);
      }
      */
      
      //Exercise 3
      /*
      int[] valA=new int[10];
      int[] valB=new int[10];
      Scanner sc=new Scanner(System.in);
      for (int counter=0; counter<valA.length; counter++){
        System.out.println("Enter a number");
        valA[counter]=sc.nextInt();
      }
      for (int counter=0; counter<valB.length; counter++){
        valB[counter]=valA[9-counter];
      }
      for (int counter=0; counter<valA.length; counter++){
        System.out.println("Value A is "+valA[counter]+" and value B is "+valB[counter]);
      }
      */
      
      //Exercise 4
      /*
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of an array.");
      n=sc.nextInt();
      int[] valA=new int[n];
      for (int counter=0; counter<valA.length; counter++){
        System.out.println("Enter a number");
        valA[counter]=sc.nextInt();
      }
      for (int counter=0; counter<valA.length; counter++){
        System.out.println("valA["+counter+"] is "+valA[counter]);
      }
      System.out.println("\nReversing order\n");
      for (int counter=0; counter<valA.length/2; counter++){
        int temporary=valA[counter];
        valA[counter]=valA[valA.length-counter-1];
        valA[valA.length-counter-1]=temporary;
      }
      for (int counter=0; counter<valA.length; counter++){
        System.out.println("valA["+counter+"] is "+valA[counter]);
      }
      */
    }
  }