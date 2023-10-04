import com.kaique.iphone.Iphone;

public class Main {

	public static void main(String[] args) {
		 Iphone iphone = new Iphone();
		 	//Reprodutor de Musica
	        iphone.tocar("Imagine Dragons");
	        iphone.pausar();
	        iphone.selecionarMusica("Zedd");
	        System.out.println("");

	        //Aparelho Telefonico
	        iphone.ligar("12341234");
	        iphone.atender();
	        iphone.iniciarCorreioVoz();
	        System.out.println("");

	        //Navegar na internet
	        iphone.exibirPagina();
	        iphone.adicionarNovaAba();
	        iphone.atualizarPagina();

	}

}
