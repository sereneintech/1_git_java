package main.java;

public class Main {
    public static void main(String[] args) {
        // data types

        // 1. primitive types
        /*
            byte (-128,= to 127), short < int < long: integer types
            float (3.14), double
            boolean
            char (unicode character)
            make it efficient!!
        */

        long age = 60;
        long age2 = 127;
        long smallValue = 2;

        double myDoubleVal = 3.14;
        float myFloatVal = (float)3.14;
        //convert double to a float with(float)//
        //I expect = actual (if dont match need to convert)//

        System.out.println(age);
        //math ops
        //sout is shortcut for this!!
        System.out.println("combined age: " + (age + age2));

        //long array
        long[] ages = {24, 32, 46, 59};
        // 'var' short for variable, and it uses type inference
        double avgAge = 0;
        long totalAge = 0;
        for(var a : ages) {
            totalAge += a;
        }
        avgAge = totalAge / ages.length;
        System.out.println("Average age: " + avgAge);

        // product of all ages
        long product = 1;
        for(var a : ages) {
            product = product * a;
        }
        System.out.println("product:" + product);

        // 2. reference types (objects)

        //char = single character, wrapped in ''
        char firstInitial = 'R';

        boolean amAnOptimist = false;

        if(amAnOptimist) {
            System.out.println("It's going to be a great day!");
        } else {
            System.out.println("I have a bad feeling about the weather");
        }

        System.out.println("Random string".getBytes());
    }
}
