/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author ronni
 */
public class Ejecutor3 {
    public static void main(String[] args) {
        
        String procesador = "Ryzen";
        UnidadDVD unidad = new UnidadDVD("Asus", 500.20);
        Computadora computadora = new Computadora(procesador, unidad);
        
        System.out.printf("Computadora:\nProcesador: %s\n"
                + "Unidad de DVD: %s\n"
                + "Costo de Unidad DVD: %.2f\n",
                computadora.obtenerTipoProcesador(),
                computadora.obtenerUnidadDvd().obtenerMarca(),
                computadora.obtenerUnidadDvd().obtenerCosto());
        
    }
    }
  

