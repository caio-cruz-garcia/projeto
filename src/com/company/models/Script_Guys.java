package com.company.models;

import com.company.Enum.HorariosExtras;
import com.company.Enum.Trabalho;

public class Script_Guys extends Usuario {
    public Script_Guys(String name, String email, Trabalho cargo){
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
                System.out.format("%s - QU3Ro_S3us_r3curs0s.py\n", this.getName());
                break;
            case horarioNormal:
                System.out.format("%s - Prazer em ajudar novos\n" +
                        "amigos de código!\n", this.getName());
                break;
            default:
                break;
        }
    }
}
