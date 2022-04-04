/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuispbo;
import java.util.Scanner;
/**
 *
 * @author Machine Game
 */
public class KuisPBO {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int inputMenu;
        int pilih;
        boolean y = false;
        
        System.out.println("Form Pendaftaran ");
        System.out.println("1. Programmer");
        System.out.println("2. Designer");
        System.out.println("3. Manager");
        System.out.print("Pilih Jenis Form : ");
        inputMenu = input.nextInt();
        
        switch(inputMenu) {
            case 1:
           
                
                String nama;
                double nilai1;
                double nilai2;
                double nilai3;
                
                System.out.println(" ");
                Scanner data = new Scanner(System.in);
                System.out.println("FORM PENDAFTARAN\n");
                

                System.out.print("Input Nama : ");
                nama = data.nextLine();
                System.out.print("Programming Knowledge : ");
                nilai1 = data.nextDouble();
                System.out.print("Clean Coding : ");
                nilai2 = data.nextDouble();
                System.out.print("Debugging : ");
                nilai3 = data.nextDouble();
                Programmer Programmer = new Programmer( nama, nilai1, nilai2, nilai3);
                
                do {
                    System.out.println(" ");
                    System.out.println("Menu");
                    System.out.println("1. Edit");
                    System.out.println("2. Tampil");
                    System.out.println("3. Exit");
                    System.out.print("Pilih : ");
                    pilih = input.nextInt();
                  
                    switch(pilih) {
                        case 1:
                            Scanner inputBaru = new Scanner(System.in);
                            System.out.println(" ");
                            System.out.println("FORM EDIT");
                            System.out.print("Programming Knowledge : "); Programmer.nilai1 = inputBaru.nextDouble();
                            System.out.print("Clean Coding : "); Programmer.nilai2 = inputBaru.nextDouble();
                            System.out.print("Debugging : "); Programmer.nilai3 = inputBaru.nextInt();
                            break;
                        case 2:
                            double nilaiAkhir;
                            String namaUser;
                            System.out.println(" ");
                            
                            nilaiAkhir = Programmer.seleksi1() + Programmer.seleksi2() + Programmer.seleksi3();
                            namaUser = Programmer.getNama();
                          
                            System.out.println("Nilai Akhir : " + nilaiAkhir);
                            if (nilaiAkhir < 85) {
                                    System.out.println("KETERANGAN : GAGAL!");
                                System.out.println("Mohon Maaf Kepada " + namaUser + " Telah Ditolak Sebagai Programmer");
                            } else {
                                System.out.println("KETERANGAN : LOLOS!");
                                System.out.println("Selamat Kepada " + namaUser + " Telah Diterima Sebagai Programmer");
                            }
                            break;
                        case 3:
                            y = true;
                            break;
                    }
                } while(!y);
                break;
                
            case 2:

                
                String namaW;
                double nilai1W;
                double nilai2W;
                double nilai3W;
                
                System.out.println(" ");
                Scanner dataweb = new Scanner(System.in);
                System.out.println("FORM PENDAFTARAN\n");

                System.out.print("Input Nama : ");
                namaW = dataweb.nextLine();
                System.out.print("Design Portofolio : ");
                nilai1W = dataweb.nextDouble();
                System.out.print("Prototyping : ");
                nilai2W = dataweb.nextDouble();
                System.out.print("Creativity : ");
                nilai3W = dataweb.nextDouble();
                Designer Designer = new Designer (namaW, nilai1W, nilai2W, nilai3W);
                
                do {
                    System.out.println(" ");
                    System.out.println("Menu");
                    System.out.println("1. Edit");
                    System.out.println("2. Tampil");
                    System.out.println("3. Exit");
                    System.out.print("Pilih : ");
                    pilih = input.nextInt();
                  
                    switch(pilih) {
                        case 1:
                            Scanner inputBaru = new Scanner(System.in);
                            System.out.println(" ");
                            System.out.println("FORM EDIT");
                            System.out.print("Design Portofolio : "); Designer.nilai1 = inputBaru.nextDouble();
                            System.out.print("Prototyping : "); Designer.nilai2 = inputBaru.nextDouble();
                            System.out.print("Creativity : "); Designer.nilai3 = inputBaru.nextInt();
                            break;
                        case 2:
                            double nilaiAkhir;
                            String namaUser;
                            System.out.println(" ");
                            
                            nilaiAkhir = Designer.seleksi1() + Designer.seleksi2() + Designer.seleksi3();
                            namaUser = Designer.getNama();
                          
                            System.out.println("Nilai Akhir : " + nilaiAkhir);
                            if (nilaiAkhir < 85) {
                                System.out.println("KETERANGAN : GAGAL!");
                                System.out.println("Mohon Maaf Kepada " + namaUser + " Telah Ditolak Sebagai Designer");
                            } else {
                                System.out.println("KETERANGAN : LOLOS!");
                                System.out.println("Selamat Kepada " + namaUser + " Telah Diterima Sebagai Designer");
                            }
                            break;
                        case 3:
                            y = true;
                            break;
                    }
                } while(!y);
                break;
                
              case 3: 
                String namaM;
                double nilai1M;
                double nilai2M;
                double nilai3M;
                
                System.out.println(" ");
                Scanner dataM = new Scanner(System.in);
                System.out.println("FORM PENDAFTARAN\n");

                System.out.print("Input Nama : ");
                namaM = dataM.nextLine();
                System.out.print("Innovation : ");
                nilai1M = dataM.nextDouble();
                System.out.print("Decision Making : ");
                nilai2M = dataM.nextDouble();
                System.out.print("Communication : ");
                nilai3M = dataM.nextDouble();
                Manager Manager = new Manager(namaM, nilai1M, nilai2M, nilai3M);
                
                 
                do {
                    System.out.println(" ");
                    System.out.println("Menu");
                    System.out.println("1. Edit");
                    System.out.println("2. Tampil");
                    System.out.println("3. Exit");
                    System.out.print("Pilih : ");
                    pilih = input.nextInt();
                  
                    switch(pilih) {
                        case 1:
                            Scanner inputBaru = new Scanner(System.in);
                            System.out.println(" ");
                            System.out.println("FORM EDIT");
                            System.out.print("Innovation : "); Manager.nilai1 = inputBaru.nextDouble();
                            System.out.print("Decision Making : "); Manager.nilai2 = inputBaru.nextDouble();
                            System.out.print("Communication : "); Manager.nilai3 = inputBaru.nextInt();
                            break;
                        case 2:
                            double nilaiAkhir;
                            String namaUser;
                            System.out.println(" ");
                            
                            nilaiAkhir = Manager.seleksi1() + Manager.seleksi2() + Manager.seleksi3();
                            namaUser = Manager.getNama();
                          
                            System.out.println("Nilai Akhir : " + nilaiAkhir);
                            if (nilaiAkhir < 85) {
                                System.out.println("KETERANGAN : GAGAL!");
                                System.out.println("Mohon Maaf Kepada " + namaUser + " Telah Ditolak Sebagai Manager");
                            } else {
                                System.out.println("KETERANGAN : LOLOS!");
                                System.out.println("Selamat Kepada " + namaUser + " Telah Diterima Sebagai Manager");
                            }
                            break;
                        case 3:
                            y = true;
                            break;
                    }
                } while(!y);
                break;
                
            default:
                break;
        }
    }
}
