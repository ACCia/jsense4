package  org.bytedeco.jsense4.presets;
import org.bytedeco.javacpp.BytePointer;
import org.bytedeco.javacpp.CLongPointer;
import org.bytedeco.jsense4.SENSE4_CONTEXT;
import org.bytedeco.jsense4.global.JSense4;
public class HelloWorldTest {

    public static void main(String[] args) {
        JSense4 jppHelloworld = new JSense4();
        SENSE4_CONTEXT sense4_context =new SENSE4_CONTEXT();
        CLongPointer cLongPointer =new CLongPointer(1);
        cLongPointer.put(0);
        long ss = JSense4.S4Enum(null,cLongPointer);
        if(ss!= JSense4.S4_SUCCESS&&ss!= JSense4.S4_INSUFFICIENT_BUFFER){
            System.out.println("return 1");
        }

        long ss2 = JSense4.S4Enum(sense4_context,cLongPointer);
        byte[] b  = new byte[8];
        b[0] = 0x00;
        BytePointer bytePointer = new BytePointer(b);
        CLongPointer cLongPointer1 = new CLongPointer(2);
        JSense4.S4Open(sense4_context);
        long fff = JSense4.S4Control(sense4_context, JSense4.S4_GET_SERIAL_NUMBER,null,0,bytePointer,bytePointer.sizeof(),cLongPointer1);
        System.out.println(ss2);
        System.out.println(fff);

        System.out.println(bytePointer.getString());


        JSense4.S4Close(sense4_context);

    }
}
