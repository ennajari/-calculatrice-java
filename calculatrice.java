import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenue dans la calculatrice simple !");
        while (true) {
            System.out.println("Choisissez une opération :");
            System.out.println("1. Addition");
            System.out.println("2. Soustraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Quitter");
            int choice = scanner.nextInt();
            
            if (choice == 5) {
                System.out.println("Merci d'avoir utilisé la calculatrice !");
                break;
            }
            
            System.out.print("Entrez le premier nombre : ");
            double num1 = scanner.nextDouble();
            System.out.print("Entrez le deuxième nombre : ");
            double num2 = scanner.nextDouble();
            
            double result = 0;
            
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Division par zéro impossible !");
                        continue;  // Revenir au début de la boucle
                    }
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez choisir une opération valide.");
                    continue;  // Revenir au début de la boucle
            }
            
            System.out.println("Résultat : " + result);
        }
        
        scanner.close();
    }
}
