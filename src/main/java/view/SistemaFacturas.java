/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;



/**
 *
 * @author ramir
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.BoxLayout;

public class SistemaFacturas extends JPanel{
    private FacturasCanvas facturasCanvas;
   
    /*"atributos", realmente inicializa botones
      1. Ingresar las facturas por servicios profesionales.
      2. Ingresar gastos 
      3. Listado de ingresos. 
      4. Listado de gastos. 
      5. Cálculo del impuesto de renta. 
      6. Salir*/
    
    private JButton btnIngresarIngresos;
    private JButton btnIngresarGastos;
    private JButton btnListadoIngresos;
    private JButton btnListadoGastos;
    private JButton btnImpuestoRenta;
    private JButton btnSalir;
    private Color currentColor;
    
    
   //metodo constructor
    public SistemaFacturas(){
         
        //grid(es para orden de botones) es 6 filas con 1 columnas
       this.setLayout(new GridLayout(6,1)); 
      
       //crear botones
       btnIngresarIngresos = new JButton ("Ingresar facturas por servicios profesionales");
       btnIngresarGastos = new JButton ("Ingresar gastos");
       btnListadoIngresos = new JButton("Listado de ingresos");
       btnListadoGastos = new JButton("Listado de gastos");
       btnImpuestoRenta= new JButton("Cálculo del impuesto de renta");
       btnSalir= new JButton("Salir");

       
       //Color fondo de los botones 
       btnIngresarIngresos.setBackground(new Color(0, 40, 80)    );
       btnIngresarGastos.setBackground(new Color(0, 40, 80)  );
       btnListadoIngresos.setBackground(new Color(0, 40, 80) );
       btnListadoGastos.setBackground(new Color(0, 40, 80));
       btnImpuestoRenta.setBackground(new Color(0, 40, 80));
       btnSalir.setBackground(new Color(0, 40, 80));
       
       //Color texto botones 
       btnIngresarIngresos.setForeground(Color.WHITE);
       btnIngresarGastos.setForeground(Color.WHITE);
       btnListadoIngresos.setForeground(Color.WHITE);
       btnListadoGastos.setForeground(Color.WHITE);
       btnImpuestoRenta.setForeground(Color.WHITE);
       btnSalir.setForeground(Color.WHITE);
       
       //agregar botones
       this.add(this.btnIngresarIngresos);
       this.add(this.btnIngresarGastos);
       this.add(this.btnListadoIngresos);
       this.add(this.btnListadoGastos);
       this.add(this.btnImpuestoRenta);
       this.add(this.btnSalir);
       
       //--------------
    }
   
    
    public void listenerButton (ActionListener controller){
        btnIngresarIngresos.addActionListener(controller);
        btnIngresarGastos.addActionListener(controller);
        btnListadoIngresos.addActionListener(controller);
        btnListadoGastos.addActionListener(controller);
        btnImpuestoRenta.addActionListener(controller);
        btnSalir.addActionListener (controller);
        
    }//fin listenerButton
    
    public JButton getBtnIngresarIngresos(){
        return btnIngresarIngresos;
    }//fin getBtnUp
    
    public JButton getBtnIngresarGastos(){
        return   btnIngresarGastos;
    }//fin getBtnDown
    
    public JButton getBtnListadoIngresos(){
        return btnListadoIngresos;
        
    }//fin getBtnbtnRight
    
    public JButton getBtnListadoGastos(){
        return btnListadoGastos;
       
    }
    
    public JButton getBtnImpuestoRenta(){
       return btnImpuestoRenta;
        
    }
    
     public JButton getBtnSalir(){
         return btnSalir;
     }
     
     
}
