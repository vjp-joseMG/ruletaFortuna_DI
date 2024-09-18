public class Councursante {

    private int puntuacion;
    private static int puntuacionMaxima;

    public Councursante() {
        this.puntuacion = 0;
        this.puntuacionMaxima = 0;
    }

    public Councursante(int puntuacion, int puntuacionMaxima) {
        this.puntuacion = puntuacion;
        this.puntuacionMaxima = puntuacionMaxima;
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