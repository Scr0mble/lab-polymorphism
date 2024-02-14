public class Truncated implements TextBlock {
  /* Fields */

  TextBlock contents;

  /**
   * The amount in characters of the line to be printed out.
   */
  int restrict;

  /* Constructors */

  /**
   * Build a new line with contents _contents and restrict _restrict.
   */
  public Truncated(TextBlock _contents, int _restrict) {
    this.contents = _contents;
    this.restrict = _restrict;
  }

  /* Methods */

  /**
   * Get one row from the block.
   *
   * @pre 0 <= i < this.height()
   * @exception Exception if the precondition is not met
   */
  public String row(int i) throws Exception {
    int w = this.contents.width();

    if (this.restrict > w) {
      System.err.println("Restrict is larger than the width.");
      return ("Restrict is larger than the width.");
    }

    return (this.contents.row(i)).substring(0, this.restrict);
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
    return (other instanceof Truncated) &&
        (this.contents.eqv(((Truncated) other).contents));
  }

}