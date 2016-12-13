package objectoutputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * @author Hà Viết Tráng - HAVIETTRANG
 * @date Dec 12, 2016 2:02:57 PM
 * @website haviettrang.blogspot.com
 * @Notes View my notes at haviettrang.postach.io
 */
class AppendableObjectOutputStream extends ObjectOutputStream {
    
    private boolean append = false;
    
    public AppendableObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }
    
    public AppendableObjectOutputStream(String fileName, boolean append) throws IOException {
        super(new FileOutputStream(fileName, append));
    }
    
    @Override
    protected void writeStreamHeader() throws IOException {
        if (append) {
            reset();
        } else {
            super.writeStreamHeader();
        }
    }
}
