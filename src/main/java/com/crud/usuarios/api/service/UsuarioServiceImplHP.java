package com.crud.usuarios.api.service;

import com.crud.usuarios.api.entity.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioServiceImplHP  implements UsuarioServiceHp {

    List<Usuario> listaUsuarios = new ArrayList<>();


    @Override
    public void meterUsuario(Usuario usuario) {
       this.listaUsuarios.add(usuario);
    }

    @Override
    public void removerUsuario(Usuario usuario) {
        this.listaUsuarios.remove((Long)usuario.id);
    }

    @Override
    public List<Usuario> meterUsuario() {
        return null;
    }

    @Override
    public void actualizarPosUsuarios(int pos, Usuario usuario) {
        this.listaUsuarios.add(pos, usuario);
    }

    @Override
    public void imprimirUsuarios(List<Usuario> Lista) {

        for(Usuario usuario: Lista)
            System.out.println(usuario );
    }
}
