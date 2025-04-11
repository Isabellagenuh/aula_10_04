public class Veiculo {

    //encapsular = proteger = private
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;
    private boolean motorLigado;
    private double combustivel;

    // botão direito, Ação de origem (source action), getters and setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public boolean isMotorLigado() {
        return motorLigado;
    }

    public void setMotorLigado(boolean motorLigado) {
        this.motorLigado = motorLigado;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    // void = vazio. ele armazena um valor mas não pode retornar
    // declaração de variavel (int, double, string) + return = retornar o valor ao usuário, mostrar  isto em algum lugar.

    /*CARMINO ME DESAFIOU
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
    }*/
    
    public void ligarMotor(){
        if(!motorLigado){
            motorLigado = true;
            System.out.println("Motor ligado!");
        } else{
            System.out.println("O carro ja está ligado!");
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

    public void frear(double decremento) {
        if (motorLigado) {
            if (velocidadeAtual > 0){
                velocidadeAtual-=decremento;
                if(velocidadeAtual<0){
                }
                System.out.println("Seu carro está parando...");
            }else {
            System.err.println("Seu carro já está parado");
        } 
        } else{
            System.out.println("o seu motor esta desligado.");
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