package knepsack.algorithm;

public class Item {
	private int No, weigth,profit;

	public int getWeigth() {
		return weigth;
	}

	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}

	public int getProfit() {
		return profit;
	}

	public void setProfit(int profit) {
		this.profit = profit;
	}

	public int getNo() {
		return No;
	}

	public void setNo(int no) {
		No = no;
	}

	@Override
	public String toString() {
		return "Item [No=" + No + ", weigth=" + weigth + ", profit=" + profit + "]";
	}
	

}
