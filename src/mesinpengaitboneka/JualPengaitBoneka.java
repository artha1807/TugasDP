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
public class JualPengaitBoneka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MesinPengaitBoneka mesin = new MesinPengaitBoneka(2);

        mesin.koinMasuk();
        mesin.kontrolPengait();
        mesin.tekanTombol();
        
        mesin.isiUlang(2);
        
        mesin.koinMasuk();
        mesin.kontrolPengait();
        mesin.tekanTombol();
        
        mesin.koinMasuk();
        mesin.kontrolPengait();
        mesin.tekanTombol();
        
        mesin.isiUlang(2);
        
        mesin.koinMasuk();
        mesin.kontrolPengait();
        mesin.tekanTombol();
    }
    
}
