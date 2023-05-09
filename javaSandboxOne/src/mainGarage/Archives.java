package mainGarage;

/** @author Table **/

public abstract class Archives 
	{
		abstract void Start(People _People);
		abstract void Stop(People _People);
		abstract void Increase(People _People);
		abstract void Decrease(People _People);
		abstract void Lock(People _People);
		abstract void Open(People _People);
	
		abstract protected void getInformation();

		abstract protected void setModel(String _Model);
		abstract protected void setMake(String _Make);
		abstract protected void setColor(String _Color);
		abstract protected void setStyle(String _Style);
		
		abstract protected void setYear(int _Year);
		
		abstract protected void setPrice(float _Price);
		abstract protected void setEfficiency(float _Efficiency);
		abstract protected void setMillage(float _Millage);
		abstract protected void setHorsePower(float _HorsePower);
		
		abstract protected String getModel();
		abstract protected String getMake();
		abstract protected String getColor();
		abstract protected String getStyle();
		
		abstract protected int getYear();
		
		abstract protected float getPrice();
		abstract protected float getEfficiency();
		abstract protected float getMillage();
		abstract protected float getHorsePower();
	}