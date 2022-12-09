//STOCK MARKET DATA ANALYZER SEMESTER PROJECT
//Aidan Villegas and Noah Molla
//Mr. Kahn - Period 3
//Sources: https://www.youtube.com/watch?v=0KdG9DZgi6I 
//https://www.youtube.com/watch?v=CWYv7xlKydw&ab_channel=AlexLee

public class Stock
	{
	  public String Date;
	  public String Open;
	  public String High;
	  public String Low;
	  public String Close;
	  public String AdjClose;
	  public String Volume;
	
	  
	  //constructor
	  
	  public Stock()
		    {
		      Date="";
		      Open="";
		      High="";
		      Low="";
		      Close="";
		      AdjClose="";
		      Volume="";
		    }
	  	
	    public Stock(String Date,String Open,String High,String Low,String Close,String AdjClose,String Volume)
		    {
		      this.Date=Date;
		      this.Open=Open;
		      this.High=High;
		      this.Low=Low;
		      this.Close=Close;
		      this.AdjClose=AdjClose;
		      this.Volume=Volume;
		    }
	//Accessors
	    public String getDate()
		    {
		      return Date;
		    }
	    public String getOpen()
		    {
		      return Open;
		    }
	    public String getHigh()
		    {
		      return High;
		    }
	    public String getLow()
		    {
		      return Low;
		    }
	    public String getClose()
		    {
		      return Close;
		    }
	    public String getadjClose()
		    {
		      return AdjClose;
		    }
	    public String getVolume()
		    {
		      return Volume;
		    }
	//Modifiers
	    public void setDate(String Date)
		    {
		      this.Date = Date;
		    }
	    public void setOpen(String Open)
		    {
		      this.Open = Open;
		    }
	    public void setHigh(String High)
		    {
		      this.High = High;
		    }
	    public void Low(String Low)
		    {
		      this.Low = Low;
		    }
	    public void setClose(String Close)
		    {
		      this.Close = Close;
		    }
	    public void setAdjClose(String AdjClose)
		    {
		      this.AdjClose = AdjClose;
		    }
	    public void setVolume(String Volume)
		    {
		      this.Volume = Volume;
		    }

		public String getSymbol() {
			// TODO Auto-generated method stub
			return null;
		}
    
	}

