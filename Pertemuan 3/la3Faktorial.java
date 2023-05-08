import java.util.Scanner;

public class la3Faktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka: ");
        int angka = input.nextInt();

        int hasil = angka;
        while(angka > 1){
            angka--;
            hasil = hasil*angka;
        }

        System.out.println("Hasilnya : " + hasil);
    }
}