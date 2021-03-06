package entities;
import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import static javax.persistence.EnumType.STRING;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import static javax.persistence.TemporalType.DATE;


@Entity
@Table
public class Project implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	@Id
	@SequenceGenerator(name = "PRO_SEQ", initialValue = 1, allocationSize = 1, sequenceName = "PRO_SEQ")
	@GeneratedValue(generator="PRO_SEQ", strategy=GenerationType.SEQUENCE)
	private Long id;
	private String name;
	private Double cost;
	private String manager;
	
	@Enumerated(STRING)
	private Status STATUS;
	private String location;
	
	@Temporal(DATE)
	private Calendar baslangic;
	
	@Temporal(DATE)
	private Calendar bitis;
	
	
	//@OneToOne
	private Long account_id;

	//@OneToMany
	private Long report_id;
	
 private String description;
	

	public Long getReport_id() {
	return report_id;
}
public void setReport_id(Long report_id) {
	this.report_id = report_id;
}
	public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public Status getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(Status sTATUS) {
		STATUS = sTATUS;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Calendar getBaslangic() {
		return baslangic;
	}
	public void setBaslangic(Calendar baslangic) {
		this.baslangic = baslangic;
	}
	public Calendar getBitis() {
		return bitis;
	}
	public void setBitis(Calendar bitis) {
		this.bitis = bitis;
	}
	public Long getAccount_id() {
		return account_id;
	}
	public void setAccount_id(Long account_id) {
		this.account_id = account_id;
	}
		

}
