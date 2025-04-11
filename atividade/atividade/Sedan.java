public class Sedan {
    boolean temTetoSolar;

    public static void main(String[] args){
        Veiculo veiculo = new Veiculo();
        
        veiculo.setMarca("hyundai");
        veiculo.setModelo("Ix35");
        veiculo.setAno(2018);
        //System.out.println("O carro " + veiculo.getModelo() + " da marca " + veiculo.getMarca() + " do ano " + veiculo.getAno());
        veiculo.exibirInfo();

    }
}
