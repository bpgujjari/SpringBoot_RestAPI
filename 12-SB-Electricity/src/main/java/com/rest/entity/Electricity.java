package com.rest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
public class Electricity {
	@Id
	private int userId;
	private String userName;
	private int previousUnits;
	private int currentUnits;
	private int monthlyUnits;
	private double perUnit;
	private double perUnitAbove300;
	private double bill;
		
}
