package iphone;

public class Iphone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical{

    @Override
    public void ligar() {
        System.out.println("Ligando para o telefone desejado...");
    }
    @Override
    public void atender() {
        System.out.println("Atendendo a ligação...");
    }
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página da web...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba ao navegador da web...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página da web...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica desejada...");
    }
}
