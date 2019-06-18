/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2.demo.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import proyecto_2.demo.dao.UsuarioDAO;
import proyecto_2.demo.modelo.Usuario;

/**
 *
 * @author Francisca Carmona
 */

@Controller
public class UsuarioController {
    
    @Autowired
    UsuarioDAO uDAO;
    
    @GetMapping("/CrearUsuario")
    public String mostrarFormulario(Model model){
        model.addAttribute("usuario", new Usuario());  //quiero enviar un usuario vacio a la vista (crear Usuario)
        return "CrearUsuario";
    }
    
    @PostMapping("/guardarUsuario")
    public String guardaUsuario(@ModelAttribute Usuario usuario){
        
        uDAO.save(usuario);
        return "exito";
    }    
}
