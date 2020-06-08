package com.company.models;

import com.company.Enum.HorariosExtras;
import com.company.Enum.Trabalho;

import java.util.ArrayList;

public class Cadastrar {
    private ArrayList<Usuario> Listausuario;
    private Trabalho trabalho;

    public Cadastrar(Trabalho trabalho) {
        this.trabalho = trabalho;
    }

    public Cadastrar(ArrayList<Usuario> listausuario) {
        Listausuario = listausuario;
    }

}
