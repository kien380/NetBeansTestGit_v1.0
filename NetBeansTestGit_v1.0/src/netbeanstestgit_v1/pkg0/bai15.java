/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbeanstestgit_v1.pkg0;

import java.util.Scanner;

/**
 *
 * @author Phan Tan Thanh
 */
public class bai15 {
    private int n,m,MT[][];
    
    public bai15() {        
        System.out.println("Nhập vào ma trận: ");
        NhapMaTran();       
        
        System.out.println("Giá trị lớn nhất của ma trận là: " + GTLN());                
        System.out.println("Giá trị nhỏ nhất của ma trận là: " + GTNN());        
        XuatNguyenTo();
        XuatTongMaTran();
    }
    
    //Nhập ma trận
    private void NhapMaTran()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập số hàng: ");
        n=in.nextInt();
        System.out.println("Nhập so cột: ");
        m=in.nextInt();
        MT=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("  a["+i+","+j+"]=");
                MT[i][j]=in.nextInt();
            }
            System.out.println();
        }
    }
    //Giá trị nhỏ nhất của ma trận
    private int GTNN()
    {
        int min = MT[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (MT[i][j]<min) {
                    min=MT[i][j];
                }
            }
        }
        return min;
    }
    //Câu c. Tìm tất cả các số nguyên tố của ma trận

    //Giá trị lớn nhất của ma trận
    private int GTLN()
    {
        int max = MT[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (MT[i][j] > max) {
                    max = MT[i][j];
                }
            }
        }
        return max;
    }
    //Kiểm tra nguyên tố
    public static boolean KiemTraNguyenTo(int n)
    {
        if(n<=1)
            return false;
        else
        {
            int dem = 0;
            for(int i=2;i<Math.sqrt(n);i++)
            {
                if((n%i)==0)
                    dem++;  
            }
            if(dem==0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
    //In ra số nguyên tố trong mảng
    private void XuatNguyenTo()
    {
        System.out.println("Các số nguyên tố có trong mảng:");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++) 
            {
                if(KiemTraNguyenTo(MT[i][j]) == true )
                System.out.print(MT[i][j] +"  ");
            }
        }
        System.out.print("\n");
    }    
    
//Câu d. Tính tổng tất cả các giá trị của ma trận

    private void XuatTongMaTran()
    {
        int S = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++) 
            {
                S+=MT[i][j];
            }
        }
        System.out.printf("Tổng các giá trị phẩn tử: %d\n", S);
    }
    
}
