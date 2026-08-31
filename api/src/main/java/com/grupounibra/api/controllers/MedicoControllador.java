package com.grupounibra.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import com.grupounibra.DTO.MedicoDTO;
import com.grupounibra.api.services.MedicoService;


@RestController
@RequestMapping("/medicos")
@RequiredArgsConstructor
public class MedicoControllador {

    private final MedicoService medicoService;
    
    @GetMapping
    public List<MedicoDTO> listarMedicos() {
        return medicoService.listarMedicos();
    }

}
