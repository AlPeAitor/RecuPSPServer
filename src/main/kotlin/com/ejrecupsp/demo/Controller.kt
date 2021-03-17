package com.ejrecupsp.demo

import org.springframework.web.bind.annotation.*

@RestController
class Controller(private val repoUsu:RepositorioUsuarios, private val repoTexto: RepositorioTexto) {


    @GetMapping("/usuarios/{id}")
    fun getUsu(@PathVariable id: Long):Usuario{
        return repoUsu.findById(id).get()
    }

    @PostMapping("/usuario")
    fun insertUsu(@RequestBody usu : Usuario){
        repoUsu.save(usu)
    }
    @PostMapping("/usuario/peticion/{id}/{texto}")
    fun insertTexto(@RequestBody txt : Texto){
        repoTexto.save(txt)
    }

}