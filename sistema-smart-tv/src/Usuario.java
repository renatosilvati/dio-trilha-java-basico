public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);   
        System.out.println("Volume Atual: " + smartTv.volume); 

        smartTv.ligar();
        System.out.println("Novo Status | TV Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status | TV Ligada? " + smartTv.ligada);

        smartTv.ligar();
        System.out.println("Novo Status | TV Ligada? " + smartTv.ligada);

        smartTv.mudarCanal(608);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Novo Status | Volume Atual: " + smartTv.volume); 

        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
    }
}
