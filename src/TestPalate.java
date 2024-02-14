import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestPalate {
  TextLine testLine = new TextLine("Hello");
  TextLine empty = new TextLine("");
  HorizontallyFlipped testline_flip = new HorizontallyFlipped((new HorizontallyFlipped(testLine)));

  TextLine testLine2 = new TextLine("World");
  VComposition testComp = new VComposition(testLine, testLine2);

  @Test
  public void testTrunc() throws Exception {
    assertEquals((new Truncated(testLine, 3)).row(0), "Hel");
  }

  @Test
  public void testHori() throws Exception {
    assertEquals((new HorizontallyFlipped(testLine)).row(0), "olleH");
  }

  @Test
  public void testHori2() throws Exception {
    assertEquals((new HorizontallyFlipped(empty)).row(0), "");
  }

  @Test
  public void testVeri() throws Exception {
    assertEquals((new VerticallyFlipped(testComp)).row(0), "World");
  }

  @Test
  public void testVeri2() throws Exception {
    assertEquals((new VerticallyFlipped(empty)).row(0), "");
  }

  @Test
  public void testRight() throws Exception {
    assertEquals((new RightJustified(testLine, 7)).row(0), "  Hello");
  }

  @Test
  public void testRight2() throws Exception {
    assertEquals((new RightJustified(testLine, 4)).row(0), "The restricted width is smaller than the box width");
  }

  @Test
  public void testLeft() throws Exception {
    assertEquals((new LeftJustified(testLine, 7)).row(0), "Hello  ");
  }

  @Test
  public void testCen() throws Exception {
    assertEquals((new Centered(testLine, 7)).row(0), " Hello ");
  }

  @Test
  public void testbox() throws Exception {
    assertEquals((new BoxedBlock(testLine)).row(1), "|Hello|");
  }

  @Test
  public void testeq() throws Exception {
    assertTrue(TBUtils.eq(testLine, testLine));
  }

  @Test
  public void testequal() throws Exception {
    assertFalse(TBUtils.equal(testLine, testLine2));
  }

  @Test
  public void testeqv() throws Exception {
    assertFalse(TBUtils.eqv(testLine, testLine2));
  }

  @Test
  public void testeqv2() throws Exception {
    assertFalse(TBUtils.eqv(testLine, testline_flip));
  }

  @Test
  public void testeq2() throws Exception {
    assertFalse(TBUtils.eq(testLine, testline_flip));
  }

  @Test
  public void testequal2() throws Exception {
    assertTrue(TBUtils.equal(testLine, testline_flip));
  }

}