package com.pokemon.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pokemon {

	public Pokemon() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length=50, nullable = false)
	private String name;
	
	@Column(length=30, nullable = false)
	private String type;
	
	@Column(length=30, nullable = false)
	private String region;
	
	@Column(precision=10, scale=2, nullable = false)
	private Double weight;
	
	@Column(precision=10, scale=2, nullable = false)
	private Double height;
	
	@Column(length=3, nullable = false)
	private Integer hp;
	
	@Column(length=50, nullable = false)
	private String quickAtttack;
	
	@Column(length=50, nullable = false)
	private String chargedAttack;

	@Column(length=150)
	private String description;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Integer getHp() {
		return hp;
	}

	public void setHp(Integer hp) {
		this.hp = hp;
	}

	public String getQuickAtttack() {
		return quickAtttack;
	}

	public void setQuickAtttack(String quickAtttack) {
		this.quickAtttack = quickAtttack;
	}

	public String getChargedAttack() {
		return chargedAttack;
	}

	public void setChargedAttack(String chargedAttack) {
		this.chargedAttack = chargedAttack;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
