package it.uniroma3.products;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class OrderLine {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(nullable=false)
	private Float unitPrice;
	private Integer quantity;
	
	@OneToMany
	private List<Product> products;
	
	public OrderLine(){}
	
	public OrderLine(Float unitPrice, Integer quantity){
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}

	//Getters & Setters
	
}
