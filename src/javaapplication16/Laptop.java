package javaapplication16;
public class Laptop {
    private String marca;
    private String modelo;
    private int memoria;
    private double precio;
    private static int cuenta = 0;

    public Laptop() {
        this.marca = "";
        this.modelo = "";
        this.memoria = 0;
        this.precio = 0.0;
        cuenta++;
    }

    public Laptop(String marca, String modelo, int memoria, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoria = memoria;
        this.precio = precio;
        cuenta++;
    }

    public Laptop(String marca, String modelo, int memoria, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoria = memoria;
        this.precio = (double) precio;
        cuenta++;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getMemoria() { return memoria; }
    public double getPrecio() { return precio; }

    public void setMarca(String marca) { this.marca = marca; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public void setMemoria(int memoria) { this.memoria = memoria; }
    public void setMemoria(double memoria) { this.memoria = (int) memoria; }

    public void setPrecio(double precio) { this.precio = precio; }
    public void setPrecio(int precio) { this.precio = (double) precio; }

    public static int getCuenta() { return cuenta; }
    public static double getCuentaDouble() { return (double) cuenta; }

    public String mostrarInfo() {
        return "Marca: " + marca +
                ", Modelo: " + modelo +
                ", Memoria: " + memoria + "GB" +
                ", Precio: $" + precio;
    }
}