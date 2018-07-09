import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

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
import javax.persistence.OneToMany;

@Entity
@Table
public class Project implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	@Id
	@SequenceGenerator(name = "PRO_SEQ", initialValue = 1, allocationSize = 1, sequenceName = "PRO_SEQ")
	@GeneratedValue(generator="PROSEQ", strategy=GenerationType.SEQUENCE)
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
	
	private Long account_id;
	@OneToMany
	private List<Report> reports;
	
	

}
