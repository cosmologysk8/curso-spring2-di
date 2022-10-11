package com.example.cursospring2di.service;

import org.springframework.stereotype.Service;

@Service
public class MiServicio implements IServicio{

    @Override
    public String operacion(){
       return  "ejecutando un proceso importante";
    }

}
