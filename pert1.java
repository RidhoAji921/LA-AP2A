import java.util.Scanner;

class pert1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("----------LA AP2A----------");
        System.out.print("Masukkan Nama\t\t: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NPM\t\t: ");
        String npm = scanner.nextLine();
        System.out.print("Masukkan Kelas\t\t: ");
        String kelas = scanner.nextLine();
        System.out.print("Masukkan Jurusan\t: ");
        String jurusan = scanner.nextLine();
        System.out.print("Masukkan Fakultas\t: ");
        String fakultas = scanner.nextLine();
        System.out.print("Masukkan Nilai UTS\t: ");
        int uts = Integer.parseInt(scanner.nextLine());
        System.out.print("Masukkan Nilai UAS\t: ");
        int uas = Integer.parseInt(scanner.nextLine());
        
        System.out.println("=============================");
        System.out.println("Berikut data diri anda:");
        System.out.println("Nama\t\t: " + nama);
        System.out.println("NPN\t\t: " + npm);
        System.out.println("Kelas\t\t: " + kelas);
        System.out.println("Jurusan\t\t: " + jurusan);
        System.out.println("Fakultas\t: " + fakultas);
        System.out.println("Nilai UTS\t: " + uts);
        System.out.println("Nilai UAS\t: " + uas);
        System.out.println("Nilai Akhir\t: " + ((uts+uas)/2));
        System.out.println("=============================");
    }
}