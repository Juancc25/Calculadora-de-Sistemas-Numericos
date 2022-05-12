package Logica;

public class Operadora {
    private int num1;
    private long num2;
    private String resultado;
    
    public String conversion(String baseD, String baseH, String dato){
        if((baseD == "Binario")&&(baseH == "Octal")){
            num2 = Long.parseLong(dato);
            resultado = String.valueOf(binarioAoctal(num2));
        }
        if((baseD == "Binario")&&(baseH == "Decimal")){
            num2 = Long.parseLong(dato);
            resultado = String.valueOf(binarioAdecimal(num2));
        }
        if((baseD == "Binario")&&(baseH == "Hexa")){
            num2 = Long.parseLong(dato);
            resultado = binarioAhexadecimal(num2);
        }
        if((baseD == "Octal")&&(baseH == "Binario")){
            resultado = octalAbinario(dato);
        }
        if((baseD == "Octal")&&(baseH == "Decimal")){
            resultado = String.valueOf(octalAdecimal(dato));
        }
        if((baseD == "Octal")&&(baseH == "Hexa")){
            resultado = octalAHexadecimal(dato);
        }
        if((baseD == "Decimal")&&(baseH == "Binario")){
            num1 = Integer.parseInt(dato);
            resultado = decimalAbinario(num1);
        }
        if((baseD == "Decimal")&&(baseH == "Octal")){
            num1 = Integer.parseInt(dato);
            resultado = decimalAoctal(num1);
        }
        if((baseD == "Decimal")&&(baseH == "Hexa")){
            num1 = Integer.parseInt(dato);
            resultado = decimalAhexadecimal(num1);
        }
        if((baseD == "Hexa")&&(baseH == "Binario")){
            resultado = hexadecimalAbinario(dato);
        }
        if((baseD == "Hexa")&&(baseH == "Octal")){
            resultado = hexadecimalAoctal(dato);
        }
        if((baseD == "Hexa")&&(baseH == "Decimal")){
            resultado = String.valueOf(hexadecimalAdecimal(dato));
        }
        return resultado;
    }
    
    //Conversión desde binarios
    public int binarioAoctal(long binario){
        int numDecimal = binarioAdecimal(binario);
        String octalString = Integer.toOctalString(numDecimal);
        int numOctal = Integer.parseInt(octalString);
        return numOctal;
    }
    
    public int binarioAdecimal(long binario){
        int numDecimal = 0;
        int i = 0;
        while (binario > 0){
            numDecimal += Math.pow(2, i++) * (binario % 10);
            binario /= 10;        
        } 
        return numDecimal;
    }
    
    public String  binarioAhexadecimal(long binario){
        int numDecimal = binarioAdecimal(binario);
        String numHex = Integer.toHexString(numDecimal);
        numHex = numHex.toUpperCase();
        return numHex;
    }
    
    //Conversión desde la base octal
    public String octalAbinario(String octal){
        int i = 0;
        String binario = "";

        while (i < octal.length()) {

            char c = octal.charAt((int)i);

            switch (c) {
                case '0':
                    binario += "000";
                    break;
                case '1':
                    binario += "001";
                    break;
                case '2':
                    binario += "010";
                    break;
                case '3':
                    binario += "011";
                    break;
                case '4':
                    binario += "100";
                    break;
                case '5':
                    binario += "101";
                    break;
                case '6':
                    binario += "110";
                    break;
                case '7':
                    binario += "111";
                    break;
                default:
                    System.out.println(
                        "\nInvalid Octal Digit "
                        + binario.charAt((int)i));
                    break;
            }
            i++;        
        }
        return binario;
    }
    
    public long octalAdecimal(String octal){
        long numDecimal = 0;
        int potencia = 0;

        for (int x = octal.length() - 1; x >= 0; x--) {
            int valorActual = Character.getNumericValue(octal.charAt(x));
            long elevado = (long) Math.pow(8, potencia) * valorActual;
            numDecimal += elevado;
            potencia++;
        }
        return numDecimal;
    }
    
    public String octalAHexadecimal(String octal){
        String numHex ="";
        int decnum;		
        decnum = Integer.parseInt(octal, 8);
        numHex = Integer.toHexString(decnum);
        numHex = numHex.toUpperCase();
        return numHex;
    }
    
    //Conversión desde decimales
    public String decimalAbinario(int decimal){
        String numOctal = decimalAoctal(decimal);
        String numBinario = octalAbinario(numOctal);
        return numBinario;
    }
    
    public String decimalAoctal(int decimal) {
        String octal = "";
        String caracteresOctales = "01234567";
        while (decimal > 0) {
          int residuo = decimal % 8;
          octal = (caracteresOctales.charAt(residuo) + octal);
          decimal /= 8;
        }
        return octal;
    }
    
    public String decimalAhexadecimal(int decimal){
        String numOctal = decimalAoctal(decimal);
        String numHex = octalAHexadecimal(numOctal);
        return numHex;
    }
    
    //Conversión desde hexadecimales
    public String hexadecimalAbinario(String hexa){
        int numHex = Integer.parseInt(hexa, 16);
        String numBinario = Integer.toBinaryString(numHex);
        return numBinario;
    }
    
    public String hexadecimalAoctal(String hexa){
        int numDecimal =hexadecimalAdecimal(hexa);
        String numOctal = decimalAoctal(numDecimal);
        return numOctal;
    }
    
    public int hexadecimalAdecimal(String hexa){
        String digitos = "0123456789ABCDEF";
        hexa = hexa.toUpperCase();
        int numDecimal = 0;
    
        for (int i = 0; i < hexa.length(); i++){
          char c = hexa.charAt(i);
          int d = digitos.indexOf(c);
          numDecimal = 16*numDecimal + d;
        }  
        return numDecimal;
    }
    
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public long getNum2() {
        return num2;
    }

    public void setNum2(long num2) {
        this.num2 = num2;
    }    
}
