import java.util.Scanner;

public class OrtHsp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Fizik notunu giriniz:");
        int Fzk = input.nextInt();
        System.out.println("Matematik notunu giriniz:");
        int Mat = input.nextInt();
        System.out.println("Türkçe notunu giriniz:");
        int Trkce = input.nextInt();
        System.out.println("Tarih notunu giriniz:");
        int Tarih = input.nextInt();
        System.out.println("Müzik notunu giriniz:");
        int Mzik = input.nextInt();
        System.out.println("Kimya notunu giriniz:");
        int Kimya = input.nextInt();

        int ort = (Fzk+Mat+Mzik+Trkce+Tarih+Kimya)/6;

        System.out.println("Ortalamaniz;" + ort);

        String str = (ort >= 60) ? "Geçtiniz" : "Kaldınız";
        System.out.println(str);
    }
}
