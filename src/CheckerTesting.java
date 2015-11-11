import static org.junit.Assert.*;

import org.junit.Test;

public class CheckerTesting {
	@Test
    public void testMergeSort() throws Exception{
		Checker bChecker = new SubstringChecker("beets");
		Checker cChecker = new SubstringChecker("eggs");
		Checker fChecker = new AddChecker(bChecker, cChecker);
		Checker dChecker = new SubstringChecker("bacon");
		Checker eChecker = new AddChecker(fChecker, dChecker);
		//System.out.println(fChecker.accept("beets and eggs and bacon are all good."));
		assertEquals(true, eChecker.accept("beets and eggs and bacon are all good."));
    }

}
