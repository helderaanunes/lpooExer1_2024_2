package modelo;

/* Parte 3
Cada funcionário tem um nome, um número de identificação único, um salário base e pertence a um departamento.
*/
public class Funcionario {
    private String nome;
    private int id; //numero de identificação única.
    private float salarioBase;
    private Departamento departamento;
    
    // poderia ser feito assim, mas não seria orientado a objetos, então vou criar a classe não apenas um atributo indicando que égerente.
    // private boolean ehGerente;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    
}
