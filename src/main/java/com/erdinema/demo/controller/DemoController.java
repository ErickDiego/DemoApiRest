package com.erdinema.demo.controller;

import com.erdinema.demo.model.Persona;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping(value = "/Persona",method = RequestMethod.GET)
    public Persona ObtenerPersona(HttpServletRequest request){

        Persona persona = new Persona();

        persona.setNombre("erick");
        persona.setApellido("Ne");
        persona.setDocumento("doc.txt");


        return  persona;

    }
}
