package pack.clinica;

public class Principal {
    public static void main(String[] args) {
        Paciente p1 = new Paciente();
        Paciente p2 = new Paciente();
        Paciente p3 = new Paciente();
        //atributos dos pacientes
        p1.peso = 102;
        p1.altura = 1.7;

        p2.peso = 68;
        p2.altura = 1.62;

        p3.peso = 72;
        p3.altura = 1.81;

        p1.diagnostico();
        p2.diagnostico();
        p3.diagnostico();
    }
}
