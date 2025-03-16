package knepsack.algorithm;

import java.util.*;

public class KSMain {

	public static void main(String[] args) {
		
		ArrayList<Item>items=new ArrayList<Item>();
		//Item1
				Item item1= new Item();
				item1.setNo(1);
				item1.setWeigth(3);
				item1.setProfit(12);
				
		//Item2
				Item item2= new Item();
				item2.setNo(2);
				item2.setWeigth(1);
				item2.setProfit(5);
				
		//Item3
				Item item3= new Item();
				item3.setNo(3);
				item3.setWeigth(4);
				item3.setProfit(16);
				
		//Item4
				Item item4= new Item();
				item4.setNo(4);
				item4.setWeigth(2);
				item4.setProfit(7);
				
		//Item5
				Item item5= new Item();
				item5.setNo(5);
				item5.setWeigth(9);
				item5.setProfit(9);
				
		//Item6
				Item item6= new Item();
				item6.setNo(6);
				item6.setWeigth(4);
				item6.setProfit(11);
				
		//Item7
				Item item7= new Item();
				item7.setNo(7);
				item7.setWeigth(3);
				item7.setProfit(6);
				
		
		items.add(item1);
		items.add(item2);
		items.add(item3);
		items.add(item4);
		items.add(item5);
		items.add(item6);
		items.add(item7);
		
	    Collections.sort(items, new KSComparator());
	    
	    for(Item i: items)
	    {
	    	System.out.println(i);
	    }
	    
	    double capacity=15.0,totalProfit=0.0;
	    
	    for(Item i: items)
	    {
	    	if(capacity>=i.getWeigth())
	    	{
	    		capacity=capacity-i.getWeigth();
	    		totalProfit=totalProfit+ i.getProfit();
	    		//System.out.println(i.getNo()+" "+capacity);
	    	}
	    	else
	    	{ 
	    		double fraction = capacity / i.getWeigth();
	    		totalProfit += i.getProfit() * fraction;
	    		break;
	    	}
	    }
	    
	    System.out.println("Total Profit="+ totalProfit);
	}

}
