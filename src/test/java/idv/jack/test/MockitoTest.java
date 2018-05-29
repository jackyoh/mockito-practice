package idv.jack.test;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


public class MockitoTest {

  @Test
  public void testListSize() {
      List<String> mockedList = mock(List.class);
      when(mockedList.size()).thenReturn(2);

      HelloWorld helloWorld = new HelloWorld();
      int listSize = helloWorld.getList(mockedList);
      assertEquals(listSize, 2);
  }

  @Test
  public void testGetElement() {
      List<String> mockedList = mock(List.class);
      when(mockedList.get(2)).thenReturn("hello");

      HelloWorld helloWorld = new HelloWorld();
      String result = helloWorld.getElement(mockedList);
      assertEquals(result, "HELLO");
  }

  @Test
  public void testVerify() {
      List<String> mockedList = mock(List.class);
      mockedList.add("one");
      mockedList.add("two");
      mockedList.add("three");

      when(mockedList.size()).thenReturn(3);
      verify(mockedList, times(1)).add("one");
      verify(mockedList, times(0)).isEmpty();
  }

  @Test
  public void testSpy1() {
      List<String> list = new LinkedList<String>();
      list.add("one");
      list.add("two");
      System.out.println(list.size());

      List<String> spy = spy(list);
      when(spy.size()).thenReturn(100);
      System.out.println(spy.size());
  }
}
