package charmask;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MaskingInputStream extends FilterInputStream{
    private char[] charsToMask;
    private char maskChar;



    // constructor 
    protected MaskingInputStream(InputStream in, char[] charsToMask, char maskChar){
        super(in); 
        this.charsToMask = charsToMask;
        this.maskChar = maskChar;

    }
    //override the read() method to apply the masking
    @Override


    /*
     * This method must return a result of type intJava(603979884)
charmask.​MaskingInputStream

public int read()
         throws IOException
Reads the next byte of data from the input stream. 
The value byte is returned as an int in the range 0 to 255. 
If no byte is available because the end of the stream has 
been reached, the value -1 is returned. 
This method blocks until input data is available, 
the end of the stream is detected, or an exception is thrown.

Implementation Requirements:

This method simply performs in.read() and returns the result. 
Returns: the next byte of data, or -1 if the end of the stream is reached. 
Throws: IOException - if an I/O error occurs.
See Also: java.io.FilterInputStream.in
     */
    public int read() throws IOException {
        int character = super.read();
        if (character ==-1) {
            return -1;
        }

        //checks the input against the masked char
        for(char c : charsToMask) {
            if (character == c ){
                return maskChar;
            }
        }
        return character;
    }

        // Override the read(byte[] b, int off, int len) method for bulk reading
        @Override
        public int read(byte[] b, int off, int len) throws IOException {
            int result = super.read(b, off, len);
            if (result == -1) {
                return -1;
            }
    
            for (int i = off; i < off + result; i++) {
                for (char c : charsToMask) {
                    if (b[i] == c) {
                        b[i] = (byte) maskChar;
                    }
                }
            }
            return result;
        }

}
