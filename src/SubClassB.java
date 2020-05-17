public class SubClassB<T> extends SuperClass {
	private T subObj;

	/**
	* Sets the object to be stored by the class
	*
	*@param val object to be stored by the class
	*
	*/
	public void setObj(T val) {
		this.subObj = val;
	}

	/**
	* Returns the object stored by the class
	*
	*@return object stored by the class
	*
	*/
	public T getObj() {
		return this.subObj;
	}
}