import models.Party;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class App {

    public static void main(String[] args) {
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

            while(true) {
                System.out.println("How many?");

                try{
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                    String inputString = bufferedReader.readLine();

                    System.out.println("Color entered : " + inputString);
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
            }
            }

    }





