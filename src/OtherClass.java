public class OtherClass {
	private SuperClass supClass;

	/**
	* Sets the SuperClass object stored by the class
	*
	*@param val the SuperClass object stored by the class  
	*
	*/
	public void setSuperClass(SuperClass val) {
		this.supClass = val;
	}

	/**
	* Gets the SuperClass object stored by the class
	*
	*@return SuperClass object stored by the class
	*
	*/
	public SuperClass getSuperClass() {
		return this.supClass;
	}

	/**
	* Calls SuperObject.setInt()
	*
	*@param val argument to be given to setInt 
	*
	*/
	public void setInt(int val) {
		this.supClass.setInt(val);
	}

	/**
	* Calls SuperObject.getInt()
	*
	*@return Value returned form SuperClass.getInt()
	*
	*/
	public int getInt() {
		return this.supClass.getInt();
	}
}