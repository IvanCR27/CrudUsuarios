package com.crud.usuarios.api.service;

import com.crud.usuarios.api.entity.Auditoria;

import java.util.List;

public interface AuditoriaServiceHP {

    void setLog(Auditoria auditoria);
    void getLog(List<Auditoria> auditoria);
    List<Auditoria> getListLog( );

}
