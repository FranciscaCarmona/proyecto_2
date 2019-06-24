/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2.demo.controlador;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import proyecto_2.demo.dao.TipoDeServicioDAO;
import proyecto_2.demo.modelo.TipoDeServicio;

/**
 *
 * @author Claudia
 */
@Controller
public class TipoDeServicioController {
    private TipoDeServicioDAO tDAO;
    @RequestMapping("/url")
    public String page(Model model){
        model.addAttribute("attribute", "value");
        return "view.name";
    }
    //get abrir pag, obtener info
    //post para enviar info
    //mostrar lista de tipo de servicio
    //string porque lo que va en el return es el nombre
    //de la vista que va a cargra cuando el metodo termine
    @GetMapping("/TipoDeServicio")
    public String muestraTipos(Model model){
        List<TipoDeServicio> lista = tDAO.findAll();
        model.addAttribute("listaservicios",lista);
        return "TipoDeServicio";
        //mostrar lista de tipo de servicio
}
}
