package se.yrgo;

import se.yrgo.RootUserEnum;
import se.yrgo.RootUserLazy;
import se.yrgo.RootUserStatic;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lazy Singleton: " + RootUserLazy.getInstance());
        System.out.println("Static Singleton: " + RootUserStatic.getInstance());
        System.out.println("Enum Singleton: " + RootUserEnum.INSTANCE);
    }
}