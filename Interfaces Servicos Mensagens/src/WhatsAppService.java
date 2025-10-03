public class WhatsAppService implements ServicoMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("[WHATSAPP] Enviando mensagem: " + mensagem);
    }
}
