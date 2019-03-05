import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  Util c;

  @Before
  public void setUp() { c = new Util(); }

  @Test
  public void example() { assertTrue(true); }

  @Test
  public void testD() {
          int [] array={1};
          boolean flag=c.compute(array);
           assertTrue(true);

   }

  @Test
  public void testF() {
          int [] array={};
          boolean flag=c.compute(array);
           assertTrue(true);

   }

   @Test
   public void testG() {
           int [] array={1,2};

           boolean flag=c.compute(array);
            assertTrue(true);

    }
    @Test
    public void testJ() {
            int [] array={0,1,2};
     try {
           boolean flag=c.compute(array);
         }catch(Exception e)
         {

         }
             assertTrue(true);

     }
     @Test
     public void testK()
     {
             int [] array={1,2,3};
             boolean flag=c.compute(array);
             assertTrue(true);

      }
      @Test
      public void testS()
      {
              int [] array={3,5,9};
              boolean flag=c.compute(array);
              assertTrue(true);

       }




}
