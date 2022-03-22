package fj.pi.service;

import fj.pi.model.Doador;

import java.util.List;
 
// Interface
public interface DoadorService {
 
    // Save operation
    Doador saveDoador(Doador Doador);
 
    // Read operation
    List<Doador> fetchDoadorList();
 
    // Update operation
    Doador updateDoador(Doador Doador, Long Id);

    // Update operation
    Doador
    updateDepartment(Doador doador,
                     Long Id);

    // Delete operation
    void deleteDoadorById(Long Id);
}