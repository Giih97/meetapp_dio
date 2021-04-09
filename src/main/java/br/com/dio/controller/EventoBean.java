package br.com.dio.controller;

import java.io.Serializable;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.dio.model.Evento;

@Named
public class EventoBean implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Inject
	private Evento evento;
}
