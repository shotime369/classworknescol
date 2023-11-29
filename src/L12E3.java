

public class L12E3 {

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

    public static void main(String[] args) {
        car car1 = new car();
        car1.make = "Ferrari";
        car1.model = "F430";
        car1.year = 2009;
        car1.vin = "3GYVKNEFXAG625569";
        car1.price = 55125;
        car1.colour = "White";
        car1.mileage = 45336;
        car1.condition = "Good";


        displayCar(car1);
    }


}
