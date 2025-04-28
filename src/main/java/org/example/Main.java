package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Guitar myGuitar = new Guitar("Fender", "Stratocaster", 6, true);
        myGuitar.play();
        System.out.println(myGuitar);
    }


}