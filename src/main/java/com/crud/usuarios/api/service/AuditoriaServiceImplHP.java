package com.crud.usuarios.api.service;

import com.crud.usuarios.api.entity.Auditoria;

import java.util.ArrayList;
import java.util.List;

public class AuditoriaServiceImplHP implements AuditoriaServiceHP {

    List<Auditoria> listaAccion = new ArrayList<>();


    @Override
    public void setLog(Auditoria auditoria) {
        this.listaAccion.add(auditoria);
    }

    @Override
    public void getLog(List<Auditoria>  aud) {

        for(Auditoria auditoria: aud)
        System.out.println(auditoria);    }

    @Override
    public List<Auditoria> getListLog() {
        return this.listaAccion;
    }
}
