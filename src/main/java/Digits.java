import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ 
		digitLIst = new ArrayList <Integer>;
		if(num == 0){
			digitList.add(0);
		}
		int n = num;
		else if(num > 0 ){
			digitList.add(0,n%10);
			n = n%10;
		}
	    
	}

	public boolean isStrictlyIncreasing()
	{ 
		for(int i = 1; i < didgitList.size(); i++){
			if(digiitList.get(i, i+1) > digitList.get(i-1, i)){
				return true;
			}
		}
		return false;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
