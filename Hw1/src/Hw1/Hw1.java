package Hw1;

public class Hw1 {

	public static void main(String[] args) {
		for(int i=0;i<args.length;i++){
			//System.out.println("arguments[" + (i+1) + "] is " + args[i]);
			String first;
			if(args[i].length() == 1){
				System.out.printf("%say ",args[i].toUpperCase());
			}
			else if(args[i].substring(0,1) != "a" || args[i].substring(0,1) != "e" || args[i].substring(0,1) != "i" || args[i].substring(0,1) != "o" || args[i].substring(0,1) != "u"){
				first = args[i].substring(0,1);
				if(i != (args.length-1))
				{
					System.out.printf("%s%s%say ",args[i].substring(1,2).toUpperCase(),args[i].substring(2),first);
				}
				else
				{
					System.out.printf("%s%s%say",args[i].substring(1,2).toUpperCase(),args[i].substring(2),first);
				}
			}
			else{
				first = args[i].substring(0,1).toUpperCase();
				if(i != (args.length-1))
				{
					System.out.printf("%s%say ",first,args[i].substring(1));
				}
				else
				{
					System.out.printf("%s%say",first,args[i].substring(1));
				}
			}
		}
	}
}