import java.util.*;

public class L8E3_DoctorDirections {



    public static void main(String[] args) {
        // Set up the directions array
        String[] directions = {"Start by exiting the building you are currently in and turning left onto the main road.",
                "Walk down the road for two blocks until you reach the traffic lights.",
                "At the traffic lights, turn right onto Oak Street.",
                "Follow Oak Street for one block then turn left onto Elm Street.",
                "Walk to the end of Elm Street. Your doctor's office will be the third building on the right side of the road.",
                "Enter through the front door of the office. Let the receptionist know you have arrived for your appointment.",
                "Take a seat in the waiting room. The doctor will call your name when it's time to be seen. You've arrived!"
        };
        // Print out each direction
        int step = 1;
        for (String direction : directions) {
            System.out.format("%d. %s %n", step, direction);
            step++;
        }
        System.out.println("\n");

        String[] newDirections = {
                "Start by exiting the building you are currently in and turning left onto the main road.",
                "Walk down the road for two blocks until you reach the traffic lights.",
                "At the traffic lights, turn right onto Oak Street.",
                "Follow Oak Street for one block then turn left onto Elm Street.",
                "After turning onto Elm Street, walk past the grocery store on your right.",
                "Walk to the end of Elm Street. Your doctor's office will be the third building on the right side of the road.",
                "Enter through the front door of the office. Let the receptionist know you have arrived for your appointment.",
                "Take a seat in the waiting room. The doctor will call your name when it's time to be seen. You've arrived!"
        };
        int step2 = 1;
        for (String lines : newDirections) {
            System.out.format("%d. %s %n", step2, lines);
            step2++;
        }
        System.out.println("\n");
        String[] finalDirections = removeLastElement(newDirections);
        int step3 = 1;
        for (String lines : finalDirections) {
            System.out.format("%d. %s %n", step3, lines);
            step3++;
        }
    }

    public static String[] addToStringArray(String[] directions, String newString) {
        String[] newDirections = Arrays.copyOf(directions, directions.length + 1);
        newDirections[directions.length] = newString;
        return newDirections;
    }

    public static String[] removeLastElement(String[] newDirections) {
        return Arrays.copyOf(newDirections, newDirections.length - 1);
    }


}

