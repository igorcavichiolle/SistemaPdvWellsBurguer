package util;

import java.text.DecimalFormat;

public class BLMascaras {

    public String converterVirgulaParaPonto(String pString) {
        String retorno = new String();
        int tamanhoString = pString.length();
        for (int i = 0; i < tamanhoString; i++) {
            if (pString.charAt(i) == ',') {
                retorno += '.';
            } else {
                retorno += pString.charAt(i);
            }
        }
        return retorno;
    }

    public String converterPontoPraVirgula(String pString) {
        String retorno = new String();
        int tamanhoString = pString.length();
        for (int i = 0; i < tamanhoString; i++) {
            if (pString.charAt(i) == '.') {
                retorno += ',';
            } else {
                retorno += pString.charAt(i);
            }
        }
        return retorno;
    }

    public float converterVirgulaParaPontoReturnFloat(String pString) {
        String retorno = new String();
        int tamanhoString = pString.length();
        for (int i = 0; i < tamanhoString; i++) {
            if (pString.charAt(i) == ',') {
                retorno += '.';
            } else {
                retorno += pString.charAt(i);
            }
        }
        return Float.parseFloat(retorno);
    }

    public String removerPontos(String pString) {
        String retorno = new String();
        int tamanhoString = pString.length();
        for (int i = 0; i < tamanhoString; i++) {
            if (pString.charAt(i) == '.') {
                retorno += "";
            } else {
                retorno += pString.charAt(i);
            }
        }
        return retorno;
    }

    public String addPonto(String pString) {
        int pontoConter = 0;
        for (int i = 0; i < pString.length(); i++) {
            if (pString.charAt(i) == '.') {
                pontoConter++;
            }
        }
        if (pontoConter == 0) {
            pString += ".0";
        }
        return pString;
    }

    public double truncar3Casas(double pValor) {

        return Math.round(pValor * 100) / 100d;
    }

    public int converteInteiro(int pString) {
        DecimalFormat df = new DecimalFormat("#.0");
        pString = Integer.parseInt(df.format(pString));
        return pString;
    }

    public double converteArredondar2Casas(double pDouble) {
        DecimalFormat df = new DecimalFormat("#,00");
        pDouble = Double.parseDouble(df.format(pDouble));
        return pDouble;
    }

    public float arredondamentoComPontoDuasCasas(float pValor) {
        DecimalFormat df = new DecimalFormat("#.00");
        return Float.parseFloat(this.converterVirgulaParaPonto(df.format(pValor)));
    }

    public Double arredondamentoComPontoDuasCasasDouble(Double pValor) {
        DecimalFormat df = new DecimalFormat("#.00");
        return Double.parseDouble(this.converterVirgulaParaPonto(df.format(pValor)));
    }

    public Double arredondamentoComPontoDuasCasasFDouble(float pValor) {
        DecimalFormat df = new DecimalFormat("#.00");
        return Double.parseDouble(this.converterVirgulaParaPonto(df.format(pValor)));
    }

    public String arredondamentoComPontoDuasCasasString(double pValor) {
        DecimalFormat df = new DecimalFormat("#,00");
        return this.converterVirgulaParaPonto(df.format(pValor));
    }

    public float arredondamentoComPontoTresCasas(float pValor) {
        DecimalFormat df = new DecimalFormat("#.000");
        return Float.parseFloat(this.converterVirgulaParaPonto(df.format(pValor)));
    }

    public String arredondamentoDoubleComPontoDuasCasasString(Double pValor) {
        DecimalFormat df = new DecimalFormat("#.00");
        return this.converterVirgulaParaPonto(df.format(pValor));
    }
    
    public static String converterDoubleString(double precoDouble) {
    /*Transformando um double em 2 casas decimais*/
    DecimalFormat fmt = new DecimalFormat("0.00");   //limita o número de casas decimais    
    String string = fmt.format(precoDouble);
    String[] part = string.split("[,]");
    String preco = part[0]+"."+part[1];
    return preco;
    }
 
    public static double converterDoubleDoisDecimais(double precoDouble) {
    DecimalFormat fmt = new DecimalFormat("0.00");      
    String string = fmt.format(precoDouble);
    String[] part = string.split("[,]");
    String string2 = part[0]+"."+part[1];
        double preco = Double.parseDouble(string2);
    return preco;
    }
}
