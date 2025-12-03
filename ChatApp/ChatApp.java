package ChatApp;
public class ChatApp {
    public void enviarMensagem(String texto) {
        System.out.println("Mensagem enviada: " + texto);
    }

    public void exibirHistorico() {
        System.out.println("Exibindo histórico de mensagens...");
    }

    public void salvarMensagemNoBanco(String texto) {
        System.out.println("Salvando mensagem: " + texto);
    }

    public void notificarContato(String contato) {
        System.out.println("Notificando contato: " + contato);
    }
}
