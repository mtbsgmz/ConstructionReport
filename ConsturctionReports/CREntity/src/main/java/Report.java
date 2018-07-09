import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import static javax.persistence.TemporalType.TIMESTAMP;
@Entity
@Table
public class Report implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name = "REP_SEQ", initialValue = 1, allocationSize = 1, sequenceName = "REP_SEQ")
	@GeneratedValue(generator="REPSEQ", strategy=GenerationType.SEQUENCE)
	private Long id;
	
	
	private Long project_id;
	
	
	private Long account_id;
	
	private String title;
	private String detail;
	@Temporal(TIMESTAMP)
	private Calendar date;

}
