package com.cardenas.clinicaHistorial.controlador;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.cardenas.clinicaHistorial.entidad.usuarioEntidad;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class formularioHistorialControlador {
    @GetMapping("/formularioHistorial")
    public String formularioHistorial(Model model) {
        usuarioEntidad usuario = new usuarioEntidad();
        model.addAttribute("usuario", usuario);
        List <String> listaTipoSangre = Arrays.asList("A+","A-","B+","B-","AB+","AB-","O+","O-");
        model.addAttribute("tipoSangre", listaTipoSangre);
        return "cuerpoWeb/formularioHistorial";
    }
}
