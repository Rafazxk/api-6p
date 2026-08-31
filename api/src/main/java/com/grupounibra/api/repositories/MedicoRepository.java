package com.grupounibra.api.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.grupounibra.api.repositories.MedicoRepository;

import com.grupounibra.DTO.MedicoDTO;
@Repository
public class MedicoRepository {
    public List<MedicoDTO> obterTodosMedicos() {
        List<MedicoDTO> listaMedicos = new ArrayList<>();

        listaMedicos.add(new MedicoDTO("Ana souza", "12345", "CARDIOLOGIA"));
        listaMedicos.add(new MedicoDTO("Paulo", "6789", "PEDIATRIA"));
        listaMedicos.add(new MedicoDTO("teste", "1234", "ORTOPEDIA"));

        return listaMedicos;
 }
}