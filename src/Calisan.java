public class Calisan {

    private String ad;
    private String soyadi;
    private int id;

    public Calisan(String ad, String soyadi, int id) {

    this.ad = ad;
    this.soyadi = soyadi;
    this.id = id;

  }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void bilgileriGoster() {

        System.out.println("Calisanlari goster...");

        System.out.println("Ad : " + ad);
        System.out.println("Soyadi : " +soyadi);
        System.out.println("id : " +id);
    }
}
