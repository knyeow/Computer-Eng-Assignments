import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Kare[] kareler = new Kare[10];
        Dikdortgen[] dikdortgenler = new Dikdortgen[10];
        Yamuk[] yamuklar = new Yamuk[10];
        Paralelkenar[] paralelkenarlar = new Paralelkenar[10];

        Scanner s = new Scanner(System.in);
        String dortgen;
        System.out.println("Sekil ismi giriniz(kare,dikdortgen,yamuk,paralelkenar)");

        dortgen = s.nextLine();
        int i = 0;
        Nokta a, b, c, d;
        int checkExit = 1;
        switch (dortgen) {
            case "kare":
                while (checkExit == 1 && i < 10) {
                    System.out.println("Noktalari giriniz");
                    a = new Nokta(s.nextInt(), s.nextInt());
                    b = new Nokta(s.nextInt(), s.nextInt());
                    c = new Nokta(s.nextInt(), s.nextInt());
                    d = new Nokta(s.nextInt(), s.nextInt());
                    kareler[i] = new Kare(a, b, c, d);
                    System.out.println(i + 1 + ". karenin alani: " + kareler[i].Alan());
                    i++;
                    System.out.println("eklemeye devam etmek icin 1,cikis yapmak icin 0 yazin");
                    checkExit = s.nextInt();
                }
                System.out.println("cikis yapildi");
                break;
            case "dikdortgen":
                while (checkExit == 1 && i < 10) {
                    System.out.println("Noktalari giriniz");
                    a = new Nokta(s.nextInt(), s.nextInt());
                    b = new Nokta(s.nextInt(), s.nextInt());
                    c = new Nokta(s.nextInt(), s.nextInt());
                    d = new Nokta(s.nextInt(), s.nextInt());
                    dikdortgenler[i] = new Dikdortgen(a, b, c, d);
                    System.out.println(i + 1 + ". dikdortgenin alani: " + dikdortgenler[i].Alan());
                    i++;
                    checkExit = s.nextInt();
                    System.out.println("eklemeye devam etmek icin devam,cikis yapmak icin cikis yazin");

                }
                System.out.println("cikis yapildi");
                break;
            case "yamuk":
                while (checkExit == 1 && i < 10) {
                    System.out.println("Noktalari giriniz");
                    a = new Nokta(s.nextInt(), s.nextInt());
                    b = new Nokta(s.nextInt(), s.nextInt());
                    c = new Nokta(s.nextInt(), s.nextInt());
                    d = new Nokta(s.nextInt(), s.nextInt());
                    yamuklar[i] = new Yamuk(a, b, c, d);
                    System.out.println(i + 1 + ". yamugun alani: " + yamuklar[i].Alan());
                    i++;
                    System.out.println("eklemeye devam etmek icin devam,cikis yapmak icin cikis yazin");
                    checkExit = s.nextInt();
                }
                System.out.println("cikis yapildi");
                break;
            case "paralelkenar":
                while (checkExit == 1 && i < 10) {
                    System.out.println("Noktalari giriniz");
                    a = new Nokta(s.nextInt(), s.nextInt());
                    b = new Nokta(s.nextInt(), s.nextInt());
                    c = new Nokta(s.nextInt(), s.nextInt());
                    d = new Nokta(s.nextInt(), s.nextInt());
                    paralelkenarlar[i] = new Paralelkenar(a, b, c, d);
                    System.out.println(i + 1 + ". paralelkenarin alani: " + paralelkenarlar[i].Alan());
                    i++;
                    System.out.println("eklemeye devam etmek icin devam,cikis yapmak icin cikis yazin");
                    checkExit = s.nextInt();
                }
                System.out.println("cikis yapildi");
                break;
            default:
                System.out.println("Programdan Çıkış yapıldı");
                break;

        }
        s.close();

    }

}
