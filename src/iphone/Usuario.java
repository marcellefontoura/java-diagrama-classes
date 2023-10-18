package iphone;

public class Usuario {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        //APARELHO TELEFONICO:
        System.out.println("Aparelho telefonico:");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        //REPRODUTOR MUSICAL:
        System.out.println("Reproduzindo música:");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        //NAVEGADOR NA INTERNET:
        System.out.println("Navegando na internet:");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }

}
