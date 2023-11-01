

public class L8E1_array {
    public static void main(String[] args) {
        String[] classlist = new String[5];
        classlist[0] = "Steve";
        classlist[1] = "Jane";
        classlist[2] = "Bob";
        classlist[3] = "Laura";
        classlist[4] = "William";

        System.out.println(classlist[0]);
        System.out.println(classlist[classlist.length-1]);
        System.out.println( "The number of items in the array is: " + classlist.length );
    }
}
