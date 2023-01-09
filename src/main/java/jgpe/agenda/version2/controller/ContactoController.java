package jgpe.agenda.version2.controller;

import jgpe.agenda.version2.model.Contacto;
import jgpe.agenda.version2.repository.ContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ContactoController {

    @Autowired
    private ContactoRepository contactoRepository;

    @GetMapping
    String index(Model model){
        List<Contacto> contactos = contactoRepository.findAll();
        model.addAttribute("contactos", contactos);
        return "index";
    }

    @GetMapping("/nuevo")
    String nuevo(Model model){
        model.addAttribute("contacto", new Contacto());
        return "nuevo";
    }
}
