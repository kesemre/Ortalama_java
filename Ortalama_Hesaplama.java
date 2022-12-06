
import java.util.Scanner;
public class Ortalama_Hesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float ort;

        int toplam;
        System.out.print("Lütfen fizik notunuzu Giriniz");
        int Fizik = input.nextInt();
        System.out.print("Lütfen Kimya Notunuzu giriniz");
        int Kimya = input.nextInt();
        System.out.print("Lütfen Türkçe Notunuzu giriniz");
        int Turkce = input.nextInt();
        System.out.print("Lütfen Müziknotunuzu giriniz");
        int Muzik = input.nextInt();
        System.out.print("Lütfen Tarih notunuzu giriniz");
        int Tarih = input.nextInt();
        System.out.print("Matematik notunuzu girinizn");
        int Matematik = input.nextInt();
        toplam = Fizik+Kimya+Turkce+Muzik+Tarih+ Kimya;
        ort = toplam/6;
        System.out.println("Geçme notu 60 dır");

        System.out.println("Sınıfı geçtiyseniz True kaldıysanız False yazar");
        System.out.println("Sınavdan Geçme durumunuz" + " "+ (ort>=60));
        System.out.println("geçme notunuz " + ort);
    }
}
