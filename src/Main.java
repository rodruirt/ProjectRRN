import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args){
        Circulo ciruculo1  = new Circulo();
        ciruculo1.setRadio(65.09);
        JOptionPane.showMessageDialog(null,"El area del circulo es: " + ciruculo1.calcularArea());

    }
}
