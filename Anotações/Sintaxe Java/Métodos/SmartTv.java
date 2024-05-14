public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=30;

    public void ligar() {
        ligada=true;
    }
    public void desligar() {
        ligada=false;
    }

    //Volume:
    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando volume para: " + volume);
        //volume = volume + 1;

    }
    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo volume para: " + volume);
        //volume = volume - 1;

    }

    public void mudarCanal (int novoCanal) {
        canal = novoCanal;
    }
    public void aumentarCanal() {
        canal++;
        System.out.println("Avançando canal para: " + canal);
    }
    public void diminuirCanal() {
        canal--;
        System.out.println("Voltando canal para: " + canal);
    }
}
