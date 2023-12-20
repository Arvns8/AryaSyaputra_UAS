public class Bulan {
    public static void main(String[] args) {
        // Memanggil method untuk menampilkan nama bulan
        tampilkanNamaBulan();
    }

    // Method untuk menampilkan nama bulan
    public static void tampilkanNamaBulan() {
        String[] namaBulan = {
            "Januari", "Februari", "Maret", "April",
            "Mei", "Juni", "Juli", "Agustus",
            "September", "Oktober", "November", "Desember"
        };

        System.out.println("Bulan Januari sampai dengan Bulan Desember:");

        // Melakukan loop untuk menampilkan nama bulan
        for (String bulan : namaBulan) {
            System.out.println("Bulan " + bulan);
        }
    }
}
