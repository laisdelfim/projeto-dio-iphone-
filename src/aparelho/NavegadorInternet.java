package aparelho;

import aparelho.NavegadorInternet;

public class NavegadorInternet {
  public static void main(String[] args) {
    NavegadorInternet net = new NavegadorInternet();
    net.exibirPagina();
    net.adicionarNovaAba();
    net.atualizarPagina();
  }

  public void exibirPagina() {
    System.out.println("pagina aberta.");
  }

  public void adicionarNovaAba() {
    System.out.println("nova pagina aberta!");
  }

  public void atualizarPagina() {
    System.out.println("atualizado!");
  }
}
