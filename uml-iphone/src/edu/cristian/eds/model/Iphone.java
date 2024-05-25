package edu.cristian.eds.model;

import edu.cristian.eds.interfaces.IAparelhoTelefonico;
import edu.cristian.eds.interfaces.INavegadorInternet;
import edu.cristian.eds.interfaces.IReprodutorMusical;

public class Iphone implements IReprodutorMusical, IAparelhoTelefonico, INavegadorInternet{

	@Override
	public void tocar() {
		System.out.println("Tocando M�sica!");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando M�sica!");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionado m�sica: "+musica);
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para n�mero: "+numero);
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo liga��o!");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Correio de voz iniciado!");
		
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo p�gina com a url: "+url);
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionado nova aba!");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("P�gina atualizada!");
		
	}

}
