package geek.chamados.di.notificacao;

import geek.chamados.di.modelo.Cliente;

public interface Notificador {

	//Substituir o Object por Cliente
	void notificar(Cliente cliente, String mensagem);

}
