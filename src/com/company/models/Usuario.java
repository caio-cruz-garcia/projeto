package com.company.models;

public class Usuario {
    public String name;
    public String email;
    public String cargo;

    public Usuario(String name, String email, String cargo) {
        this.name = name;
        this.email = email;
        this.cargo = cargo;
    }

    public String getName() {
        return name;
    }
    public String getCargo() {
        return cargo;
    }

}
