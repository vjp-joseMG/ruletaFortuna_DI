class Silla {
    private int patas;
    private boolean respaldo;

    public Silla(int patas, boolean respaldo) {
        this.patas = patas;
        this.respaldo = respaldo;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public boolean isRespaldo() {
        return respaldo;
    }

    public void setRespaldo(boolean respaldo) {
        this.respaldo = respaldo;
    }

    @Override
    public String toString() {
        return "Silla [patas=" + patas + ", respaldo=" + respaldo + "]";
    }
}