/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Muhammad Muizuddin
 */
public class MarkahKeseluruhan {
public static void main (String[]args){
    
    int fop=87;
    int coa=90;
    int wp=68;
    int si=50;
    int jumlah=fop+coa+wp+si;
    int purata=fop+coa+wp+si/4;
    
    int peratusan=jumlah*100/400;
    
System.out.println("==============================================================================================================================================");    
System.out.println("Markah bagi Fundamental Of Programming :"+fop+"                    Markah bagi Computer Organization and Architecture :"+coa);
System.out.println("Markah bagi System Interface :"+si+"                               Markah bagi Web Programming :"+wp);
System.out.println("Jumlah Markah Keseluruhan :"+jumlah);
System.out.println("Jumlah Purata Keseluruhan :"+purata);
System.out.println("Jumlah Peratusan Keseluruhan :"+peratusan+"%");
System.out.println("==============================================================================================================================================");
}
    
}
