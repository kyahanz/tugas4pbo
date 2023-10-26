/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6;

/**
 *
 * @author unsika
 */
public class Perhitungan {
    int s;
    int p,l,t;
    
    
    public Perhitungan(int s){
        this.s = s;
    }
    
    public Perhitungan(int p, int l, int t){
        this.p = p;
        this.l = l;
        this.t = t;
    }
    
    
    int VolumeKubus(){
        return  s * s * s;
    }
    
    int LuasKubus(){
        return 6*s;
    }
    
    int VolumeBalok(){
        return p*l*t;
    }
    
    int LuasBalok(){
        return 2 * ((p * l) + (p * t) + (l * t));
    }
}
