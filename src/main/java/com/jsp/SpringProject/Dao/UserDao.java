package com.jsp.SpringProject.Dao;

import java.io.Serializable;

import org.hibernate.annotations.GenericGenerator;

import com.jsp.SpringProject.Entity.UserEntity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDao implements Serializable {
	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
 	private Integer id;
	private String name;
	private String adhar;
	private String cell;
	public UserDao(UserEntity dao) {
		this.id=dao.getId();
		this.name=dao.getName();
		this.adhar=dao.getAdhar();
		this.cell=dao.getCell();
		
		
	}
	@Override
	public String toString() {
		return "UserDao [id=" + id + ", name=" + name + ", adhar=" + adhar + ", cell=" + cell + "]";
	}

	
}
