package projeto_dio_iphone;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

	
	@Override
	public void abirPagina(String url) {
		System.out.println("Abrindo a página: " + url);

	}

	@Override
	public void autualizarPagina() {
		System.out.println("Atualizando a Pagina...");

	}

	@Override
	public void fecharAba() {
		System.out.println("Fechando a aba...");

	}

	@Override
	public void trocarMusica(String musica) {

		System.out.println("Tocando a musica: " + musica);

	}

	@Override
	public void pausarMusica() {
		System.out.println("Musica Pausada!");

	}

	@Override
	public void avancarFaixar() {
		System.out.println("Proxima Musica!");

	}

	@Override
	public void voltarFaixa() {
		System.out.println("Musica Anterior!");

	}

	@Override
	public void fazerChamada(String nmTelefonico) {
		System.out.println("Ligando para o telefone: " + nmTelefonico);
	}

	@Override
	public void anterChamada() {
		System.out.println("Recebendo uma ligaçao!");

	}

	@Override
	public void desligar() {
		System.out.println("Desligando a ligação!");

	}
	
	public static void main(String[] args) {
		Iphone iphone =  new Iphone();
		//navegadorInternet
		iphone.abirPagina("https:google.com");
		iphone.autualizarPagina();
		iphone.fecharAba();
		
		//reprodutorMusica
		iphone.trocarMusica("7mz");
		iphone.pausarMusica();
		iphone.avancarFaixar();
		iphone.voltarFaixa();
		
		//aparelhoTelefonico
		iphone.fazerChamada("85996207714");
		iphone.anterChamada();
		iphone.desligar();
	}

}
