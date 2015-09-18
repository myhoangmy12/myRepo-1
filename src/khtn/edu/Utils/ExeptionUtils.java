package khtn.edu.Utils;

import khtn.edu.exeptionModel.TooOldExeption;
import khtn.edu.exeptionModel.TooYoungExeption;

public class ExeptionUtils {
	
	public static void CheckAge(int age) 
			throws TooYoungExeption,TooOldExeption
	{
		if(age<18)
		{
			throw new TooYoungExeption("Age : "+age+" is too young");
		}
		if(age>60)
		{
			throw new TooOldExeption("Age : "+age+" is too old");
		}
	}
}
