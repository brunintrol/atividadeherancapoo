public class Gerente extends Funcionario{
  private Gerente(String Nome,String Cpf, double Salario){
    super(Nome, Cpf, Salario);
  }
  private int SenhaEspecial;
  private int NumFuncGer; //numeroDeFuncionariosGerenciados

  //Constructor
  public Gerente(String Nome, String Cpf, double Salario, int SenhaEspecial){
    super(Nome, Cpf, Salario);
    this.SenhaEspecial = SenhaEspecial;
    this.NumFuncGer = 0;
  }

  //Bonificação Gerente
  @Override
  public double getBonificacao(){
    return super.getBonificacao()+1000;
  }

  //Autenticar senha
  public String autentica(int Senha){

    if(this.SenhaEspecial == Senha)return "Acesso Liberado!";

    else return "Acesso Negado!";
  }

  //Start Setters and Getters
  public void setNumFuncGer(int NumFuncGer){
    this.NumFuncGer = NumFuncGer;
  }

  public int getNumFuncGer(){
    return NumFuncGer;
  }
  //End Setters and Getters


  //Listar
  public void Listar(int Senha){
    System.out.println("\n Nome : " + getNome() + "\n CPF : " + getCpf() + "\n Salario : " + getSalario() + "\n Status Login : " + this.autentica(Senha) + "\n Numero de func : " + getNumFuncGer());
  }







}