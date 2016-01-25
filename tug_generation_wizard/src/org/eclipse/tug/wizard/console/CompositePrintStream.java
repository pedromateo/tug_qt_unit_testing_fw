package org.eclipse.tug.wizard.console;

/**
 * @version $Id: CompositePrintStream.java,v 1.1 2008/10/19 15:27:23 david Exp $
 */

import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Class CompositePrintStream represents a multiple print stream. It is a print
 * stream that encloses more than one print stream. Each message sent to this
 * print stream is also sent to its nested print streams.
 */
public class CompositePrintStream extends PrintStream {

	/**
	 * A stream collection.
	 */
	private Collection<PrintStream> _streams;

	/**
	 * As expected from a PrintStream, this stream converts exceptions into
	 * error status.
	 */
	private boolean _error = false;

	/**
	 * Creates a new composite print stream.
	 */
	public CompositePrintStream() {
		super(System.out); // this should not be necessary
		_streams = new ArrayList<PrintStream>();
	}

	/**
	 * Add a print stream object to this composite print stream.
	 * 
	 * @param st
	 *            the new print stream to add.
	 */
	public final void add(PrintStream st) {
		_streams.add(st);
	}

	/**
	 * @see java.io.PrintStream#checkError()
	 */
	@Override
	public boolean checkError() {
		boolean res = _error;
		for (PrintStream st : _streams)
			res = res || st.checkError();
		return res;
	}

	/**
	 * @see java.io.PrintStream#close()
	 */
	@Override
	public void close() {
		for (PrintStream st : _streams)
			if (st != System.out)
				st.close();
	}

	/**
	 * @see java.io.PrintStream#flush()
	 */
	@Override
	public void flush() {
		for (PrintStream st : _streams)
			st.flush();
	}

	/**
	 * @see java.io.PrintStream#print(boolean)
	 */
	@Override
	public void print(boolean b) {
		for (PrintStream st : _streams)
			st.print(b);
	}

	/**
	 * @see java.io.PrintStream#print(char)
	 */
	@Override
	public void print(char c) {
		for (PrintStream st : _streams)
			st.print(c);
	}

	/**
	 * @see java.io.PrintStream#print(char[])
	 */
	@Override
	public void print(char[] c) {
		for (PrintStream st : _streams)
			st.print(c);
	}

	/**
	 * @see java.io.PrintStream#print(double d)
	 */
	@Override
	public void print(double d) {
		for (PrintStream st : _streams)
			st.print(d);
	}

	/**
	 * @see java.io.PrintStream#print(float)
	 */
	@Override
	public void print(float f) {
		for (PrintStream st : _streams)
			st.print(f);
	}

	/**
	 * @see java.io.PrintStream#print(int)
	 */
	@Override
	public void print(int i) {
		for (PrintStream st : _streams)
			st.print(i);
	}

	/**
	 * @see java.io.PrintStream#print(long)
	 */
	@Override
	public void print(long l) {
		for (PrintStream st : _streams)
			st.print(l);
	}

	/**
	 * @see java.io.PrintStream#print(Object)
	 */
	@Override
	public void print(Object obj) {
		for (PrintStream st : _streams)
			st.print(obj);
	}

	/**
	 * @see java.io.PrintStream#print(String)
	 */
	@Override
	public void print(String s) {
		for (PrintStream st : _streams)
			st.print(s);
	}

	/**
	 * @see java.io.PrintStream#println(boolean)
	 */
	@Override
	public void println(boolean b) {
		for (PrintStream st : _streams)
			st.println(b);
	}

	/**
	 * @see java.io.PrintStream#println(char)
	 */
	@Override
	public void println(char c) {
		for (PrintStream st : _streams)
			st.println(c);
	}

	/**
	 * @see java.io.PrintStream#println(char[])
	 */
	@Override
	public void println(char[] c) {
		for (PrintStream st : _streams)
			st.println(c);
	}

	/**
	 * @see java.io.PrintStream#println(double d)
	 */
	@Override
	public void println(double d) {
		for (PrintStream st : _streams)
			st.println(d);
	}

	/**
	 * @see java.io.PrintStream#println(float)
	 */
	@Override
	public void println(float f) {
		for (PrintStream st : _streams)
			st.println(f);
	}

	/**
	 * @see java.io.PrintStream#println(int)
	 */
	@Override
	public void println(int i) {
		for (PrintStream st : _streams)
			st.println(i);
	}

	/**
	 * @see java.io.PrintStream#println(long)
	 */
	@Override
	public void println(long l) {
		for (PrintStream st : _streams)
			st.println(l);
	}

	/**
	 * @see java.io.PrintStream#println(Object)
	 */
	@Override
	public void println(Object obj) {
		for (PrintStream st : _streams)
			st.println(obj);
	}

	/**
	 * @see java.io.PrintStream#println(String)
	 */
	@Override
	public void println(String s) {
		for (PrintStream st : _streams)
			st.println(s);
	}

	/**
	 * @see java.io.PrintStream#setError()
	 */
	@Override
	protected void setError() {
		_error = true;
	}

	/**
	 * @see java.io.PrintStream#write(byte[], int, int)
	 */
	@Override
	public void write(byte[] buf, int off, int len) {
		for (PrintStream st : _streams)
			st.write(buf, off, len);
	}

	/**
	 * @see java.io.PrintStream#write(int)
	 */
	@Override
	public void write(int b) {
		for (PrintStream st : _streams)
			st.write(b);
	}

	/**
	 * @see java.io.FilterOutputStream#write(byte[])
	 */
	@Override
	public void write(byte[] b) throws IOException {
		for (PrintStream st : _streams)
			st.write(b);
	}
}