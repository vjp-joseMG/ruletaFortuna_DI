public class App {
    public static int suma(int a, int b){
        return a + b;
    }
    public static void main(String[] args) throws Exception {
        //System.out.println(suma(7, 8));
       Personaje juan = new Personaje("Juan");
       Personaje nemesio = new Personaje("Nemesio");
       System.out.println(juan);

       System.out.println(nemesio);

       while (juan.getVida() >0 && nemesio.getVida() >0) {
            juan.ataque(juan, nemesio);
            nemesio.ataque(nemesio, juan);
       }



    }
}
