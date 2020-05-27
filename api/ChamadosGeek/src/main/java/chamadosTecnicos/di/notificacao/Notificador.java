package chamadosTecnicos.di.notificacao;

import chamadosTecnicos.di.modelo.Cliente;

public interface Notificador {

	//Substituir o Object por Cliente
	void notificar(Cliente cliente, String mensagem);

}
