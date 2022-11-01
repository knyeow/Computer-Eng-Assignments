
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Kare[] kareler = new Kare[10];
        Dikdortgen[] dikdortgenler = new Dikdortgen[10];
        Yamuk[] yamuklar = new Yamuk[10];
        Paralelkenar[] paralelkenarlar = new Paralelkenar[10];

        String dortgen;
        Nokta a, b, c, d;
        Scanner s = new Scanner(System.in);
        int checkExit = 1;
        while (checkExit == 1) {

            System.out.println("Sekil ismi giriniz(kare,dikdortgen,yamuk,paralelkenar)");
            dortgen = s.next();
            System.out.println("1. Noktayı giriniz(x,y)");
            a = new Nokta(s.nextInt(), s.nextInt());
            System.out.println("2. Noktayı giriniz(x,y)");
            b = new Nokta(s.nextInt(), s.nextInt());
            System.out.println("3. Noktayı giriniz(x,y)");
            c = new Nokta(s.nextInt(), s.nextInt());
            System.out.println("4. Noktayı giriniz(x,y)");
            d = new Nokta(s.nextInt(), s.nextInt());
            switch (dortgen) {
                case "kare":
                    kareler[findNextShape(kareler)] = new Kare(a, b, c, d);
                    break;
                case "dikdortgen":
                    dikdortgenler[findNextShape(dikdortgenler)] = new Dikdortgen(a, b, c, d);
                    break;
                case "yamuk":
                    yamuklar[findNextShape(yamuklar)] = new Yamuk(a, b, c, d);
                    break;
                case "paralelkenar":
                    paralelkenarlar[findNextShape(yamuklar)] = new Paralelkenar(a, b, c, d);
                    break;
                default:
                    System.out.println("Geçersiz şekil ismi");
                    break;

            }
            System.out.println("eklemeye devam etmek icin 1,cikis yapmak icin 0 yazin");
            checkExit = s.nextInt();

        }

        for (int x = 0; x < 10; x++) {
            if (kareler[x] != null)
                System.out.println(x + 1 + ". karenin alanı: " + kareler[x].Alan());
            if (dikdortgenler[x] != null)
                System.out.println(x + 1 + ". dikdortgenin alanı: " + dikdortgenler[x].Alan());
            if (yamuklar[x] != null)
                System.out.println(x + 1 + ". yamuğun alanı: " + yamuklar[x].Alan());
            if (paralelkenarlar[x] != null)
                System.out.println(x + 1 + ". paralelkenarın alanı: " + paralelkenarlar[x].Alan());
        }
        s.close();

    }

    public static int findNextShape(Dortgen dortgen[]) {
        for (int i = 0; i < dortgen.length; i++) {
            if (dortgen[i] == null)
                return i;
        }
        return dortgen.length - 1;

    }

}
