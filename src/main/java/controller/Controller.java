/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author ramir
 */

//imports
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.FacturasCanvas;
import view.FacturasFrame;
import view.SistemaFacturas;

//controller
public class Controller implements ActionListener{
    //atributos
    private FacturasCanvas facturasCanvas;
    private FacturasFrame facturasFrame;
    private SistemaFacturas sistemaFacturas;
    
    //metodo controlador sin parametros
    public Controller(){
        //Jframe relacion
        this.facturasFrame = new FacturasFrame(); 

        //Por medio del JFrame me relaciono con el GetCanvas = PanelCanvas
        this.facturasCanvas= facturasFrame.getFacturasCanvas();
        //listnerButton
        this.facturasFrame.getSistemaFacturas().listenerButton(this);
        facturasFrame.setVisible(true); // 
    }//fin Controller
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //la accion llamar sistema 
        if(e.getSource() == facturasFrame.getSistemaFacturas().getBtnIngresarIngresos()){
           facturasCanvas.ingresarIngresos();
       }else if(e.getSource() == facturasFrame.getSistemaFacturas().getBtnIngresarGastos()){
           facturasCanvas.ingresarGastos();
       }else if(e.getSource() == facturasFrame.getSistemaFacturas().getBtnListadoIngresos()){
           facturasCanvas.listadoIngresos();
       }else if(e.getSource()== facturasFrame.getSistemaFacturas().getBtnListadoGastos()){
           facturasCanvas.listadoGastos();
       }else if(e.getSource()== facturasFrame.getSistemaFacturas().getBtnImpuestoRenta()){
           facturasCanvas.impuestoRenta();    
       }else if (e.getSource()== facturasFrame.getSistemaFacturas().getBtnSalir()){
          facturasCanvas.salir();
       }
    }//fin actionPErformed
    
}
