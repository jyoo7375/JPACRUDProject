package com.skilldistillery.designerbrands.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Designer_brand")
public class DesignerBrand {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String country;
	@Column(name="found_year")
	private int foundYear;
	@Column(name="average_cost")
	private double averageCost;
	@Column(name="ceo_name")
	private String ceoName;
	@Column(name="net_worth")
	private Long netWorth;
	
	public DesignerBrand() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getYear() {
		return foundYear;
	}
	public void setYear(int year) {
		this.foundYear = year;
	}
	public double getAverageCost() {
		return averageCost;
	}
	public void setAverageCost(double averageCost) {
		this.averageCost = averageCost;
	}
	public String getCeoName() {
		return ceoName;
	}
	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}
	public Long getNetWorth() {
		return netWorth;
	}
	public void setNetWorth(Long netWorth) {
		this.netWorth = netWorth;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DesignerBrand [id=").append(id).append(", name=").append(name).append(", country=")
				.append(country).append(", year=").append(foundYear).append(", averageCost=").append(averageCost)
				.append(", ceoName=").append(ceoName).append(", netWorth=").append(netWorth).append("]");
		return builder.toString();
	}
	
	
	
	
	
	

}
