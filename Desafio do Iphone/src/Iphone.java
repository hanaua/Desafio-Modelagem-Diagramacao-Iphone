
import java.util.Scanner;

public class Iphone {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\nDigite o comando desejado: ");
        String entrada = scanner.nextLine().trim();

		NavegadorInternet navegador = new NavegadorInternet();
		ReprodutorMusical reprodutor = new ReprodutorMusical();
		AparelhoTelefonico telefone = new AparelhoTelefonico();

		

        if (entrada.equalsIgnoreCase("exibirPagina")) {
			navegador.exibirPagina();
        } else if (entrada.equalsIgnoreCase("adicionarNovaAba")) {
            navegador.adicionarNovaAba();
        } else if (entrada.equalsIgnoreCase("atualizarPagina")) {
            navegador.atualizarPagina();
		} else if (entrada.equalsIgnoreCase("selecionarMusica")) {
			reprodutor.selecionarMusica();
		} else if (entrada.equalsIgnoreCase("tocar")) {
			reprodutor.tocar();
		} else if (entrada.equalsIgnoreCase("pausar")) {
			reprodutor.pausar();
		} else if (entrada.equalsIgnoreCase("ligar")) {
			telefone.ligar();
		} else if (entrada.equalsIgnoreCase("atender")) {
			telefone.atender();
		} else if (entrada.equalsIgnoreCase("iniciarCorreioVoz")) {
			telefone.iniciarCorreioVoz();
			
		}
		scanner.close();
	}
}