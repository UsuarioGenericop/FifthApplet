package javaapplication16;

public class Account {
    int numeroCuenta;
    String  nombre;
    double saldo;

    Account(int numeroCuenta, String nombre, double saldo){
        this.numeroCuenta =  numeroCuenta;
        this.nombre = nombre;
        this.saldo = saldo;
    }
    public String toString() {
        return "Número: " + numeroCuenta + "\nNombre: " + nombre + "\nSaldo: $" + saldo;
    }
}
