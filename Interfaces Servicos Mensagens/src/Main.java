import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Lista de serviços
        List<ServicoMensagem> servicos = new ArrayList<>();
        servicos.add(new SmsService());
        servicos.add(new EmailService());
        servicos.add(new RedeSocialService());
        servicos.add(new WhatsAppService());

        // Mensagem de marketing
        String mensagemMarketing = "Promoção! Desconto de 50% em todos os produtos!";

        // Envia para todos os serviços
        servicos.forEach(servico -> servico.enviarMensagem(mensagemMarketing));
    }
}
