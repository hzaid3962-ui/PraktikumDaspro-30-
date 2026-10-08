import java.util.Scanner;

public class Studikasus230 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, jenis, Status;
        int jumlahDokumen, peringkat, StatusPKM, kurang;

        System.out.println("Nama Mahasiswa :");
        nama = input.nextLine();
        System.out.println("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) :");
        jenis = input.nextLine().trim();

        if (jenis.equalsIgnoreCase("BELMAWA") || jenis.equalsIgnoreCase("BAKORMA")
                || jenis.equalsIgnoreCase("MANDIRI")) {

            // Perlombaan
            System.out.println("Jumlah dokumen :");
            jumlahDokumen = input.nextInt();
            System.out.println("Peringkat juara :");
            peringkat = input.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {
                if (jumlahDokumen == 4) {
                    Status = "Dokumen lengkap dan juara " + peringkat + ". Dana penghargaan diberikan.";
                } else {
                    kurang = 4 - jumlahDokumen;
                    Status = "Dokumen tidak lengkap (kurang " + kurang
                            + " dokumen). Dana penghargaan tidak diberikan.";
                }
            } else {
                Status = "Bukan juara 1, 2, atau 3. Dana penghargaan tidak diberikan.";
            }

        } else if (jenis.equalsIgnoreCase("PKM")) {

            // PKM
            System.out.println("Jumlah dokumen :");
            jumlahDokumen = input.nextInt();
            System.out.println("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) :");
            StatusPKM = input.nextInt();

            if (StatusPKM == 1) {
                if (jumlahDokumen == 4) {
                    Status = "Lolos pendanaan PKM dan dokumen lengkap. Dana penghargaan diberikan.";
                } else {
                    kurang = 4 - jumlahDokumen;
                    Status = "Dokumen tidak lengkap (kurang " + kurang
                            + " dokumen). Dana penghargaan tidak diberikan.";
                }
            } else {
                Status = "Tidak lolos pendanaan PKM. Dana penghargaan tidak diberikan.";
            }

        } else if (jenis.equalsIgnoreCase("LAINNYA")) {
            Status = "Kegiatan lainnya tidak memperoleh dana penghargaan.";

        } else {
            Status = "Jenis kegiatan tidak dikenali.";
        }

        System.out.println("Status : " + Status);

    }
}