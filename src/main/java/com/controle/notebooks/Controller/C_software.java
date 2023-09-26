package com.controle.notebooks.Controller;

import com.controle.notebooks.Service.S_Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class C_software {
    @GetMapping("/Software/Cadastro")
    public String getCadsoftware() {
        return "Software/Cadastro";
    }

    @PostMapping("/Software/Cadastro")
    public String cadastrarSoftware(@RequestParam("nome") String nome,
                                    @RequestParam("pago") boolean exigelicenca){
        return null;
    }
}
