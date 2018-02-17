import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scr = new Scanner(System.in);
//urboi
        char a = 'a';
        char A = 'A';
        char b = 'b';
        char B = 'B';
        char c = 'c';
        char C = 'C';
        char d = 'd';
        char D = 'D';
        char e = 'e';
        char E = 'E';
        char f = 'f';
        char F = 'F';
        char x = 'x';
        char X = 'X';
        int exponent = 1;
        int entryLength;
        long output = 0;
        String entry;

        System.out.print("Enter a hexadecimal number: ");
        entry = scr.next();
        entryLength = entry.length();

        do {
            if ((entry.charAt(entryLength - exponent) == a) || (entry.charAt(entryLength - exponent) == A)) {
                output += Character.getNumericValue(entry.charAt(entryLength - exponent)) * Math.pow(16, exponent - 1);
            }
            else if ((entry.charAt(entryLength - exponent) == b) || (entry.charAt(entryLength - exponent) == B)) {
                output += Character.getNumericValue(entry.charAt(entryLength - exponent)) * Math.pow(16, exponent - 1);
            }
            else if ((entry.charAt(entryLength - exponent) == c) || (entry.charAt(entryLength - exponent) == C)) {
                output += Character.getNumericValue(entry.charAt(entryLength - exponent)) * Math.pow(16, exponent - 1);
            }
            else if ((entry.charAt(entryLength - exponent) == d) || (entry.charAt(entryLength - exponent) == D)) {
                output += Character.getNumericValue(entry.charAt(entryLength - exponent)) * Math.pow(16, exponent - 1);
            }
            else if ((entry.charAt(entryLength - exponent) == e) || (entry.charAt(entryLength - exponent) == E)) {
                output += Character.getNumericValue(entry.charAt(entryLength - exponent)) * Math.pow(16, exponent - 1);
            }
            else if ((entry.charAt(entryLength - exponent) == f) || (entry.charAt(entryLength - exponent) == F)) {
                output += Character.getNumericValue(entry.charAt(entryLength - exponent)) * Math.pow(16, exponent - 1);
            }
            else if ((entry.charAt(entryLength - exponent) == '0')) {
                output += Character.getNumericValue(entry.charAt(entryLength - exponent)) * Math.pow(16, exponent - 1);
            }
            else if ((entry.charAt(entryLength - exponent) == '1')) {
                output += Character.getNumericValue(entry.charAt(entryLength - exponent)) * Math.pow(16, exponent - 1);
            }
            else if ((entry.charAt(entryLength - exponent) == '2')) {
                output += Character.getNumericValue(entry.charAt(entryLength - exponent)) * Math.pow(16, exponent - 1);
            }
            else if ((entry.charAt(entryLength - exponent) == '3')) {
                output += Character.getNumericValue(entry.charAt(entryLength - exponent)) * Math.pow(16, exponent - 1);
            }
            else if ((entry.charAt(entryLength - exponent) == '4')) {
                output += Character.getNumericValue(entry.charAt(entryLength - exponent)) * Math.pow(16, exponent - 1);
            }
            else if ((entry.charAt(entryLength - exponent) == '5')) {
                output += Character.getNumericValue(entry.charAt(entryLength - exponent)) * Math.pow(16, exponent - 1);
            }
            else if ((entry.charAt(entryLength - exponent) == '6')) {
                output += Character.getNumericValue(entry.charAt(entryLength - exponent)) * Math.pow(16, exponent - 1);
            }
            else if ((entry.charAt(entryLength - exponent) == '7')) {
                output += Character.getNumericValue(entry.charAt(entryLength - exponent)) * Math.pow(16, exponent - 1);
            }
            else if ((entry.charAt(entryLength - exponent) == '8')) {
                output += Character.getNumericValue(entry.charAt(entryLength - exponent)) * Math.pow(16, exponent - 1);
            }
            else if ((entry.charAt(entryLength - exponent) == '9')) {
                output += Character.getNumericValue(entry.charAt(entryLength - exponent)) * Math.pow(16, exponent - 1);
            }
            else if ((entry.charAt(entryLength - exponent) == x) || (entry.charAt(entryLength - exponent) == X)) {
                exponent = entryLength + 1;
            }
            exponent++;
        } while (exponent <= entryLength);

        System.out.println("Your number is " + output + " in decimal");

    }
}