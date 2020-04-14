public class Funcionario{

  private String Nome;
  private String Cpf;
  private double Salario;

  //Constructor
  public Funcionario(String Nome, String Cpf, double Salario){
    this.Nome = Nome;
    this.Cpf = Cpf;
    this.Salario = Salario;
  }

  //Start getters and setters
  public void setNome(String Nome){
    this.Nome = Nome;
  }

  public String getNome(){
    return this.Nome;
  }

  public void setCpf(String Cpf){
    this.Cpf = Cpf;
  }

  public String getCpf(){
    return this.Cpf;
  }

  public void setSalario(double Salario){
    this.Salario = Salario;
  }

  public double getSalario(){
    return this.Salario;
  }
  //End getters and setters

  //bonificação
  public double getBonificacao(){
    return this.getSalario()*1.1;
  }

  //Listar
  public void Listar(){
    System.out.println("\n Nome : " + this.getNome() + "\n Cpf : " + this.getCpf() + "\n Salario : " + this.getSalario());
  }



}