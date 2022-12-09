import java.util.Scanner;

//STOCK MARKET DATA ANALYZER SEMESTER PROJECT
//Aidan Villegas and Noah Molla
//Mr. Kahn - Period 3



public class Main {
	public static boolean run=true;
	public static Scanner jMenu = new Scanner(System.in);
	public static boolean run1=false;
	public static String a = "";;
	public static String tickerSS="";
	public static void main(String[] args) 
	{
		//System.out.println("STOCK ANALYZER\n");
		new importFiles();
		
//		System.out.println("Ticker TSLA DATA:");
//		importFiles.scannerFileRead("TSLA.csv");
//	
//		System.out.println("Ticker AAPL DATA:");
//		importFiles.scannerFileRead("AAPL.csv");
//		
//		System.out.println("Ticker NIO DATA:");
//		//importFiles.scannerFileRead("NIO.csv");
//		
//		System.out.println("Ticker NVDA DATA:");
//		//importFiles.scannerFileRead("NVDA.csv");
//		
//		System.out.println("Ticker NFLX DATA:");
//		//importFiles.scannerFileRead("NFLX.csv");
		
		
		//MENU
		
		System.out.println("Welcome to Stock Analyzer. Made by Noah Molla and Aidan Villegas. "
							+ "This program works by asking the USER for their ticker symbol of choice, "
							+ " the ticker's data must be in the program folder, and returns the 52 week "
							+ "data of the stock, as well as analytics."
							+ "\n\nEnter your stock's ticker symbol of choice and press 'ENTER' "
							+ "(default values are 'AAPL', 'NFLX', 'NIO', 'NVDA', 'TSLA'): ");
		while(run==true) 
		{
			menu(true);
			//System.out.println("run is equal to: " + run);
			//run=false;
			//analytics: 
		
		}
		
		jMenu.close();
		
		
	}
	
	static boolean menu(boolean c)
	{
		
		
		if(run1==false)
		{
			tickerSS=jMenu.next().toUpperCase();
			a = tickerSS + ".csv";
			
		}
		else
		{
			
			a=tickerSS.toUpperCase()+".csv";
		}
		switch(a)
		{
			case "TSLA.csv" :
			{
				importFiles.scannerFileRead("TSLA.csv");
				break;
			}
			case "AAPL.csv" :
			{
				importFiles.scannerFileRead("AAPL.csv");
				break;
			}
			case "NIO.csv" :
			{
				importFiles.scannerFileRead("NIO.csv");
				break;
			}
			case "NVDA.csv" :
			{
				importFiles.scannerFileRead("NVDA.csv");
				break;
			}
			case "NFLX.csv" :
			{
				importFiles.scannerFileRead("NFLX.csv");
				break;
			}
			
			default :
			{
				System.out.println("NO '.csv' file was found");
			}
		}
		
		new analysis();
		//System.out.println("tickerSS is: " + tickerSS +".");
		System.out.println("\nThe weekly percent change for '" +tickerSS +   "' stock is '" + analysis.percentChange(tickerSS, "week") +
							" %' . \nThe yearly percent change for this stock is '" + analysis.percentChange(tickerSS, "year") + " %' .");
//		System.out.println(importFiles.yearhighTSLA());
//		System.out.println("\nThe 52 week low for '" +tickerSS +   "' stock is ' " + analysis.yearlyStats(tickerSS, "High") +
//				"' . \nThe yearly percent change for this stock is '" + analysis.yearlyStats(tickerSS, "LOW") + " ' .");
		System.out.println("The standard deviation of '" + tickerSS + "' is: " + analysis.standardDeviation(tickerSS));
		
		System.out.println("Our calculated rating on this stock is a: " + analysis.rating(tickerSS));
		
		
		System.out.println("\nENTER NEXT TICKER SYMBOL: ");
		
		tickerSS=jMenu.next().toUpperCase();
		//a=jMenu.next();
		run1=true;
		
		return run;
		
	}
}

