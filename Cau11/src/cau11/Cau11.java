/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau11;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;


/**
 *
 * @author Ho Khang
 */
public class Cau11 {


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ParseException {
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
       Scanner in = new Scanner(System.in);
       
       System.out.println("Nhap ngay a (dd/MM/yyyy)");
       String a = in.nextLine();
       Date d1 = sdf.parse(a);

       Calendar date1 = Calendar.getInstance();
       date1.setTime(d1);
       
       /**System.out.println(sdf.format(d1)); */
       
       System.out.println("Nhap ngay b (dd/MM/yyyy)");
       String b = in.nextLine();
       Date d2 = sdf.parse(b);

       Calendar date2 = Calendar.getInstance();
       date2.setTime(d2);
       /**System.out.println(sdf.format(d2)); */
       
       /**====Cau a====*/
       
       /**
       if (date1.getTimeInMillis()== date2.getTimeInMillis())
            System.out.println("Ngay a bang ngay b");
       else if (date1.getTimeInMillis() < date2.getTimeInMillis())
           System.out.println("Ngay a nho hon ngay b");
       else
           System.out.println("Ngay a lon hon ngay b");
       */
       
       /**====Cau b====*/
       
       /**
       Calendar temp = date1;
       temp.add(Calendar.DATE, 1);
       
       Date tempdate =  temp.getTime();
      
       System.out.println("Ngay tiep theo cua a: " + sdf.format(tempdate));
       * */
       
       /**====Cau c====*/
       
       /**
       Calendar temp = date1;
       temp.add(Calendar.DATE, -1);
       
       Date tempdate =  temp.getTime();
      
       System.out.println("Ngay truoc do cua a: " + sdf.format(tempdate));
       */
       
       /**====Cau d====*/
       
       /**
       System.out.println("a la ngay thu " + date1.get(Calendar.DAY_OF_YEAR) + " cua nam");
       */
       
       /**====Cau e====*/
       
       /**
       int num = date1.getActualMaximum(Calendar.DAY_OF_MONTH);
       System.out.println("Thang chua a co " + num + "  ngay");
       */
       /**====Cau f====*/
       int year = date1.get(Calendar.YEAR);
       if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
            System.out.println("Nam nhuan");
       else 
            System.out.println("Nam khong nhuan");
       
   }
    
}
