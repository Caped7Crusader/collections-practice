package generics;

public class DataObject {
	
	private Object data;

	public DataObject(Object data) {
		this.data = data;
	}
	
	public Object getData() {
		return data;
	}
	
	public void setData(Object data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "data is :" + data;
	}

}
