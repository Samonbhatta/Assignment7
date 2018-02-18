

import java.util.Scanner;

public class index {

    public static int number(double []array){
        double minimumnumber=array[0];
        int index =0;
        for(int i=1;i<array.length;i++){
            if(array[i]<minimumnumber){
                minimumnumber=array[i];
                index=i;
            }
        }
        return index;

    }

    public static void main(String[] args) {
	Scanner scanner = new Scanner( System.in );
	double []numbers = new double[10];
	System.out.println( "Please enter 10 different numbers" );
	for(int count = 1;count<10;count++){
	    numbers[count]=scanner.nextDouble();
    }
    System.out.println( "THe index of smallest element "+ number( numbers )+"\n And the smallest element is" +numbers[number( numbers )]);
    }
}
