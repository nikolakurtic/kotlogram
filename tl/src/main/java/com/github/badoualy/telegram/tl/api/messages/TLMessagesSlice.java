
package com.github.badoualy.telegram.tl.api.messages;


import com.github.badoualy.telegram.tl.core.*;
import com.github.badoualy.telegram.tl.*;
import java.io.*;
import rx.Observable;

import static com.github.badoualy.telegram.tl.StreamUtils.*;



public class TLMessagesSlice extends TLAbsMessages {
    public static final int CLASS_ID = 0xb446ae3;

    public TLMessagesSlice() {

    }


    public TLMessagesSlice(        int _count,         com.github.badoualy.telegram.tl.core.TLVector<com.github.badoualy.telegram.tl.api.TLAbsMessage> _messages,         com.github.badoualy.telegram.tl.core.TLVector<com.github.badoualy.telegram.tl.api.TLAbsChat> _chats,         com.github.badoualy.telegram.tl.core.TLVector<com.github.badoualy.telegram.tl.api.TLAbsUser> _users) {
        this.count = _count;
        this.messages = _messages;
        this.chats = _chats;
        this.users = _users;

    }


    public int getClassId() {
        return CLASS_ID;
    }


    protected int count;


    public int getCount() {
        return count;
    }

    public void setCount(int value) {
        this.count = value;
    }


    @Override
    public void serializeBody(OutputStream stream) throws IOException {

        writeInt(this.count, stream);
        writeTLVector(this.messages, stream);
        writeTLVector(this.chats, stream);
        writeTLVector(this.users, stream);
    }


    @Override
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {

        this.count = readInt(stream);
        this.messages = readTLVector(stream, context);
        this.chats = readTLVector(stream, context);
        this.users = readTLVector(stream, context);
    }



    @Override
    public String toString() {
        return "messages.messagesSlice#b446ae3";
    }

}