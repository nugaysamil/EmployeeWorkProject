public class Yazilimci extends Calisan{

    private String diller;
    public Yazilimci(String ad, String soyadi, int id,String diller) {

        super(ad, soyadi, id);
        this.diller = diller;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yazilimcinin bildigi diller : " + diller);
    }

    public void formatAt(String isletim_sistemi) {
        System.out.println(getAd() + " " +  isletim_sistemi + "'ni yukluyor");
    }
}
