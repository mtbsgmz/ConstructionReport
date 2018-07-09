package service;

import java.util.List;



public class ReportsService {
	ReportDAO reportDao = new ReportDAO();

	public void CreateRapor(Report rapor) {
		reportDao.create(rapor);
	}



	public Report RaporGoster(Long id) {
		return reportDao.read(id);
	}

	public List<Report> RaporGoster() {
		return reportDao.readAll();
	}
}

}
