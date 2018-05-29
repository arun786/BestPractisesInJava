# Creating and Destroying Objects

## Item 1

Prefer static methods rather than constructors for creating objects.

Advantages

    1. static factory methods have names, which is easier for understanding the code.
    2. a new object is not created when invoking the factory method which is also called instance 
    Controlled classes.
    
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
        
        There are advantages of creating such instance controlled classes.
        1. it gaurantees a single instance of the class
        2. it is non instantiable
        3. it allows an immutable class such that 
        
        Color a = Color.getInstanceOfColor();
        Color b = Color.getInstanceOfColor();
        
        if (a == b && a.equals(b)) {
            System.out.println("Both the instances are same");
        }
    


[Main Page](https://github.com/arun786/BestPractisesInJava/blob/master/Documentation/CreatingAndDestroyingObjects.md)