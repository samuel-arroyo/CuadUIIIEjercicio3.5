/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relojdigital;

/**
 *
 * @author Samuel A
 */
/**
 * La clase NumberDisplay representa una pantalla numérica digital que puede
 * almacenar valores comprendidos entre cero y un determinado límite. El límite
 * puede especificarse a la hora de crear la pantalla. Los valores van de 0
 * (incluido) hasta límite-1. Por ejemplo, si se usa para los segundos en un
 * reloj digital, el límite sería 60, lo que nos daría un rango de visualización
 * comprendido entre 0 y 59. Al incrementarse, la pantalla vuelve
 * automáticamente a cero cuando alcanza el límite.
 *
 * @author Michael Kölling y David J. Barnes
 * @version 2016.02.29
 */
public class NumberDisplay 
{

    private int limit;
    private int value;

    /**
     * Constructor para los objetos de la clase NumberDisplay Fijar el límite
     * para el cual avanza la visualización
     */
    public NumberDisplay(int rollOverLimit) {
        limit = rollOverLimit;
        value = 0;
    }

    /**
     * Devuelve el valor actual.
     */
    public int getValue() {
        return value;
    }

    /**
     * Devuelve el valor de visualización (es decir, el valor actual en forma de
     * String de dos dígitos. Si el valor es menor que diez, lo rellena con un
     * cero a la izquierda).
     */
    public String getDisplayValue() {
        if (value < 10) {
            return "0" + value;
        } else {
            return "" + value;
        }
    }

    /**
     * Configura	el	valor	de	la	pantalla	con	el	nuevo	valor	especificado.	Si	el
     * nuevo valor es menor que cero o superior al límite, no hace nada.
     */
    public void setValue(int replacementValue) {
        if ((replacementValue >= 0) && (replacementValue < limit)) {
            value = replacementValue;
        }
    }

    /**
     * Incrementa el valor de visualización en una unidad, volviendo a cero si
     * se alcanza el límite.
     */
    public void increment() {
        value = (value + 1) % limit;
    }


}
