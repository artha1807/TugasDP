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
public class StateBonekaHabis implements State{
    private MesinPengaitBoneka mesin;
    
    public StateBonekaHabis(MesinPengaitBoneka mesin){
        this.mesin = mesin;
    }
    
    @Override
    public void kontrolPengait(){
        System.out.println("Mengontrol pengait mesin");
    }
    
    @Override
    public void koinMasuk(){
        System.out.println("Mohon maaf, stok boneka telah habis");
    }
    
    @Override
    public void koinKeluar(){
        System.out.println("Tidak ada koin");
    }
    
    @Override
    public void tekanTombol(){
        System.out.println("Mohon maaf, tidak ada sisa boneka di dalam mesin");
    }
    
    @Override
    public void ambilBoneka(){
        System.out.println("Mohon maaf, tidak ada sisa boneka yang dapat dikeluarkan");
    }
    
    @Override
    public void isiUlang(int jumlahBoneka){
        mesin.setSisaBoneka(jumlahBoneka);
        System.out.println(jumlahBoneka + " boneka ditambahkan ke dalam mesin");
        mesin.setState(mesin.getTidakAdaKoin());
    }

}