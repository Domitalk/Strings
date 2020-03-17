package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // PRIMITIVES 8

	    // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        // the long lost primitive 9
        // A CLASS but special because we have to use it so much. Size limited to 2.14Bil characters (int's MAXVALUE)
        String myString = "This is a string";
        // not primitive so capital S
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        // 250.5549.95 ... obviously, it acts like a string just like in other languages.

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        // the int becomes a string
        // so if there was a showdown... string > double > int in override capabilities
        System.out.println("LastString is equal to " + lastString);
        // 1050

        // Strings are immutable.
        // Java actually creates a new memory object every single time we change it


    }
}
