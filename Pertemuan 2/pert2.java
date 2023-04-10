import java.util.Scanner;

public class pert2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilihan");
        System.out.println("1. Biodata");
        System.out.println("2. Kalkulator");

        System.out.print("pilih: ");
        int pilih = input.nextInt();

        switch (pilih) {
            case 1:
                System.out.print("Masukkan nama\t: ");
                String nama = input.next();
                System.out.print("Masukkan NPM\t: ");
                String NPM = input.next();
                System.out.print("Masukkan Kelas\t: ");
                String kelas = input.next();

                System.out.println("================================================================");
                System.out.println("Nama\t: " + nama);
                System.out.println("NPM\t: " + NPM);
                System.out.println("Kelas\t: " + kelas);
                break;
            case 2:
                System.out.print("Masukkan bilangan pertama\t: ");
                int bil1 = input.nextInt();
                System.out.print("Masukkan bilangan kedua\t: ");
                int bil2 = input.nextInt();

                System.out.println(bil1 + " + " + bil2 + " = " + (bil1+bil2));
                System.out.println(bil1 + " - " + bil2 + " = " + (bil1-bil2));
                System.out.println(bil1 + " * " + bil2 + " = " + (bil1*bil2));
                System.out.println(bil1 + " / " + bil2 + " = " + (bil1/bil2));
                break;
            default:
                System.out.println("Pilihan tidak ada!");
                break;
        }
    }
}
