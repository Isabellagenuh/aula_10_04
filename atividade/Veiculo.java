public class Veiculo {

    String marca;
    String modelo;
    int ano;
    double velocidadeAtual;
    boolean motorLigado;
    double combustivel;

    public void ligarMotor() {
        if (motorLigado && combustivel>=1) {
           System.out.println("Seu motor ja está ligado!");
        } else if(combustivel>=1){
            motorLigado = true;
            System.out.println("Motor ligado!");
        }else if (combustivel<1){
            System.out.println("você esta sem gasolina");
        }else{
            System.out.println("ligado!");
        }
    }

    public void desligarMotor() {
        if (motorLigado) {
            motorLigado = false;
            velocidadeAtual = 0;
            System.out.println("Seu motor está desligado!");
        } else {
            System.out.println("Seu motor ja está ligado!");
        }
    }

    public void acelerar() {
        if (motorLigado && combustivel >= 1) {
            motorLigado = true;
            velocidadeAtual += 10;
            combustivel -= 0.10;
            System.out.println("Sua velocidade atual é: " + velocidadeAtual + "km/h");
        } else if (!motorLigado && combustivel >= 1) {
            System.out.println("Motor está desligado");
        } else if (motorLigado && combustivel <= 0) {
            motorLigado = true;
            System.out.println("Você está sem combustivel");
        } else {
            System.out.println("Seu motor está desligado, e seu combustivel acabou!");
        }
    }

    public void frear() {
        if (velocidadeAtual < 1) {
            velocidadeAtual -= 10;
            System.out.println("Seu carro está parando...");
        } else {
            System.err.println("Seu carro já está parado");
        }
    }

    public void exibirInfo() {
        System.out.println("Sua marca é de carro é: " + marca);
        System.out.println("Seu modelo de carro é: " + modelo);
        System.out.println("Seu ano é:" + ano);
        System.out.println("Sua velocidade atual é: " + velocidadeAtual);
        System.out.println("Seu motor está ligado? " + motorLigado);
        System.out.println("Você tem: " + combustivel + "de combustivel no seu veiculo.");
    }

}