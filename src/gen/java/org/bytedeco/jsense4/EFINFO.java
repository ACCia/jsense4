// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.jsense4;

import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;
import org.bytedeco.jsense4.presets.JSense4;
/** RSA key prime length,in bytes*/

//@{
/**
        structure definition
*/

/* file information definition*/
@Properties(inherit = JSense4.class)
public class EFINFO extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public EFINFO() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public EFINFO(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EFINFO(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public EFINFO position(long position) {
        return (EFINFO)super.position(position);
    }

        public native @Cast("WORD") short EfID(); public native EFINFO EfID(short setter);                                                              /* file ID*/
        public native @Cast("BYTE") byte EfType(); public native EFINFO EfType(byte setter);                                                            /* file type*/
        public native @Cast("WORD") short EfSize(); public native EFINFO EfSize(short setter);                                                            /* file size*/
}
