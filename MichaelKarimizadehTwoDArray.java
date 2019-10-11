import java.util.Scanner;
import java.text.*;

public class MichaelKarimizadehTwoDArray{
 public static void main(String[] args){
  //Exercise 1 StarTable
  /*
  int firstD;
  int secondD;
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the first dimension of array:");
  firstD=sc.nextInt();
  System.out.println("Enter the second dimension of array:");
  secondD=sc.nextInt();
  String[][] a= new String[firstD][secondD];
  for (int counter=0;counter<firstD;counter++){
   for(int counter1=0;counter1<secondD;counter1++){
    a[counter][counter1]="*";
    System.out.println(a[counter][counter1]);
   }
  }
  */

  //Exercise 2 TimesTable
 /*
  int[][] a= new int[12][12];
  System.out.format("%-4s"," ");
  for(int counter=1;counter<=12;counter++){
   System.out.format("%-4s",(counter));
  }
  System.out.print("\n");
  for (int counter=0;counter<12;counter++){
   System.out.format("%-4s",counter+1);
   for(int counter1=0;counter1<12;counter1++){
    a[counter][counter1]=(counter+1)*(counter1+1);
    System.out.format("%-4s",a[counter][counter1]);
   }
   System.out.print("\n");
  }
 */

  //Exercise 3 BasketBall
  /*
  Scanner sc= new Scanner(System.in);
  int[][] a= new int[2][5];
  int total1=0;
  int total2=0;
  int won1=0;
  int won2=0;
  for (int counter=0;counter<2;counter++){
   for(int counter1=0;counter1<5;counter1++){
    System.out.println("Enter the team's score for game "+(counter1+1));
    a[counter][counter1]=sc.nextInt();
   }
  }
  for(int counter=0;counter<5;counter++){
   total1=total1+a[0][counter];
  }
  for(int counter=0;counter<5;counter++){
   total2=total2+a[1][counter];
  }
  for(int counter=0;counter<5;counter++){
   if (a[0][counter]>a[1][counter]){
    won1++;
   }
   else{
    won2++;
   }
  }
  System.out.println("The first team got "+total1+" points total");
  System.out.println("The second team got "+total2+" points total");
  System.out.println("The first team won "+won1+" games");
  System.out.println("The second team won "+won1+" games");
  */

  //Exercise 4 Students
  
  int[][] a= new int[10][5];
  int[]avg=new int[10];
  int[]testAvg=new int[5];
  int max=0;
  int index=0;
  Scanner sc= new Scanner(System.in);
  for (int counter=0;counter<10;counter++){
   for(int counter1=0;counter1<5;counter1++){
    System.out.println("Enter the student's score for test "+(counter1+1));
    a[counter][counter1]=sc.nextInt();
   }
  }
  for (int counter=0;counter<10;counter++){
   for(int counter1=0;counter1<5;counter1++){
    avg[counter]=avg[counter]+a[counter][counter1];
   }
   avg[counter]=avg[counter]/5;
   System.out.println("Student "+(counter+1)+" has an average of "+avg[counter]);
  }
  for (int counter=0;counter<10;counter++){
   if(avg[counter]>max){
    max=avg[counter];
    index=counter+1;
   }
  }
  System.out.println("The student with the highest average is student "+index);
  for (int counter=0;counter<5;counter++){
   for(int counter1=0;counter1<10;counter1++){
    testAvg[counter]=testAvg[counter]+a[counter1][counter];
   }
   testAvg[counter]=testAvg[counter]/10;
   System.out.println("The class average for test "+(counter+1)+" is "+testAvg[counter]);
  }
  
 }
}