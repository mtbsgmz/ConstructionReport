package entities;
import java.io.Serializable;
import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@Table
public class Company implements Serializable{


	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "COMP_SEQ", initialValue = 1, allocationSize = 1, sequenceName = "COMP_SEQ")
	@GeneratedValue(generator="PSEQ", strategy=GenerationType.SEQUENCE)
	private Long id;
	private String email;
	private String password;
	private String companyName;
	private Boolean role;
	private Blob logo;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Boolean getRole() {
		return role;
	}
	public void setRole(Boolean role) {
		this.role = role;
	}
	public Blob getLogo() {
		return logo;
	}
	public void setLogo(Blob logo) {
		this.logo = logo;
	}
	
	
	
}
