import edu.cristian.eds.model.Iphone;

public class Main {

	public static void main(String[] args) {
		
		Iphone iphone = new Iphone();
		
		iphone.ligar("49 9 70707070");
		iphone.iniciarCorreioVoz();
		
		iphone.selecionarMusica("Radioactive");
		iphone.tocar();

	}

}
