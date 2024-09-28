package modelo;

import java.util.Date;


/*
Os projetos da empresa possuem um título, 
uma data de início, uma data de término e um orçamento.
*/
public class Projeto {
    private String titulo;
    private Date dataDeInicio;
    private Date dataDeTermino;
    private float orcamento;
    /*
     Os funcionários podem ser promovidos a cargos de liderança de
projetos, e essa experiência deve ser registrada no sistema 
para fins de avaliação de desempenho.
    */
    private Departamento departamento;
    
    
    /*
    Cada projeto é supervisionado por um gerente e 
    envolve uma equipe de funcionários alocados.
    */
    private Gerente gerente;
    private FuncionarioProjeto funcionariosProjetos [];

    /*
    Esses projetos podem ser de desenvolvimento de 
    software, campanhas de marketing ou qualquer 
    outra atividade que a empresa julgar necessária.
    */
    private String areaDoProjeto;
    
    /*
    Um projeto não pode existir sem um gerente 
    responsável, e o gerente deve ser alocado a 
    apenas um departamento.
    */
    //Composição
    public Projeto(Gerente gerente){
        this.gerente = gerente;
    }

    public String getAreaDoProjeto() {
        return areaDoProjeto;
    }

    public void setAreaDoProjeto(String areaDoProjeto) {
        this.areaDoProjeto = areaDoProjeto;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    
    
    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public FuncionarioProjeto[] getFuncionariosProjetos() {
        return funcionariosProjetos;
    }

    public void setFuncionariosProjetos(FuncionarioProjeto[] funcionariosProjetos) {
        this.funcionariosProjetos = funcionariosProjetos;
    }

    
            
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getDataDeInicio() {
        return dataDeInicio;
    }

    public void setDataDeInicio(Date dataDeInicio) {
        this.dataDeInicio = dataDeInicio;
    }

    public Date getDataDeTermino() {
        return dataDeTermino;
    }

    public void setDataDeTermino(Date dataDeTermino) {
        this.dataDeTermino = dataDeTermino;
    }

    public float getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(float orcamento) {
        this.orcamento = orcamento;
    }
    
    
}
