  import java.util.*;
  
  public class MichaelKarimizadehArrays{
    public static void main(String[] args){
      //Exercise 2
      /*
      Scanner sc=new Scanner (System.in);
      int[] numbers=new int[20];
      int numbersTotal=0;
      double avg;
      for (int counter=0; counter<numbers.length; counter++){
        System.out.println("Please enter a persons height:");
        numbers[counter]=sc.nextInt();
      }
      for (int counter=0; counter<numbers.length; counter++){
        numbersTotal=numbersTotal+numbers[counter];
      }
      avg = numbersTotal/20;
      for (int counter=0; counter<numbers.length; counter++){
        if (numbers[counter]>avg)
          System.out.println(numbers[counter]);
      }
      */
      
      //Exercise 3
      /*
      Scanner sc=new Scanner (System.in);
      double[] numbers=new double[6];
      for (int counter=0; counter<numbers.length; counter++){
        System.out.println("Please enter a value");
        numbers[counter]=sc.nextInt();
      }
      int counter=6;
      while(counter!=0){
        System.out.println(numbers[counter-1]);
        counter--;
      }
      for (counter=0; counter<numbers.length; counter++){
        System.out.println(numbers[counter]+(numbers[counter]*0.1));
      }
      for (counter=0; counter<numbers.length; counter++){
        if (numbers[counter]>50)
          System.out.println(numbers[counter]);
      }
      */

      //Exercise 4
      /*
      double input;
      String[] name=new String[4];
      int[] mark=new int[4];
      Scanner sc=new Scanner (System.in);
      for (int counter=0; counter<name.length; counter++){
        System.out.println("Please enter a name");
        name[counter]=sc.nextLine();
      }
      for (int counter=0; counter<mark.length; counter++){
        System.out.println("Please enter a mark");
        mark[counter]=sc.nextInt();
      }
      System.out.println("Please enter a mark and I will search for a person with that mark");
      input=sc.nextDouble();
      for (int counter=0; counter<mark.length; counter++){
        if (input==mark[counter]){
         System.out.println(name[counter]+" has that mark.");
        }
        else if (counter==mark.length){
         System.out.println("The mark doesn's exist");
        }
      }
      */
    }
  }