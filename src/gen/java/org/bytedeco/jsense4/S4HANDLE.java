// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.jsense4;

import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;
import org.bytedeco.jsense4.presets.JSense4;

//LiLiang
//#elif defined _EIV_MAC_
//typedef io_connect_t S4HANDLE;
//End
// #else
@Namespace @Name("void") @Opaque @Properties(inherit = JSense4.class)
public class S4HANDLE extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public S4HANDLE() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public S4HANDLE(Pointer p) { super(p); }
}
