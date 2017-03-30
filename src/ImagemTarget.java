/**
 * 
 * @author BRENO
 * Interface onde apresentamos as responsabilidades de carregar uma imagem e
 * desenhar uma imagem.
 */

public interface ImagemTarget {

	void carregarImagem(String arquivo);
	void desenharImagem (int posicaoA, int posicaoB, int largura, int altura);
}

/*
 * Utilizar um adaptador de classe n�o seria vi�vel pois precisar�amos de um
 * adaptador para cada subclasse, j� que herdando de uma classe gen�rica n�o
 * adicionaria nada.
 */