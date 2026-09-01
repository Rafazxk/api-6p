package com.grupounibra.api.services;

import lombok.RequiredArgsConstructor;
import java.util.List;

import com.grupounibra.DTO.MedicoCadastroDTO;
import com.grupounibra.DTO.MedicoDTO;
import com.grupounibra.api.repositories.MedicoRepository;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MedicoService {
    private final MedicoRepository medicoRepository;

    public List<MedicoDTO> listarMedicos() {
        return medicoRepository.obterTodosMedicos();
    }

     public MedicoDTO cadastrarMedico(MedicoCadastroDTO dto) {
         MedicoDTO medicoResposta = new MedicoDTO(
          dto.getNome(),
          dto.getCrm(),
          dto.getEspecialidade()
    );

    return medicoRepository.salvar(medicoResposta);
 }
}
