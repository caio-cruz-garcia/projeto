package com.company.models;

import com.company.Enum.HorariosExtras;
import com.company.Enum.Trabalho;

import java.util.ArrayList;

public class Cadastrar {
    private ArrayList<Usuario> Listausuario;
    private Trabalho trabalho;
    private HorariosExtras horarios;

    public Cadastrar(Trabalho trabalho) {
        this.trabalho = trabalho;
    }

    public void CadastrarUsuario(Usuario usuario) {
        this.Listausuario.add(usuario);
    }
    public void Deletar(Usuario usuario) {
        this.Listausuario.remove(usuario);
    }

    public ArrayList<Usuario> getListausuario() {
        return Listausuario;
    }
    public HorariosExtras getHorarios() {
        return horarios;
    }
    public void Trocarhorario() {
        switch (this.horarios){
            case horarioNormal:
                this.horarios = HorariosExtras.horarioNormal;
                break;
            case horarioExtras:
                this.horarios = HorariosExtras.horarioExtras;
                break;
            default:
                break;
        }
    }

}
