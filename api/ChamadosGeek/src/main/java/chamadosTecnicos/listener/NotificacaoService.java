package chamadosTecnicos.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import chamadosTecnicos.di.notificacao.NivelUrgencia;
import chamadosTecnicos.di.notificacao.Notificador;
import chamadosTecnicos.di.notificacao.TipoDoNotificador;
import chamadosTecnicos.di.services.ClienteAtivadoEvent;




@Component
public class NotificacaoService {

	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
	@Autowired
	private Notificador notificador;
	
	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		notificador.notificar(event.getCliente(), "Seu cadastro no sistema está ativo!");
	}
	
}
