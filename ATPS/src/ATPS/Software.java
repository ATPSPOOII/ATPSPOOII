package ATPS;

public class Software {
	String Nome;
	String Fabricante;
	int Versao;
	int Numero_da_nota_fiscal;
	int Data_de_aquisição;
	double Chave_de_Licença;
	int Validade_da_Chave_de_Licença;
	int Classificação;
	String Necessidade_de_Backup;
	
	//getters e setters
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getFabricante() {
		return Fabricante;
	}
	public void setFabricante(String fabricante) {
		Fabricante = fabricante;
	}
	public int getVersao() {
		return Versao;
	}
	public void setVersao(int versao) {
		Versao = versao;
	}
	public int getNumero_da_nota_fiscal() {
		return Numero_da_nota_fiscal;
	}
	public void setNumero_da_nota_fiscal(int numero_da_nota_fiscal) {
		Numero_da_nota_fiscal = numero_da_nota_fiscal;
	}
	public int getData_de_aquisição() {
		return Data_de_aquisição;
	}
	public void setData_de_aquisição(int data_de_aquisição) {
		Data_de_aquisição = data_de_aquisição;
	}
	public double getChave_de_Licença() {
		return Chave_de_Licença;
	}
	public void setChave_de_Licença(double chave_de_Licença) {
		Chave_de_Licença = chave_de_Licença;
	}
	public int getValidade_da_Chave_de_Licença() {
		return Validade_da_Chave_de_Licença;
	}
	public void setValidade_da_Chave_de_Licença(int validade_da_Chave_de_Licença) {
		Validade_da_Chave_de_Licença = validade_da_Chave_de_Licença;
	}
	public int getClassificação() {
		return Classificação;
	}
	public void setClassificação(int classificação) {
		Classificação = classificação;
	}
	public String getNecessidade_de_Backup() {
		return Necessidade_de_Backup;
	}
	public void setNecessidade_de_Backup(String necessidade_de_Backup) {
		Necessidade_de_Backup = necessidade_de_Backup;
	}	

}