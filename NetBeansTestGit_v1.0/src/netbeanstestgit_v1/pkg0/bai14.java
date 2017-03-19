/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbeanstestgit_v1.pkg0;

/**
 *
 * @author CongHua
 */
public class bai14 {
    private int[][] tg;

    public bai14() {
        tg = new int[7][7];
        taoTg();
        VeTg();
    }
    
    public void taoTg() {
        for(int i = 0 ; i < tg.length ; i++) {
            for(int j = 0 ; j < tg[i].length ; j++) {
                if(j > i) {
                    tg[i][j] = 0;
                }
                else if(j == 0 || i == j) {
                    tg[i][j] = 1;
                }
                else {
                    tg[i][j] = tg[i-1][j] + tg[i-1][j-1];
                }
            }
        }
    }
    
    public void VeTg() {
        for(int i = 0 ; i < tg.length ; i ++) {
            for(int j = 0 ; j < tg[i].length ; j++) {
                if(tg[i][j] != 0) {
                    System.out.print(" " + tg[i][j]);
                }
            }
            System.out.println();
        }
    }
}
