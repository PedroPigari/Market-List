/*package br.com.fiap.market_list.listaDeCompras;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/lista")
public class ListaController {

    @Autowired
    ListaService service;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("lista", service.findAll());
        return "lista/index";
    }

    @GetMapping
    public String delete(@PathVariable Long id, RedirectAttributes redirect) {
        if (service.delete(id)) {
            redirect.addFlashAttribute("success", "Item apagado com sucesso");
        } else {
            redirect.addFlashAttribute("error", "Item não encontrado");
        }
        return "redirect:/lista";
    }

}*/