/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author ronni
 */
public class Ejecutor02 {

    public static void main(String[] args) {

        // 1. Crear una persona de Barrio el Valle de la ciudad de Loja
        // 2. Crear una persona del Barrio Central de la ciudad de Cuenca
        // 3. Crear una persona del Barrio Centenario de la ciudad de Guayaquil
        Ciudad ciudad00 = new Ciudad("Loja");
        Ciudad ciudad01 = new Ciudad("Cuenca");
        Ciudad ciudad02 = new Ciudad("Guayaquil");

        Barrio barrio00 = new Barrio("El valle", ciudad00);
        Barrio barrio01 = new Barrio("Barrio Central", ciudad01);
        Barrio barrio02 = new Barrio("Barrio Centenario", ciudad02);

        Persona persona00 = new Persona("Ronin Carrión", "11037020394", barrio00);
        Persona persona01 = new Persona("Tais Balcázar", "11045726453", barrio01);
        Persona persona02 = new Persona("José Luis Benítez", "110349456483", barrio02);

        System.out.println("------------------------------------------");
        System.out.printf("El barrio de la persona %s es: %s\n Y pertenece a la "
                + "ciudad: %s\n",
                persona00.obtenerNombre(),
                persona00.obtenerBarrio().obtenerNombre(),
                persona00.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");


        // persona01.establecerBarrio(barrio01.establecerNombre("Guasmo"));
        System.out.printf("El barrio de la persona %s es: %s\n Y pertenece a la "
                + "ciudad: %s\n",
                persona01.obtenerNombre(),
                persona01.obtenerBarrio().obtenerNombre(),
                persona01.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");

        System.out.printf("El barrio de la persona %s es: %s\n Y pertenece a la "
                + "ciudad: %s\n",
                persona02.obtenerNombre(),
                persona02.obtenerBarrio().obtenerNombre(),
                persona02.obtenerBarrio().obtenerCiudad().obtenerNombre());

    }
}
