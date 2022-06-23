package sistemaHotel;

public class Cliente {
	
	private String nome;
	private String dtNasc;
	private String fone;
	private String email;
	private String cidade;
	private String uf;
	private String fumante;
	public boolean clienteFumante;
	private String acomodacao;
	

	public String getAcomodacao() {
		return acomodacao;
	}

	public void setAcomodacao(String acomodacao) {
		this.acomodacao = acomodacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDtNasc() {
		return dtNasc;
	}

	public void setDtNasc(String dtNasc) {
		this.dtNasc = dtNasc;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getFumante() {
		return fumante;
	}

	public void setFumante(String fumante) {
		this.fumante = fumante;
	
		if (fumante.equals("s")) {
			this.clienteFumante = true;
			
		} else if (fumante.equals("n")) {
			this.clienteFumante = false;
		}
	}
	
	@Override
    public String toString() {
        return "[Cliente: " + this.nome + " Data nasc: " + this.dtNasc + " Telefone: " + this.fone + 
        		" E-mail: " + this.email + " Cidade: " + this.cidade + " UF: " + this.uf
                + " Fumante: " + this.fumante + " ]";	
		}
    
}
