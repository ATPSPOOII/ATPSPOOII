package atps_etapa1;

public class Testador {

   
    public static void main(String[] args) {
        
        
    }
}

//-----------------------------
package atps_etapa1;


public class Departamento {
    int codigo;
    String descricao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
	//---------------------------------------------------
	
	package atps_etapa1;


public class Equipamento {
    String tipo;
    String acessorio;
    String matricula_colaborador;
    String tipo_acesso_rede;
    String uso;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(String acessorio) {
        this.acessorio = acessorio;
    }

    public String getMatricula_colaborador() {
        return matricula_colaborador;
    }

    public void setMatricula_colaborador(String matricula_colaborador) {
        this.matricula_colaborador = matricula_colaborador;
    }

    public String getTipo_acesso_rede() {
        return tipo_acesso_rede;
    }

    public void setTipo_acesso_rede(String tipo_acesso_rede) {
        this.tipo_acesso_rede = tipo_acesso_rede;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }
    
}
//-----------------------------------------------

package atps_etapa1;

public class Colaborador {
    String matricula;
    String nome;
    String local_trabalho;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal_trabalho() {
        return local_trabalho;
    }

    public void setLocal_trabalho(String local_trabalho) {
        this.local_trabalho = local_trabalho;
    }
}
//----------------------------------------------------

package atps_etapa1;

public class Software {
    String nome;
    String fabricante;
    String versao;
    int numero_nota_fiscal;
    String data_aquisicao;
    String chave_licenciamento;
    String validade_chave;
    String classificacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public int getNumero_nota_fiscal() {
        return numero_nota_fiscal;
    }

    public void setNumero_nota_fiscal(int numero_nota_fiscal) {
        this.numero_nota_fiscal = numero_nota_fiscal;
    }

    public String getData_aquisicao() {
        return data_aquisicao;
    }

    public void setData_aquisicao(String data_aquisicao) {
        this.data_aquisicao = data_aquisicao;
    }

    public String getChave_licenciamento() {
        return chave_licenciamento;
    }

    public void setChave_licenciamento(String chave_licenciamento) {
        this.chave_licenciamento = chave_licenciamento;
    }

    public String getValidade_chave() {
        return validade_chave;
    }

    public void setValidade_chave(String validade_chave) {
        this.validade_chave = validade_chave;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
       
}

	
	
	
    
}
