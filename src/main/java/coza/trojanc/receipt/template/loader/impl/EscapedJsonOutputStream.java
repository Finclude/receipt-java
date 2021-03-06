package coza.trojanc.receipt.template.loader.impl;

import java.io.IOException;
import java.io.OutputStream;

/**
 * @author Charl Thiem
 */
public class EscapedJsonOutputStream extends OutputStream {

	private final OutputStream out;

	public EscapedJsonOutputStream(OutputStream out){
		this.out = out;
	}
	@Override
	public void write(int b) throws IOException {
		if (b == '\'') {
			out.write('\\');
			out.write('\'');
		} else if (b == '\"') {
			out.write('\\');
			out.write('\"');
		} else {
			out.write(b);
		}
	}

	@Override
	public void close() throws IOException {

	}
}
