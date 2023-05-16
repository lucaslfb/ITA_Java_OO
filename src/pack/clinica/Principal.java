package pack.clinica;

public class Principal {
    public static void main(String[] args) {
        Paciente p1 = new Paciente();
        //atributos do paciente
        p1.peso = 110;
        p1.altura = 1.7;

        p1.diagnostico();
    }
}
