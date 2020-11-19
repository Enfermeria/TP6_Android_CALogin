/*
    Clase Claves: maneja pares de usuario y clave
    Hecho por John David Molina
 */
package com.johnmolina.calogin;

import java.util.ArrayList;

public class Claves {
    private ArrayList<String> listaUsuarios;
    private ArrayList<String> listaClaves;

    public Claves() {
        this.listaUsuarios = new ArrayList<String>();
        this.listaClaves   = new ArrayList<String>();
    }

    public void clear() {
        this.listaUsuarios.clear();
        this.listaClaves.clear();
    }

    public void add(String usuario, String clave){
        this.listaUsuarios.add(usuario);
        this.listaClaves.add(clave);
    }

    public void generaClaves() {
        //Genero algunos nombres y claves
        add("User", "1234");
        add("John", "Molina");
        add("Lucas", "Salvatori");
        add("Juan", "Mi clave");
        add("Otro", "Una clave");
    }

    public boolean remove(String usuario){
        int i = listaUsuarios.indexOf(usuario);
        if (i>=0) {
            listaUsuarios.remove(i);
            listaClaves.remove(i);
            return true;
        }
        else
            return false;
    }

    public boolean claveCorrecta(String usuario, String clave) {
        int i = listaUsuarios.indexOf(usuario);
        if (i>=0 && listaClaves.get(i).equals(clave))
            return true;
        else
            return false;
    }
}
