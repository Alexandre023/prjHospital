package hospital;
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
                System.out.println(funcionario.get(i));
            }
        }
    }
    
    public void listarEnfermeiro(){
        for (int i = 0; i < funcionario.size(); i++) {
            if(funcionario.get(i) instanceof Enfermeiro){
                System.out.println(funcionario.get(i));
            }
        }
    }
    
    public Hospital(int id, String endereco){
        this.idHospital = id;
        this.endereco = endereco;
    }
}
