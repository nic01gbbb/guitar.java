package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Guitarra myGuitar = new Guitarra("01020304", "fender", "telecaster", "elétrica", "mogno", 1500.00);

        System.out.println(myGuitar.getNumeroSerie());
        System.out.println(myGuitar.getFabricante());
        System.out.println(myGuitar.getModelo());
        System.out.println(myGuitar.getTipo());
        System.out.println(myGuitar.getMadeira());
        System.out.println(myGuitar.getPreco());
    }

}