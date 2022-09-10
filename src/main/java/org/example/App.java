package org.example;

public class App {

    public static void main(String[] args) {
        GetIntValue getIntValue = x -> x * 2;
        System.out.println(getIntValue.getIntegerValue (55));

        String lightMessage;
        lightMessage = getIntValue.turnLightOn ();
        System.out.println (lightMessage );
//        System.out.println (getIntValue.turnLightOn () );

        lightMessage = getIntValue.turnLightOff ();
        System.out.println (lightMessage );

        GetIntValue.SayHello("Ronald", true);
        System.out.println ("Pi = " + GetIntValue.getPi () );
    }

}
