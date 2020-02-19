package hospital;


public class Principal {

    
    public static void main(String[] args) {
        Paciente p=new Paciente();
        p.setNome("Bruno");
        p.setRg("63.532.895-4");
        p.setCpf("260.740.270-05");
        p.setIdade(19);
        p.setCodPaciente(1);
        p.setSenha("bruninhoPJL");
        
        Funcionário f=new Funcionário();
        f.setNome("Neide");
        f.setRg("54.645.872-5");
        f.setCpf("486.674.800-10");
        f.setIdade(54);
        f.setMatricula(422269);
        f.setSenha("deussejalouvado");
        f.setValorHora(20);
        
        Enfermeiro e=new Enfermeiro();
        e.setNome("Luciana");
        e.setRg("26.158.679-8");
        e.setCpf("990.825.150-32");
        e.setIdade(34);
        e.setMatricula(208944);
        e.setSenha("DeusFielgloria");
        e.setCoren("sp013per");
        e.setValorHora(25.50);
        
        Medico m=new Medico();
        m.setNome("Rafael");
        m.setRg("15.713.859-8");
        m.setCpf("978.803.890-59");
        m.setIdade(40);
        m.setMatricula(342175);
        m.setSenha("sertaomeuamor");
        m.setCrm("sp019rm");
        m.setEspecialidade("Pediatra");
        m.setValorHora(32.25);
        
        Hospital h=new Hospital(10,"Rua Armando Cunha Nº730 Peruibe/SP");
        h.setNome("Oswaldo Herrera");
        h.addFuncionario(f);
        h.addFuncionario(m);
        h.addFuncionario(e);
        
        h.listarEnfermeiro();
        System.out.println("Coren: "+e.getCoren());
        System.out.println("--------------------------------------");
        
        h.listarMedico();        
        System.out.println("CRM: "+m.getCrm());
        System.out.println("Especialidade: "+m.getEspecialidade());
        System.out.println("--------------------------------------");
    
        
        
        System.out.println("Paciente: "+p.getNome());
        System.out.println("Idade: "+p.getIdade());
        System.out.println("Rg: "+p.getRg());
        System.out.println("Cpf: "+p.getCpf());
        System.out.println("Codigo do Paciente: "+p.getCodPaciente());
        System.out.println("Senha: "+p.getSenha());
        System.out.println("--------------------------------------");
        
        System.out.println("Funcionário: "+f.getNome());
        System.out.println("Idade: "+f.getIdade());
        System.out.println("Rg: "+f.getRg());
        System.out.println("Cpf: "+f.getCpf());
        System.out.println("Matricula: "+f.getMatricula());
        System.out.println("Senha: "+f.getSenha());
        System.out.println("Salario: R$"+f.calcularSalario());
        System.out.println("--------------------------------------");
        
        
    }
}
