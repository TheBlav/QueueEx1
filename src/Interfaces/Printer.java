package Interfaces;

public interface Printer {
    default void print (String txt){
        System.out.println(txt);
    }

    default void printL (String txt){
        System.out.print(txt);
    }

    default void print (Priority p){
        System.out.println(p.toString());
    }

    default void print (Object o){
        System.out.println(o.toString());
    }
}
