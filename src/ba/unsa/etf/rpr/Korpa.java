package ba.unsa.etf.rpr;
public class Korpa {
        private Artikl[] UKorpi = new Artikl[50];
        private int ArtikliUKorpi = 0;
        public Artikl[] getArtikli(){
          return UKorpi;
        }
    public boolean dodajArtikl (Artikl AddMe){
            UKorpi[ArtikliUKorpi] = new Artikl (AddMe.getNaziv(),AddMe.getCijena(),AddMe.getKod());
        ArtikliUKorpi++;
        return (ArtikliUKorpi<=50);
    }


    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl pomocni = null;
                int trenutni = 0;
                for (trenutni = 0; trenutni < ArtikliUKorpi; trenutni++){
                    if(UKorpi[trenutni].getKod().equals(kod)) {
                        pomocni = UKorpi[trenutni];
                        UKorpi[trenutni] = new Artikl(UKorpi[ArtikliUKorpi-1].getNaziv(),UKorpi[ArtikliUKorpi-1].getCijena(),UKorpi[ArtikliUKorpi-1].getKod());
                        UKorpi[ArtikliUKorpi-1] = null;
                        ArtikliUKorpi--;
                    }
                }
        return pomocni;
        }



    public int dajUkupnuCijenuArtikala() {
            int suma = 0;
            for (Artikl a : UKorpi) {
             if(a!=null)
                suma += a.getCijena();
            }
            return suma;
    }


}
