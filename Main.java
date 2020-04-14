class Main {
  public static void main(String[] args) {

    System.out.println("********************** TRABALHO POO***********************\n\n Aluno: Bruno Felipe de Souza \n\n github: https://github.com/brunintrol/atividadeherancapoo");

    //Criando 3 funcionarios
    Funcionario func1 = new Funcionario("Bruno","123",1000);
    Funcionario func2 = new Funcionario("João","1234",2000);
    Funcionario func3 = new Funcionario("Maria","12345",3000);

    //listando funcionarios antes da bonificação
    System.out.println("\n\n*******Funcionarios********");
    func1.Listar();
    func2.Listar();
    func3.Listar();

    //Criando 3 Gerentes
    Gerente ger1 = new Gerente("Jose","321",1000,123);
    Gerente ger2 = new Gerente("Roberto","4321",2000,123);
    Gerente ger3 = new Gerente("Ana","54321",3000,123);

    //Listando gerentes antes da bonificação
    System.out.println("\n\n*******Gerentes********");
    ger1.Listar(123);
    ger2.Listar(123);
    ger3.Listar(1);

    //aplicando bonificações

    func1.setSalario(func1.getBonificacao());
    func2.setSalario(func2.getBonificacao());
    func3.setSalario(func3.getBonificacao());

    ger1.setSalario(ger1.getBonificacao());
    ger2.setSalario(ger2.getBonificacao());
    ger3.setSalario(ger3.getBonificacao());


    //Listando funcionarios depois das bonificações
    System.out.println("\n\n*******Funcionarios********");
    func1.Listar();
    func2.Listar();
    func3.Listar();

    //Listando gerentes depois das bonificações
    System.out.println("\n\n*******Gerentes********");
    ger1.Listar(123);
    ger2.Listar(123);
    ger3.Listar(1);

  }
}