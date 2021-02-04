package exercise_person;

public class ValidaCpf {
    public static boolean valida(String cpf) {
        if(cpf.length() == 11) {
            System.out.println("Válido");
            return true;
        } else {
            System.out.println("Inválido");
            return false;
        }
    }
}
