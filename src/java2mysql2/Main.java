/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package java2mysql2;

import controlladores.BancoController;

/**
 *
 * @author Cristian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BancoController controller = new BancoController();
        controller.verTodos();
    }
    
}
