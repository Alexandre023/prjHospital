
package model;


public class Enfermeiro extends Funcionário{
    private String coren;

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }
    
    @Override
    public double gerarBonus(){
        return calcularSalario()*0.2;
    }
}
