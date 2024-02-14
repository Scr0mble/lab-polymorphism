public class HorizontallyFlipped implements TextBlock {
  /* Fields */

  TextBlock contents;

  /* Constructors */

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

  public String row(int i) throws Exception {
    return reverse(this.contents.row(i));
  }

  public int height() {
    return this.contents.height();
  } // height()

  public int width() {
    return this.contents.width();
  } // width()

  public boolean eqv(TextBlock other) {
    return (other instanceof HorizontallyFlipped) &&
        (this.contents.eqv(((HorizontallyFlipped) other).contents));
  } // eqv(TextBlock)
}
