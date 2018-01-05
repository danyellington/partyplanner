import models.Party;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class App {

    public static void main(String[] args) {
        boolean programRunning = true;
        //public class Party {

            Party guest = new Party();
            Party meal = new Party();
            Party drink = new Party();
            Party entertainment = new Party();


//            ArrayList<PartyCost> PartyCost = new ArrayList<PartyCost>();
//
//            PartyCost.add(guest)
//                    PartyCost.add(meal)
//                    PartyCost.add(drink)
//                    PartyCost.add(entertainment);

            while(programRunning) {

                System.out.println("How many guests will be attending?");

                try{
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                    String inputString = bufferedReader.readLine();

                    System.out.println("Ok, great, " + inputString + " guests. How many meals will be ordered?");

                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
                try{
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                    String inputMealString = bufferedReader.readLine();

                    System.out.println("Excellent! " + inputMealString + " meals. How many drinks will be ordered?");

                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
                try{
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                    String inputDrinkString = bufferedReader.readLine();

                    System.out.println("Also,  " + inputDrinkString + " Drinks.");


                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
                try{
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                    String price = bufferedReader.readLine();

                    System.out.println("Wonderful, your final cost is,  ");
                    programRunning = false;

                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
            }
            }

    }





