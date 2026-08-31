package com.grupounibra.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MedicoCadastroDTO {
    private String nome;
    private String email;
    private String telefone;
    private String crm;
    private String especialidade;
    private String endereco;
}
