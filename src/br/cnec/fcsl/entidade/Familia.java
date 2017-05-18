package br.cnec.fcsl.entidade;

public enum Familia {
	METAIS_ALCALINOS ("Metais alcalinos"),
	METAIS_LANTANIDEOS ("Metais lantanídeos"),
	SEMIMETAIS ("Semimetais"),
	NAO_METAIS ("Não metais"),
	HALOGENIOS ("Halogênios"),
	GASES_NOBRES ("Gases nobres");

	private Familia(String descricao) {
		this.descricao = descricao;
	}
	
	private String descricao;
	
	public String toString(){
		return descricao;
	}
}
