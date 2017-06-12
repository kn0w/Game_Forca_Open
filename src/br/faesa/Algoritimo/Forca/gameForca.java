package br.faesa.Algoritimo.Forca;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class gameForca {
	static StringBuilder guardPalavErrad = new StringBuilder();
	static int forCa_Mont = 8;
	static Random ranDomm = new Random();
	static boolean perDeu = false;
	static StringBuilder sepLetraSeparador = new StringBuilder();
	static String palavra;
	static String capTura;
	private static Scanner scann;
	public static void main(String args[]) throws Exception {
		montarTelaInicio();
		telaInicio();
	}
	public static void telaInicio() {
		palavra = gerarPalavra();
		System.out.println("Dica .... A palavra sortiada tem:  " + palavra.length() + " Letras:!");
		for (int i = palavra.length(); i > 0; i--) {
			sepLetraSeparador = sepLetraSeparador.append("-");
		}
		System.out.println(sepLetraSeparador);
		getInicio();
		checarPalavra();
		while (!perDeu) {
			System.out.println("..................................");
			getInicio();
			checarPalavra();
			if (forCa_Mont == 0) {
				perDeu = true;
				System.out.println("Ixi não deu Certo, mas podemos tentar de novo na Proxima..");
				System.out.println(" a palavra sorteada era .. >  " + palavra);
				limparConfigDefault();
				contNoJogo();
			} else if (palavra.equals(sepLetraSeparador.toString())) {
				perDeu = true;
				System.out.println("Parabens você Acertou: Hurruuu... Noss você e Bom");
				limparConfigDefault();
				contNoJogo();
			}
	}}
	public static void contNoJogo() {
		System.out.println("Quer Continuar no Jogo!..[S] sim - [N] não");
		String cont = scann.next();
		if (cont.equalsIgnoreCase("s")) {
			System.out.println("Vamos recomeçar...");
			montarTelaInicio();
		} else if (cont.equalsIgnoreCase("n")) {
			System.out.println("ok encerrado game ... ");
			System.exit(0);
	}}
	public static void limparConfigDefault() {
		forCa_Mont = 8;// aqui. iniciar o metodo, de limpesa zerando todos os metodos a cima com alguma coisa dentro. e dando valores Default.. a eles
		perDeu = false;
		palavra = "";
		capTura = "";
		sepLetraSeparador.delete(0, sepLetraSeparador.length()); // inicia na posição 0 e vai ate a posição da ultima letra.
		guardPalavErrad.delete(0, guardPalavErrad.length()); // inicia na posição 0 e vai ate a posição da ultima letra.usar outro medodo e ruim
	}
	public static String gerarPalavra() {
		String palavra;
		String[] bancoDPalavras = { "PAULO", "BRASIL", "MORCEGO", "ALGORITIMO", "JAVA", "UNIVERSO", "SAIDEIRA",
				"ADVINHAR" };
		palavra = bancoDPalavras[ranDomm.nextInt(bancoDPalavras.length)];
		return palavra;
	}
	public static void getInicio() {
		scann = new Scanner(System.in);
		System.out.println("");
		System.out.println("Vamos lá, Digite uma Letra:");
		capTura = scann.nextLine().toUpperCase();
		if (capTura.length() > 1) {
			System.out.print("Você Digitou Mais que Uma Letra Ou nada! :( ");
			capTura = scann.next();
		} else if (capTura.length() == 0) {
			JOptionPane.showMessageDialog(null,
					"Você não digitou uma Letra, ou esta vazio" + "\n" + "Tente Novamente" + "\n" + "Letra ok !");
			capTura = scann.next();
		} else {
			System.out.println("Oba!! Uma das Letras e esta: " + capTura);
	}}
	public static void checarPalavra() {
		if (!palavra.contains(capTura)) {
			System.out.println("Ops.. a Palavra não tem esta Letra >  " + capTura);
			guardPalavErrad = guardPalavErrad.append(capTura);
			forCa_Mont = forCa_Mont - 1;
			MontForca();
			System.out.println("Acertos :" + sepLetraSeparador);
			System.out.println("Você Palpitou :( Errado:  " + guardPalavErrad);
		} else {
			System.out.println("Que Bom.. é isto ai ..");
			for (int i = 0; i < palavra.length(); i++) {
				if (palavra.charAt(i) == capTura.charAt(0)) {
					sepLetraSeparador.replace(i, i + 1, capTura);
				}
			}
			System.out.println("::::::::::::::::::::::::::");
			MontForca();
			System.out.println("Você acertou Huruu:   " + sepLetraSeparador);
			System.out.println("Letras Erradas :  : " + guardPalavErrad + " : : ");
		}
	}
	public static void montarTelaInicio() {
		System.out.println("_______________________________________________________________________");
		System.out.println("|                                                                      |");
		System.out.println("|" + "  :::: Ola.. Bem vindo ao Game Jogo da Forca.Algoritimos I ::::" + "       |");
		System.out.println("|" + "  :::: Developer: Paulo Hendrix Alves Moreira              ::::" + "       |");
		System.out.println("|" + "  :::: Professor: Howard Cruz Roatti                       ::::" + "       |");
		System.out.println("|" + "  :::: Vamos JOGAR ...!                                    ::::" + "       |");
		System.out.println("|______________________________________________________________________|");
		System.out.println(" ");
		System.out.println("_______________**     ****    **    *    * *****     ******    **       ********");
		System.out.println("               **    **      *  *   **  ** **        **   **  *  *      ********");
		System.out.println("               **    **  ** ******  ****** *****     **   ** ******     ********");
		System.out.println("               **    ***** **    ** **  ** **        **  ** **    **    ********");
		System.out.println("               **      **  **    ** **  ** *****     ***** **      **   ********");
		System.out.println("               **                                                       ********");
		System.out.println("               **     ******  ****   *******   ****     **              ********");
		System.out.println("               **     **     **  **  **  **   **       *  *             ********");
		System.out.println("               **     ***** **    ** ** **   **       ******            ********");
		System.out.println("               **     **    **    ** ***     **      **    **           ********");
		System.out.println("               **     **     **  **  ** **    **    **      **          ********");
		System.out.println("               **     *       ****   **  **    *** **        **         ********");
		System.out.println("");
		System.out.println("_____Começou____você tem 7 Chances para errar...");
		telaInicio();
	}
	public static void MontForca() {
		switch (forCa_Mont) {
		case 0:
			System.out.println("________________**");
			System.out.println("  | ___            **");
			System.out.println("  |(-_-)           **");
			System.out.println("  |--º             **");
			System.out.println("    /|\\            **");
			System.out.println("   / | \\           **");
			System.out.println("  /  |  \\          **");
			System.out.println("     |             **");
			System.out.println("     |             **");
			System.out.println("    / \\            **");
			System.out.println("   /   \\           **");
			System.out.println("  /     \\          **");
			System.out.println("!!!!!!!Game Over!!!!!!");
			break;
		case 1:
			System.out.println("________________**");
			System.out.println("    ___            **");
			System.out.println("   (-_-)           **");
			System.out.println("                   **");
			System.out.println("   / | \\           **");
			System.out.println("  /  |  \\          **");
			System.out.println(" /   |   \\         **");
			System.out.println("     |             **");
			System.out.println("     |             **");
			System.out.println("      \\            **");
			System.out.println("       \\           **");
			System.out.println("        \\          **");
			System.out.println("                      ____Nada Bom .. Se Errar de Novo Já Era-Tent: 07");
			break;
		case 2:
			System.out.println("________________**");
			System.out.println("    ___            **");
			System.out.println("   (-_-)           **");
			System.out.println("                   **");
			System.out.println("   / | \\           **");
			System.out.println("  /  |  \\          **");
			System.out.println(" /   |   \\         **");
			System.out.println("     |             **");
			System.out.println("     |             **");
			System.out.println("                   **");
			System.out.println("                   **");
			System.out.println("                   **");
			System.out.println("                      ____Nada Bom Ta Ficando Feio Negocío -Tent: 06");
			break;
		case 3:
			System.out.println("________________**");
			System.out.println("    ___            **");
			System.out.println("   (-_-)           **");
			System.out.println("                   **");
			System.out.println("  /  |             **");
			System.out.println(" /   |             **");
			System.out.println("/    |             **");
			System.out.println("     |             **");
			System.out.println("     |             **");
			System.out.println("                   **");
			System.out.println("                   **");
			System.out.println("                   **");
			System.out.println("                      ____Nada Bom Ta Ficando Feio Negocío -Tent: 05");
			break;
		case 4:
			System.out.println("________________**");
			System.out.println("    ___            **");
			System.out.println("   (-_-)           **");
			System.out.println("                   **");
			System.out.println("     |             **");
			System.out.println("     |             **");
			System.out.println("     |             **");
			System.out.println("     |             **");
			System.out.println("     |             **");
			System.out.println("                   **");
			System.out.println("                   **");
			System.out.println("                   **");
			System.out.println("                      ____Nada Bom esta Ai Ai AAii -Tent: 04");
			break;
		case 5:
			System.out.println("________________**");
			System.out.println("    ___            **");
			System.out.println("   (-_-)           **");
			System.out.println("                   **");
			System.out.println("                   **");
			System.out.println("                   **");
			System.out.println("                   **");
			System.out.println("                   **");
			System.out.println("                   **");
			System.out.println("                   **");
			System.out.println("                   **");
			System.out.println("                   **");
			System.out.println("                      ____Nada Bom esta Apertando-Tent: 03");
			break;
		case 6:
			System.out.println("________________**");
			System.out.println("    ___           **");
			System.out.println("   (- -)          **");
			System.out.println("                  **");
			System.out.println("                  **");
			System.out.println("                  **");
			System.out.println("                  **");
			System.out.println("                  **");
			System.out.println("                  **");
			System.out.println("                  **");
			System.out.println("                  **");
			System.out.println("                  **");
			System.out.println("                     ____Nada Bom esta Apertando-Tent: 02");
			break;
		case 7:
			System.out.println("____________**");
			System.out.println("                 **");
			System.out.println("                 **");
			System.out.println("                 **");
			System.out.println("                 **");
			System.out.println("                 **");
			System.out.println("                 **");
			System.out.println("                 **");
			System.out.println("                 **");
			System.out.println("                 **");
			System.out.println("                 **");
			System.out.println("                 **");
			System.out.println("                 _____Nada bom Começou-Tent: 01");
		}
}}