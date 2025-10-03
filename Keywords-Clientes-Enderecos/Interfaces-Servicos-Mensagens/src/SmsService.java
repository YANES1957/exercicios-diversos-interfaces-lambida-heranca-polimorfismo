public class SmsService implements ServicoMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("[SMS] Enviando mensagem: " + mensagem);
    }
}
