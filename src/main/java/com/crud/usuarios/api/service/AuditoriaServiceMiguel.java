package com.crud.usuarios.api.service;

import com.crud.usuarios.api.entity.Auditoria;
import com.crud.usuarios.api.entity.Usuario;
import com.crud.usuarios.api.enums.EnumProcesoMiguel;

import java.util.Date;
import java.util.List;

public interface AuditoriaServiceMiguel {

    void setLog(Auditoria auditoria);
    void getLog(List<Auditoria> auditoria);
    List<Auditoria> getListLog();


}
