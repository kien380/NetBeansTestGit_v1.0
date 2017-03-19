/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbeanstestgit_v1.pkg0;

import java.math.BigInteger;

/**
 *
 * @author CongHua
 */
public class bai12 {
    private BigInteger A,B;

    public bai12() {
        A = new BigInteger("1234567890");
        B = new BigInteger("9876654321");
        Cong();
    }
    
    public void Cong() {
        BigInteger sum = A.add(B.multiply(new BigInteger("3")));
        
        System.out.println(A+ " + " + B + " * 3 = "+sum);
    }
    
}
