/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;



/**
 *
 * @author ramir
 */

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class FacturasFrame extends JFrame {

    private FacturasCanvas facturasCanvas;
    private SistemaFacturas sistemaFacturas;

    public FacturasFrame() {
        this.facturasCanvas = new FacturasCanvas();
        this.sistemaFacturas = new SistemaFacturas();
        this.setSize(500, 500);
        this.setTitle("Facturas Profesionales");

        // Cerrar
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Para que no se ajuste el popup
        setResizable(false);
        setLocationRelativeTo(null);

        // Es para ubicar los objetos
        this.setLayout(new BorderLayout());
        add(facturasCanvas, BorderLayout.CENTER);
        add(sistemaFacturas, BorderLayout.CENTER); // Agregar sistemaFacturas

        setVisible(true);
    }

    public void FacturasFrame(String titulo, int ancho, int alto) {
        this.setSize(ancho, alto);
        this.setTitle(titulo);
        this.setVisible(true);
    } // Con perimetros

    public FacturasCanvas getFacturasCanvas() {
        return this.facturasCanvas;
    }

    public SistemaFacturas getSistemaFacturas() {
        return sistemaFacturas;
    }
}