package project_sql;

public class SalesDTO extends MemDTO{
	private int mSum;
	private String mGrade;
	
	public SalesDTO() {
		
	}

	public SalesDTO(int mSum, String mGrade) {
		super();
		this.mSum = mSum;
		this.mGrade = mGrade;
	}
	public SalesDTO(int mNumber, int mSum) {
		this.mNumber = mNumber;
	    this.mSum = mSum;
	}
	
	public int getmNumber() {
		return super.getmNumber();
	}

	
	public int getmSum() {
		return mSum;
	}

	public void setmSum(int mSum) {
		this.mSum = mSum;
	}

	public String getmGrade() {
		return mGrade;
	}

	public void setmGrade(String mGrade) {
		this.mGrade = mGrade;
	}
	
	
} // end class
