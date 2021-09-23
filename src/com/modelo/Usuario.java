package com.modelo;

public class Usuario {
	private int id_usuario;
    private String nombre;
    private String apellido;
    private String mail;
    private String contrasena;
    private String nombreUsuario;
    private Estatus estatus;


    public Usuario () {
    }
    public Usuario (int id_usuario, String nombre, String apellido, String mail, String contrasena, String nombreUsuario, Estatus estatus) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.contrasena = contrasena;
        this.nombreUsuario = nombreUsuario;
        this.estatus = estatus;
    }
}