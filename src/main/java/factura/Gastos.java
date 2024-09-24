/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factura;

/**
 *
 * @author ramir
 * 
 */

public class Gastos {

    //atributos
    private double spentMoney, totalSpent;
    private int spentBillNumber, spentDay, spentMonth;
    private String spentYear;
    //------------------------------------
    
    //metodo sin parametros
    public Gastos(){
        this.spentBillNumber=0;
        this.spentDay=0;
        this.spentMoney=0;
        this.spentMonth=0;
        this.spentYear="";
    }
    //------------------------------------
    
    //metodo con parametros
     public Gastos(int spentBillNumber, int spentDay, int spentMonth, String spentYear,double spentMoney){
        this.spentBillNumber= spentBillNumber;
        this.spentDay=spentDay;
        this.spentMoney=spentMoney;
        this.spentMonth=spentMonth;
        this.spentYear=spentYear;
     }
     //------------------------------------
     
    //gastos mensuales
     
    //set 
   public void setSpentMoney(double spentMoney){
      this.spentMoney = spentMoney;
   }//fin set
  //get
   public double getSpentMoney(){
       return this.spentMoney;
   }//fin get
   
   //totalSpent
   public void setTotalSpent(double totalSpent){
      this.totalSpent=totalSpent+spentMoney;
   }
   public double getTotalSpent(){
       return this.totalSpent;
   }//fin get
   //get
   //----------------------------------------
   
   //dates of the bills
   //--------day
   //set
   public void setSpentDay(int spentDay){
       this.spentDay = spentDay;   
   }//fin set
   
   public int getSpentDay(){
       return this.spentDay;
   }//fin get
   
   //--------month
   //set
   public void setSpentMonth(int spentMonth){
       this.spentMonth = spentMonth;   
   }//fin set
   
   public int getSpentMonth(){
       return this.spentMonth;
   }//fin get
   
   //----numero factura
   //set 
   public void setSpentBillNumber(int spentBillNumber){
      this.spentBillNumber = spentBillNumber;
   }//fin set
  //get
   public int getSpentBillNumber(){
       return this.spentBillNumber;
   }//fin get
   
     //----------------------------------------
   
   //Imprimir factura de gastos
    @Override
   public String toString() {
       //concatenar con +
        return("\n \n--------------------- \n \nFactura Gastos \n.......................... \n Número de Factura: ..... "+ getSpentBillNumber() +"\n Fecha: ............. " + getSpentDay() + "/"+ getSpentMonth() + spentYear + "\n Precio: ............. " + getSpentMoney() + " colones. \n \n---------------------");
    }//fin toString
}//fin class Gastos
