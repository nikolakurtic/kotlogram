
package com.github.badoualy.telegram.tl.api;


import com.github.badoualy.telegram.tl.core.*;
import com.github.badoualy.telegram.tl.*;
import java.io.*;
import rx.Observable;

import static com.github.badoualy.telegram.tl.StreamUtils.*;



public class TLInputMessagesFilterPhotos extends TLAbsMessagesFilter {
    public static final int CLASS_ID = 0x9609a51c;

    public TLInputMessagesFilterPhotos() {

    }



    public int getClassId() {
        return CLASS_ID;
    }







    @Override
    public String toString() {
        return "inputMessagesFilterPhotos#9609a51c";
    }

}