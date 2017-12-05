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
public class MesinPengaitBoneka {
    private State adaKoin;
    private State tidakAdaKoin;
    private State bonekaTerkait;
    private State bonekaHabis;
    private State bonekaTidakTerkait;
    
    private State state;
    private int sisaBoneka = 1;
    private boolean statusPengait = false;
    
    public MesinPengaitBoneka(int jumlahBoneka){
        adaKoin = new StateAdaKoin(this);
        tidakAdaKoin = new StateTidakAdaKoin(this);
        bonekaTerkait = new StatePengaitBonekaTerkait(this);
        bonekaTidakTerkait = new StatePengaitBonekaTidakTerkait(this);
        bonekaHabis = new StateBonekaHabis(this);
               
        if(sisaBoneka > 0){
            state = tidakAdaKoin;
        }
        else{
            state = bonekaHabis;
        }
    }
    
    public void kontrolPengait(){
        state.kontrolPengait();
    }
    
    public void koinMasuk(){
        state.koinMasuk();
    }
    
    public void koinKeluar(){
        state.koinKeluar();
    }
    
    public void tekanTombol(){
        state.tekanTombol();
        state.ambilBoneka();
    }
    
    public void ambilBoneka(int jumlah){
        if(sisaBoneka != 0) sisaBoneka -= jumlah;
        
        System.out.println("Boneka diambil: " + jumlah + " buah (Sisa: "+ sisaBoneka +")");
    }
    
    public void isiUlang(int jumlah){
        state.isiUlang(jumlah);
    }
    
    public void setState(State state){
        this.state = state;
    }
    
    public void setSisaBoneka(int tambahan){
        sisaBoneka += tambahan;
    }

    public State getAdaKoin() {
        return adaKoin;
    }

    public State getTidakAdaKoin() {
        return tidakAdaKoin;
    }

    public State getBonekaTerkait() {
        return bonekaTerkait;
    }

    public State getBonekaHabis() {
        return bonekaHabis;
    }

    public State getBonekaTidakTerkait() {
        return bonekaTidakTerkait;
    }

    public State getState() {
        return state;
    }

    public int getSisaBoneka() {
        return sisaBoneka;
    }


    
    
}
