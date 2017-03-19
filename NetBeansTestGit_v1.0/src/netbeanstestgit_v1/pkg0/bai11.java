/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbeanstestgit_v1.pkg0;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;


/**
 *
 * @author Ho Khang
 */
public class bai11 {
    public bai11() throws ParseException {
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
       if (date1.getTimeInMillis()== date2.getTimeInMillis())
            System.out.println("Ngày a bằng ngày b");
       else if (date1.getTimeInMillis() < date2.getTimeInMillis())
           System.out.println("Ngày a nhỏ hơn ngày b");
       else
           System.out.println("ngày a lớn hơn ngày b");
       
       /**====Cau b====*/
       Calendar temp = date1;
       temp.add(Calendar.DATE, 1);
       
       Date tempdate =  temp.getTime();
      
       System.out.println("Ngày tiếp theo của a: " + sdf.format(tempdate));
       
       /**====Cau c====*/
       temp = date1;
       temp.add(Calendar.DATE, -1);
       
       tempdate =  temp.getTime();
      
       System.out.println("Ngày trước đó của a: " + sdf.format(tempdate));
       
       /**====Cau d====*/
       System.out.println("a là ngày " + date1.get(Calendar.DAY_OF_YEAR) + " của năm");
       
       /**====Cau e====*/
       int num = date1.getActualMaximum(Calendar.DAY_OF_MONTH);
       System.out.println("Tháng chứa a có " + num + "  ngày");
       
       /**====Cau f====*/
       int year = date1.get(Calendar.YEAR);
       if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
            System.out.println("Năm chứa a là năm nhuận");
       else 
            System.out.println("Năm chứa a là năm không nhuận");
       
   }
    
}
