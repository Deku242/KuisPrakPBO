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
public class Pendaftaran implements Seleksi {

    String nama;
    double nilai1;
    double nilai2;
    double nilai3;

    public Pendaftaran(String nama, double nilai1, double nilai2, double nilai3) {

        this.nama = nama;
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getNilai1() {
        return nilai1;
    }

    public void setNilai1(double nilai1) {
        this.nilai1 = nilai1;
    }

    public double getNilai2() {
        return nilai2;
    }

    public void setNilai2(double nilai2) {
        this.nilai2 = nilai2;
    }

    public double getNilai3(double nilai3) {
        return nilai3;
    }

    public void setNilai3(double nilai3) {
        this.nilai3 = nilai3;
    }

    @Override
    public double seleksi1() {
        return 0;
    }

    @Override
    public double seleksi2() {
        return 0;
    }

    @Override
    public double seleksi3() {
        return 0;
    }

    

   
}
