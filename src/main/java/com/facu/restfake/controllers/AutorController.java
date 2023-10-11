package com.facu.restfake.controllers;

import com.facu.restfake.entities.Autor;
import com.facu.restfake.services.AutorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.lang.model.util.Elements;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/Autores")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl>{
}
