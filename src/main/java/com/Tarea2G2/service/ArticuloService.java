package com.Tarea2G2.service;

import com.Tarea2G2.domain.Articulo;
import java.util.List;

public interface ArticuloService {

    public List<Articulo> getArticulos(boolean activos);

    public Articulo getArticulo(Articulo articulo);

    public void save(Articulo articulo);

    public void delete(Articulo articulo);
}
