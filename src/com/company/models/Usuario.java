package com.company.models;

import com.company.Enum.Trabalho;
import com.company.Interface.PostarMensagem;
import com.company.Interface.Apresentacao;

public abstract class Usuario implements PostarMensagem,Apresentacao {
    public String name;
    public String email;
    public Trabalho cargo;

    public Usuario(String name,String email,Trabalho cargo) {
        this.name = name;
        this.email = email;
        this.cargo = cargo;
    }

    public String getName() {
        return name;
    }

    public Trabalho getCargo() {
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

    public void setCargo(Trabalho cargo) {
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
