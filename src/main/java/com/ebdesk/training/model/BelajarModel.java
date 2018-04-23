package com.ebdesk.training.model;



public class BelajarModel {
 
	private String id;
	private String nama;
	private String descrip;
	//private String Umur;
	private String steps;
	
	public BelajarModel(String id, String nama, String descrip, String steps) {
		this.id = id;
		this.nama = nama;
		this.descrip = descrip;
		//this.Umur = Umur;
		this.steps = steps;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
	 this.nama = nama;
	}
	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	/*public String getUmur() {
		return Umur;
	}
	public void setUmur(String Umur) {
		this.Umur = Umur;
	}*/
	public String getSteps() {
		return steps;
	}
	public void setSteps(String steps) {
		this.steps = steps;
	}
	
	
}

