package com.Tarea2G2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class jugadores {

    @GetMapping(value = "/jugadores")
    public ModelAndView jugadoresPage() {
        ModelAndView mav = new ModelAndView("jugadores");
        return mav;
    }
}
