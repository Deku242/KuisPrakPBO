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
public class Programmer extends Pendaftaran implements Seleksi {

    public Programmer( String nama, double nilai1, double nilai2, double nilai3) {
        super( nama, nilai1, nilai1, nilai3);
    }

    
    @Override
    public double seleksi1() {
        return (double) (this.nilai1 * 0.6);
    }

    @Override
    public double seleksi2() {
        return (double) (this.nilai1 * 0.15);
    }

    @Override
    public double seleksi3() {
        return (float) (this.nilai3 * 0.3);
    }
}
