package modelo;

import java.util.Date;

/*
 *Funcionários podem trabalhar em mais de um projeto ao
mesmo tempo, e é necessário que o sistema armazene quais
funcionários estão alocados em quais projetos e por 
quanto tempo (data de início e término da alocação)
 */
public class FuncionarioProjeto {
    private Funcionario funcionario;
    private Projeto projeto;
    private Date dataInicio;
    private Date dataFinal;

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }
    
}
