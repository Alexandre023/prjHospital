package model;
import java.util.ArrayList;

public class Hospital {
    private String nome;
    private int idHospital;
    private String endereco;
    private ArrayList<Funcionário> funcionario = new ArrayList();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdHospital() {
        return idHospital;
    }

    public void setIdHospital(int idHospital) {
        this.idHospital = idHospital;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void addFuncionario(Funcionário funcionario){
        this.funcionario.add(funcionario);
    }
    
    public void listarTodosFuncionario(){
        funcionario.forEach(funcionario-> System.out.println(funcionario));
    }
    
    public void listarMedico(){
        for (int i = 0; i < funcionario.size(); i++) {
            if(funcionario.get(i) instanceof Medico){
                System.out.println("Médico: "+funcionario.get(i).getNome());
                System.out.println("Idade: "+funcionario.get(i).getIdade());
                System.out.println("Rg: "+funcionario.get(i).getRg());
                System.out.println("Cpf: "+funcionario.get(i).getCpf());
                System.out.println("Matricula: "+funcionario.get(i).getMatricula());
                System.out.println("Senha: "+funcionario.get(i).getSenha());
                System.out.println("Salario: R$"+funcionario.get(i).calcularSalario());
            }
        }
    }
    
    public void listarEnfermeiro(){
        for (int i = 0; i < funcionario.size(); i++) {
            if(funcionario.get(i) instanceof Enfermeiro){
                System.out.println("Enfermeiro: "+funcionario.get(i).getNome());
                System.out.println("Idade: "+funcionario.get(i).getIdade());
                System.out.println("Rg: "+funcionario.get(i).getRg());
                System.out.println("Cpf: "+funcionario.get(i).getCpf());
                System.out.println("Matricula: "+funcionario.get(i).getMatricula());
                System.out.println("Senha: "+funcionario.get(i).getSenha());
                System.out.println("Salario: R$"+funcionario.get(i).calcularSalario(25.50));
            }
        }
    }
    
    public Hospital(int id, String endereco){
        this.idHospital = id;
        this.endereco = endereco;
    }
}
