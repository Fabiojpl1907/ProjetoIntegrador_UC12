package fj.pi.model;

// Importing required classes
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


// Annotations
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Doador {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private long id;
        private String nome;
        private String cpf;
        private String endereco;
        private String email;
        private String telefone;

    }
