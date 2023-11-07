import java.util.ArrayList;
import java.util.Scanner;
public class employee{
    public static void main (String[] args){
        System.out.println("how much can you spend?");
        Scanner scan =new Scanner(System.in);
        double total = scan.nextDouble();
        double sum=0;
        int i =0;
        ArrayList<Double> proportion= new ArrayList <Double>();//These lines initialize a few variables. sum is used to keep track of the cumulative sum of proportions entered by the user, i is used as a counter, and proportion is an ArrayList that will store the user's expense proportions.
        System.out.println("enter your proportion of various expenses");
        System.out.print("the system stops if cumlative proportion exceeds 100%");
        do {//This is a do-while loop that repeatedly prompts the user to enter expense proportions. It continues until the sum of the proportions entered so far is less than or equal to 100%. The user's inputs are added to the proportion list, and the cumulative sum is updated. The loop increments the i counter for each iteration.
            System.out.println("your proportion of expense"+ (i+ 1) + ":");
            double value =scan.nextDouble();
            proportion.add(value);
            sum+= proportion.get(i);
            i++;
        }while(sum<=100);
        scan.close();
        if (sum > 100){
            double cumulativeSum =0.0;
            for (int j=0; j< proportion.size()-1; i++){
                cumulativeSum+= proportion.get(j);
            }
            proportion.set(proportion.size()-1,100.0-cumulativeSum);

        }
        for (double value: proportion){
            double expense=value*total/100.0;
            System.out.println("your"+ value+"% equals $" + expense);
        }
    }
}