package edu.cristian.eds.model;

import edu.cristian.eds.interfaces.IAparelhoTelefonico;
import edu.cristian.eds.interfaces.INavegadorInternet;
import edu.cristian.eds.interfaces.IReprodutorMusical;

public class Iphone implements IReprodutorMusical, IAparelhoTelefonico, INavegadorInternet{

	@Override
	public void tocar() {
		System.out.println("Tocando Música!");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando Música!");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionado música: "+musica);
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para número: "+numero);
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligação!");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Correio de voz iniciado!");
		
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo página com a url: "+url);
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionado nova aba!");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página atualizada!");
		
	}

}
