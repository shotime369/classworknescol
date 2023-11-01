import java.util.*;

public class L8E3_Array_library {

    //Appending to an array
    public static String[] addToStringArray(String[] oldArray, String newString) {
        String[] newArray = Arrays.copyOf(oldArray, oldArray.length + 1);
        newArray[oldArray.length] = newString;
        return newArray;
    }
//removing last item from an array
    public static String[] removeLastElement(String[] oldArray) {
        return Arrays.copyOf(oldArray, oldArray.length - 1);
    }

    //removing an item from any index position of an array
    public static String[] removeElementAt(String[] oldArray, int index) {
        int length = oldArray.length;
        String[] newArray = new String[length-1];
        // Create the new array
        // Copy old values before the index to remove
        System.arraycopy(oldArray, 0, newArray, 0, index);
        if (index < (length-1)) {
            // Copy old values after the index to remove
            System.arraycopy(oldArray, index + 1, newArray, index, length-index-1);
        }
        return newArray;
    }




}
