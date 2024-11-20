import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validar;
        do{
            validar=true;
                try {
                    System.out.println("Ingrese el ángulo de disparo (en grados): ");
                    double angulo = Double.parseDouble(scanner.nextLine());
                    System.out.println("Ingrese la distancia a la portería (en metros): ");
                    double distancia = Double.parseDouble(scanner.nextLine());
                    System.out.println("Ingrese el tiempo estimado para el regreso del portero (en segundos): ");
                    double tiempo = Double.parseDouble(scanner.nextLine());

                    // Crear instancia de TiroParabolico
                    Tiroparabolico tiro = new Tiroparabolico(angulo, distancia, tiempo);
                    //Mostrar resultados
                    tiro.imprimir();
                    // Mostrar resultados

                    } catch (NumberFormatException e) {
                        System.out.println("Error: Ingrese valores numéricos válidos.");
                        System.out.println("REINTENTAR...")
                        validar=false;
                    } catch (Exception e) {
                        System.out.println("Ocurrió un error inesperado: " + e.getMessage());
                        validar=false;
                    }
        }while(!validar);
        scanner.close();

    }
}