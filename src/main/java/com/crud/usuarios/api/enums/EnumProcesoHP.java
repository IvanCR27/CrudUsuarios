package com.crud.usuarios.api.enums;

public enum EnumProcesoHP {

    LOG_IN("login",1), LOG_OUT("logout",2), MODIFICACION("modificacion",3),REVISION("revision",4);

    private String proceso;
    private int numProceso;

    EnumProcesoHP(String accion, int i) {
    }

    public String getProceso() {
        return this.proceso;
    }

    public int getNumProceso() {

        return this.numProceso;
    }

}
