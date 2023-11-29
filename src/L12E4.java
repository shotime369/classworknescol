import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L12E4 {

    public static void displayCar(car thiscar){
        System.out.format("--------------------\n" +
                        "%s %s (%d) \n" +
                        "Vin: " + "%s \n" +
                        "Price: " + "%d \n" +
                        "Colour: " + "%s \n" +
                        "Mileage: "+ "%d \n" +
                        "Condition: "+ "%s \n" +
                        "--------------------"
                ,thiscar.make,thiscar.model, thiscar.year, thiscar.vin, thiscar.price, thiscar.colour, thiscar.mileage, thiscar.condition);
    }

    public static ArrayList<car> loadFile(String filename){
        List<String> carDetails;
        ArrayList<car> thisClass = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader(filename));
            String line = in.readLine();
            while (line != null) {
                carDetails = Arrays.asList(line.split(","));
                car newCar = new car();
                //newCar.id = Integer.parseInt(carDetails.get(0));
                newCar.make = carDetails.get(0);
                newCar.model = carDetails.get(1);
                newCar.year = Integer.parseInt(carDetails.get(2));
                newCar.vin = carDetails.get(3);
                newCar.price = Integer.parseInt(carDetails.get(4));
                newCar.colour = carDetails.get(5);
                newCar.mileage = Integer.parseInt(carDetails.get(6));
                newCar.condition = carDetails.get(7);
                thisClass.add(newCar);
                line = in.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error occurred reading file: " + e.toString());
        }
        return thisClass;
    }

    public static void main(String[] args) {
        // load file contents into an array of student objects
        ArrayList<car> thisClass = loadFile("carSales.txt");
        // loop for all objects and show details
        for(int i=0;i<thisClass.size();i++){
            car thiscar = (car) thisClass.get(i);
            displayCar(thiscar);
        }
    }


}
