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
public interface State {
    void koinMasuk();
    void koinKeluar();
    void kontrolPengait();
    void tekanTombol();
    void ambilBoneka();
    void isiUlang(int jumlahPermen);
}
