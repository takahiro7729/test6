package model;
import java.io.Serializable;

public class Health implements Serializable{
	private double height, weight,bmi;
    private String bodyType;
    
	
	public void setHeight(double height) {this.height = height;}
	public double getHeight() {return height;}
    public void setWeight(double weight) {this.weight = weight;}
	public double getWeight() {return weight;}
	public void setBmi(double bmi) {this.bmi = bmi;}
	public double getBmi() {return bmi;}
	public void setBodyType(String bodyType) {this.bodyType = bodyType;}
	public String getBodyType() {return this.bodyType;}
 }
