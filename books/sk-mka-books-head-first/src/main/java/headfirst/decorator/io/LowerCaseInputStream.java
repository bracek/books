package headfirst.decorator.io;

import java.io.*;

public class LowerCaseInputStream extends FilterInputStream {

	public LowerCaseInputStream(final InputStream in) {
		super(in);
	}
 
	public int read() throws IOException {
		int c = super.read();
		return (c == -1 ? c : Character.toLowerCase((char)c));
	}
		
	public int read(final byte[] b,
final  int offset,
final  int len) throws IOException {
		int result = super.read(b, offset, len);
		for (int i = offset; i < offset+result; i++) {
			b[i] = (byte)Character.toLowerCase((char)b[i]);
		}
		return result;
	}
}
