package Exercicio;
/* testando codgigos até aqui com  lig/deslg * vol +/- * canal +/- */
public class Usuario {
    public static void main(String[] args) throws Exception {
        
      SmartTv smartTv = new SmartTv();

      System.out.println("Tv Ligada ? " + smartTv.ligada);
      System.out.println("Canal atual: " + smartTv.canal);
      System.out.println("Volume atual: " + smartTv.volume);

      smartTv.ligar();
      System.out.println("Tv Ligada ? " + smartTv.ligada);

      smartTv.desligar();
      System.out.println("Tv Ligada ? " + smartTv.ligada);

      smartTv.aumentarVolume();
      smartTv.diminuirVolume();
      smartTv.diminuirVolume();
      System.out.println("Volume atual: " + smartTv.volume);

      smartTv.mudarCanal(19);
      System.out.println("Canal atual: " + smartTv.canal);
    }
}
