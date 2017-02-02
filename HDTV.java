import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class HDTV {
	private String Brandname;
	int size;
	public HDTV(String Brandname, int size) {
		this.Brandname = Brandname;
		this.size = size;
	}
	public String getBrandname() {
		return Brandname;
	}
	public void setBrandname(String Brandname) {
		this.Brandname = Brandname;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

}
class SizeComparator implements Comparator<HDTV> {
	public int compare(HDTV tv1, HDTV tv2) {
		int tv1Size = tv1.getSize();
		int tv2Size = tv2.getSize();
 
		if (tv1Size > tv2Size) {
			return 1;
		} else if (tv1Size < tv2Size) {
			return -1;
		} else {
			return 0;
		}
	}

public static void main(String[] args) {
	HDTV tv1 = new HDTV("LG",55);
	HDTV tv2 = new HDTV("Sony",40);
	HDTV tv3 = new HDTV("Samsung",42);

	ArrayList<HDTV> al = new ArrayList<HDTV>();
	al.add(tv1);
	al.add(tv2);
	al.add(tv3);

	Collections.sort(al, new SizeComparator());
	for (HDTV a : al) {
		System.out.println(a.getBrandname());
	}
}

}