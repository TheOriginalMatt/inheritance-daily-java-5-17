public class SubClassA extends SuperClass {

	private String subStr;

	/**
	* Sets the String stored in the subclass
	*
	*@param val string to be stored in the subclass
	*
	*/
	public void setStr(String val) {
		this.subStr = val;
	}

	/**
	* Returns the string stored in the subclass
	*
	*@return string stored in the subclass
	*
	*/
	public String getStr() {
		return this.subStr;
	}
}