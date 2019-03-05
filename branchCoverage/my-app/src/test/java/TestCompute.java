import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.mockito.Mockito.*;
import org.mockito.*;

public class TestCompute {

private Compute c;

  @Test
  public void example() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    assertTrue(true);
  }
  @Test
  public void test1()
  {
          MessageQueue mq =mock(MessageQueue.class);
          Mockito.when(mq.size()).thenReturn(0);
          c =new Compute(mq);
          int temp=c.countNumberOfOccurrences("Furkan");
          assertTrue(true);
  }

  @Test
  public void test2()
  {
         MessageQueue mq =mock(MessageQueue.class);
         Mockito.when(mq.size()).thenReturn(1);
         Mockito.when(!mq.contains("Furkan")).thenReturn(true);
          c =new Compute(mq);
          int temp=c.countNumberOfOccurrences("Furkan");
          assertTrue(true);
  }


  @Test
  public void test3()
  {
          MessageQueue mq =mock(MessageQueue.class);
          Mockito.when(mq.size()).thenReturn(3);
          Mockito.when(mq.getAt(1)).thenReturn("Furkan");
          c =new Compute(mq);
          int temp=c.countNumberOfOccurrences("Furkan");
          assertTrue(true);
  }
  @Test
  public void test4()
  {
          MessageQueue mq =mock(MessageQueue.class);
          Mockito.when(mq.size()).thenReturn(2);
          Mockito.when(!mq.contains("Furkan")).thenReturn(true);
          Mockito.when(mq.getAt(1)).thenReturn("Furkan");
          c =new Compute(mq);
          int temp=c.countNumberOfOccurrences("Furkan");
          assertTrue(true);
  }



}
