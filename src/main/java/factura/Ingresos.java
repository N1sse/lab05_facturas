/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factura;

/**
 *
 * @author ramir
 */
public class Ingresos {
    
  
    //----------------------------------------
   
    //atributos
    private double earnedMoney, totalEarned;
    private int billNumber, day, month;
    private String year;
     //----------------------------------------

    //ingresos por servicios como profesional.
    
    //construcctor sin parametros
    public Ingresos(){
        this.year= "";
        this.billNumber=billNumber+1;
        this.day=0;
        this.month=0;
        this.earnedMoney=0;
        
    }
    
    //construcctor con parametros
   public Ingresos(double earnedMoney, int billNumber, int day,int month, String year){
       this.earnedMoney = earnedMoney;
       this.billNumber=billNumber;
       this.day=day;
       this.month=month;
       this.year=year;
   }
    //----------------------------------------
   
   
   //billNumber
   
  //get
   public int getBillNumber(){
        return this.billNumber;
   }//fin get
   //----------------------------------------
   
   //dates of the bills
   //--------day
   //set
   public void setDay(int day){
        this.day = day;  
   }//fin set
   
   public int getDay(){
       return this.day;
   }//fin get
   
   //--------month
   //set
   public void setMonth(int month){
       this.month = month;   
   }//fin set
   
   public int getMonth(){
       return this.month;
   }//fin get
   
     //----------------------------------------
  
   
   //earnedMoney
   //set
   public void setEarnedMoney(double earnedMoney){
      this.earnedMoney = earnedMoney;
   }
   //get
   public double getEarnedMoney(){
      return this.earnedMoney;
   }//fin get
   
   
   //totalEarned
   public void setTotalEarned(double totalEarned){
      this.totalEarned=totalEarned+earnedMoney;
   }
   //get
   public double getTotalEarned(){
      return this.totalEarned;
   }//fin get
    //----------------------------------------
   
   //Imprimir factura
    @Override
   public String toString() {
       //concatenar con +
         return "\n--------------------- \n \nFactura por servicios Profesionales \n.......................... \n \n Número de Factura: .... "+ this.billNumber +"\n Fecha de emisión: ..... " + this.day + "/"+ this.month  + year + "\n Monto cobrado: ........ " + this.earnedMoney +" colones. \n \n---------------------";
    }//fin toString
   
}//fin class Ingresos
