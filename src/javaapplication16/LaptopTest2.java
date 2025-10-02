package javaapplication16;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop("Dell", "Inspiron", 16, 2500.99);
        Laptop l3 = new Laptop("HP", "Pavilion", 8, 1800);

        System.out.println("== Estado inicial ==");
        mostrarTodas(l1, l2, l3);

        l1.setMarca("Lenovo");
        l1.setModelo("ThinkPad");
        l1.setMemoria(32);
        l1.setPrecio(3200.50);
        System.out.println("\nDespués de modificar l1:");
        mostrarTodas(l1, l2, l3);

        l2.setMemoria(16.0);
        l2.setPrecio(2600);
        System.out.println("\nDespués de modificar l2:");
        mostrarTodas(l1, l2, l3);

        l3.setMarca("Asus");
        l3.setModelo("ROG");
        l3.setMemoria(12);
        l3.setPrecio(2200.75);
        System.out.println("\nDespués de modificar l3:");
        mostrarTodas(l1, l2, l3);

        System.out.println("\n== Número de laptops creadas ==");
        System.out.println("Cuenta (int): " + Laptop.getCuenta());
        System.out.println("Cuenta (double): " + Laptop.getCuentaDouble());
    }

    public static void mostrarTodas(Laptop... laptops) {
        for (int i = 0; i < laptops.length; i++) {
            System.out.println("Laptop " + (i+1) + ": " + laptops[i].mostrarInfo());
        }
    }
}
