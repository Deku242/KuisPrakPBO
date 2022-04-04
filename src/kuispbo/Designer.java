/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuispbo;

/**
 *
 * @author Machine Game
 */
public class Designer extends Pendaftaran implements Seleksi {

    public Designer( String nama, double nilai1, double nilai2, double nilai3) {
        super( nama, nilai1, nilai2, nilai3);
    }
    
    @Override
    public double seleksi1() {
        return (double) (this.nilai1 * 0.3);
    }

    @Override
    public double seleksi2() {
        return (double) (this.nilai2 * 0.45);
    }

    @Override
    public double seleksi3() {
        return (double) (this.nilai3 * 0.25);
    }
    
}
