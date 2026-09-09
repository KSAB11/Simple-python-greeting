public class Main {

    public static void main(String[]args) {
        System.out.println("Hello java, I'm back!");
        System.out.print("This is 1 line only, ");
        System.out.print("It is!!!\n");

        // Data types
        char letter = 'K';
        int number = 67;
        String numero = "12";
        double price = 99.96;
        boolean isTrue = true;
        boolean isFalse = false;

        // Output
        System.out.println(letter);
        System.out.println(number);
        System.out.println(numero);
        System.out.println(price);
        System.out.println(isTrue);
        System.out.println(isFalse);
        System.out.println(); // new line

        // Comparison and Logical operators
        int x = 8;
        int y = 2;
        boolean check1 = (x > y); // greater than
        boolean check2 = (x < y); // less than
        boolean check3 = (x >= y); // greater than or equal to
        boolean check4 = (x <= y); // less than or equal to
        boolean check5 = (x == y); // equal to
        boolean check6 = ( x != y); // not equal

        //Output
        System.out.println("COMPARISON");
        System.out.println(check1);
        System.out.println(check2);
        System.out.println(check3);
        System.out.println(check4);
        System.out.println(check5);
        System.out.println(check6);
        System.out.println(); // new line

        boolean kenshi = true;
        boolean shiken = true;

        boolean both = kenshi && shiken;
        boolean atleastOne = kenshi || shiken;
        boolean flip = !kenshi;

        System.out.println("LOGICAL");
        System.out.println(both);
        System.out.println(atleastOne);
        System.out.println(flip);

        // Arithmetic
        System.out.println(x / y);
        System.out.println(x * y);
        System.out.println(x % y); // it is / but output whats left



        

    }
}
