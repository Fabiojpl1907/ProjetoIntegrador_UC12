package fj.pi.controller;

import java.util.List;
import javax.validation.Valid;


import fj.pi.model.Doador;
import fj.pi.service.DoadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
 
// Annotation
@RestController
 
// Class
public class DoadorController {
 
    // Annotation
    @Autowired private DoadorService doadorService
            ;
 
    // Salvar
    @PostMapping("/doadores")
    public Doador saveDepartment(
        @Valid @RequestBody Doador doador)
    {
        return doadorService
                .saveDoador(doador);
    }
 
    // Read operation
    @GetMapping("/doadores")
    public List<Doador> fetchDoadorList()
    {
        return doadorService
                .fetchDoadorList();
    }
 
    // Update operation
    @PutMapping("/doadores/{id}")
    public Doador
    updateDoador(@RequestBody Doador doador,
                     @PathVariable("id") Long Id)
    {
        return doadorService
                .updateDoador(
           doador, Id);
    }
 
    // Delete operation
    @DeleteMapping("/doadores/{id}")
    public String deleteDoadorById(@PathVariable("id")
                                       Long Id)
    {
        doadorService
                .deleteDoadorById(Id);
        return "Deleção com Sucesso";
    }
}