public class RedeSocialService implements ServicoMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("[REDE SOCIAL] Publicando mensagem: " + mensagem);
    }
}
