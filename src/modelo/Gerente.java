package modelo;
/*
Além disso, funcionários podem ser promovidos a cargos de gerência, onde eles terão um bônus salarial adicional por gerenciar suas equipes. 
Os gerentes também são responsáveis por monitorar os projetos de seu departamento e alocar funcionários para trabalharem nesses projetos.
*/
public class Gerente extends Funcionario{
    private float bonusSalarial;
    
    //Como o gerente sempre terá o bonus, então é uma composição.
    public Gerente (float bonusSalarial){
        this.bonusSalarial=bonusSalarial;
    }
    // não preciso criar um atributo para o salário bruto.
    // basta o método get, tente lembrar sobre atributos
    // abstratos de banco de dados (data de nascimento e idade).
    @Override
    public float getSalarioBruto(float gratificacao){
      return this.getSalarioBase()*(bonusSalarial+1) + gratificacao;
    }

    public float getBonusSalarial() {
        return bonusSalarial;
    }

    public void setBonusSalarial(float bonusSalarial) {
        this.bonusSalarial = bonusSalarial;
    }
    
    
}
