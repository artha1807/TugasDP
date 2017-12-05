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
public class StateAdaKoin implements State{
    private MesinPengaitBoneka mesin;
    
    public StateAdaKoin(MesinPengaitBoneka mesin){
        this.mesin = mesin;
    }

    @Override
    public void kontrolPengait(){
        System.out.println("Mengontrol pengait mesin");
    }
    
    @Override
    public void koinMasuk(){
        System.out.println("Maaf, Anda sudah memasukkan koin");
    }
    
    @Override
    public void koinKeluar(){
        System.out.println("Koin diambil kembali, penjualan dibatalkan");
        mesin.setState(mesin.getTidakAdaKoin());
    }
    
    @Override
    public void tekanTombol(){
        System.out.println("Tombol ditekan");
        mesin.setState(mesin.getBonekaTerkait());
    }
    
    @Override
    public void ambilBoneka(){
        System.out.println("Mohon tekan tombol terlebih dahulu");
    }
    
    @Override
    public void isiUlang(int jumlahBoneka){
        System.out.println("Isi ulang tidak bisa dilakukan saat ada yang memainkan");
    }

}