package pack.clinica;
public class Paciente {

    public double peso; //em kg
    public double altura; //em metros
    //construtor
    public Paciente(){
    }
    //Método cálculo IMC
    public double calculoIMC() {
        return (peso / (altura*altura));
    }
    //Método diagnóstico
    public void diagnostico() {
        double IMC = calculoIMC();
        if (IMC < 16) {
            System.out.println("Baixo peso muito grave");
        } else if (IMC >= 16 && IMC <= 16.99) {
            System.out.println("Baixo peso grave");
        } else if (IMC >= 17 && IMC <= 18.49) {
            System.out.println("Baixo peso");
        } else if (IMC >= 18.50 && IMC <= 24.99) {
            System.out.println("Peso normal");
        } else if (IMC >= 25 && IMC <=29.99) {
            System.out.println("Sobrepeso");
        } else if (IMC >= 30 && IMC <= 34.99) {
            System.out.println("Obesidade grai I");
        } else if (IMC >= 35 && IMC <= 39.99) {
            System.out.println("Obesidade grau II");
        } else if (IMC >= 40) {
            System.out.println("Obesidade grau III (obesidade mórbida)");
        }

    }
}
