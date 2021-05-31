// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.jsense4;

import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;
import org.bytedeco.jsense4.presets.JSense4;


/** S4OPENINFO structure definition*/
@Properties(inherit = JSense4.class)
public class S4OPENINFO extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public S4OPENINFO() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public S4OPENINFO(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public S4OPENINFO(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public S4OPENINFO position(long position) {
        return (S4OPENINFO)super.position(position);
    }

        public native @Cast("DWORD") long dwS4OpenInfoSize(); public native S4OPENINFO dwS4OpenInfoSize(long setter);                                                 /* size of the structure*/
        public native @Cast("DWORD") long dwShareMode(); public native S4OPENINFO dwShareMode(long setter);                                                      /* share mode*/
}
