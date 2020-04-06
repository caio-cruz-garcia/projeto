package Atividade1;
// Caio Cruz RA 15.01580-7

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nick:");
        String nick;
        nick = scanner.nextLine();
        Usuario usuario = new Usuario(nick,"123","");
        Conta conta = new Conta(usuario);
        System.out.println(conta.getId().getNome());
        conta.addSaldo(1000);
        System.out.println("Dados inicial da conta:"+ conta.getInfo());


        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Informe o nick:");
        String nick1;
        nick1 = scanner.nextLine();
        Usuario usuario1 = new Usuario(nick1,"123","");
        Conta conta1 = new Conta(usuario1);
        System.out.println(conta1.getId().getNome());
        conta1.addSaldo(250);
        System.out.println("Dados inicial da conta:"+ conta1.getInfo());


        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Informe o nick:");
        String nick2;
        nick2 = scanner.nextLine();
        Usuario usuario2 = new Usuario(nick2,"123","");
        Conta conta2 = new Conta((usuario2));
        System.out.println(conta2.getId().getNome());
        conta2.addSaldo(3000);
        System.out.println("Dados inicial da conta:"+ conta2.getInfo());
        scanner.close();
    }
}
