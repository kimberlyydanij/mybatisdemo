package project_sql;

public class MemDTO {
	
	public int mNumber;
	private String mName;
	private String mPhone;
	private String mAddress;
	
	public MemDTO() {
	
	}


	public MemDTO(int mNumber, String mName, String mPhone, String mAddress) {
		this.mNumber = mNumber;
		this.mName = mName;
		this.mPhone = mPhone;
		this.mAddress = mAddress;
	}


	public MemDTO(String mName, String mPhone, String mAddress) {
		this.mName = mName;
		this.mPhone = mPhone;
		this.mAddress = mAddress;
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


} // end class
