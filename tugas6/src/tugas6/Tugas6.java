/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas6;

/**
 *
 * @author unsika
 */
public class Tugas6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perhitungan volumeKubus = new Perhitungan(2);
        Perhitungan luasKubus = new Perhitungan(2);
        Perhitungan volumeBalok = new Perhitungan(2,3,2);
        Perhitungan luasBalok = new Perhitungan(3,4,2);
        
        System.out.println("Volume kubus : " +  volumeKubus.VolumeKubus());
        System.out.println("Luas kubus : " +  luasKubus.LuasKubus());
        
        System.out.println("Volume balok : " +  volumeBalok.VolumeBalok());
        System.out.println("Luas balok : " +  luasBalok.LuasBalok());
    }
    
}
