package prjHospital;

import model.Enfermeiro;
import model.Funcionário;
import model.Hospital;
import model.Medico;
import model.Paciente;
import model.ConnectionFactory;

import java.sql.Connection;
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        
        try{
            Connection con=new ConnectionFactory().getConnection();
            JOptionPane.showMessageDialog(null,"Conectado ao banco!");
            con.close();
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
        
    }
}
