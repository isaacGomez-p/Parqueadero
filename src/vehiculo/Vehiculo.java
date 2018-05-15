/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo;

/**
 *
 * @author ISAACELEAZAR
 */
public class Vehiculo {
    String placa;
    String tipo_vehiculo;
    String posicion;
    String hora_e;
    String hora_s;
    String fecha_e;
    
    public Vehiculo(String placa_, String tipo_vehiculo_, String posicion_, String hora_e_, String hora_s_, String fecha_e_){
        this.placa = placa_;
        this.tipo_vehiculo = tipo_vehiculo_;
        this.posicion = posicion_;
        this.hora_e = hora_e_;
        this.hora_s = hora_s_;
        this.fecha_e = fecha_e_;
    }

    public Vehiculo(String placa, String posicion, String hora_e, String fecha_e) {
        this.placa = placa;
        this.posicion = posicion;
        this.hora_e = hora_e;
        this.fecha_e = fecha_e;
    }
    
     public static Vehiculo crear(String placa, String tipo, String posicion, String hora_e, String hora_s, String fecha_e){
         return new Vehiculo(placa, tipo, posicion, hora_e, hora_s, fecha_e);
     }
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    public void setTipo_vehiculo(String tipo_vehiculo) {
        this.tipo_vehiculo = tipo_vehiculo;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getHora_e() {
        return hora_e;
    }

    public void setHora_e(String hora_e) {
        this.hora_e = hora_e;
    }

    public String getHora_s() {
        return hora_s;
    }

    public void setHora_s(String hora_s) {
        this.hora_s = hora_s;
    }

    public String getFecha_e() {
        return fecha_e;
    }

    public void setFecha_e(String fecha_e) {
        this.fecha_e = fecha_e;
    }
    
    
    
}
