package part04.controller;

import java.util.List;
import part04.dao.MemDAO;
import part04.dto.MemDTO;


public class MemController {
	
	private MemDAO dao;
	
	public MemController() {
		dao  = new MemDAO();
	}
	
	public List<MemDTO> selectProcess() {
		return dao.allMethod();
	}
	
	public int multiInsertProcess(List<MemDTO> list) {
		for(MemDTO dto : list) {
			dto.setNum(dao.keyMethod()); }
		
		return dao.multiInsertMethod(list); 
	} // end MultiInsertProcess
	
	public int multiDeleteProcess(List<Integer> list) {
		return dao.multiDeleteMethod(list); 
	} // end MultiDeleteProcess
	
	public List<MemDTO> searchProcess(MemDTO dto) {
		return dao.searchMethod(dto);
	} // end searchProcess
	
	public int multiUpdateProcess(MemDTO dto) {
		return dao.multiUpdateMethod(dto);
	} // end multiUpdateProcess
	
	public int insertDataMethod(MemDTO dto) {
		return dao.insertDataMethod(dto);
	}

} // end class
