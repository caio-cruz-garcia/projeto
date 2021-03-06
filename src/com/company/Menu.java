package com.company;

import com.company.Enum.Trabalho;
import com.company.Enum.HorariosExtras;
import com.company.models.Big_Brothers;
import com.company.models.Script_Guys;
import com.company.models.Heavy_Lifters;
import com.company.models.Mobile_Members;
import com.company.models.Usuario;
import com.company.models.Cadastrar;
import java.util.Scanner;


public class Menu {
    final static Scanner scanner = new Scanner(System.in);

    public static void run() throws Exception {
        Cadastrar cadastrar = new Cadastrar(HorariosExtras.horarioNormal);
        System.out.println("Bem Vindo!");
        boolean run = true;
        while(run) {
            System.out.println("1- Cadastrar Usuario:");
            System.out.println("2- Remover Usuario:");
            System.out.println("3- Postar Mensagem:");
            System.out.println("4- Apresentação do Usuario:");
            System.out.println("5- Trocar hora de trabalho:");
            System.out.println("6- Sair:");
            System.out.println("Horarios de Trabalho Atual: " + cadastrar.getHorarios());
            int menu = scanner.nextInt();

            switch (menu){
                case 1:
                    Usuario usuario = menuCadatrarUsuario();
                    if(usuario != null){
                        cadastrar.CadastrarUsuario(usuario);
                    }
                    break;
                case 2:
                    if(cadastrar.getListausuario().size() > 0){
                        for (int i=0; i<cadastrar.getListausuario().size();i++){
                            System.out.format("%d - %s %s",i,cadastrar.getListausuario().get(i).getName(),cadastrar.getListausuario().get(i).getCargo());
                        }
                        System.out.println("Digite o Usuario a ser excluido:");
                        int index = scanner.nextInt();
                        cadastrar.Deletar(cadastrar.getListausuario().get(index));
                    }
                    else{
                        System.out.println("Ainda não há usuarios cadastrados:");
                    }
                    break;
                case 3:
                    cadastrar.ExibirMensagem();
                    break;
                case 4:
                    cadastrar.MostrarUsuarios();
                    break;
                case 5:
                    cadastrar.Trocarhorario();
                    break;
                case 6:
                    run = false;
                    break;
                default:
                    break;
            }
            System.out.println();
        }
    }
    public static Usuario menuCadatrarUsuario(){
        System.out.println("Cadastrar usuario");
        System.out.println("Digite o Cargo");
        String cargo = scanner.next();
        System.out.print("Digite o nome");
        String name = scanner.next();
        System.out.print("Digite o email");
        String email = scanner.next();
        System.out.println("Digite o Trabalho");
        if(cargo.equals("Mobile Members")){
            return new Mobile_Members(name,email,Trabalho.Mobile_Members);
        }
        else if(cargo.equals("Heavy Lifters")){
            return new Mobile_Members(name,email,Trabalho.Heavy_Lifters);
        }
        else if(cargo.equals("Script Guys")){
            return new Mobile_Members(name,email,Trabalho.Script_Guys);
        }
        else if(cargo.equals("Big Brothers")){
            return new Mobile_Members(name,email,Trabalho.Big_Brothers);
        }
        else{
            System.out.println("Não Existe cargo com esse nome");
        }
        return null;
    }
}


