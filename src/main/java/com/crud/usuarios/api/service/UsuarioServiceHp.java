package com.crud.usuarios.api.service;

import com.crud.usuarios.api.entity.Usuario;

import java.util.List;

public interface UsuarioServiceHp {

    void meterUsuario(Usuario usuario);
    void removerUsuario(Usuario usuario);
    List<Usuario> meterUsuario();
    void actualizarPosUsuarios(int pos, Usuario usuario);
    void imprimirUsuarios(List<Usuario> Lista);

}
