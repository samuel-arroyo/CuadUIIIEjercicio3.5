/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relojdigital;

/**
 *
 * @author Samuel A
 */
public class RelojDigital 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       ClockDisplay reloj = new ClockDisplay();     // crea el reloj en 00:00

        String hora = reloj.getTime();               // obtiene la hora inicial
        System.out.println("Hora inicial: " + hora);

        reloj.timeTick();                            // avanza un minuto
        String nuevaHora = reloj.getTime();
        System.out.println("Hora despues de timeTick: " + nuevaHora);

        // Ejercicio 3.16

        ClockDisplay reloj3 = new ClockDisplay();    // nuevo reloj para avanzar hasta 01:00

        int conteo = 0;
        while (!reloj3.getTime().equals("01:00")) {
            reloj3.timeTick();
            conteo++;
        }

        System.out.println("Ticks necesarios: " + conteo);
        System.out.println("Hora final: " + reloj3.getTime());

        ClockDisplay reloj2 = new ClockDisplay();    // segunda forma
        reloj2.setTime("01:00");

        System.out.println("Hora establecida manualmente: " + reloj2.getTime());
    }
    
}
