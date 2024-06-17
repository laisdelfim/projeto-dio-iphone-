package aparelho;

import aparelho.AparelhoTelefonico;

public class AparelhoTelefonico {
  public static void main(String[] args) {

    AparelhoTelefonico telefone = new AparelhoTelefonico();
    telefone.ligar();
    telefone.atender();
    telefone.iniciarCorreioVoz();
  }

  public void ligar() {
    System.out.println("ligando.");
  }

  public void atender() {
    System.out.println("chamada atendida!");
  }

  public void iniciarCorreioVoz() {
    System.out.println("caixa de mensagem.");
  }
}
