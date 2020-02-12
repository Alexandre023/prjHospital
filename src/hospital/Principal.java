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
        
        Enfermeiro e=new Enfermeiro();
        e.setNome("Luciana");
        e.setRg("26.158.679-8");
        e.setCpf("990.825.150-32");
        e.setIdade(34);
        e.setMatricula(208944);
        e.setSenha("DeusFielgloria");
        e.setCoren("sp013per");
        
        Medico m=new Medico();
        m.setNome("Rafael");
        m.setRg("15.713.859-8");
        m.setCpf("978.803.890-59");
        m.setIdade(40);
        m.setMatricula(342175);
        m.setSenha("sertaomeuamor");
        m.setCrm("sp019rm");
        m.setEspecialidade("Pediatra");
    
    
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
        System.out.println("--------------------------------------");
        
        System.out.println("Enfermeiro: "+e.getNome());
        System.out.println("Idade: "+e.getIdade());
        System.out.println("Rg: "+e.getRg());
        System.out.println("Cpf: "+e.getCpf());
        System.out.println("Matricula: "+e.getMatricula());
        System.out.println("Senha: "+e.getSenha());
        System.out.println("Coren: "+e.getCoren());
        System.out.println("--------------------------------------");
        
        System.out.println("Médico: "+m.getNome());
        System.out.println("Idade: "+m.getIdade());
        System.out.println("Rg: "+m.getRg());
        System.out.println("Cpf: "+m.getCpf());
        System.out.println("Matricula: "+m.getMatricula());
        System.out.println("Senha: "+m.getSenha());
        System.out.println("CRM: "+m.getCrm());
        System.out.println("Especialidade: "+m.getEspecialidade());
        System.out.println("--------------------------------------");
    }
}
