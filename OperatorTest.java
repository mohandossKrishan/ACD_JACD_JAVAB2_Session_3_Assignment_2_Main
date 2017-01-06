public class OperatorTest 
{
	boolean same = "TRUE";
	string S1 = "Happy";
	string S2 = "Happy";

	public static void main(String[] args)
	{
	   OperatorTest ot = new OperatorTest();
	   if (ot.S1 == ot.S2 )
           {
		ot.same = "TRUE";
	      System.out.Println(ot.same + " ,S1 is mathcing with S2");
	   }
	   else
	   {
		ot.same = "TRUE"							 		;
		System.out.Println(ot.same + " ,S1 is mathcing with S2");	
	   }
	}
}