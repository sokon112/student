package ch12;

public class Value {
	int value;
	
	
	public Value(int value) {
		this.value = value;
	}
	
	@Override
	public boolean equals(Object obj) {
		Value v = (Value) obj;
		if(this.value == v.value) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Value [value = "+value+"]";
	}
	
}
