// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.jsense4;

import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;
import org.bytedeco.jsense4.presets.JSense4;


/**
        device information structure definition
*/
@Properties(inherit = JSense4.class)
public class SENSE4_CONTEXT extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SENSE4_CONTEXT() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SENSE4_CONTEXT(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SENSE4_CONTEXT(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SENSE4_CONTEXT position(long position) {
        return (SENSE4_CONTEXT)super.position(position);
    }

        public native @Cast("DWORD") long dwIndex(); public native SENSE4_CONTEXT dwIndex(long setter);                                        /** device index; index begins at zero*/
        public native @Cast("DWORD") long dwVersion(); public native SENSE4_CONTEXT dwVersion(long setter);                                      /** device version*/ 
        public native @Cast("S4HANDLE") Pointer hLock(); public native SENSE4_CONTEXT hLock(Pointer setter);                                          /** device handle*/
        public native @Cast("BYTE") byte reserve(int i); public native SENSE4_CONTEXT reserve(int i, byte setter);
        @MemberGetter public native @Cast("BYTE*") BytePointer reserve();                           /** reserved*/
        public native @Cast("BYTE") byte bAtr(int i); public native SENSE4_CONTEXT bAtr(int i, byte setter);
        @MemberGetter public native @Cast("BYTE*") BytePointer bAtr();                              /** ATR*/
        public native @Cast("BYTE") byte bID(int i); public native SENSE4_CONTEXT bID(int i, byte setter);
        @MemberGetter public native @Cast("BYTE*") BytePointer bID();                                /** device ID*/
        public native @Cast("DWORD") long dwAtrLen(); public native SENSE4_CONTEXT dwAtrLen(long setter);                                       /** ATR length*/
}
