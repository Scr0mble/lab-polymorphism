public class LeftJustified implements TextBlock {
  /* Fields */

  TextBlock contents;

  /**
   * The width of the block.
   */
  int tWidth;

  /* Constructors */

  /**
   * Build a new line with contents _contents and tWidth _tWidth.
   */
  public LeftJustified(TextBlock _contents, int _tWidth) {
    this.contents = _contents;
    this.tWidth = _tWidth;
  }

  /* Methods */

  /**
   * Get one row from the block.
   *
   * @pre 0 <= i < this.height()
   * @exception Exception if the precondition is not met
   */
  public String row(int i) throws Exception {
    int width = this.contents.width();

    if (this.tWidth < width) {
      System.err.println("The restricted width is smaller than the box width");
      return ("The restricted width is smaller than the box width");
    }

    return (this.contents.row(i) + " ".repeat(tWidth - width));
  }

  /**
   * Determine how many rows are in the block.
   */
  public int height() {
    return this.contents.height();
  } // height()

  /**
   * Determine how many columns are in the block.
   */
  public int width() {
    return this.contents.width();
  } // width()

  /**
   * Checks to see if this block is equivalent to another block
   */
  public boolean eqv(TextBlock other) {
    return (other instanceof LeftJustified) &&
        (this.contents.eqv(((LeftJustified) other).contents));
  }
}
