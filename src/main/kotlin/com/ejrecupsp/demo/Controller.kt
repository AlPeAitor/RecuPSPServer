package com.ejrecupsp.demo

import org.springframework.web.bind.annotation.*

@RestController
class Controller(private val repoUsu:RepositorioUsuarios) {


    @GetMapping("/usuarios/{id}")
    fun getUsu(@PathVariable id: Long):Usuario{
        return repoUsu.findById(id).get()
    }

    @PostMapping("/usuario")
    fun insertUsu(@RequestBody usu : Usuario){
        repoUsu.save(usu)
    }

    @GetMapping("/usuario/peticion/{id}/{texto}")
    fun peticion(@PathVariable id : String, @PathVariable texto: String):String{
        //rellenar
    }
}