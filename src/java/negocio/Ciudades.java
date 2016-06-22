/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import accesodato.Coneccion;

/**
 *
 * @author Administrador
 */
public class Ciudades {
    
    private int ciudad_id;
    private String nombre;
    private String creado_por;
    private String estado;
    private int pais_id;
    Coneccion con;

    public Ciudades() {
        con=new Coneccion();
    }

    public int getCiudad_id() {
        return ciudad_id;
    }

    public void setCiudad_id(int ciudad_id) {
        this.ciudad_id = ciudad_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCreado_por() {
        return creado_por;
    }

    public void setCreado_por(String creado_por) {
        this.creado_por = creado_por;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPais_id() {
        return pais_id;
    }

    public void setPais_id(int pais_id) {
        this.pais_id = pais_id;
    }
    
     public void guardar(){
        con.setInsertar("insert into Ciudades(nombre,creado_por,pais_id,estado) values('"+this.getNombre()+"','"+this.getCreado_por()+"','"+this.getPais_id()+"','activo')");
    }
    public void eliminar(){
        con.setInsertar("update Ciudades set estado='pasivo' where pais_id='"+this.getPais_id()+"'");
    }
    public void actualizar(){
        con.setInsertar("update Ciudades set nombre='"+this.getNombre()+"',creado_por='"+this.getCreado_por()+"' where pais_id='"+this.getPais_id()+"'");
    }
    
    
}

