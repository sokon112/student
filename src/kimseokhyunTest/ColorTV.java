package kimseokhyunTest;
//문제1
public class ColorTV extends TV {
	int color;
	public ColorTV(int size,int color) {
		super(size);
		this.color = color;
	}

	void printProperty() {
		System.out.printf("%d인치 %d컬러",getSize(),color);
	}
}
