package org.bytedeco.jsense4.presets;

import org.bytedeco.javacpp.annotation.Platform;
import org.bytedeco.javacpp.annotation.Properties;
import org.bytedeco.javacpp.tools.Info;
import org.bytedeco.javacpp.tools.InfoMap;
import org.bytedeco.javacpp.tools.InfoMapper;

@Properties(
        target = "org.bytedeco.jsense4",
        global = "org.bytedeco.jsense4.global.JSense4",
        value = {
                @Platform(
                        value = {
                                "linux-x86",
                                "linux-x86_64",
                                "macosx-x86_64",
                                "windows-x86",
                                "windows-x86_64"
                        },
                        include = "sense4.h",
                        link = "Sense4"
                )
        }
)
public class JSense4 implements InfoMapper {

    @Override
    public void map(InfoMap infoMap) {
        infoMap.put(new Info("PVOID", "LPVOID", "PVOID64", "PSID", "PLUID",
                "HANDLE", "HINSTANCE", "HMODULE", "HWND", "HHOOK", "HRSRC")
                .cast().valueTypes("Pointer").pointerTypes("PointerPointer"));

        infoMap.put(new Info("VOID").cppTypes().valueTypes("void").pointerTypes("Pointer"));

        infoMap.put(new Info("CONST").skip());
        infoMap.put(new Info("LPCSTR").cast(true).pointerTypes("BytePointer"));
//        infoMap.put(new Info("S4HANDLE").cast(true));
//        infoMap.put(new Info("HANDLE").cast(true).valueTypes("S4HANDLE"));
        infoMap.put(new Info("TM").javaNames("TM").skip());
//        infoMap.put(new Info("VOID").javaNames("VOID").skip());
//        infoMap.put(new Info("S4ExecuteEx2").javaNames("S4ExecuteEx2").skip());


    }
}
