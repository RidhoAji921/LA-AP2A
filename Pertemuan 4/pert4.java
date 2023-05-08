import java.util.Scanner;

public class pert4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] nama = new String[50];
        String[] kelas = new String[50];
        String[] npm = new String[50];
        int[] uts = new int[50];
        int[] uas = new int[50];

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data mahasiswa ke-" + (i+1));
            System.out.print("Masukkan nama mahasiswa\t\t: ");
            nama[i] = input.nextLine();
            System.out.print("Masukkan NPM mahasiswa\t\t: ");
            npm[i] = input.nextLine();
            System.out.print("Masukkan kelas mahasiswa\t: ");
            kelas[i] = input.nextLine();
            System.out.print("Masukkan nilai UTS mahasiswa\t: ");
            uts[i] = input.nextInt();
            System.out.print("Masukkan nilai UAS mahasiswa\t: ");
            uas[i] = input.nextInt();
            input.nextLine();
            System.out.println("\n");
        }

        System.out.println("===== HASIL =====");

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data mahasiswa ke-" + (i+1));
            System.out.println("Nama\t\t: " + nama[i]);
            System.out.println("NPM\t\t: " + npm[i]);
            System.out.println("Kelas\t\t: " + kelas[i]);
            System.out.println("Nilai UTS\t: " + uts[i]);
            System.out.println("Nilai UAS\t: " + uas[i]);
            System.out.println("Nilai Rata-rata\t: " + (uts[i] + uas[i])/2);
            System.out.println("\n");
        }
    }
}
