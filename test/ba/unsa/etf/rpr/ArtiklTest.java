package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ArtiklTest {

    Artikl TestniArtikl = new Artikl("Jagode",5,"1982324")
    @Test
    void getKod() {
       assertEquals("1982324", TestniArtikl.getKod()) ;
        System.out.println("Test 1 uspješan");
    }

    @Test
    void getNaziv() {
        assertEquals("Jagode", TestniArtikl.getNaziv());
        System.out.println("Test 2 uspješan");
    }

    @Test
    void getCijena() {
        assertEquals(5, TestniArtikl.getCijena());
        System.out.println("Test 3 uspješan");
    }
}