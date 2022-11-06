import java.util.Scanner;

public class ödev{
    public static void main(String[] args){
        int mat, fiz, kimya, turkce, tarih, muzik;
        Scanner inp = new Scanner(System.in);
        System.out.println("Matematik notunuz: ");
        mat = inp.nextInt();
        System.out.println("Fizik notunuz: ");
        fiz = inp.nextInt();
        System.out.println("Kimya notunuz: ");
        kimya = inp.nextInt();
        System.out.println("Türkçe notunuz: ");
        turkce = inp.nextInt();
        System.out.println("Tarih notunuz: ");
        tarih = inp.nextInt();
        System.out.println("Müzik notunuz: ");
        muzik = inp.nextInt();

        int toplam = (mat + fiz + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız: " + sonuc);

        System.out.println (sonuc > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");
        
        /*Boolean kosul1 = sonuc >= 60;
        System.out.println(kosul1 + "sınıfı geçti");
        Boolean kosul2 = sonuc < 60;
        System.out.println(kosul2 + "sınıfta kaldı");*/


    }
}