
public class Main {

	public static void main(String[] args) {
		int num = 3;
		int sum = f(num);
		System.out.println(sum);
		int num2 = 4;
		int mul = mul(num2);
		System.out.println(mul);
		int num3=5;
		int e=even(num3);
		System.out.println(e);
		int num4=10;
		int res=n(num4);
		System.out.println(res);
		int big=23;
		int small=7;
		int mana=mana(big,small);
		System.out.println(mana);
		boolean multy=multy(28,7);
		System.out.println(multy);
		boolean flag=first(8,2);
		System.out.println(flag);
		boolean all=allgood(267);
		System.out.println(all);
	}

	public static int f(int num) {
		if (num == 0) {
			return 0;
		}

		return f(num - 1) + num;
	}

	
	
	public static int mul(int num) {
		if (num == 1) {
			return 1;
		}

		return mul(num - 1) * num;
	}

	
	
	
	public static int even(int num) {
		if (num == 1) {
			return 1;
		}

		if (num % 2 == 0) {
			return even(num - 1);
		}

		return even(num - 1) * num;

	}
	
	
	
	public static int n(int num) {
		if(num<10) {
			return 1;
		}
		
		return n(num/10)+1;
		
		
	}
  //  מחזיר את השארית של החלוקה ולא את המנה(ביקשו לעדכן.לשנות)	
	public static int mana(int big ,int small) {
		int sum=0; 
		if(big==small) {
			return 0;
			
			}
		if(big>small) {
			 sum=big-small;
			 return mana(sum,small);
		}
		return big;	
	}
	
	
	
	public static boolean multy(int x,int y) {
		 if (x == 0) {
	            return false;
	        }

	        if (x == y) {
	            return true;
	            
	        }
	        else if (x < y) {
	            return false;
	        } 
	        else {
	            return multy(x - y, y);
	        }
	    }
	
	
	
	public static boolean first(int number,int count) {
	    if (number == 0 || number == 1) {
	        return false;
	    }
	    if (count > number -1) {
	        return true;
	    }

	    boolean flag = multy(number, count);
	    if (flag==true) {
	        return false;  
	    }
	    return first(number, count + 1);
	}

	
	
	
	public static boolean allgood(int n) {
	    if (n < 10) {
	        return true;
	    }
	    int curDigit = n % 10;
	    int nextDigit = (n / 10) % 10;

	    if ((curDigit % 2) != (nextDigit % 2)) {
	        return false;
	    }

	    return allgood(n / 10);
	}}
	
	
	
	
	
	
