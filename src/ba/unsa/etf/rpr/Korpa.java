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
        return (2>1);
    }


    public Artikl izbaciArtiklSaKodom(String kod) {
                int trenutni = 0;
                for (trenutni = 0; trenutni < ArtikliUKorpi; trenutni++){
                    if(UKorpi[trenutni].getKod().equals(kod)) {
                        UKorpi[trenutni] = new Artikl(UKorpi[ArtikliUKorpi].getNaziv(),UKorpi[ArtikliUKorpi].getCijena(),UKorpi[ArtikliUKorpi].getKod());
                        UKorpi[ArtikliUKorpi-1] = null;
                        ArtikliUKorpi--;
                    }
                }
        return UKorpi[0];
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
