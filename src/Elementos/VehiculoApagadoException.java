/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Elementos;

/**
 *
 * @author lopez
 */
public class VehiculoApagadoException extends RuntimeException{

    @Override
    public String getMessage() {
        return "El vehículo se encuentra apagado, por lo tanto no se puede apagar.";
    }

}
