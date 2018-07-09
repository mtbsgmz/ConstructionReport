package beans;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import entities.Report;
import entities.Status;

@ManagedBean
@RequestScoped
public class ProjectBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String name;
	private Double cost;
	private String manager;
	private Status STATUS;
	private String location;
	private Calendar baslangic;
	private Calendar bitis;
	private Long account_id;	
	private List<Report> reports;
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
	public List<Report> getReports() {
		return reports;
	}
	public void setReports(List<Report> reports) {
		this.reports = reports;
	}
	
	

}
