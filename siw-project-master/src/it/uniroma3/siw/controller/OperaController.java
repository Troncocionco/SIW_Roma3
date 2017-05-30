package it.uniroma3.siw.controller;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import it.uniroma3.siw.model.Opera;
import it.uniroma3.siw.model.OperaFacade;

@ManagedBean(name="operaController")
public class OperaController {
	
	@EJB(beanName="operaFacade")
	private OperaFacade operaFacade;
	
	private List<Opera> opere;
	
	public String listOpere() {
		this.opere = operaFacade.getAllOpere();
		return "showOpere"; 
	}
}
