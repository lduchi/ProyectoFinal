/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import com.db4o.*;
import com.db4o.ext.Db4oIOException;

public class Conexion {

    public static ObjectContainer ConectarBD() {
        try {
            ObjectContainer baseDatos = Db4o
                    .openFile("C:\\Users\\PC\\Documents\\Mini proyecto BDOO\\Academia_Musical.yap");

            return baseDatos;
        } catch (Db4oIOException e) {
            System.out.println("¡RUTA de base de datos no encontrada!\nDetalles del error:" + e);
        }
        return null;
    }
}
