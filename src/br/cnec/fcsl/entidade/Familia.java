package br.cnec.fcsl.entidade;

public enum Familia {
	METAIS_ALCALINOS ("Metais alcalinos"),
	METAIS_LANTANIDEOS ("Metais lantan�deos"),
	SEMIMETAIS ("Semimetais"),
	NAO_METAIS ("N�o metais"),
	HALOGENIOS ("Halog�nios"),
	GASES_NOBRES ("Gases nobres");

	private Familia(String descricao) {
		this.descricao = descricao;
	}
	
	private String descricao;
	
	public String toString(){
		return descricao;
	}
}
