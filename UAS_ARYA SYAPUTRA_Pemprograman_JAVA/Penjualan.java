import java.io.*;

public class Penjualan {
    private double harga;

    public Penjualan(double harga) {
        this.harga = harga; 
    }

    public double hitungTotal() {
        double discount = 0.0;

        if (harga >= 100000) {
            discount = 0.2;
        } else if (harga >= 50000) {
            discount = 0.1;
        }

        double total = harga - (harga * discount);
        return total;
    }

    public static void main(String[] args) {
        // Contoh penggunaan
        double hargaPenjualan1 = 120000;
        Penjualan penjualan1 = new Penjualan(hargaPenjualan1);
        double totalPenjualan1 = penjualan1.hitungTotal();

        double hargaPenjualan2 = 70000;
        Penjualan penjualan2 = new Penjualan(hargaPenjualan2);
        double totalPenjualan2 = penjualan2.hitungTotal();

        double hargaPenjualan3 = 8000;
        Penjualan penjualan3 = new Penjualan(hargaPenjualan3);
        double totalPenjualan3 = penjualan3.hitungTotal();

        // Output
        System.out.println("Harga\t\tDiscount\tTotal");
        System.out.println(String.format(">= 100,000\t20%%\t\t%.2f", totalPenjualan1));
        System.out.println(String.format(">= 50,000\t10%%\t\t%.2f", totalPenjualan2));
        System.out.println(String.format("< 10,000\t0%%\t\t%.2f", totalPenjualan3));
    }
}