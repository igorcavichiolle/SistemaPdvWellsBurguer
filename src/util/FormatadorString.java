package util;

public abstract class FormatadorString {

    public static String format(Double _valor) {
        String valor = String.valueOf(_valor);
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < valor.length(); i++) {
            if (valor.charAt(i) == '.') {
                count1++;
            } else if (count1 == 1) {
                count2++;
            }
        }
        if (count2 == 0) {
            valor += ",00";
        } else if (count2 == 1) {
            valor += "0";
        }
        return "R$ " + valor.replace(".", ",");
    }
}
