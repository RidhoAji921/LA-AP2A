import java.util.Scanner;

public class pert2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilihan");
        System.out.println("1. Biodata");
        System.out.println("2. Kalkulator");
        System.out.println("3. Grade Nilai");

        System.out.print("pilih: ");
        int pilih = input.nextInt();
        input.nextLine();

        switch (pilih) {
            case 1:
                System.out.println("=== Biodata ===");
                System.out.print("Masukkan nama\t\t: ");
                String nama = input.nextLine();
                System.out.print("Masukkan Kelas\t\t: ");
                String kelas = input.nextLine();
                System.out.print("Masukkan NPM\t\t: ");
                String NPM = input.nextLine();
                System.out.print("Masukkan Jurusan\t: ");
                String jurusan = input.nextLine();
                System.out.print("Masukkan Fakultas\t: ");
                String fakultas = input.nextLine();

                System.out.println("================================================");
                System.out.println("Nama\t\t: " + nama);
                System.out.println("Kelas\t\t: " + kelas);
                System.out.println("NPM\t\t: " + NPM);
                System.out.println("Jurusan\t\t: " + jurusan);
                System.out.println("Fakultas\t: " + fakultas);
                break;

            case 2:
                System.out.print("Masukkan nilai pertama\t: ");
                float bil1 = input.nextFloat();
                System.out.print("Masukkan nilai kedua\t: ");
                float bil2 = input.nextFloat();

                System.out.println(bil1 + " + " + bil2 + " = " + (bil1+bil2));
                System.out.println(bil1 + " - " + bil2 + " = " + (bil1-bil2));
                System.out.println(bil1 + " * " + bil2 + " = " + (bil1*bil2));
                System.out.println(bil1 + " / " + bil2 + " = " + (bil1/bil2));
                System.out.println(bil1 + " % " + bil2 + " = " + (bil1%bil2));
                break;

            case 3:
                System.out.print("Masukkan nilai UTS\t: ");
                float uts = input.nextFloat();
                System.out.print("Masukkan nilai UAS\t: ");
                float uas = input.nextFloat();

                double rata_rata = (uts*0.4) + (uas * 0.6);

                System.out.println("================================================");
                System.out.println("Rata-rata nilai anda adalah\t: "+rata_rata);

                if(90 <= rata_rata && rata_rata <= 100){
                    System.out.println("Sangat baik!");
                }
                else if(80 <= rata_rata && rata_rata <= 89){
                    System.out.println("Baik");
                }
                else if(70 <= rata_rata && rata_rata <= 79){
                    System.out.println("Cukup baik");
                }
                else if(60 <= rata_rata && rata_rata <= 69){
                    System.out.println("Kurang");
                }
                else if(0 <= rata_rata && rata_rata <= 59){
                    System.out.println("Kurang sekali");
                }
                else{
                    System.out.println("Nilai rata-rata tidak valid!");
                }
                break;

            default:
                System.out.println("Pilihan tidak ada!");
                break;
        }
    }
}
