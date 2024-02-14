public class RightJustified implements TextBlock {
  /* Fields */

  TextBlock contents;
  int tWidth;

  /* Constructors */

  public RightJustified(TextBlock _contents, int _tWidth) {
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

    return (" ".repeat(tWidth - width) + this.contents.row(i));
  }

  public int height() {
    return this.contents.height();
  } // height()

  public int width() {
    return this.contents.width();
  } // width()

  public boolean eqv(TextBlock other) {
    return (other instanceof RightJustified) &&
        (this.contents.eqv(((RightJustified) other).contents));
  }
}
