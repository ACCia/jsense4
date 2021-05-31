// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.jsense4;

import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;
import org.bytedeco.jsense4.presets.JSense4;


/** RSA private key structure*/                                              
@Properties(inherit = JSense4.class)
public class S4_RSA_PRIVATE_KEY extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public S4_RSA_PRIVATE_KEY() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public S4_RSA_PRIVATE_KEY(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public S4_RSA_PRIVATE_KEY(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public S4_RSA_PRIVATE_KEY position(long position) {
        return (S4_RSA_PRIVATE_KEY)super.position(position);
    }
                                                                
  public native @Cast("unsigned char") byte modulus(int i); public native S4_RSA_PRIVATE_KEY modulus(int i, byte setter);
  @MemberGetter public native @Cast("unsigned char*") BytePointer modulus();                                    /* modulus*/
  public native @Cast("unsigned char") byte publicExponent(int i); public native S4_RSA_PRIVATE_KEY publicExponent(int i, byte setter);
  @MemberGetter public native @Cast("unsigned char*") BytePointer publicExponent();                             /* public exponent*/
  public native @Cast("unsigned char") byte exponent(int i); public native S4_RSA_PRIVATE_KEY exponent(int i, byte setter);
  @MemberGetter public native @Cast("unsigned char*") BytePointer exponent();                                   /* private exponent*/
  public native @Cast("unsigned char") byte prime(int i, int j); public native S4_RSA_PRIVATE_KEY prime(int i, int j, byte setter);
  @MemberGetter public native @Cast("unsigned char*") BytePointer prime();                                     /* prime factors*/
  public native @Cast("unsigned char") byte primeExponent(int i, int j); public native S4_RSA_PRIVATE_KEY primeExponent(int i, int j, byte setter);
  @MemberGetter public native @Cast("unsigned char*") BytePointer primeExponent();                             /* exponents for CRT*/
  public native @Cast("unsigned char") byte coefficient(int i); public native S4_RSA_PRIVATE_KEY coefficient(int i, byte setter);
  @MemberGetter public native @Cast("unsigned char*") BytePointer coefficient();                                  /* CRT coefficient*/
}