/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlladores;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import services.Factory;

/**
 *
 * @author Cristian
 */
public class BancoController {
    /**
     * Imprime todos los elementos de la tabal banco.
     */
    public void verTodos(){
        try {
            Factory.conectar("localhost", "gtcop", "root", "pos.2012");
            Factory.setConsulta(Factory.getConexion().prepareStatement("SELECT id, nombre FROM banco"));
            Factory.setDatos(Factory.getConsulta().executeQuery());
            while(Factory.getDatos().next()){
                System.out.println(
                        "id: "
                        + Factory.getDatos().getInt("id")
                        + " nombre: "
                        + Factory.getDatos().getString("nombre")
                );
            }
            Factory.desconectar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BancoController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BancoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
