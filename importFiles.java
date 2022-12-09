import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class importFiles 
	{

		public static LinkedList<Stock> TSLA= new LinkedList<Stock>();
		public static LinkedList<Stock> AAPL = new LinkedList<Stock>();
		public static LinkedList<Stock> NIO = new LinkedList<Stock>();
		public static LinkedList<Stock> NVDA = new LinkedList<Stock>();
		public static LinkedList<Stock> NFLX = new LinkedList<Stock>();
		public static int lineNumber = 0;
		public static void scannerFileRead(String fileName)	//Input text file into program for use
			{
			String tickerSymbol=fileName;
			lineNumber=0;
			//LinkedList<Stock> TSLA = new LinkedList<Stock>();
			
				try
				{
					//Scanner lets you read data in whatever data format you wish
					//ie: .nextLine(), .next(), .nextInt(), etc.
					File dataBaseFile = new File(tickerSymbol);
					//Scanner object setup to read from a file
					Scanner inFile = new Scanner(dataBaseFile);
					Scanner inFile3 = new Scanner(dataBaseFile);
					//line number counter
					
					while(inFile.hasNextLine())
						{
							//System.out.println(lineNumber + ": " + inFile.nextLine());
							inFile.nextLine();
							++lineNumber;
						}
//					if(fileName=="AAPL") {
//						while(inFile3.hasNextLine())
//							{
//								//System.out.println(lineNumber + ": " + inFile.nextLine());
//								inFile3.nextLine();
//								++lineNumber;
//							}}
					--lineNumber;--lineNumber;
					final int lineNumber1=lineNumber;
					//System.out.println("\n\nNUMBER OF LINES: " + lineNumber +"\n\n");
					if(lineNumber>1)
						{
							//System.out.println("\nMADE IT TO IF");
							int i=1;
							Scanner inFile1 = new Scanner(dataBaseFile);
							inFile1.useDelimiter(",|\\n");
							Scanner inFile2 = new Scanner(dataBaseFile);
							inFile2.useDelimiter(",|\\n");
							//System.out.println("\nMADE IT TO INFILE DELIMITER");
							while(i<(lineNumber1)-2)
								{
					//				System.out.println();
					//				System.out.printf("ADDING STOCK with these parameters: " + inFile1.next() + " | " + inFile1.next()+ " | " + 
					//						inFile1.next()+ " | " + inFile1.next() + " | "+
					//						inFile1.next() + " | "+ inFile1.next() + " | "+ inFile1.next() +"\n" );	
									if(fileName=="TSLA.csv")
									{
										TSLA.add(new Stock (inFile1.next(), inFile1.next(), inFile1.next(), inFile1.next(),
												inFile1.next(),inFile1.next(), inFile1.next()  ));
										//System.out.println("\nJUST ADDED a STOCK at index: "+ i); //+ ". - " + TSLA +"\n");
									}
									if(fileName=="AAPL.csv")
									{
										//System.out.println("RUNNING AAPL");
										AAPL.add(new Stock ( inFile2.next(), inFile2.next(), inFile2.next(), inFile2.next(),
												inFile2.next(),inFile2.next(), inFile2.next()  ));
										//System.out.println("\nJUST ADDED a STOCK at index: "+ i); //+ ". - " + TSLA +"\n");
									}
									if(fileName=="NIO.csv")
									{
										//System.out.println("RUNNING NIO at: " +i);
										NIO.add(new Stock (inFile1.next(), inFile1.next(), inFile1.next(), inFile1.next(),
												inFile1.next(),inFile1.next(), inFile1.next()  ));
										//System.out.println("\nJUST ADDED a STOCK at index: "+ i); //+ ". - " + TSLA +"\n");
									}
									if(fileName=="NVDA.csv")
									{
										//System.out.println("RUNNING NVDA");
										NVDA.add(new Stock (inFile1.next(), inFile1.next(), inFile1.next(), inFile1.next(),
												inFile1.next(),inFile1.next(), inFile1.next()  ));
										//System.out.println("\nJUST ADDED a STOCK at index: "+ i); //+ ". - " + TSLA +"\n");
									}
									if(fileName=="NFLX.csv")
									{
										//System.out.println("RUNNING NFLX");
										NFLX.add(new Stock (inFile1.next(), inFile1.next(), inFile1.next(), inFile1.next(),
												inFile1.next(),inFile1.next(), inFile1.next()  ));
										//System.out.println("\nJUST ADDED a STOCK at index: "+ i); //+ ". - " + TSLA +"\n");
									}
									++i;
								}
							inFile1.reset(); 
							inFile1.close();//System.out.println("inFile1 Closed and Reset");
							inFile2.reset();
							inFile2.close();//System.out.println("inFile2 Closed and Reset");
						}
					inFile.reset(); //System.out.println("inFile Closed and Reset");
					inFile.close(); //System.out.println("inFile Closed and Reset");
					inFile3.reset();//System.out.println("inFile3 Closed and Reset");
					inFile3.close();//System.out.println("inFile3 Closed and Reset");
					//System.out.println("scannerFileRead() executed successfully");
					
				}
				catch(FileNotFoundException e)
				{
					System.out.println("FileNotFoundException: Cannot input from file.");
				}
				int tickerS=0;
				if(fileName=="TSLA.csv")
				{
					
				
					for (int i=tickerS;i<lineNumber-3;++i)
						{
							//System.out.println("\n" + "	DATA	:" + stud +
									System.out.println("" + "	TSLA DATA at line " + i +"	:	"  +
									TSLA.get(i).getDate() + " | "+ 
									TSLA.get(i).getOpen()+ " | "+
									TSLA.get(i).getHigh()+ " | "+
									TSLA.get(i).getLow()+ " | "+
									TSLA.get(i).getClose()+ " | "+
									TSLA.get(i).getadjClose()+ " | "+
									TSLA.get(i).getVolume()); 
						}	
				}
				if(fileName=="AAPL.csv")
				{
					
				
					for (int i=tickerS;i<lineNumber-3;++i)
						{
							//System.out.println("\n" + "	DATA	:" + stud +
									System.out.println("" + "	AAPL DATA at line " + i +"	:	"  +
									AAPL.get(i).getDate() + " | "+ 
									AAPL.get(i).getOpen()+ " | "+
									AAPL.get(i).getHigh()+ " | "+
									AAPL.get(i).getLow()+ " | "+
									AAPL.get(i).getClose()+ " | "+
									AAPL.get(i).getadjClose()+ " | "+
									AAPL.get(i).getVolume()); 
						}	
				}
				if(fileName=="NIO.csv")
				{
					
				
					for (int i=tickerS;i<lineNumber-3;++i)
						{
							//System.out.println("\n" + "	DATA	:");
									System.out.println("" + "	NIO DATA at line " + i +"	:	"  +
									NIO.get(i).getDate() + " | "+ 
									NIO.get(i).getOpen()+ " | "+
									NIO.get(i).getHigh()+ " | "+
									NIO.get(i).getLow()+ " | "+
									NIO.get(i).getClose()+ " | "+
									NIO.get(i).getadjClose()+ " | "+
									NIO.get(i).getVolume()); 
						}	
				}
				if(fileName=="NVDA.csv")
				{
					
				
					for (int i=tickerS;i<lineNumber-3;++i)
						{
							//System.out.println("\n" + "	DATA	:" + stud +
									System.out.println("" + "	NVDA DATA at line " + i +"	:	"  +
											NVDA.get(i).getDate() + " | "+ 
											NVDA.get(i).getOpen()+ " | "+
											NVDA.get(i).getHigh()+ " | "+
											NVDA.get(i).getLow()+ " | "+
											NVDA.get(i).getClose()+ " | "+
											NVDA.get(i).getadjClose()+ " | "+
											NVDA.get(i).getVolume()); 
						}	
				}
				if(fileName=="NFLX.csv")
				{
					
				
					for (int i=tickerS;i<lineNumber-3;++i)
						{
							//System.out.println("\n" + "	DATA	:" + stud +
									System.out.println("" + "	NFLX DATA at line " + i +"	:	"  +
											NFLX.get(i).getDate() + " | "+ 
											NFLX.get(i).getOpen()+ " | "+
											NFLX.get(i).getHigh()+ " | "+
											NFLX.get(i).getLow()+ " | "+
											NFLX.get(i).getClose()+ " | "+
											NFLX.get(i).getadjClose()+ " | "+
											NFLX.get(i).getVolume()); 
						}	
				}
				//HELPER METHODS
				
			}
		//52 week highs and lows
		public static float yearLowTSLA()
		{
			float low=0;
			float f=0;
			
			for(int i=1;i<lineNumber-5;++i)
			{
				try {
				f=Float.parseFloat(TSLA.get(i).getLow());}
				catch (NumberFormatException ex) {}
				if(f<low)
				{
					low=f;
				}
				
			}
			return low;
			
		}
		public static float yearhighTSLA()
		{
			float high=0;
			float f=0;
			for(int i=1;i<lineNumber-5;++i)
			{
				try {
				f=Float.parseFloat(TSLA.get(i).getHigh());}catch (NumberFormatException ex) {}
				if(f>high)
				{
					high=f;
				}
				
			}
			return high;
			
		}
		public static float yearLowAAPL()
		{
			float low=0;
			float f=0;
			for(int i=1;i<lineNumber-5;++i)
			{
				try {
				f=Float.parseFloat(TSLA.get(i).getLow());}catch (NumberFormatException ex) {}
				if(f<low)
				{
					low=f;
				}
				
			}
			return low;
			
		}
		public static float yearhighAAPL()
		{
			float high=0;
			float f=0;
			for(int i=1;i<lineNumber-5;++i)
			{
				try {System.out.println("Fbgwveqfbhqfbwhqjbfw" + i);
						f=Float.parseFloat(TSLA.get(i).getHigh());
				}
				catch (NumberFormatException ex) {}
				if(f>high)
				{
					high=f;
				}
				
			}
			return high;
			
		}
		public static float yearLowNIO()
		{
			float low=0;
			float f=0;
			for(int i=1;i<lineNumber-5;++i)
			{try {
				f=Float.parseFloat(TSLA.get(i).getHigh());}catch (NumberFormatException ex) {}
				if(f<low)
				{
					low=f;
				}
				
			}
			return low;
			
		}
		public static float yearhighNIO()
		{
			float high=0;
			float f=0;
			for(int i=1;i<lineNumber-5;++i)
			{try {
				f=Float.parseFloat(TSLA.get(i).getHigh());}catch (NumberFormatException ex) {}
				if(f>high)
				{
					high=f;
				}
				
			}
			return high;
			
		}
		public static float yearLowNVDA()
		{
			float low=0;
			float f=0;
			for(int i=1;i<lineNumber-5;++i)
			{try {
				f=Float.parseFloat(TSLA.get(i).getLow());}catch (NumberFormatException ex) {}
				if(f<low)
				{
					low=f;
				}
				
			}
			return low;
			
		}
		public static float yearhighNVDA()
		{
			float high=0;
			float f=0;
			for(int i=1;i<lineNumber-5;++i)
			{try {
				f=Float.parseFloat(TSLA.get(i).getHigh());}catch (NumberFormatException ex) {}
				if(f>high)
				{
					high=f;
				}
				
			}
			return high;
			
		}
		public static float yearLowNFLX()
		{
			float low=0;
			float f=0;
			for(int i=1;i<lineNumber-5;++i)
			{try {
				f=Float.parseFloat(TSLA.get(i).getLow());}catch (NumberFormatException ex) {}
				if(f<low)
				{
					low=f;
				}
				
			}
			return low;
			
		}
		public static float yearhighNFLX()
		{
			float high=0;
			float f=0;
			for(int i=1;i<lineNumber-5;++i)
			{try {
				f=Float.parseFloat(TSLA.get(i).getHigh());}catch (NumberFormatException ex) {}
				if(f>high)
				{
					high=f;
				}
				
			}
			return high;
			
		}
		
		
		//percent changes
		public static float weekTSLA()
		{
			float percent=0;
			float f=0;
			float z=0;
			try {
				f=Float.parseFloat(TSLA.get(lineNumber-12).getLow());
				z=Float.parseFloat(TSLA.get(lineNumber-5).getLow());}catch (NumberFormatException ex) {}
				if(f>z)
				{
					percent=((f - z) / z)*100;
				}
				else
				{
					percent=((z - f) / f)*100;
				}
				
			
			
			return percent;
			
		}
		public static float yearTSLA()
		{
			float percent=0;
			float f=0;
			float z=0;
			try {
				f=Float.parseFloat(TSLA.get(1).getLow());
				z=Float.parseFloat(TSLA.get(lineNumber-5).getLow());}catch (NumberFormatException ex) {}
				if(f>z)
				{
					percent=((f - z) / z)*100;
				}
				else
				{
					percent=((z - f) / f)*100;
				}
				
			
			
			return percent;
			
		}
		public static float weekAAPL()
		{
			float percent=0;
			float f = 0;
			float z = 0;
			
				try {
				f=Float.parseFloat(AAPL.get(lineNumber-12).getLow());
				z=Float.parseFloat(AAPL.get(lineNumber-5).getLow());
				}
				catch (NumberFormatException ex) {}
				if(f>z)
				{
					percent=((f - z) / z)*100;
				}
				else
				{
					percent=((z - f) / f)*100;
				}
				
			
			
			return percent;
			
		}
		public static float yearAAPL()
		{
			float percent=0;
			float f=0;
			float z=0;
				try {
				f=Float.parseFloat(AAPL.get(1).getLow());
				z=Float.parseFloat(AAPL.get(lineNumber-5).getLow());}
				catch (NumberFormatException ex) {}
				if(f>z)
				{
					percent=((f - z) / z)*100;
				}
				else
				{
					percent=((z - f) / f)*100;
				}
				
			
			
			return percent;
			
		}
		public static float weekNIO()
		{
			float percent=0;
			float f=0;
			float z=0;
			try {
				f=Float.parseFloat(NIO.get(lineNumber-12).getLow());
				z=Float.parseFloat(NIO.get(lineNumber-5).getLow());}catch (NumberFormatException ex) {}
				if(f>z)
				{
					percent=((f - z) / z)*100;
				}
				else
				{
					percent=((z - f) / f)*100;
				}
				
			
			
			return percent;
			
		}
		public static float yearNIO()
		{
			float percent=0;
			float f=0;
			float z=0;
			try {
				f=Float.parseFloat(NIO.get(1).getLow());
				z=Float.parseFloat(NIO.get(lineNumber-5).getLow());}catch (NumberFormatException ex) {}
				if(f>z)
				{
					percent=((f - z) / z)*100;
				}
				else
				{
					percent=((z - f) / f)*100;
				}
				
			
			
			return percent;
			
		}
		public static float weekNVDA()
		{
			float percent=0;
			float f=0;
			float z=0;
			try {
				f=Float.parseFloat(NVDA.get(lineNumber-12).getLow());
				z=Float.parseFloat(NVDA.get(lineNumber-5).getLow());}catch (NumberFormatException ex) {}
				if(f>z)
				{
					percent=((f - z) / z)*100;
				}
				else
				{
					percent=((z - f) / f)*100;
				}
				
			
			
			return percent;
			
		}
		public static float yearNVDA()
		{
			float percent=0;
			float f=0;
			float z=0;
			try {
				f=Float.parseFloat(NVDA.get(1).getLow());
				z=Float.parseFloat(NVDA.get(lineNumber-5).getLow());}catch (NumberFormatException ex) {}
				if(f>z)
				{
					percent=((f - z) / z)*100;
				}
				else
				{
					percent=((z - f) / f)*100;
				}
				
			
			
			return percent;
			
		}
		public static float weekNFLX()
		{
			float percent=0;
			float f=0;
			float z=0;
try {
				f=Float.parseFloat(NFLX.get(lineNumber-12).getLow());
				z=Float.parseFloat(NFLX.get(lineNumber-5).getLow());}catch (NumberFormatException ex) {}
				if(f>z)
				{
					percent=((f - z) / z)*100;
				}
				else
				{
					percent=((z - f) / f)*100;
				}
				
			
			
			return percent;
			
			
		}
		public static float yearNFLX()
		{
			float percent=0;
			float f=0;
			float z=0;
			try {
				f=Float.parseFloat(NFLX.get(1).getLow());
				z=Float.parseFloat(NFLX.get(lineNumber-5).getLow());}catch (NumberFormatException ex) {}
				if(f>z)
				{
					percent=((f - z) / z)*100;
				}
				else
				{
					percent=((z - f) / f)*100;
				}
				
			
			
			return percent;
		}
	
		public static float standardDevTSLA()
		{
			float standardDev = 0;
			//float f=Float.parseFloat(TSLA.get(lineNumber-16).getOpen());
			//float z=Float.parseFloat(NFLX.get(lineNumber-5).getOpen());
			int e=lineNumber-5;
			float average=0;
			for(int i=0;i<14;++i)
			{
				try {
				float z=Float.parseFloat(TSLA.get(e).getOpen());
				average=average+z;}catch (NumberFormatException ex) {}
				--e;
			}
			average=average/14;
			for(int i=0;i<14;++i)
			{
				try {
				float f=Float.parseFloat(TSLA.get(e).getOpen());
				standardDev=standardDev+Math.abs(average-f);}catch (NumberFormatException ex) {}
				--e;
			}
			standardDev=standardDev/14;
			
			
			return standardDev;
			
		}
		public static float standardDevAAPL()
		{
			float standardDev = 0;
			//float f=Float.parseFloat(TSLA.get(lineNumber-16).getOpen());
			//float z=Float.parseFloat(NFLX.get(lineNumber-5).getOpen());
			int e=lineNumber-5;
			float average=0;
			for(int i=0;i<14;++i)
			{
				try {
				float z=Float.parseFloat(AAPL.get(e).getOpen());
				average=average+z;}catch (NumberFormatException ex) {}
				--e;
			}
			average=average/14;
			for(int i=0;i<14;++i)
			{try {
				float f=Float.parseFloat(AAPL.get(e).getOpen());
				standardDev=standardDev+Math.abs(average-f);}catch (NumberFormatException ex) {}
				--e;
			}
			standardDev=standardDev/14;
			
			
			return standardDev;
			
		}
		public static float standardDevNIO()
		{
			float standardDev = 0;
			//float f=Float.parseFloat(TSLA.get(lineNumber-16).getOpen());
			//float z=Float.parseFloat(NFLX.get(lineNumber-5).getOpen());
			int e=lineNumber-5;
			float average=0;
			for(int i=0;i<14;++i)
			{try {
				float z=Float.parseFloat(NIO.get(e).getOpen());
				average=average+z;}catch (NumberFormatException ex) {}
				--e;
			}
			average=average/14;
			for(int i=0;i<14;++i)
			{try {
				float f=Float.parseFloat(NIO.get(e).getOpen());
				standardDev=standardDev+Math.abs(average-f);}catch (NumberFormatException ex) {}
				--e;
			}
			standardDev=standardDev/14;
			
			
			return standardDev;
			
		}
		public static float standardDevNVDA()
		{
			float standardDev = 0;
			//float f=Float.parseFloat(TSLA.get(lineNumber-16).getOpen());
			//float z=Float.parseFloat(NFLX.get(lineNumber-5).getOpen());
			int e=lineNumber-5;
			float average=0;
			for(int i=0;i<14;++i)
			{try {
				float z=Float.parseFloat(NVDA.get(e).getOpen());
				average=average+z;
				--e;}catch (NumberFormatException ex) {}
			}
			average=average/14;
			for(int i=0;i<14;++i)
			{try {
				float f=Float.parseFloat(NVDA.get(e).getOpen());
				standardDev=standardDev+Math.abs(average-f);}catch (NumberFormatException ex) {}
				--e;
			}
			standardDev=standardDev/14;
			
			
			return standardDev;
			
		}
		public static float standardDevNFLX()
		{
			float standardDev = 0;
			//float f=Float.parseFloat(TSLA.get(lineNumber-16).getOpen());
			//float z=Float.parseFloat(NFLX.get(lineNumber-5).getOpen());
			int e=lineNumber-5;
			float average=0;
			for(int i=0;i<14;++i)
			{try {
				float z=Float.parseFloat(NFLX.get(e).getOpen());
				average=average+z;
				--e;}catch (NumberFormatException ex) {}
			}
			average=average/14;
			for(int i=0;i<14;++i)
			{try {
				float f=Float.parseFloat(NFLX.get(e).getOpen());
				standardDev=standardDev+Math.abs(average-f);
				--e;}catch (NumberFormatException ex) {}
			}
			standardDev=standardDev/14;
			
			
			return standardDev;
			
		}
		
		
		
	}
