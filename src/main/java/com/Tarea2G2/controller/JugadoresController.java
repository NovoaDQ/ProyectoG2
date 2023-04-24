/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tarea2G2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author manul
 */
public class JugadoresController {

    @GetMapping(value = "/jugadores")
    public ModelAndView jugadoresPage() {
        ModelAndView mav = new ModelAndView("jugadores");
        return mav;
    }
}
