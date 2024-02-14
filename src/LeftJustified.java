public class LeftJustified implements TextBlock {
  /* Fields */

  TextBlock contents;
  int tWidth;

  /* Constructors */

  public LeftJustified(TextBlock _contents, int _tWidth) {
    this.contents = _contents;
    this.tWidth = _tWidth;
  }

  /* Methods */

  public String row(int i) throws Exception {
    int width = this.contents.width();

    if (this.tWidth < width) {
      System.err.println("The restricted width is smaller than the box width");
      return ("The restricted width is smaller than the box width");
    }

    return (this.contents.row(i) + " ".repeat(tWidth - width));
  }

  public int height() {
    return this.contents.height();
  } // height()

  public int width() {
    return this.contents.width();
  } // width()

  public boolean eqv(TextBlock other) {
    return (other instanceof LeftJustified) &&
        (this.contents.eqv(((LeftJustified) other).contents));
  }
}
