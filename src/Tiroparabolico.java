public class Tiroparabolico {
    private static final double GRAVITY = 9.8; // Aceleración debido a la gravedad (m/s^2)

    private double angulo; // En grados
    private double distancia;
    private double tiempo;

    public Tiroparabolico(double angulo, double distancia, double tiempo) {
        this.angulo = Math.toRadians(angulo); // Convertir a radianes
        this.distancia = distancia;
        this.tiempo = tiempo;
    }

    public double calcularVelocidad() {
        // Velocidad horizontal: v0x = distancia / tiempo
        // v0x = v0 * cos(angulo)
        double v0x = distancia / tiempo;

        // Velocidad inicial: v0 = v0x / cos(angulo)
        return v0x / Math.cos(angulo);
    }

    public double calcularAlturaMaxima() {
        // Altura máxima: Hmax = (v0 * sin(angulo))^2 / (2 * g)
        double v0 = calcularVelocidad();
        double v0y = v0 * Math.sin(angulo);
        return (v0y * v0y) / (2 * GRAVITY);
    }
}
