public class VerticallyFlipped implements TextBlock {
  /* Fields */

  TextBlock contents;

  /* Constructors */

  public VerticallyFlipped(TextBlock _contents) {
    this.contents = _contents;
  }

  /* Methods */

  public String row(int i) throws Exception {
    return (this.contents.row((this.contents.height() - 1) - i));
  }

  public int height() {
    return this.contents.height();
  } // height()

  public int width() {
    return this.contents.width();
  } // width()

  public boolean eqv(TextBlock other) {
    return (other instanceof VerticallyFlipped) &&
        (this.contents.eqv(((VerticallyFlipped) other).contents));
  }

}
