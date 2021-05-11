package pl.mkluzniak;

public class Main {

    public static void main(String[] args) {
// return types

        int x = 3; //declaring x value
        int y = 4; //declaring y value
        int z = add(x, y); //declaring that z is sum of x & y
        System.out.println(z); //printing in console z value

    }

    static int add(int x, int y) { //adding new method
        return x + y; //returning value to another method
    }
}
