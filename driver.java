import java.util.Scanner;

public class driver {

    public static void main (String[] args) {

    Scanner scan = new Scanner (System.in);//Here, a Scanner object named scan is created to read input from the console (System.in). This scanner will be used to read values entered by the user.
    
    System.out.println("enter your buying price per share:");
    double buyingPrice = scan.nextDouble();//this line reads a double value from the user using the scan scanner and assigns it to the variable buyingPrice. This value represents the buying price per share and the .nextdouble meathod is part of scanner class which reads double from the user//
    int day=1;//A variable day is declared and initialized with a value of 1. This variable will be used to keep track of the current day in the simulation.
    double closingPrice=0.1;
    while (true){
        System.out.println("enter the closing price for day " + day);
    closingPrice = scan.nextDouble();
    if (closingPrice<0.0) break;
    double earnings = closingPrice - buyingPrice;
    if (earnings>0){
        System.out.println("after day"+ day+",you earned "+ earnings + "perShare");
    }
    else if (earnings <0){
        System.out.println("after day"+ day+",you lost "+ (-earnings) + "perShare");
        }
    else{
        System.out.println("after day" +day + ",you have" + "no earnings per share.");

    }
    day +=1;

}
scan .close();
    }
}

