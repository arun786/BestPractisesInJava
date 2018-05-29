package Chapter1;

/**
 * Created by Adwiti on 5/28/2018.
 */
public class StaticFactoryMethods {

    public static void main(String[] args) {
        Color a = Color.getInstanceOfColor();
        Color b = Color.getInstanceOfColor();

        if (a == b && a.equals(b)) {
            System.out.println("Both the instances are same");
        }

    }
}

class Color {
    private static Color color = new Color();

    private Color() {
    }

    /**
     * static factory method is simply a static method to return an instance of a class
     *
     * @return
     */
    public static Color getInstanceOfColor() {
        return color;
    }
}
