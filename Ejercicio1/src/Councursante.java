public class Councursante {

    private int puntuacion;
    private String nombre;
    private static int puntuacionMaxima;
    private boolean cpu;

    public Councursante() {
        this.puntuacion = 0;
        this.puntuacionMaxima = 0;
    }

    public Councursante(int puntuacion, String nombre, int puntuacionMaxima) {
        this.puntuacion = puntuacion;
        this.puntuacionMaxima = puntuacionMaxima;
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getPuntuacionMaxima() {
        return puntuacionMaxima;
    }

    public void setPuntuacionMaxima(int puntuacionMaxima) {
        this.puntuacionMaxima = puntuacionMaxima;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}