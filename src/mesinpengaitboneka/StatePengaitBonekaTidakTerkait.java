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
public class StatePengaitBonekaTidakTerkait implements State{
    private MesinPengaitBoneka mesin;
    
    public StatePengaitBonekaTidakTerkait(MesinPengaitBoneka mesin){
        this.mesin = mesin;
    }
    
    @Override
    public void kontrolPengait(){
        System.out.println("Mohon menunggu pengait sedang mengambil boneka");
    }
    
    @Override
    public void koinMasuk(){
        System.out.println("Maaf, koin tidak dapat dimasukkan saat sedang ada penjualan");
    }
    
    @Override
    public void koinKeluar(){
        System.out.println("Maaf, koin tidak dapat diambil kembali");
    }
    
    @Override
    public void tekanTombol(){
        System.out.println("Mohon menunggu, boneka sedang dikeluarkan");
    }
    
    @Override
    public void ambilBoneka(){
        mesin.ambilBoneka(1);
        
        if(mesin.getSisaBoneka()> 0)
            mesin.setState(mesin.getTidakAdaKoin());
        else
            mesin.setState(mesin.getBonekaHabis());
    }
    
    @Override
    public void isiUlang(int jumlahPermen){
        System.out.println("Proses pengaitan boneka sedang berlangsung, mohon menunggu");
    }

}