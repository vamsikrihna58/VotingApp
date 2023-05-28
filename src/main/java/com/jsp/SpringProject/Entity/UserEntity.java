package com.jsp.SpringProject.Entity;

import java.io.Serializable;

import org.hibernate.annotations.GenericGenerator;

import com.jsp.SpringProject.Dao.UserDao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "Voters_list")
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity implements Serializable{
	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
 	private Integer id;
	private String name;
	private String adhar;
	private String cell;
	public UserEntity(UserDao dao) {
		this.id=dao.getId();
		this.name=dao.getName();
		this.adhar=dao.getAdhar();
		this.cell=dao.getCell();
		
		
	}
	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", name=" + name + ", Adhar=" + adhar + ", cell=" + cell + "]";
	}

}
