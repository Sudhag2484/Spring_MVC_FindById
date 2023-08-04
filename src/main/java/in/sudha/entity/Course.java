package in.sudha.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Course {
	@Id
	private Integer cid;
	private String name;
	private Double price;
	
	

}
