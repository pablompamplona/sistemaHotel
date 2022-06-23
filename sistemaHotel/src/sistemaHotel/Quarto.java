package sistemaHotel;

public class Quarto {

	private String nome;
	private String numero;
	private String posicao;
	private String valorDiaria;
	private String capacidade;
	private String fumante;
	private String hospede;
	boolean quartoFumante;
	
	public Quarto () {

	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public String getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(String valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public String getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(String capacidade) {
		this.capacidade = capacidade;
	}
	

	public String getHospede() {
		return hospede;
	}

	public void setHospede(String hospede) {
		this.hospede = hospede;
	}

	public String getFumante() {
		return fumante;
	}

	public void setFumante(String fumante) {
		this.fumante = fumante;
		
		if (fumante.equals("s")) {
			quartoFumante = true;
		} else if (fumante.equals("n")) {
			quartoFumante = false;
		}
	}
	@Override
    public String toString() {
        return " Nome Quarto: " + this.nome + " Numero: " + this.numero +
        		" Posicao: " + this.posicao + " Valor da Diaria: " + this.valorDiaria +  " Capacidade max de hospedes: " + this.capacidade +
        		 " Fumante: " + this.fumante;	
		}
	
}
