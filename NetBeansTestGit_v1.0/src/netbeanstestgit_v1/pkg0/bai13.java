/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbeanstestgit_v1.pkg0;

import java.util.*;

/**
 *
 * @author CongHua
 */
public class bai13 {
    private int[] A, B, C;
    
    public void NhapA(){
        Scanner in = new Scanner(System.in);
        
        System.out.print("nhap so phan tu cua mang A : ");
        int n = in.nextInt();
        
        A = new int[n];
        
        for(int i = 0 ; i < n ; i++){
            System.out.print("nhap phan tu thu "+ (i+1) + " : ");
            A[i] = in.nextInt();
        }
    }
    
    public void XuatA(){
        System.out.print("mang A : ");
        for(int i : A){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    //a. Tạo mảng số nguyên B random
    public void TaoMangB_rd(){
        Scanner in = new Scanner(System.in);
        
        System.out.print("\nnhap so phan tu cua mang B : ");
        int m = in.nextInt();
        
        B = new int[m];
        
        for(int i = 0 ; i < m ; i++){
            B[i] = (int)(Math.random()*100);
        }
    }
    
    public void XuatB(){
        System.out.print("mang B : ");
        for(int i : B){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    //b. Xuất toàn bộ các phần tử của B ra màn hình (Arrays.toString)
    public void XuatB_toString(){
        String str = Arrays.toString(B);
        
        System.out.println("B to string : " + str);
    }
    
    //c. Tạo mảng C từ mảng A 
    public void TaoMangC(){
        System.out.println("\ntao mang C!!");
        
        try{
        C = Arrays.copyOf(A, A.length);
        }catch(Exception e){System.out.println("khong the tao mang C!!");}
    }
    
    public void XuatC(){
        String str = Arrays.toString(C);
        
        System.out.println("C to string : " + str);
    }
    
    //d. thay thế phần tử thứ 1->3 của C bằng 3 phần tử cuối của B
    public void Ccopy3B(){
        System.out.println("\nCopy 3 phan tu cuoi cua B vao 1-3 cua C");
        
        try{
            System.arraycopy(B, B.length-3, C, 0, 3);
        }catch(Exception e) {System.out.println("khong the copy!!");}
        
        XuatC();   
    }
    
    //e.Sắp xếp mảng C tăng dần và xuất ra màn hình (Arrays.sort)
    public void Csort(){
        Arrays.sort(C);
        System.out.println("\nsap xep mang C : ");
        XuatC();
    }
    
    //f. Nhập vào số x, kiểm tra x có nằm trong mảng C hay không? (Arrays.binarySearch)
    public void CSearchx(){
        Scanner in = new Scanner(System.in);
        
        System.out.print("\nnhap so can tim : ");
        
        int x = in.nextInt();
        
        int p = Arrays.binarySearch(C, x);
        
        System.out.printf("vi tri cua %d : ", x);
        
        if(p >= 0){
            System.out.println(p);
        }
        else{
            System.out.printf("khong tim thay %d trong C!!\n",x);
        }
    }
}
