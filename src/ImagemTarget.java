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
 * Utilizei um adaptador de classe para introduz somente um objeto, e não para não
 * ser necessário o endereçamento indireto adicional por ponteiros para chegar até
 * a classe Adaptee.
 */
