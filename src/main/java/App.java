import models.Party;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class App {

    public static void main(String[] args) {
        boolean programRunning = true;
<<<<<<< HEAD
        while(programRunning) {

            System.out.println("How many guests will be attending?");

            try{
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                String guestTotal = bufferedReader.readLine();

                System.out.println("Ok, great, " + guestTotal + " guests. How many meals will be ordered?");
                String inputMealString = bufferedReader.readLine();
                System.out.println("Excellent! " + inputMealString + " meals. How many drinks will be ordered?");
                String inputDrinkString = bufferedReader.readLine();
                System.out.println("Also,  " + inputDrinkString + " Drinks. Do you want to include a DJ for $300? ('yes' or 'no'");

                String inputEntertainment = bufferedReader.readLine();
                boolean yesNo = false;

                if (inputEntertainment.equals("yes")){
                    yesNo = true;
                }

                System.out.println("Enter your coupon code ('50for100' or '$50off' or enter 'finish' if no coupon.");
                String inputCoupon = bufferedReader.readLine();

                System.out.println(inputCoupon);

                Party newParty = new Party(Integer.parseInt(guestTotal), Integer.parseInt(inputMealString), Integer.parseInt(inputDrinkString), yesNo, inputCoupon);

                System.out.println("Wonderful, your final cost is,  $" + newParty.calculateFullPrice());
                programRunning = false;
=======
            while(programRunning) {

                System.out.println("How many guests will be attending?");

                try{
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                    String guestTotal = bufferedReader.readLine();

                    System.out.println("Ok, great, " + guestTotal + " guests. How many meals will be ordered?");
                    String inputMealString = bufferedReader.readLine();
                    System.out.println("Excellent! " + inputMealString + " meals. How many drinks will be ordered?");
                    String inputDrinkString = bufferedReader.readLine();
                    System.out.println("Also,  " + inputDrinkString + " Drinks. Do you want to include a DJ for $300? ('yes' or 'no'");

                    String inputEntertainment = bufferedReader.readLine();
                    boolean yesNo = false;

                    if (inputEntertainment.equals("yes")){
                        yesNo = true;
                    }

                    System.out.println("Enter your coupon code ('50for100' or '$50off' or enter 'finish' if no coupon.");
                    String inputCoupon = bufferedReader.readLine();

                    System.out.println(inputCoupon);

                    Party newParty = new Party(Integer.parseInt(guestTotal), Integer.parseInt(inputMealString), Integer.parseInt(inputDrinkString), yesNo, inputCoupon);

                    System.out.println("Wonderful, your final cost is,  " + newParty.calculateFullPrice());
                    programRunning = false;
>>>>>>> a0e26e25fdb9f768674714db48dee76b0e23404d

            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }
    }

}
