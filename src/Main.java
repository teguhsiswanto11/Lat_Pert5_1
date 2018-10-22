public class Main {
    public static void main(String[] args) {
        Dosen dos1;
        Dosen dos2;

        dos1 = new DosenTetap();
        dos1.setNama("Mira Kania");
        System.out.println("Dosen Tetap : "+dos1.getNama());
        dos1.absen();

        dos2 = new DosenLB();
        dos2.setNama("Rizki Adam Kurniawan");
        System.out.println("Dosen Luar Biasa : "+dos2.getNama());
        dos2.absen();

    }
}
