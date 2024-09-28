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
    Cada projeto é supervisionado por um gerente e 
    envolve uma equipe de funcionários alocados.
    */
    private Gerente gerente;
    private Funcionario funcionarios [];

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario [] funcionarios) {
        this.funcionarios = funcionarios;
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
