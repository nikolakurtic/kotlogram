package com.github.badoualy.telegram.tl.api.request

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.api.TLInputPhoneCall
import com.github.badoualy.telegram.tl.core.TLBool
import com.github.badoualy.telegram.tl.core.TLMethod
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLRequestPhoneReceivedCall() : TLMethod<TLBool>() {
    var peer: TLInputPhoneCall = TLInputPhoneCall()

    private val _constructor: String = "phone.receivedCall#17d54f61"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(peer: TLInputPhoneCall) : this() {
        this.peer = peer
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeTLObject(peer)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        peer = readTLObject<TLInputPhoneCall>(TLInputPhoneCall::class, TLInputPhoneCall.CONSTRUCTOR_ID)
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += peer.computeSerializedSize()
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLRequestPhoneReceivedCall) return false
        if (other === this) return true

        return peer == other.peer
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x17d54f61.toInt()
    }
}