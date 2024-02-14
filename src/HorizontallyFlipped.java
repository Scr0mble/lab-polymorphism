public class HorizontallyFlipped implements TextBlock {
  /* Fields */

  TextBlock contents;

  /* Constructors */

  /**
   * Build a new line with contents _contents.
   */
  public HorizontallyFlipped(TextBlock _contents) {
    this.contents = _contents;
  }

  /* Methods */

  public String reverse(String str) {
    char[] revArray = str.toCharArray();
    char temp;
    for (int i = 0; i < (str.length() / 2); i++) {
      temp = revArray[i];
      revArray[i] = revArray[(str.length() - 1) - i];
      revArray[(str.length() - 1) - i] = temp;
    }

    return String.valueOf(revArray);
  }

  /**
   * Get one row from the block.
   *
   * @pre 0 <= i < this.height()
   * @exception Exception if the precondition is not met
   */
  public String row(int i) throws Exception {
    return reverse(this.contents.row(i));
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
    return (other instanceof HorizontallyFlipped) &&
        (this.contents.eqv(((HorizontallyFlipped) other).contents));
  } // eqv(TextBlock)
}
