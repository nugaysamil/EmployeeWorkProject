public class Yonetici extends Calisan {

    private int sorumlu_kisi_sayisi;

    public Yonetici(String ad, String soyadi, int id,int sorumlu_kisi_sayisi) {
        super(ad, soyadi, id);
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yoneticinin sorumlu oldugu kisi sayisi : " + sorumlu_kisi_sayisi );
    }
    public void zam_yap(int zamMiktari) {
        System.out.println(getAd() + " Calisanlara " + zamMiktari + " kadar yap yaptı...");

    }
}
