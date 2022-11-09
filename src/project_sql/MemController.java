package project_sql;

import java.util.HashMap;
import java.util.List;

public class MemController {
	
	private MemDAO dao;
	
	public MemController() {
		 dao = new MemDAO();
	} // end MemController()
	
	public List<SalesDTO> listProcess() {
		return dao.listMethod();
	} // end ListProcess();
	
	public int insertProcess(MemDTO dto) {
		return dao.insertMethod(dto);
	} // end InsertProcess()
	
	public int deleteProcess(int num) {
		return dao.deleteMethod(num);
	} // end deleteProcess
	
	public int updateProcess(SalesDTO sdto) {
		return dao.updateMethod(sdto);

	} // end deleteProcess
	
} // end Class
