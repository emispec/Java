package emi.poo22;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = Calculadora.getInstance();
        System.out.println(calculadora.calcularPromedio(7.0,9.0));
        System.out.println(calculadora.toString());
    }
}