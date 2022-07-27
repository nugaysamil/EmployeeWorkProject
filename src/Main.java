import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);


        System.out.println("***********************");
        System.out.println("Calisanlar programina hosgeldiniz...");

        String islemler = "Islemler.. \n"
                      + "1.Yazilimci islemleri\n"
                      + "2.Yonetici islemleri\n"
                      + "Cikis icin q'ya basin\n";
        System.out.println("*******************");
        System.out.println(islemler);
        System.out.println("******************");

        while(true) {

            System.out.println("Islemi seciniz : ");
            String islem = scanner.nextLine();

            if(islem.equals("q")){

                System.out.println("Programdan cikiliyor..");
                break;

            }
            else if (islem.equals("1")) {
                Yazilimci yazilimci = new Yazilimci("samil","nugay" , 343, "Java");
                String yazilimci_islem = "1.Format at\n"
                        +"2.Bilgileri goster\n"
                        +"Cikis icin q'ya bas";
                System.out.println(yazilimci_islem);
                while(true) {
                    System.out.println("Islemi seciniz : ");
                    String y_islem= scanner.nextLine();

                    if(y_islem.equals("q")) {

                        System.out.println("Yazilimci islemlerinden cikiliyor...");
                        break;


                    }

                    else if (yazilimci_islem.equals("1")) {
                        System.out.println("Isletim sistemi : ");
                        String isletim_sistem = scanner.nextLine();
                        yazilimci.formatAt(isletim_sistem);

                    }
                    else if(y_islem.equals(2)) {
                        yazilimci.bilgileriGoster();

                    }
                    else {
                        System.out.println("Gecersiz yazilimci islemi...");
                    }

                }
            }
            else if(islem.equals("2")){
                Yonetici yonetici = new Yonetici("Serhat " , " say " ,123,10);

                String yonetici_islem = "Yonetici islemler\n"
                                    +"1. Zam yap\n"
                                    +"2.Bilgileri goster\n"
                                    +"Cikis icin q'ya basin";
                System.out.println(yonetici_islem);

                while (true) {
                    System.out.println("Islemi seciniz : ");
                    String y_islem = scanner.nextLine();

                    if (y_islem.equals("q")) {

                    System.out.println("Yonetici islemden cikiliyor");
                    break;

                }
                    else if(yonetici_islem.equals("1")) {
                        System.out.println("Yoneticinin ne kadar zam yapmasini istiyorsunuz ");
                        int zam_miktari = Integer.parseInt(scanner.nextLine());
                        scanner.nextLine();
                        yonetici.zam_yap(zam_miktari);

                }
                    else if(y_islem.equals("2")) {

                    yonetici.bilgileriGoster();
                    }
                    else {
                        System.out.println("Gecersiz yonetim sistemi");
                    }
                }


            }


        }
    }
}
