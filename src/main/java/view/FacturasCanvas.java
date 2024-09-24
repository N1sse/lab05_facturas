/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;



/**
 *
 * @author ramir
 */
//imports
import factura.Gastos;
import factura.Ingresos;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
//codigo
public class FacturasCanvas extends JPanel{
    //lista
    List<Ingresos> listaIngresos = new ArrayList<>();
    List<Gastos> listaGastos = new ArrayList<>();
    private Gastos gastos;
    private Ingresos ingresos;
    
    //atributos
    private double totalEarned, earnedMoney;
    private    int billNumber, day, month;
    private    String year;
        
    //-----------varibles - gastos
    private   double totalSpent, spentMoney;
    private    int spentBillNumber, spentDay, spentMonth,spentYear;
        
     //-----------varibles main & Impuestos Renta
    private    int cicle;
    //----------------------------------------------- 
        
    //inicializar  
    public FacturasCanvas(){
     this.totalEarned = 0;
     this.totalSpent = 0;
     this.billNumber=0;
     this.month=0;
     
     this.setBackground(Color.BLACK);
    }
    
    
    public void ingresarIngresos() {
         do {
        // Solicitar cuánto cobró al cliente
        earnedMoney = Double.parseDouble(JOptionPane.showInputDialog("Digite cuánto cobró al cliente:"));

        // Solicitar el día que emitió la factura
        day = Integer.parseInt(JOptionPane.showInputDialog("Digite el día que emitió la factura. \n(Ingrese un día entre 1 y 31)"));
        while (day < 1 || day > 31) {
            day = Integer.parseInt(JOptionPane.showInputDialog("Día inválido. Ingrese un día entre 1 y 31:"));
        }

        // Solicitar el mes que emitió la factura
        month = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes que emitió la factura \n(Ingrese un mes entre el mes 1 = enero y el mes 12 = Diciembre)"));
        while (month < 1 || month > 12) {
            month = Integer.parseInt(JOptionPane.showInputDialog("Mes inválido. Ingrese un mes entre 1 y 12:"));
        }

        billNumber++; // Para llevar la cuenta de las facturas de forma "automática"
        JOptionPane.showMessageDialog(null, "Número de la factura: " + billNumber);

        // Guardar la factura
        Ingresos ingreso = new Ingresos(earnedMoney, billNumber, day, month, "/2024");
        listaIngresos.add(ingreso);
        totalEarned += earnedMoney;

        // Preguntar si desea ingresar otra factura
        cicle = JOptionPane.showConfirmDialog(null, "¿Desea ingresar otra factura?", "Confirmación", JOptionPane.YES_NO_OPTION);

        } while (cicle != JOptionPane.NO_OPTION);

    }//fin ingresarIngresos
    
   public void ingresarGastos() {
       do {
        // Solicitar cuánto gastó en la factura
        spentMoney = Double.parseDouble(JOptionPane.showInputDialog("Digite cuánto gastó en esta factura:"));

        // Solicitar el día que se emitió la factura
        spentDay = Integer.parseInt(JOptionPane.showInputDialog("Digite el día que se emitió la factura \n(Ingrese un día entre 1 y 31):"));
        while (spentDay < 1 || spentDay > 31) {
            spentDay = Integer.parseInt(JOptionPane.showInputDialog("Día inválido. Por favor, digite un día entre 1 y 31:"));
        }

        // Solicitar el mes que se emitió la factura
        spentMonth = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes que se emitió la factura \n(Ingrese un mes entre el mes 1 = enero y el mes 12 = Diciembre):"));
        while (spentMonth < 1 || spentMonth > 12) {
            spentMonth = Integer.parseInt(JOptionPane.showInputDialog("Mes inválido. Por favor, digite un mes entre 1 y 12:"));
        }

        // Solicitar el número de la factura
        spentBillNumber = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de la factura:"));

        // Guardar el gasto
        Gastos gasto = new Gastos(spentBillNumber, spentDay, spentMonth, "/2024", spentMoney);
        listaGastos.add(gasto);
        totalSpent += spentMoney;

        // Preguntar si desea ingresar otro gasto
        cicle = JOptionPane.showConfirmDialog(null, "¿Desea ingresar otro gasto que haya hecho? ", "Confirmación", JOptionPane.YES_NO_OPTION);

        } while (cicle != JOptionPane.NO_OPTION);
    }//fin ingresarGastos

    public void listadoIngresos(){
       if (listaIngresos.isEmpty()) {
       JOptionPane.showMessageDialog(null, "No se han ingresado los datos de las Facturas por servicios profesionales");
       return; // Salir del método si no hay datos
       }
        JOptionPane.showMessageDialog(null,"--------------------- \nListado de Ingresos \n--------------------- \n ");
                    for (Ingresos ingreso : listaIngresos) {
                        JOptionPane.showMessageDialog(null,ingreso);
                    }
    }//fin ListadoIngresos
    
    public void listadoGastos(){
        if (listaGastos.isEmpty()) {
       JOptionPane.showMessageDialog(null, "No se han ingresado los datos de las facturas de los gastos");
       return; // Salir del método si no hay datos
       }
        
        JOptionPane.showMessageDialog(null,"--------------------- \nListado de Gastos \n--------------------- \n ");
                    for (Gastos gasto : listaGastos) {
                        JOptionPane.showMessageDialog(null,gasto);
                    }
    }//fin ListadoGastos
    
    public void impuestoRenta(){
        int children, descount, answer, descountMarriage;
        double  rent, taxRent;
       
    //------------------------------------
     
    gastos = new Gastos();
    ingresos = new Ingresos();
    descountMarriage = 31440;
    descount = 0;
    taxRent = 0;
    answer=0;   
    children=0;
    double totalNet = totalEarned - totalSpent;
    //------------------------------------
    if (listaIngresos.isEmpty() || listaGastos.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No hay datos suficientes para calcular el impuesto sobre la renta. \nPor favor, ingrese los datos de las facturas de Servicios profesionales y Gastos para calcular el impuesto sobre la renta.");
        return; // Salir del método si no hay datos
    }
    //-----------renta
    if (totalNet <= 4127000) {
       JOptionPane.showMessageDialog(null, "Su renta es de: ...."+ totalNet +"·\nComo su renta no excede los ¢4.127.000 de colones no se le aplicará un impuesto sobre la renta");
        rent = totalNet;
    } else if (totalNet <= 6164000) {
        JOptionPane.showMessageDialog(null,"Como su renta es de: ¢" + totalNet + "\n Se le aplicará un impuesto de renta del 10%");
        rent = totalNet * 0.10;
    } else if (totalNet <= 10281000) {
        JOptionPane.showMessageDialog(null,"Como su renta es de: ¢" + totalNet + "\n Se le aplicará un impuesto de renta del 15%");
        rent = totalNet * 0.15;
    } else if (totalNet <= 20605000) {
        JOptionPane.showMessageDialog(null,"Como su renta es de: ¢" + totalNet + "\n Se le aplicará un impuesto de renta del 20%");
        rent = totalNet * 0.20;
    } else {
        JOptionPane.showMessageDialog(null,"Como su renta es de: ¢" + totalNet + "\n Se le aplicará un impuesto de renta del 25%");
        rent = totalNet * 0.25;
    }
    //------------------------------------  
    
    //-----------desc renta si tiene hijos
    if (rent != 0) {
        //---Se puede descontar ¢20.760,00 anuales por cada hijo y ¢31.440,00
        //anuales por el cónyuge.
        answer = JOptionPane.showConfirmDialog(null, "Usted tiene hijos?", "Confirmación", JOptionPane.YES_NO_OPTION);

        if (answer == JOptionPane.YES_OPTION) {
            children = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de hijos que usted tiene"));
            descount = children * 20760;
            JOptionPane.showMessageDialog(null, "Tendrá un descuento de: " + descount + ", ya que te tiene " + children + "hijos.");
            rent = rent - descount;
        } else {
            JOptionPane.showMessageDialog(null, "Usted no tiene hijos, entonces no puede recibir ese rebajo del impuesto de la renta ");
        }
    //-----------desc renta si esta casado
        answer = JOptionPane.showConfirmDialog(null, "¿Usted está casada(o)?","Confirmación", JOptionPane.YES_NO_OPTION);
        if (answer == JOptionPane.YES_OPTION) { 
            rent = rent - descountMarriage;
             JOptionPane.showMessageDialog(null, "Tendrá un descuento de: " + descountMarriage + ", ya que usted esta casado");
           
        } else {
            JOptionPane.showMessageDialog(null, "Usted no está casado, entonces no puede recibir ese rebajo del impuesto de la renta ");
        }
    } else {
        //-----------renta menor a 4127000
        JOptionPane.showMessageDialog(null, "No tiene que pagar el impuesto sobre la renta");
    }//fin if-else
    
    if(rent!=0){
         //monto a pagar del impuesto sobre la renta
        JOptionPane.showMessageDialog(null, "\n------------- \nSu monto a pagar del impuesto sobre la renta final es de: ... " + rent + " colones.");
    
    }else{
       JOptionPane.showMessageDialog(null, "\n------------- \nSu monto a pagar del impuesto sobre la renta final es de: ... 0 colones.");  
    }
  }//fin impuestoRenta
    
    public void salir(){
         JOptionPane.showMessageDialog(null,"..Se salio de forma exitosa del sistema");
         System.exit(0);
    }
   

}
