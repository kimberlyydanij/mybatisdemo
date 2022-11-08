package project_sql;

import java.util.HashMap;
import java.util.List;

public class MemController {
	
	private MemDAO dao;
	
	public MemController() {
		 dao = new MemDAO();
	} // end MemController()
	
	public List<MemDTO> listProcess() {
		return dao.listMethod();
	} // end ListProcess();
	
	public int insertProcess(MemDTO dto) {
		return dao.insertMethod(dto);
	} // end InsertProcess()
	
	public int deleteProcess(int num) {
		return dao.deleteMethod(num);
	} // end deleteProcess
	
	public int updateProcess(int n, int s) {
		return dao.updateMethod(n,s);
	} // end deleteProcess
	
} // end Class
