package com.tcbd07.mintproject.controller;

import com.tcbd07.mintproject.model.dto.ProgramsVo;
import com.tcbd07.mintproject.model.entity.User;
import com.tcbd07.mintproject.service.ProgramsVoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProgramsController {
    @Autowired
    private ProgramsVoService programsVoService;

    @GetMapping("/queryAllProgramsVo")
    public List<ProgramsVo> get(){
        return programsVoService.queryAllProgramsVo();
    }
    @GetMapping("/getAllFirms")
    public List<User> get1(){
        return programsVoService.getAllFirms("2");
    }



}
