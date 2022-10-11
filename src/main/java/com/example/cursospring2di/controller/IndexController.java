package com.example.cursospring2di.controller;

import com.example.cursospring2di.service.IServicio;
import com.example.cursospring2di.service.MiServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/inicio")
public class IndexController {

    @Autowired
    private IServicio servicio ;

    @GetMapping("/mostrar")
    public String index(Model model){
        model.addAttribute("objeto", servicio.operacion());
        return "index";
    }

}
