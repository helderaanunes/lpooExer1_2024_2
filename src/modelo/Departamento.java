package modelo;

/*Parte da questão que diz:
A empresa possui uma estrutura organizada em departamentos, onde cada departamento é responsável por diferentes áreas de atuação, como Desenvolvimento de Software, Marketing e Recursos Humanos.
*/

/*Parte 2 
Cada departamento tem um gerente responsável por supervisionar as atividades e um conjunto de funcionários que realizam as tarefas diárias.
*/
public class Departamento {
    private String areaDeAtuacao;
    // Eu criei como String pois ainda não li a questão toda
    // e não sei o tipo/classe desse gerente.
    private String gerente;
    // Eu criei como String pois ainda não li a questão toda
    // e não sei o tipo/classe desses funcionários.
    //agora eu já sei o tipo do funcionário
    private Funcionario listaFuncionarios [];
    public String getAreaDeAtuacao() {
        return areaDeAtuacao;
    }

    public void setAreaDeAtuacao(String areaDeAtuacao) {
        this.areaDeAtuacao = areaDeAtuacao;
    }
    
    
}
