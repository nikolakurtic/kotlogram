
package com.github.badoualy.telegram.tl.api;


import com.github.badoualy.telegram.tl.core.*;
import com.github.badoualy.telegram.tl.*;
import java.io.*;
import rx.Observable;

import static com.github.badoualy.telegram.tl.StreamUtils.*;



public class TLInputPeerNotifyEventsEmpty extends TLAbsInputPeerNotifyEvents {
    public static final int CLASS_ID = 0xf03064d8;

    public TLInputPeerNotifyEventsEmpty() {

    }



    public int getClassId() {
        return CLASS_ID;
    }







    @Override
    public String toString() {
        return "inputPeerNotifyEventsEmpty#f03064d8";
    }

}