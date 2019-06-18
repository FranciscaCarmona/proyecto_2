/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2.demo.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import proyecto_2.demo.modelo.Usuario;

/**
 *
 * @author Francisca Carmona
 */
public interface UsuarioDAO extends CrudRepository<Usuario, Integer>{
    
    @Override
    public List<Usuario> findAll();
    
//    Usuario aux = uDAO.findByidUsuario(u.getIdUsuario);
//    if(aux==null){
//       uDAO.save(u);
//       return "exito"
//    }else{
//    return "registro"
//}
 //  public Usuario findidUsuario(String s);
}
