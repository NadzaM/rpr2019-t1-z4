package ba.unsa.etf.rpr;

public class Supermarket {
    Artikl[] SviArtikli = new Artikl[1000];
    private int BrojArtikala = 0;
    public void  dodajArtikl (Artikl AddMe){
        SviArtikli[BrojArtikala] = new Artikl(AddMe.getNaziv(),AddMe.getCijena(),AddMe.getKod());
        BrojArtikala++;
    }





    public Artikl[] getArtikli() {
        return SviArtikli;
    }
    public  Artikl izbaciArtiklSaKodom (String Kod){
       int trenutni = 0;
        for(trenutni = 0; trenutni < BrojArtikala; trenutni++){
            if(SviArtikli[trenutni].getKod().equals(Kod)){
                SviArtikli[trenutni] = new Artikl(SviArtikli[BrojArtikala-1].getNaziv(),SviArtikli[BrojArtikala-1].getCijena(),SviArtikli[BrojArtikala-1].getKod());
                SviArtikli[BrojArtikala-1] = null;
                BrojArtikala--;
            }
        }
return SviArtikli[0];
    }



}
