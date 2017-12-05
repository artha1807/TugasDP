/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mesinpengaitboneka;

/**
 *
 * @author Artha
 */
public class StateTidakAdaKoin implements State{
    private MesinPengaitBoneka mesin;
    
    public StateTidakAdaKoin(MesinPengaitBoneka mesin){
        this.mesin = mesin;
    }
    
    @Override
    public void kontrolPengait(){
        System.out.println("Pengait tidak dapat digunakan");
    }
    
    @Override
    public void koinMasuk(){
        System.out.println("Koin dimasukkan");
        mesin.setState(mesin.getAdaKoin());
    }
    
    @Override
    public void koinKeluar(){
        System.out.println("Tidak ada koin yang bisa dikeluarkan");
    }
    
    @Override
    public void tekanTombol(){
        System.out.println("Masukkan koin terlebih dahulu");
    }
    
    @Override
    public void ambilBoneka(){
        System.out.println("Boneka tidak dapat dikeluarkan");
    }
    
    @Override
    public void isiUlang(int jumlahPermen){
        System.out.println("Boneka belum habis");
    }
}