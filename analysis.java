
public class analysis 
	{
		public static float percentChange(String symbol, String parameter)
		{
			new importFiles();
			float s = 0;
			String c=symbol;
			//System.out.println("symbol is: " + c + ". Parameter is: " + parameter +".");
			
			if(c.compareTo("TSLA")==0)
			{
				if(parameter.compareTo("week")==0)
					{
					s=importFiles.weekTSLA();
					}
				else
					{
					s=importFiles.yearTSLA();
					}
			}
			if(c.compareTo("AAPL")==0)
			{ 
				//System.out.println("FHFNBWFEUHWQBFHUJWQBFHJQWBHFJBWFJHBQFHJ");
				if(parameter.compareTo("week")==0)
					{
					s=importFiles.weekAAPL();
					}
				else
					{
					s=importFiles.yearAAPL();
					}
			}
			if(c.compareTo("NIO")==0)
			{
				if(parameter.compareTo("week")==0)
					{
					s=importFiles.weekNIO();
					}
				else
					{
					s=importFiles.yearNIO();
					}
			}
			if(c.compareTo("NVDA")==0)
			{
				if(parameter.compareTo("week")==0)
					{
					s=importFiles.weekNVDA();
					}
				else
					{
					s=importFiles.yearNVDA();
					}
			}
			if(c.compareTo("NFLX")==0)
			{
				if(parameter.compareTo("week")==0)
					{
					s=importFiles.weekNFLX();
					}
				else
					{
					s=importFiles.yearNFLX();
					}
			}
			return s;
			
		}
		
		public static float yearlyStats(String symbol, String parameter)
		{
			new importFiles();
			float s = 0;
			if(symbol.compareTo("TSLA")==0)
			{
				if(parameter.compareTo("High")==0)
					{
					s=importFiles.yearhighTSLA();
					}
				else
					{
					s=importFiles.yearLowTSLA();
					}
			}
			if(symbol.compareTo("AAPL")==0)
			{
				if(parameter.compareTo("High")==0)
					{
					s=importFiles.yearhighAAPL();
					}
				else
					{
					s=importFiles.yearLowAAPL();
					}
			}
			if(symbol.compareTo("NIO")==0)
			{
				if(parameter.compareTo("High")==0)
					{
					s=importFiles.yearhighNIO();
					}
				else
					{
					s=importFiles.yearLowNIO();
					}
			}
			if(symbol.compareTo("NVDA")==0)
			{
				if(parameter.compareTo("High")==0)
					{
					s=importFiles.yearhighNVDA();
					}
				else
					{
					s=importFiles.yearLowNVDA();
					}
			}
			if(symbol.compareTo("NFLX")==0)
			{
				if(parameter.compareTo("High")==0)
					{
					s=importFiles.yearhighNFLX();
					}
				else
					{
					s=importFiles.yearLowNFLX();
					}
			}
			return s;
			
		
		}
		
		public static float standardDeviation(String symbol)
		{
			
			new importFiles();
			float s = 0;
			if(symbol.compareTo("TSLA")==0)
			{
				
					s=importFiles.standardDevTSLA();
					
			}
			if(symbol.compareTo("AAPL")==0)
			{
				
					s=importFiles.standardDevAAPL();
					
			}
			if(symbol.compareTo("NIO")==0)
			{
				
					s=importFiles.standardDevNIO();
					
			}
			if(symbol.compareTo("NVDA")==0)
			{
				
					s=importFiles.standardDevNVDA();
					
			}
			if(symbol.compareTo("NFLX")==0)
			{
				
					s=importFiles.standardDevNFLX();
					
			}
			return s;
			
		
		}
			
		public static String rating(String s)
		{
			String rating = "NEUTRAL";
			if((standardDeviation(s)<10) && (percentChange(s,"year")>0)&& (percentChange(s,"week")>0))
			{
				rating="BUY";
			}
			if((standardDeviation(s)>10) && percentChange(s,"year")>0)
			{
				rating="SELL";
			}
			if(standardDeviation(s)>10)
			{
				System.out.println(s + " is very volatile. This stock may be good for swing trades.");
			}
			
			return rating;
		}
	}
