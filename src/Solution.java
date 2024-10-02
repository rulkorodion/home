public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        if (decimalNumber <= 0) {
            return "";
        }
        String hexRes = "";
        while (decimalNumber != 0){
            int ost = decimalNumber % 16;
            hexRes = HEX.charAt(ost) + hexRes;
            decimalNumber = decimalNumber / 16;
        }
        return hexRes;
    }


    public static int toDecimal(String hexNumber) {
        if(hexNumber.isEmpty() || hexNumber == null) {
            return 0;
        }
        int decRes = 0;
        for(int i = 0; i < hexNumber.length(); i++){
            char ch = hexNumber.charAt(i);
            int index = HEX.indexOf((Character.toLowerCase(ch)));
            decRes = 16 * decRes + index;
        }
        return decRes;
    }
}

