package tienda;

public class Tienda {

    public static void main(String[] args) {
        String cedula = "0950134395"; // Aquí puedes ingresar el número de cédula a validar

        if (validarCedulaEcuatoriana(cedula)) {
            System.out.println("La cédula es válida.");
        } else {
            System.out.println("La cédula no es válida.");
        }
    }

    public static boolean validarCedulaEcuatoriana(String cedula) {
        if (cedula.length() != 10) {
            return false;
        }

        int sum = 0;
        int[] coefficients = {2, 1, 2, 1, 2, 1, 2, 1, 2};
        int verificationDigit = Integer.parseInt(cedula.substring(9));
        int provinceCode = Integer.parseInt(cedula.substring(0, 2));

        // Validar provincia
        if (provinceCode < 0 || provinceCode > 24) {
            return false; // Código de provincia inválido
        }

        // Validar dígito verificador
        for (int i = 0; i < 9; i++) {
            int digit = Integer.parseInt(cedula.substring(i, i + 1));
            int multiplied = digit * coefficients[i];
            sum += multiplied > 9 ? multiplied - 9 : multiplied;
        }

        int calculatedDigit = sum % 10 == 0 ? 0 : 10 - (sum % 10);

        return calculatedDigit == verificationDigit;
    }


}
