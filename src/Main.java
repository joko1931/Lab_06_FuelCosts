import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double totalGallons = 0;
        double gallonPrice = 0;
        double fuelEfficiency = 0;
        String trash = "";
        boolean totalDone = false;
        boolean priceDone = false;
        boolean fuelDone = false;

        do
        {
            System.out.println("Please enter total gallons the car has: ");
            if (in.hasNextDouble())
            {
                totalGallons = in.nextDouble();
                totalDone = true;
                do
                {
                    System.out.println("Please enter price per gallon: ");
                    if (in.hasNextDouble())
                    {
                        gallonPrice = in.nextDouble();
                        priceDone = true;
                        do
                        {
                            System.out.println("Please enter miles per gallon: ");
                            if (in.hasNextDouble()) {
                                fuelEfficiency = in.nextDouble();
                                fuelDone = true;
                                
                            }
                            else
                            {
                                trash = in.nextLine();
                                System.out.println("Please enter valid value, not " + trash);
                            }
                        }while (!fuelDone);
                    }
                    else
                    {
                        trash = in.nextLine();
                        System.out.println("Please enter valid value, not " + trash);
                    }
                }while(!priceDone);
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Please enter valid value, not " + trash);
            }
        }while(!totalDone);
    }
}