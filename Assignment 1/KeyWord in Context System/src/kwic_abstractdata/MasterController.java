package kwic_abstractdata;
import java.io.FileNotFoundException;
import java.io.IOException;

/** This module controls the input, storage, circular shift, alphabetic sort,
 * and out modules and sequences them in turn. 
 * @author Sebastian Wong Zhi Qian
 *
 */

public class MasterController{
	
	// default constructor
	public MasterController()
	{
		
	}
	
	public void startKwic(String titlesFileName, String ignoreFileName) throws FileNotFoundException, IOException
	{
	    Input input = new Input(titlesFileName,ignoreFileName);
		Storage storage = new Storage(input);
		CircularShift circularShift = new CircularShift(storage);
		circularShift.setup();
		circularShift.shiftSentence();
		AlphabeticSort alphabeticSort = new AlphabeticSort(circularShift);
		alphabeticSort.alphabetizeInAscendingOrder();
		Outputs output = new Outputs(alphabeticSort);
		output.printResults();
	}	

}

	