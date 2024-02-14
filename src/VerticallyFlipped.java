public class VerticallyFlipped implements TextBlock {
  /* Fields */

  TextBlock contents;

  /* Constructors */

  /**
   * Build a new line with contents _contents.
   */
  public VerticallyFlipped(TextBlock _contents) {
    this.contents = _contents;
  }

  /* Methods */

  /**
   * Get one row from the block.
   *
   * @pre 0 <= i < this.height()
   * @exception Exception if the precondition is not met
   */
  public String row(int i) throws Exception {
    return (this.contents.row((this.contents.height() - 1) - i));
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
    return (other instanceof VerticallyFlipped) &&
        (this.contents.eqv(((VerticallyFlipped) other).contents));
  }

}
