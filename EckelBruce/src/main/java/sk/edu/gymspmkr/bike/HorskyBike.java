/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.edu.gymspmkr.bike;

/**
 *
 * @author bracek
 */
public class HorskyBike extends Bicykel {
    // podtrieda HorskyBike pridáva jednu vlastnosť
    public int vyskaSedadla;

    public HorskyBike() {
        
        System.out.println(".. constructor HorskyBike ..");
    }
    // podtrieda HorskyBike má jeden konštruktor
    public HorskyBike(final int zacVyska,
final  int zacTempo,
final  int zacRychlost,
final  int zacPrevod) {
        super(zacTempo, zacRychlost, zacPrevod);
        vyskaSedadla = zacVyska;
    }

    public int getVyskaSedadla() {
        return vyskaSedadla;
    }

    public void setVyskaSedadla(final int vyskaSedadla) {
        this.vyskaSedadla = vyskaSedadla;
    }
    // podtrieda HorskyBike pridáva jednu metódu
    public void nastavVysku(final int novaHodnota) {
        vyskaSedadla = novaHodnota;
    }
}
