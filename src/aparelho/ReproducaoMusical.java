package aparelho;

import aparelho.ReproducaoMusical;

public class ReproducaoMusical {
  public static void main(String[] args) {
    ReproducaoMusical aparelho = new ReproducaoMusical();
    aparelho.selecionarMusica();
    aparelho.tocar();
    aparelho.pausar();
  }

  public void selecionarMusica() {
    System.out.println("Musica selecionada.");
  }

  public void tocar() {
    System.out.println("tocando!");
  }

  public void pausar() {
    System.out.println("parando.");
  }
}
