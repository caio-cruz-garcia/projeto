package com.company.models;

import com.company.Interface.PostarMensagem;

public abstract class Usuario implements PostarMensagem {
    public String name;
    public String email;
    public String cargo;

    public Usuario(String name,String email,String cargo) {
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
    public String getEmail() {
        return email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
