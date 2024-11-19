import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Ingrese el ángulo de disparo (en grados): ");
            double angulo = Double.parseDouble(scanner.nextLine());

            System.out.println("Ingrese la distancia a la portería (en metros): ");
            double distancia = Double.parseDouble(scanner.nextLine());

            System.out.println("Ingrese el tiempo estimado para el regreso del portero (en segundos): ");
            double tiempo = Double.parseDouble(scanner.nextLine());

            // Crear instancia de TiroParabolico
            Tiroparabolico tiro = new Tiroparabolico(angulo, distancia, tiempo);

            // Calcular velocidad y altura máxima
            double velocidad = tiro.calcularVelocidad();
            double alturaMaxima = tiro.calcularAlturaMaxima();

            // Mostrar resultados
            System.out.printf("La velocidad inicial necesaria es: %.2f m/s%n", velocidad);
            System.out.printf("La altura máxima alcanzada es: %.2f metros%n", alturaMaxima);

        } catch (NumberFormatException e) {
            System.out.println("Error: Ingrese valores numéricos válidos.");
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}