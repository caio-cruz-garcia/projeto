package com.company.models;
import com.company.Enum.HorariosExtras;
import com.company.Enum.Trabalho;

public class Mobile_Members extends Usuario {
    public Mobile_Members(String name, String email, Trabalho cargo){
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
                System.out.format("%s - Happy_C0d1ng. Maskers\n", this.getName());
                break;
            case horarioNormal:
                System.out.format("%s - Happy Coding!\n", this.getName());
                break;
            default:
                break;
        }
    }


}
