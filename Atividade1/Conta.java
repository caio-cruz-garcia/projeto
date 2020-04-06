package Atividade1;
// Caio Cruz RA 15.01580-7

public class Conta {
    private  Usuario id;
    private static double saldo;

    public Conta(Usuario id){
        this.id = id;
        saldo = 0;
    }

    public void addSaldo(double valor){
        Conta.saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public Usuario getId() {
        return id;
    }

    public String getInfo(){
        String resposta = "";
        resposta = String.format("{id:%s, saldo:%f}",id.getNome(),Conta.saldo);
        return resposta;
    }
}


