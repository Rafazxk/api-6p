package com.grupounibra.api;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.grupounibra.api.MedicoDTO;

@RestController
@RequestMapping("/medicos")
public class MedicoControllador {

    @GetMapping
    public ArrayList<MedicoDTO> listaMedicos(@RequestParam(required = true) String nome, @RequestParam(required = false) String crm) {
        ArrayList<MedicoDTO> listaMedicos = new ArrayList<MedicoDTO>();

        listaMedicos.add(new MedicoDTO("Ana souza", "12345", "CARDIOLOGIA"));
        listaMedicos.add(new MedicoDTO("Paulo", "6789", "PEDIATRIA"));
        listaMedicos.add(new MedicoDTO("teste", "1234", "ORTOPEDIA"));

        if (nome != null) {
            ArrayList<MedicoDTO> listaMedicosResposta = new ArrayList<MedicoDTO>();
            for (MedicoDTO medicoDTO : listaMedicosResposta) {

                if (medicoDTO.getNome().contains(nome)) {
                    listaMedicosResposta.add(medicoDTO);
                }
            }
            
            return listaMedicosResposta;
        } else {
            return listaMedicos;
        }

    }

}
