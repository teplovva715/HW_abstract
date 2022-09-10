package org.example;

@FunctionalInterface
public interface GetIntValue {
    Integer getIntegerValue(Integer value);

    default String turnLightOn() {
        return "Turning the light on.";
    }

    default String turnLightOff() {
        return "Turning the light off.";
    }

    static double getPi() {
        return 3.1415926;
    }

    static void SayHello(String name, boolean shouldPrint) {
        System.out.println ("Started!!!" );
        if (shouldPrint) {
            System.out.println ("Hello, " + name);
        } else {
            return;
        }
        System.out.println ("Finished!!!" );
    }
}
