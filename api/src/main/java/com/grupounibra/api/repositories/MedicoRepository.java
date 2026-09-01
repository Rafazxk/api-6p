package com.grupounibra.api.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.grupounibra.api.repositories.MedicoRepository;
import com.grupounibra.DTO.MedicoCadastroDTO;
import com.grupounibra.DTO.MedicoDTO;
@Repository
public class MedicoRepository {
    private final List<MedicoDTO> listaMedicos = new ArrayList<>(List.of(
        new MedicoDTO("Rafael", "1234", "Desenvolvedor"),
        new MedicoDTO("Miguel", "2345", "pediatra"),
        new MedicoDTO("Rafael", "3456", "ortopedista")
    ));

    public List<MedicoDTO> obterTodosMedicos() {
        List<MedicoDTO> listaMedicos = new ArrayList<>();

        listaMedicos.add(new MedicoDTO("Ana souza", "12345", "CARDIOLOGIA"));
        listaMedicos.add(new MedicoDTO("Paulo", "6789", "PEDIATRIA"));
        listaMedicos.add(new MedicoDTO("teste", "1234", "ORTOPEDIA"));
        listaMedicos.add(new MedicoDTO("Ana souza", "12345", "CARDIOLOGIA"));
        return listaMedicos;
 }

    public MedicoDTO salvar(MedicoDTO novoMedico) {
        listaMedicos.add(novoMedico);
        return novoMedico;
    }
}