class Personaje{
    private String nombre;
    private int fuerza ;
    private int defensa;
    private int vida;


    public int aleatorio(int menor, int mayor){
        return (int) ((Math.random() * (mayor - menor)) + menor);
    }

    public Personaje(String name) {
        this.nombre = name;
        this.fuerza = aleatorio(7, 10);
        this.defensa = aleatorio(0, 6);
        this.vida = 10;
    }

    public Personaje(String nombre, int fuerza, int defensa, int vida) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.defensa = defensa;
        this.vida = vida;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getFuerza() {
        return fuerza;
    }
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
    public int getDefensa() {
        return defensa;
    }
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }

    public void ataque(Personaje atacante, Personaje defensor){
        if (aleatorio(0, 4)>=3 && atacante.getVida() > 0) {
            System.out.println("Ataque efectivo");
            int vidaRestante = defensor.getVida()-(atacante.getFuerza()-defensor.getDefensa());
            defensor.setVida(vidaRestante);
            System.out.println(defensor.getNombre() + " tiene "+ defensor.getVida() + " puntos de vida.");
        }   else{
            System.out.println("Ataque fallido.");
            System.out.println(defensor.getNombre() + " tiene "+ defensor.getVida() + " puntos de vida.");
        }

        if (defensor.getVida()<=0) {
            System.out.println(defensor.getNombre() + " ha muerto.");
        }
       
    }

    @Override
    public String toString() {
        return "{" +"\n" +
            " nombre='" + getNombre() + "\n" +
            ", fuerza='" + getFuerza() + "\n" + //
            ", defensa='" + getDefensa() + "\n" + //
            ", vida='" + getVida() + "\n" + //
            "}";
    }
}