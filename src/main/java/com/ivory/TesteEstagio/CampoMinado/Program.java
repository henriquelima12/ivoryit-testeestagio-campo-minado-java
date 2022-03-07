package com.ivory.TesteEstagio.CampoMinado;

public class Program {
	
	public void executar() {
		
		CampoMinado campoMinado = new CampoMinado();
		
		System.out.println("Início do jogo\n=======");
		System.out.println(campoMinado.Tabuleiro());
		
		// Realize sua codificação a partir deste ponto, boa sorte!
		while(campoMinado.JogoStatus() == StatusTipo.Aberto) {
			int linha = (int)(Math.random() * 9 ) + 1;
			System.out.printf("\nLinha: " +linha+ "\n");
			int coluna = (int)(Math.random() * 9 ) + 1;
			System.out.printf("Coluna: " +coluna+ "\n");
			campoMinado.Abrir(linha, coluna);
			System.out.println("=========");
			System.out.println(campoMinado.Tabuleiro());
			if(campoMinado.JogoStatus() == StatusTipo.GameOver) {
				System.out.println("Você perdeu.");
			}
			if(campoMinado.JogoStatus() == StatusTipo.Vitoria) {
				System.out.println("Parabéns. Você venceu!");
			}
		}
		
	}

}
