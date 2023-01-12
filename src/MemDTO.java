

public class MemDTO {
	private int mNumber;
	private String mName;
	private String mPhone;
	private String mAddress;
	private int mSum;
	private String mGrade;
	
	public MemDTO() {
		
	}

	public MemDTO(int mNumber, String mName, String mPhone, String mAddress, int mSum, String mGrade) {
		super();
		this.mNumber = mNumber;
		this.mName = mName;
		this.mPhone = mPhone;
		this.mAddress = mAddress;
		this.mSum = mSum;
		this.mGrade = mGrade;
	}

	public int getmNumber() {
		return mNumber;
	}

	public void setmNumber(int mNumber) {
		this.mNumber = mNumber;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmPhone() {
		return mPhone;
	}

	public void setmPhone(String mPhone) {
		this.mPhone = mPhone;
	}

	public String getmAddress() {
		return mAddress;
	}

	public void setmAddress(String mAddress) {
		this.mAddress = mAddress;
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
	
	
}
