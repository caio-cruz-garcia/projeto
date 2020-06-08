package com.company.models;

import com.company.Enum.HorariosExtras;
import com.company.Enum.Trabalho;

public class Heavy_Lifters extends Usuario {
    public Heavy_Lifters(String name, String email, Trabalho cargo){
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
                System.out.format("%s - N00b_qu3_n_Se_r3pita.bat\n", this.getName());
                break;
            case horarioNormal:
                System.out.format("%s - Podem contar conosco!\n", this.getName());
                break;
            default:
                break;
        }
    }
}
