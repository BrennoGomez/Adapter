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
 * Utilizar um adaptador de classe não seria viável pois precisaríamos de um
 * adaptador para cada subclasse, já que herdando de uma classe genérica não
 * adicionaria nada.
 */