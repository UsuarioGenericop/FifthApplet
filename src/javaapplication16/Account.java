package javaapplication16;

public class Account {
    int numeroCuenta;
    String  nombre;
    String saldo;

    Account(int numeroCuenta, String nombre, String saldo){
        this.numeroCuenta =  numeroCuenta;
        this.nombre = nombre;
        this.saldo = saldo;
    }
    public String toString() {
        return "Número: " + numeroCuenta + "\nNombre: " + nombre + "\nSaldo: $" + saldo;
    }
}
