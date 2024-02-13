public class Truncated implements TextBlock {
/* Fields */

  TextBlock contents;
  int restrict;

/* Constructors */

  public Truncated(TextBlock _contents, int _restrict) {
    this.contents = _contents;
    this.restrict = _restrict;
  }

/* Methods */

  public String row(int i) throws Exception {
    int w = this.contents.width();

    if (this.restrict > w) {
      System.err.println("Restrict is larger than the width.");
    }

    return ("|" + this.contents.row(i) + "|").substring(0, this.restrict);
  }

  public int height() {
    return this.contents.height();
  } // height()

  public int width() {
    return this.contents.width();
  } // width()
}