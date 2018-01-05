package models;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Party {
    public static void main(String[] args) {
        System.out.println("How many guests will be attending?");
        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String stringNumber = bufferedReader.readLine();
            Integer yourNumber = Integer.parseInt(stringNumber);
            // Integer yourDoubledNumber = yourNumber * 2;

            System.out.println(yourNumber + " guests");

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }


}
