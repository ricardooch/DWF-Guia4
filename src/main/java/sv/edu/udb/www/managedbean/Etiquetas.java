package sv.edu.udb.www.managedbean;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.SessionScoped;
@ManagedBean
@SessionScoped
public class Etiquetas {
    private String nombre;
    private String apellidos;
    private String password;
    private String comentario;
    private Boolean fumador;
    private ArrayList <String> aficiones;
    private String profesion;
    private ArrayList <String> lenguajes;
    /** Creates a new instance of Etiquetas */
    public Etiquetas() {
    }
    public ArrayList<String> getAficiones() {
        return aficiones;
    }
    public void setAficiones(ArrayList<String> aficiones) {
        this.aficiones = aficiones;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getComentario() {
        return comentario;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public Boolean getFumador() {
        return fumador;
    }
    public void setFumador(Boolean fumador) {
        this.fumador = fumador;
    }
    public ArrayList<String> getLenguajes() {
        return lenguajes;
    }
    public void setLenguajes(ArrayList<String> lenguajes) {
        this.lenguajes = lenguajes;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getProfesion() {
        return profesion;
    }
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
}
