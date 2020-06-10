package com.crud.usuarios.api.service;

import com.crud.usuarios.api.entity.Auditoria;

import java.util.ArrayList;
import java.util.List;

public class AuditoriaServiceImplMiguel implements AuditoriaServiceMiguel {

    List<Auditoria> listaProcesos = new ArrayList<>();

    @Override
    public void setLog(Auditoria auditoria) {
        this.listaProcesos.add(auditoria);
    }

    @Override
    public void getLog(List<Auditoria> audit) {
        for (Auditoria auditoria: audit)
            System.out.println(auditoria );
    }

    @Override
    public List<Auditoria> getListLog() {
    return this.listaProcesos;
    }

}
