public class EmailService implements ServicoMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("[E-MAIL] Enviando mensagem: " + mensagem);
    }
}
