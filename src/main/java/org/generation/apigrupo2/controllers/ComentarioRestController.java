package org.generation.apigrupo2.controllers;

import org.generation.apigrupo2.models.Comentario;
import org.generation.apigrupo2.services.ComentarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comentario")
public class ComentarioRestController {
    @Autowired
    ComentarioServiceImpl comentarioService;

    @GetMapping("/lista")
    public List<Comentario> listaComentario(){
        List<Comentario> mostrarListaComentario = comentarioService.listaDeComentarios();
        return  mostrarListaComentario;
    }

    @PostMapping("/guardar")
    public  Comentario guardarComentario(@RequestBody Comentario comentarioNuevo){
        Comentario comentarioGuardar = comentarioService.guardarComentario(comentarioNuevo);
        return comentarioGuardar;
    }
}
