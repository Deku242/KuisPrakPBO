/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuispbo;

/**
 *
 * @author Machine Game
 */
public class Manager extends Pendaftaran implements Seleksi {

    public Manager(String nama, double nilai1, double nilai2, double nilai3) {
        super( nama, nilai1, nilai2, nilai3);
    }
    
    @Override
    public double seleksi1() {
        return (double) (this.nilai1 * 0.4);
    }

    @Override
    public double seleksi2() {
        return (double) (this.nilai2 * 0.3);
    }

    @Override
    public double seleksi3() {
        return (double) (this.nilai3 * 0.3);
    }
    
}
