/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tarea2G2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author manul
 */
@Controller
public class BootcampController {

    @GetMapping("/bootcamp")
    public String bootcamp() {
        return "bootcamp";
    }
}
