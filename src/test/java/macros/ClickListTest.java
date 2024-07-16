package test.java.macros;

import main.java.macros.*;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class ClickListTest {
	
    ClickList c;
	@Before
	public void prep() 
		{
		c = new ClickList();
		}
	
    @Test
    public void test01()
    	{
    	assertEquals(c.addClick(120,120),1 );
    	}
    
    @Test
    public void test02()
    	{
        assertEquals(c.addClick(-1,120),-1 );
    	}
    
    @Test
    public void test03()
    	{
        assertEquals(c.addClick(120,-1),-1 );
    	}

}
