package javaSandboxOneLevelTwoGarageTwo;

public abstract class Information
	{
		protected String $Model;
		protected String $Color;
		protected String $Make;
		protected String $Style;
		protected String $Name = "Gaius Julius Caesar";
		protected String $FirstName = "Caesar";
		protected String $MiddleName = "Gaius";
		protected String $LastName = "Julius";
		protected String $Profession = "Politician";
		protected String $JobTitle = "Executive Magistrate";

		protected int $Year;
		protected int $Age = 55;
		protected float $Price;
		protected float $HorsePower;
		protected float $Efficiency;
		protected float $Millage;
		protected float $Height = 5.7f;
		protected float $Weight = 143.48f;
		protected float $Salary = 2036650.34f;

		abstract protected void Start(People _People);
		abstract protected void Stop(People _People);
		abstract protected void Increase(People _People);
		abstract protected void Decrease(People _People);
		abstract protected void Lock(People _People);
		abstract protected void Open(People _People);
		
		abstract protected String getModel(String Vehicle);
		abstract protected String getMake(String Vehicle);
		abstract protected String getColor(String Vehicle);
		abstract protected String getStyle(String Vehicle);
		abstract protected int getYear(String Vehicle);
		abstract protected float getPrice(String Vehicle);
		abstract protected float getEfficiency(String Vehicle);
		abstract protected float getMillage(String Vehicle);
		abstract protected float getHorsePower(String Vehicle);
		
		abstract protected void setModel(String _Model);
		abstract protected void setMake(String _Make);
		abstract protected void setColor(String _Color);
		abstract protected void setStyle(String _Style);
		abstract protected void setYear(int _Year);
		abstract protected void setPrice(float _Price);
		abstract protected void setEfficiency(float _Efficiency);
		abstract protected void setMillage(float _Millage);
		abstract protected void setHorsePower(float _HorsePower);
	}