package Atividade1;
// Caio Cruz RA 15.01580-7

public class Transacao {
    private  Usuario id;
    public static double gerar;
    public static double receber;


    public Transacao(Usuario id, double gerar, double receber){
        this.id = id;
        Transacao.gerar = gerar;
        Transacao.receber = receber;
    }

    public Usuario getId() {
        return id;
    }

    public static double getReceber() {
        return receber;
    }

    public static double getGerar() {
        return gerar;
    }

    //public static qrcode(Usuario id,double saldo,double QRcode){
    //      String resposta = "";
    //      resposta = String.format("{id:%s,saldo:%d,Qrcode:%d}",id.getNome(),saldo.get(),Qrcode.ramdon);
    //}

    /*
    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
     */
}