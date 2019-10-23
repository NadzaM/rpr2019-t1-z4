package ba.unsa.etf.rpr;
import java.lang.String;
public class Artikl {
    private int Cijena;
    private String Kod;
    private String NazivArtikla;
    public  Artikl (String nazivArtikla, int cijena, String kod){
        Cijena = cijena;
        Kod = kod;
        NazivArtikla = nazivArtikla;
    }

    public String getKod(){
        return Kod;
    }
    public String getNaziv(){
        return NazivArtikla;
    }
    public int getCijena() {
        return Cijena;
    }

  /*  @Override
    public int hashCode() {
        return super.hashCode();
    }*/


    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Artikl artikl = (Artikl) obj;
        return  Cijena == artikl.Cijena &&
                NazivArtikla.equals(artikl.NazivArtikla) &&
                Kod.equals(artikl.Kod);
    }

}
