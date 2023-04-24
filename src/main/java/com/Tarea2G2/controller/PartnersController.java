/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tarea2G2.controller;

import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author manul
 */
public class PartnersController {

    @GetMapping("/partners")
    public String partners() {
        return "partners";
    }
}
