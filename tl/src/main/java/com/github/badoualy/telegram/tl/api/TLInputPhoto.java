
package com.github.badoualy.telegram.tl.api;


import com.github.badoualy.telegram.tl.core.*;
import com.github.badoualy.telegram.tl.*;
import java.io.*;
import rx.Observable;

import static com.github.badoualy.telegram.tl.StreamUtils.*;



public class TLInputPhoto extends TLAbsInputPhoto {
    public static final int CLASS_ID = 0xfb95c6c4;

    public TLInputPhoto() {

    }


    public TLInputPhoto(        long _id,         long _accessHash) {
        this.id = _id;
        this.accessHash = _accessHash;

    }


    public int getClassId() {
        return CLASS_ID;
    }


    protected long id;

    protected long accessHash;


    public long getId() {
        return id;
    }

    public void setId(long value) {
        this.id = value;
    }

    public long getAccessHash() {
        return accessHash;
    }

    public void setAccessHash(long value) {
        this.accessHash = value;
    }


    @Override
    public void serializeBody(OutputStream stream) throws IOException {

        writeLong(this.id, stream);
        writeLong(this.accessHash, stream);
    }


    @Override
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {

        this.id = readLong(stream);
        this.accessHash = readLong(stream);
    }



    @Override
    public String toString() {
        return "inputPhoto#fb95c6c4";
    }

}