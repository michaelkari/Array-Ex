import java.util.Scanner;
import java.util.Random;
import java.text.*;

public class MichaelKarimizadehArrayExercises{
  public static void main(String[] args){
    //Exercise 1
    /*
    Scanner sc=new Scanner(System.in);
    Scanner sc1=new Scanner(System.in);
    Random r=new Random();
    DecimalFormat df=new DecimalFormat("00000");
    String[] plate;
    String plateInput;
    int numOfPlates;
    int sku=1;
    int selection;
    int skuInput;
    char charTemp;
    boolean duplicate=false;
    boolean findPlate=false;
    System.out.print("Enter number of license plates to genereate:\t");
    numOfPlates=sc.nextInt();
    System.out.println("\nSku #\tLICENSE PLATE");
    plate=new String[numOfPlates];
    for(int counter=0;counter<numOfPlates;counter++){
     plate[counter]="";
    }
    for(int counter=0;counter<numOfPlates;counter++){
      for(int counter1=0;counter1<4;counter1++){
        charTemp=(char)(r.nextInt(90-65)+65);
        plate[counter]=charTemp+plate[counter];
      }
      plate[counter]=plate[counter]+" "+(r.nextInt(9000)+1000);
      System.out.println(df.format(sku)+"\t"+plate[counter]);
      sku++;
    } 
    for(int counter=0;counter<numOfPlates;counter++){
     for(int counter1=counter+1;counter1<numOfPlates;counter1++){
      if(counter1!=counter && plate[counter1].equals(plate[counter])){
       duplicate=true;
       System.out.println("SKU #"+df.format(counter)+" and SKU #"+df.format(counter1)+" are the same ("+plate[counter1]+") !");
      }
     }
    }
    if(duplicate==false){
     System.out.println("No duplicate license plate numbers found!");
    }
    System.out.println("\nPlease select one of the following search options:\n");
    System.out.println("1 - Find a SKU");
    System.out.println("2 - Find a driver's license number\n");
    System.out.print("Enter a selection\t\t\t");
    selection=sc.nextInt();
    if(selection==1){
     System.out.print("Enter a SKU\t\t\t\t");
     skuInput=sc.nextInt();
     if(skuInput>numOfPlates || skuInput<1){
      System.out.println("The SKU# does not exist");
     }
     else{
      System.out.println("SKU# "+df.format(skuInput)+" is "+plate[skuInput-1]+"!");
     }
    }
    else if (selection==2){
     System.out.print("Enter a driver's license number:\t");
     plateInput=sc1.nextLine();
     for (int counter = 0; counter < plate.length; counter++) {
     if(plate[counter].equals(plateInput)){
      findPlate=true;
          System.out.println(plateInput+" has been assigned SKU# "+df.format(counter+1));
     }
    }
    if(findPlate==false){
     System.out.println("That plate number does not exist");
    }
   } 
   */
    
    //Exercise 2
    /*
    int []oneArray;
    int input;
    int temp;
    int sampleSum=0;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter an integer:\t");
    input=sc.nextInt();
    oneArray=new int[input];
    for(int counter=0;counter<input;counter++){
      oneArray[counter]=1;
    }
    System.out.println("Enter "+input+" integers");
    for(int counter=0;counter<input;counter++){
      System.out.print("Enter an integer:\t");
      //input=sc.nextInt();
      oneArray[counter]=sc.nextInt();
    }
    temp=oneArray[input-1];
    oneArray[input-1]=oneArray[0];
    oneArray[0]=oneArray[input-1];
    for(int counter=0;counter<input;counter++){
      if(oneArray[counter]<0){
        oneArray[counter]=oneArray[counter]*(-1);
      }
    }
    
    for(int counter=0;counter<input;counter++){
      sampleSum=sampleSum+oneArray[counter];
    }
    for(int counter=0;counter<input;counter++){
      if(oneArray[counter]%2==0){
        System.out.println(oneArray[counter]);
      }
    }
    */

    //Exercise 3
    /*
    Scanner sc=new Scanner(System.in);
    int []fVersionA=new int[14];
    int []fVersionB=new int[14];
    int []sVersion=new int[14];
    int temp;
    for (int counter=0;counter<14;counter++){
    	System.out.println("Enter an input");
		fVersionA[counter]=sc.nextInt();
		sVersion[counter]=fVersionA[counter];
	}
	System.out.println("\n");
	for (int counter=0;counter<14;counter++){
		fVersionB[counter]=fVersionA[14-counter-1];
		System.out.println(fVersionB[counter]);
	}
	System.out.println("\n");
	for (int counter=0;counter<14/2;counter++){
		temp=sVersion[counter];
		sVersion[counter]=sVersion[14-counter-1];
		sVersion[14-counter-1]=temp;
	}
	for (int counter=0;counter<14;counter++){
		System.out.println(sVersion[counter]);
	}
	*/

	//Exercise 4
	/*
	int sum=0;
	int[][] data={{3,2,5},{1,4,4,8,13},{9,1,0,2},{0,2,6,4,-1,-8}};
	for(int counter=0;counter<data.length;counter++){
		for(int counter1=0;counter1<data[counter].length;counter1++)
			sum=sum+data[counter][counter1];
	}
	System.out.println(sum);
	*/

	//Exercise 5
	/*
    int[][] a;
    int[]avg;
  	int[]testAvg;
  	int numOfStudents;
  	int numOfTests;
  	int max=0;
 	int index=0;
 	int classAvg=0;
  	Scanner sc= new Scanner(System.in);
  	System.out.println("Enter the amount of students");
  	numOfStudents=sc.nextInt();
  	System.out.println("Enter the amount of tests");
  	numOfTests=sc.nextInt();
  	a=new int[numOfStudents][numOfTests];
  	avg=new int[numOfStudents];
  	testAvg=new int[numOfTests];
  	for (int counter=0;counter<numOfStudents;counter++){
   		for(int counter1=0;counter1<numOfTests;counter1++){
    		System.out.println("Enter the student's score for test "+(counter1+1));
    		a[counter][counter1]=sc.nextInt();
   		}
  	}
  	for (int counter=0;counter<numOfStudents;counter++){
   		for(int counter1=0;counter1<numOfTests;counter1++){
    		avg[counter]=avg[counter]+a[counter][counter1];
   		}
   		avg[counter]=avg[counter]/numOfTests;
   		System.out.println("Student "+(counter+1)+" has an average of "+avg[counter]);
  	}
  	for (int counter=0;counter<numOfStudents;counter++){
   		classAvg=classAvg+avg[counter];
  	}
  	classAvg=classAvg/numOfStudents;
  	for (int counter=0;counter<numOfStudents;counter++){
   		if(avg[counter]>max){
    	max=avg[counter];
    	index=counter+1;
   		}
  	}
  	System.out.println("The student with the highest average is student "+index);
  	for (int counter=0;counter<numOfStudents;counter++){
  		if(avg[counter]>classAvg){
  			System.out.println("Student "+(counter+1)+" has an average higher than the class average");
  		}
  	}
  	*/
  }
}