import javax.swing.JOptionPane;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        afisare();
        int i = nrInvitati();
        pret(i);
    }

    public static int nrInvitati() {
        System.out.println("Introduceti nr de invitati");
        Scanner sc = new Scanner(System.in);
        int invitati = sc.nextInt();
        return invitati;
    }

    public static void afisare() {
        JOptionPane.showMessageDialog(null, "Carly’s makes the food that makes it a party");
    }

    public static void pret(int i) {
        int pretInitial = 35;
        int pretTotal = i * pretInitial;
        if (i >= 50) {
            System.out.println("Evenimentul este mare");
        } else {
            System.out.println("Evenimentul este mic");
        }
        System.out.println("Pretul total este: " + pretTotal);
    }
}