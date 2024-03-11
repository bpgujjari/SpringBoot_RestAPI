package com.image.entity;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;


@Entity
public class Image {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	@Lob
	@Column(columnDefinition = "LONGBLOB")
	private byte[] image;
	public Image() {
	}
	public Image(int id, String name, byte[] image) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
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
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Image [id=" + id + ", name=" + name + ", image=" + Arrays.toString(image) + "]";
	}
	
	
	
	
}
