package knepsack.algorithm;

import java.util.*;

public class KSComparator implements Comparator<Item> {

	@Override
	public int compare(Item obj1, Item obj2) {
		double cpr1,cpr2;
		cpr1=(double)obj1.getProfit()/obj1.getWeigth();
		cpr2=(double)obj2.getProfit()/obj2.getWeigth();
		
		return Double.compare(cpr2, cpr1);
	}

}
