import java.util.Arrays;

//AsciiCharSequence class implements compact storage of ASCII character sequences in a byte array.
public class AsciiCharSequence implements CharSequence {

    private final byte[] byteArray;

    //my constructor
    public AsciiCharSequence(byte[] x) {
        this.byteArray = Arrays.copyOf(x, x.length);
    }

    @Override
    public int length() {
        return this.byteArray.length;
    }

    @Override
    public char charAt(int i) {
        return (char)this.byteArray[i];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] subArray = Arrays.copyOfRange(this.byteArray, start, end);
        return new AsciiCharSequence(subArray) {
        };  // String implements CharSequence interface
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(this.byteArray.length);
        for (byte b : this.byteArray) {
            sb.append((char) b);
        }
        return sb.toString();
    }
}
