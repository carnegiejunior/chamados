package geek.chamados.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import geek.chamados.di.notificacao.NivelUrgencia;
import geek.chamados.di.notificacao.Notificador;
import geek.chamados.di.notificacao.TipoDoNotificador;
import geek.chamados.di.services.ClienteAtivadoEvent;


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
