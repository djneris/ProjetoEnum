package br.cnec.fcsl.entidade;

public enum ElementoQuimico {
	H ("H", "Hidrogenio", 1, 1.00794, Familia.NAO_METAIS),
	HE ("He", "Hélio", 2, 4.002602, Familia.GASES_NOBRES),
	LI ("Li", "Lítio", 3, 6.941, Familia.METAIS_ALCALINOS),
	BE ("Be", "Berílio", 4, 9.012182, Familia.METAIS_ALCALINOS),
	B ("B", "Boro", 5, 10.811, Familia.SEMIMETAIS),
	C ("C", "Carbono", 6, 12.0107, Familia.NAO_METAIS),
	N ("N", "Nitrogênio", 7, 14.0067, Familia.NAO_METAIS),
	O ("O" ,"Oxigênio", 8, 15.9994, Familia.NAO_METAIS),
	F ("F", "Flúor", 9, 18.9984032, Familia.HALOGENIOS),
	NE ("Ne", "Neônio", 10, 20.1797, Familia.GASES_NOBRES),
	TM ("Tm", "Túlio", 69, 168.93421, Familia.METAIS_LANTANIDEOS);
	
	
	private ElementoQuimico(String simbolo, String nome, Integer numero, Double massa, Familia familia) {
		this.simbolo = simbolo;
		this.nome = nome;
		this.numero = numero;
		this.massa = massa;
		this.familia = familia;
	}

	private String simbolo, nome;
	private Integer numero;
	private Double massa;
	private Familia familia;
	
	public String getSimbolo() {
		return simbolo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Integer getNumero() {
		return numero;
	}
	
	public Double getMassa() {
		return massa;
	}
	
	public Familia getFamilia() {
		return familia;
	}
	
	public String toString(){
		return nome;
		
	}

}
