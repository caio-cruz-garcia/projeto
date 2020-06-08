package com.company.models;

import com.company.Enum.HorariosExtras;
import com.company.Enum.Trabalho;

public class Big_Brothers extends Usuario {
    public Big_Brothers(String name, String email, Trabalho cargo){
        super(name,email,cargo);
    }


    @Override
    public void apresentacao() {
        System.out.println(this.toString());
    }

    @Override
    public void mensagem(HorariosExtras horarios) {
        switch (horarios){
            case horarioExtras:
                System.out.format("%s - ...\n", this.getName());
                break;
            case horarioNormal:
                System.out.format("%s - Sempre\n" +
                        "ajudando as pessoas membros ou não S2!\n", this.getName());
                break;
            default:
                break;
        }
    }
}
