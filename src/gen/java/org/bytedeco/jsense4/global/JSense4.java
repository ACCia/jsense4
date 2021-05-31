// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.jsense4.global;

import org.bytedeco.jsense4.*;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

public class JSense4 extends org.bytedeco.jsense4.presets.JSense4 {
    static { Loader.load(); }

// Parsed from sense4.h

/**************************************************************************************
* Copyright (c) 1995-2009, Beijing Senselock Software Technology Co.,Ltd.
* All rights reserved.
*
* filename: sense4.h
*
* briefs: EliteIV library interface declaration, return value and some constant definition.
*
* date:        09/09/2009
* history:     
* 05/31/2005   Rename the product to EliteIV.
* 06/08/2006   Support for net dongle,upgrade to version 3.0
* 09/09/2009   Upgrade to version 3.3,S4MODULEINFO upgrade to 64
*******************************************************************************************/

// #ifndef __SENSE4_H__
// #define __SENSE4_H__

// #ifdef  _MSC_VER
// #pragma comment(linker, "/defaultlib:setupapi.lib")
// #elif defined __WATCOMC__
// #pragma library("\watcom\lib386\nt\setupapi.lib")
// #endif

// #ifdef __cplusplus
// #endif

// #if defined __x86_64__ && (defined __linux__ || defined __APPLE__)
public static final int RESERVE_NUM =		24;
// #else
// #endif

// #if defined WIN32 || defined _WIN32 || defined _WIN64
// #include <windows.h>
// Targeting ..\S4HANDLE.java


// #endif  /* defined WIN32 || defined _WIN32 || defined _WIN64 */

// #ifndef         IN
// #define         IN
// #endif

// #ifndef         OUT
// #define         OUT
// #endif

// #if !defined _WINDOWS_

//Mod By MaJC,20080820,for WATCOM compiler.
// #ifndef __WATCOMC__
// #define WINAPI
// #endif

// #define CONST const
// Targeting ..\VOID.java


// #endif


// #ifndef _BYTE_DEFINED
// #define _BYTE_DEFINED
// #endif

// #ifndef _WORD_DEFINED
// #define _WORD_DEFINED
// #endif

// #ifndef _DWORD_DEFINED
// #define _DWORD_DEFINED
// #endif

// #endif /* !defined _WINDOWS */

//@{ 
/** 
        device share mode definition
*/
public static final int S4_EXCLUSIZE_MODE =                       0;                               /** exclusive mode*/
public static final int S4_SHARE_MODE =                           1;                               /** sharable mode*/ 
//@}

//@{
/**
        the control code value definition
*/
public static final int S4_LED_UP =                               0x00000004;                      /** LED up*/
public static final int S4_LED_DOWN =                             0x00000008;                      /** LED down*/ 
public static final int S4_LED_WINK =                             0x00000028;                      /** LED wink*/ 
public static final int S4_GET_DEVICE_TYPE =                      0x00000025;                      /** get the device type*/
public static final int S4_GET_SERIAL_NUMBER =                    0X00000026;                      /** get the device serial number*/ 
public static final int S4_GET_VM_TYPE =                          0X00000027;                      /** get the virtual machine type*/ 
public static final int S4_GET_DEVICE_USABLE_SPACE =              0x00000029;                      /** get the total space of the device*/ 
public static final int S4_SET_DEVICE_ID =                        0x0000002a;                      /** set the device ID*/
public static final int S4_RESET_DEVICE =                         0x00000002;                      /** reset the device*/
public static final int S4_DF_AVAILABLE_SPACE =                   0x00000031;                      /** get the free space of current directory*/
public static final int S4_EF_INFO =                              0x00000032;                      /** get specified file information in current directory*/ 
public static final int S4_SET_USB_MODE =                         0x00000041;                      /** set the device as a normal usb device*/
public static final int S4_SET_HID_MODE =                         0x00000042;                      /** set the device as a HID device*/
public static final int S4_GET_CUSTOMER_NAME =                    0x0000002b;                      /** get the customer number*/
public static final int S4_GET_MANUFACTURE_DATE =                 0x0000002c;                      /** get the manufacture date of the device*/
public static final int S4_GET_CURRENT_TIME =                     0x0000002d;                      /** get the current time of the clock device*/
public static final int S4_GET_LICENSE =                          0x0000002e;                      /** get the license */ 
public static final int S4_FREE_LICENSE =                         0x0000002f;                      /** free the license */ 
public static final int S4_RESET_LICENSE =                        0x00000033;                      /** Reset the license */ 
public static final int S4_SET_NET_CONFIG =                       0x00000030;                      /** set netlock config */
public static final int S4_GET_NET_CONFIG =                       0x00000034;                      /** get netlock config */
public static final int S4_GET_TOTAL_LICENSE =					0x00000035;						/** get total license of device, note: license'll be reset after invoking this control code */
//@}


//@} 

//@{
/**
        device type definition
*/
public static final int S4_LOCAL_DEVICE =                         0x00;                            /** local device*/
public static final int S4_MASTER_DEVICE =                        0x01;                            /** net master device*/ 
public static final int S4_SLAVE_DEVICE =                         0x02;                            /** net slave device*/

//@} 

//@{
/**
        virtual machine type definition
*/
public static final int S4_VM_51 =                                0x00;                            /** inter 51*/
public static final int S4_VM_251_BINARY =                        0x01;                            /** inter 251, binary mode*/ 
public static final int S4_VM_251_SOURCE =                        0X02;                            /** inter 251, source mode*/


//@}

//@{
/**
        NetLock license mode
*/
public static final int S4_MODULE_MODE =                          0x00000000;                            /** Module mode*/ 
public static final int S4_IP_MODE =                              0x00000001;                            /** IP mode*/

//@}

//@{
/**
        PIN and key type definition
*/
public static final int S4_USER_PIN =                             0x000000a1;                      /** user PIN*/
public static final int S4_DEV_PIN =                              0x000000a2;                      /** developer PIN*/  
public static final int S4_AUTHEN_PIN =                           0x000000a3;                      /** authentication key of net device*/

//@}

//@{
/**
        file type definition
*/

public static final int S4_RSA_PUBLIC_FILE =                      0x00000006;                      /** RSA public key file*/
public static final int S4_RSA_PRIVATE_FILE =                     0x00000007;                      /** RSA private key file*/ 
public static final int S4_EXE_FILE =                             0x00000008;                      /** executable file of virtual machine*/
public static final int S4_DATA_FILE =                            0x00000009;                      /** data file*/ 

//4s not support
public static final int S4_XA_EXE_FILE =                          0x0000000b;                      /** executable file of XA User mode*/ 


//@}

//@{
/**
        flag value definition
*/
public static final int S4_CREATE_NEW =                           0x000000a5;                      /** create a new file*/
public static final int S4_UPDATE_FILE =                          0x000000a6;                      /** write data to the specified file*/
public static final int S4_KEY_GEN_RSA_FILE =                     0x000000a7;                      /** generate RSA key pair files*/
public static final int S4_SET_LICENCES =                         0x000000a8;                      /** set the max license number of the current module for the net device*/
public static final int S4_CREATE_ROOT_DIR =                      0x000000ab;                      /** create root directory*/
public static final int S4_CREATE_SUB_DIR =                       0x000000ac;                      /** create child directory for current directory*/
public static final int S4_CREATE_MODULE =                        0x000000ad;                      /** create a module directory for the net device */
/** the following three flags can only be used when creating a new executable file */
public static final int S4_FILE_READ_WRITE =                      0x00000000;                      /** the new executable file can be read and written by executable file */
public static final int S4_FILE_EXECUTE_ONLY =                    0x00000100;                      /** the new executable file can't be read or written by executable file*/
public static final int S4_CREATE_PEDDING_FILE =                  0x00002000;                      /** create a padding file*/


//@}

//@{
/** 
        execuable file executing mode definition
*/
public static final int S4_VM_EXE =                               0x00000000;                      /** executing on virtual machine*/
public static final int S4_XA_EXE =                               0x00000001;                      /** executing on XA User mode   */

//@}

//@{
/**
        return value definition
*/

public static final int S4_SUCCESS =                              0x00000000;                      /** success*/
public static final int S4_UNPOWERED =                            0x00000001;                      /** the device has been powered off*/  
public static final int S4_INVALID_PARAMETER =                    0x00000002;                      /** invalid parameter*/
public static final int S4_COMM_ERROR =                           0x00000003;                      /** communication error*/
public static final int S4_PROTOCOL_ERROR =                       0x00000004;                      /** communication protocol error*/
public static final int S4_DEVICE_BUSY =                          0x00000005;                      /** the device is busy*/
public static final int S4_KEY_REMOVED =                          0x00000006;                      /** the device has been removed */
public static final int S4_INSUFFICIENT_BUFFER =                  0x00000011;                      /** the input buffer is insufficient*/
public static final int S4_NO_LIST =                              0x00000012;                      /** find no device*/
public static final int S4_GENERAL_ERROR =                        0x00000013;                      /** general error, commonly indicates not enough memory*/
public static final int S4_UNSUPPORTED =                          0x00000014;                      /** the function isn't supported*/
public static final int S4_DEVICE_TYPE_MISMATCH =                 0x00000020;                      /** the device type doesn't match*/
public static final int S4_FILE_SIZE_CROSS_7FFF =                 0x00000021;                      /** the execuable file crosses address 0x7FFF*/
public static final int S4_CURRENT_DF_ISNOT_MF =                  0x00000201;                      /** a net module must be child directory of the root directory*/
public static final int S4_INVAILABLE_MODULE_DF =                 0x00000202;                      /** the current directory is not a module*/
public static final int S4_FILE_SIZE_TOO_LARGE =                  0x00000203;                      /** the file size is beyond address 0x7FFF*/
public static final int S4_DF_SIZE =                              0x00000204;                      /** the specified directory size is too small*/
public static final int S4_DEVICE_UNSUPPORTED =                   0x00006a81;                      /** the request can't be supported by the device*/
public static final int S4_FILE_NOT_FOUND =                       0x00006a82;                      /** the specified file or directory can't be found */
public static final int S4_INSUFFICIENT_SECU_STATE =              0x00006982;                      /** the security state doesn't match*/
public static final int S4_DIRECTORY_EXIST =                      0x00006901;                      /** the specified directory has already existed*/
public static final int S4_FILE_EXIST =                           0x00006a80;                      /** the specified file or directory has already existed*/
public static final int S4_INSUFFICIENT_SPACE =                   0x00006a84;                      /** the space is insufficient*/
public static final int S4_OFFSET_BEYOND =                        0x00006B00;                      /** the offset is beyond the file size*/
public static final int S4_PIN_BLOCK =                            0x00006983;                      /** the specified pin or key has been locked*/
public static final int S4_FILE_TYPE_MISMATCH =                   0x00006981;                      /** the file type doesn't match*/
public static final int S4_CRYPTO_KEY_NOT_FOUND =                 0x00009403;                      /** the specified pin or key cann't be found*/
public static final int S4_APPLICATION_TEMP_BLOCK =               0x00006985;                      /** the directory has been temporarily locked*/
public static final int S4_APPLICATION_PERM_BLOCK =               0x00009303;                      /** the directory has been locked*/
public static final int S4_DATA_BUFFER_LENGTH_ERROR =             0x00006700;                      /** invalid data length*/
public static final int S4_CODE_RANGE =                           0x00010000;                      /** the PC register of the virtual machine is out of range*/
public static final int S4_CODE_RESERVED_INST =                   0x00020000;                      /** invalid instruction*/
public static final int S4_CODE_RAM_RANGE =                       0x00040000;                      /** internal ram address is out of range*/
public static final int S4_CODE_BIT_RANGE =                       0x00080000;                      /** bit address is out of range*/
public static final int S4_CODE_SFR_RANGE =                       0x00100000;                      /** SFR address is out of range*/
public static final int S4_CODE_XRAM_RANGE =                      0x00200000;                      /** external ram address is out of range*/
public static final int S4_ERROR_UNKNOWN =                        0xffffffff;                      /** unknown error*/     

public static final int MAX_MODULE_COUNT =												64;
//@}

public static final int MAX_ATR_LEN =                             56;                              /** max ATR length */
public static final int MAX_ID_LEN =                              8;                               /** max device ID length */
public static final int S4_RSA_MODULUS_LEN =                      128;                             /** RSA key modules length,in bytes */
public static final int S4_RSA_PRIME_LEN =                        64;
// Targeting ..\EFINFO.java


// Targeting ..\S4_MANUFACTURE_DATE.java



/* current time structure definition*/
// #ifndef _TM_DEFINED
// #define _TM_DEFINED
// #endif



/** 
        device version definition
*/
/** enum CARD_VERSION */
public static final int
        SENSE4_CARD_TYPE_V2_00 = 0x00020000,                                    /** version 2.00*/
        SENSE4_CARD_TYPE_V2_01 = 0x00020001,                                    /** version 2.10*/
        SENSE4_CARD_TYPE_V2_02 = 0x00020002,                                    /** version 2.20*/
        SENSE4_CARD_TYPE_V2_05 = 0x00020005,                                    /** version 2.05*/
        SENSE4_CARD_TYPE_V2_30 = 0x00020300,                                     /** version 2.30*/
		SENSE4_CARD_TYPE_V5_12 = 0x00050102;									 /** version 5.12*/
// Targeting ..\SENSE4_CONTEXT.java


// Targeting ..\S4_RSA_PUBLIC_KEY.java


// Targeting ..\S4_RSA_PRIVATE_KEY.java


// Targeting ..\S4MODULEINFO.java


// Targeting ..\S4NETCONFIG.java


// Targeting ..\S4CREATEDIRINFO.java


// Targeting ..\S4OPENINFO.java



//@}


//@{
/** 
        \function interface
*/

/*
                        reserved
*/
public static native @Cast("unsigned long") long S4Startup(
);


/*
                        reserved
*/
public static native @Cast("unsigned long") long S4Cleanup(
);


/**
                enumerate all EliteIV devices plugged in the computer.
                if pS4CtxList is NULL, the pdwCtxListSize will return the required buffer size
                
                \paramter pS4CtxList             [out]           return the device list
                \paramter pdwCtxListSize         [in][out]       return the amount of storage of device list, in bytes.
                <p>
                @return value 
                if the function succeeds,the return vlaue is S4_SUCCESS, otherwise return other defined return value.
<p>
*/
public static native @Cast("DWORD") long S4Enum(
        SENSE4_CONTEXT pS4CtxList,
        @Cast("DWORD*") CLongPointer pdwCtxListSize
);


/**
                open the EliteIV device with sharable mode
                                                        
                \paramter pS4Ctx                 [in][out]    the context pointer of the device
                        
                @return value 
                if the function succeeds,the return vlaue is S4_SUCCESS, otherwise return other defined return value.
<p>
*/
public static native @Cast("DWORD") long S4Open(
        SENSE4_CONTEXT pS4Ctx
);


/**
                close the EliteIV device
                                                        
                \parameter pS4Ctx                [in]  the context pointer of the device
                        
                <p>
                        
                @return value 
                if the function succeeds,the return vlaue is S4_SUCCESS, otherwise return other defined return value.
                                                
<p>
                                                
*/
public static native @Cast("DWORD") long S4Close(
        SENSE4_CONTEXT pS4Ctx
);


/**
                Send control command to device
                                                                        
                \parameter pS4Ctx                [in]  the context pointer of the device, the device must has been opened
                \parameter dwCtlCode             [in]  control code
                \parameter pInBuffer             [in]  input buffer
                \parameter dwInBufferLen         [in]  the length of input data,in bytes
                \parameter pOutBuffer            [out] return output data
                \parameter dwOutBufferLen        [in]  output buffer size, in bytes
                \parameter pdwBytesReturned      [out] the length of output data, cannot be NULL
                <p>
                @return value 
                if the function succeeds,the return vlaue is S4_SUCCESS, otherwise return other defined return value.
                                                
*/
public static native @Cast("DWORD") long S4Control(
        SENSE4_CONTEXT pS4Ctx,
        @Cast("DWORD") long dwCtlCode,
        Pointer pInBuffer,
        @Cast("DWORD") long dwInBufferLen,
        Pointer pOutBuffer,
        @Cast("DWORD") long dwOutBufferLen,
        @Cast("DWORD*") CLongPointer pdwBytesReturned
);      


/**
                create a new child directory for the current directory, and set current directory to the new directory
                
                \parameter pS4Ctx               [in]  the context pointer of the device, the device must has been opened
                \parameter lpszDirID            [in]  ID of the new directory
                \parameter dwDirSize            [in]  size of the new directory
                \parameter dwFlags              [in]  flag
                <p>
                @return value 
                if the function succeeds,the return vlaue is S4_SUCCESS, otherwise return other defined return value.
                                                
*/
public static native @Cast("DWORD") long S4CreateDir(
        SENSE4_CONTEXT pS4Ctx,
        @ByVal @Cast("LPCSTR*") BytePointer lpszDirID,
        @Cast("DWORD") long dwDirSize,
        @Cast("DWORD") long dwFlags
);


/**
                set the current directory
                                                        
                \parameter pS4Ctx                [in]  the context pointer of the device, the device must has been opened
                \parameter lpszPath              [in]  ID of the specified directory
                <p>
                @return value 
                if the function succeeds,the return vlaue is S4_SUCCESS, otherwise return other defined return value.
                                                
*/
public static native @Cast("DWORD") long S4ChangeDir(
        SENSE4_CONTEXT pS4Ctx,
        @ByVal @Cast("LPCSTR*") BytePointer lpszPath
);


/**
                erase the root and empty the device if the specified direcotry is the device root,
                otherwise erase all files or child direcotries of the specified directory.
                                                        
                \parameter pS4Ctx                [in]  the context pointer of the device, the device must has been opened
                \parameter lpszDirID             [in]  reserved, must be NULL
                <p>
                @return value 
                if the function succeeds,the return vlaue is S4_SUCCESS, otherwise return other defined return value.
                                                
*/
public static native @Cast("DWORD") long S4EraseDir(
        SENSE4_CONTEXT pS4Ctx,
        @ByVal @Cast("LPCSTR*") BytePointer lpszDirID
);


/**
                verify the pin, to reach a security status before call S4CreateDir,S4EraseDir,S4Execute,S4WriteFile.
                                                        
                \parameter pS4Ctx                [in]  the context pointer of the device, the device must has been opened
                \parameter pbPin                 [in]  PIN value
                \parameter dwPinLen              [in]  the PIN value length, the length of User PIN is 8 bytes��the length of developer PIN is 24 bytes
                \parameter dwPinType             [in]  PIN type
                <p>
                @return value 
                if the function succeeds,the return vlaue is S4_SUCCESS, otherwise return other defined return value.
                                                
*/
public static native @Cast("DWORD") long S4VerifyPin(
        SENSE4_CONTEXT pS4Ctx,
        @Cast("BYTE*") BytePointer pbPin,
        @Cast("DWORD") long dwPinLen,
        @Cast("DWORD") long dwPinType
);
public static native @Cast("DWORD") long S4VerifyPin(
        SENSE4_CONTEXT pS4Ctx,
        @Cast("BYTE*") ByteBuffer pbPin,
        @Cast("DWORD") long dwPinLen,
        @Cast("DWORD") long dwPinType
);
public static native @Cast("DWORD") long S4VerifyPin(
        SENSE4_CONTEXT pS4Ctx,
        @Cast("BYTE*") byte[] pbPin,
        @Cast("DWORD") long dwPinLen,
        @Cast("DWORD") long dwPinType
);


/**
                change PIN or key value��
                                                        
                \parameter pS4Ctx                [in]  the context pointer of the device, the device must has been opened
                \parameter pbOldPin              [in]  old PIN or key value
                \parameter dwOldPinLen           [in]  the length of old PIN or key value
                \parameter pbNewPin              [in]  new PIN or key value
                \parameter dwNewPinLen           [in]  the legnth of new PIN or key value
                \parameter dwPinType             [in]  PIN or key type
                <p>
                @return value 
                if the function succeeds,the return vlaue is S4_SUCCESS, otherwise return other defined return value.
                                                
*/
public static native @Cast("DWORD") long S4ChangePin(
        SENSE4_CONTEXT pS4Ctx,
        @Cast("BYTE*") BytePointer pbOldPin,
        @Cast("DWORD") long dwOldPinLen,
        @Cast("BYTE*") BytePointer pbNewPin,
        @Cast("DWORD") long dwNewPinLen,
        @Cast("DWORD") long dwPinType
);
public static native @Cast("DWORD") long S4ChangePin(
        SENSE4_CONTEXT pS4Ctx,
        @Cast("BYTE*") ByteBuffer pbOldPin,
        @Cast("DWORD") long dwOldPinLen,
        @Cast("BYTE*") ByteBuffer pbNewPin,
        @Cast("DWORD") long dwNewPinLen,
        @Cast("DWORD") long dwPinType
);
public static native @Cast("DWORD") long S4ChangePin(
        SENSE4_CONTEXT pS4Ctx,
        @Cast("BYTE*") byte[] pbOldPin,
        @Cast("DWORD") long dwOldPinLen,
        @Cast("BYTE*") byte[] pbNewPin,
        @Cast("DWORD") long dwNewPinLen,
        @Cast("DWORD") long dwPinType
);


/**
                create a new file or update file data
                                                        
                \parameter pS4Ctx                [in]  the context pointer of the device, the device must has been opened
                \parameter lpszFileID            [in]  ID of the specified file
                \parameter dwOffset              [in]  offset to write the file
                \parameter pBuffer               [in]  input data buffer
                \parameter dwBufferSize          [in]  input data length
                \parameter dwFileSize            [in]  file size
                \parameter pdwBytesWritten       [out] return the length of data written into the file
                \parameter dwFlags               [in]  flag
                \parameter bFileType             [in]  file type
                <p>
                @return value 
                if the function succeeds,the return vlaue is S4_SUCCESS, otherwise return other defined return value.
                                                
*/
public static native @Cast("DWORD") long S4WriteFile(
        SENSE4_CONTEXT pS4Ctx,
        @ByVal @Cast("LPCSTR*") BytePointer lpszFileID,
        @Cast("DWORD") long dwOffset,
        Pointer pBuffer,
        @Cast("DWORD") long dwBufferSize,
        @Cast("DWORD") long dwFileSize,
        @Cast("DWORD*") CLongPointer pdwBytesWritten,
        @Cast("DWORD") long dwFlags,
        @Cast("BYTE") byte bFileType
);


/**
                execute the specified executable file of current directory on virtual machine
                                                        
                \parameter pS4Ctx                [in]  the context pointer of the device, the device must has been opened
                \parameter lpszFileID            [in]  ID of the executable file
                \parameter pInBuffer             [in]  input data buffer
                \parameter dwInbufferSize        [in]  input data length
                \parameter pOutBuffer            [out] output data buffer
                \parameter dwOutBufferSize       [in]  output data buffer size
                \parameter pdwBytesReturned      [out] output data length
                <p>
                @return value 
                if the function succeeds,the return vlaue is S4_SUCCESS, otherwise return other defined return value.
*/
public static native @Cast("DWORD") long S4Execute(
        SENSE4_CONTEXT pS4Ctx,
        @ByVal @Cast("LPCSTR*") BytePointer lpszFileID,
        Pointer pInBuffer,
        @Cast("DWORD") long dwInbufferSize,
        Pointer pOutBuffer,
        @Cast("DWORD") long dwOutBufferSize,
        @Cast("DWORD*") CLongPointer pdwBytesReturned
);

/**
                execute the specified executable file of current directory on virtual machine
                or on XA User mode
                                                      
                \parameter pS4Ctx                [in]  the context pointer of the device, the device must has been opened
                \parameter lpszFileID            [in]  ID of the executable file
                \parameter dwFlag                [in]  executing mode
                \parameter pInBuffer             [in]  input data buffer
                \parameter dwInbufferSize        [in]  input data length
                \parameter pOutBuffer            [out] output data buffer
                \parameter dwOutBufferSize       [in]  output data buffer size
                \parameter pdwBytesReturned      [out] output data length
                <p>
                @return value 
                if the function succeeds,the return vlaue is S4_SUCCESS, otherwise return other defined return value.
<p>
*/
public static native @Cast("DWORD") long S4ExecuteEx(
        SENSE4_CONTEXT pS4Ctx,
        @ByVal @Cast("LPCSTR*") BytePointer lpszFileID,
        @Cast("DWORD") long dwFlag,
        Pointer pInBuffer,
        @Cast("DWORD") long dwInbufferSize,
        Pointer pOutBuffer,
        @Cast("DWORD") long dwOutBufferSize,
        @Cast("DWORD*") CLongPointer pdwBytesReturned
);

/**
                execute the specified executable file of current directory on virtual machine
                or on XA User mode
                                                      
                \parameter pS4Ctx                [in]  the context pointer of the device, the device must has been opened
                \parameter lpszFileID            [in]  ID of the executable file
                \parameter dwFlag                [in]  executing mode
                \parameter pInBuffer             [in]  input data buffer
                \parameter dwInbufferSize        [in]  input data length
                \parameter pOutBuffer            [out] output data buffer
                \parameter dwOutBufferSize       [in]  output data buffer size
                \parameter pdwBytesReturned      [out] output data length
				\parameter dwSecondTime			 [in]  input second time
                <p>
                @return value 
                if the function succeeds,the return vlaue is S4_SUCCESS, otherwise return other defined return value.
<p>
*/
public static native @Cast("DWORD") long S4ExecuteEx2(
						  SENSE4_CONTEXT s4Ctx,
						  @ByVal @Cast("LPCSTR*") BytePointer lpszFileID,
						  @Cast("DWORD") long dwFlag,
						  @Cast("LPVOID") Pointer lpInBuffer,
						  @Cast("DWORD") long dwInbufferSize,
						  @Cast("LPVOID") Pointer lpOutBuffer,
						  @Cast("DWORD") long dwOutBufferSize,
						  @Cast("LPDWORD") long lpBytesReturned,
						  @Cast("DWORD") long dwSecondTime
);



/**
                create a new child directory for the current directory, and set the new
                directory to current directory. if creating the root directory, the function
                will create a ATR file at the same time.
                
                \parameter pS4Ctx               [in]  the context pointer of the device, the device must has been opened
                \parameter lpszDirID            [in]  ID of the new directory
                \parameter dwDirSize            [in]  size of the new directory
                \parameter dwFlags              [in]  flag
                \parameter pCreateDirInfo       [in]  S4CREATEDIRINFO structure pointer
                <p>
                @return value 
                if the function succeeds,the return vlaue is S4_SUCCESS, otherwise return other defined return value.
<p>
*/
public static native @Cast("DWORD") long S4CreateDirEx(
        SENSE4_CONTEXT pS4Ctx,
        @ByVal @Cast("LPCSTR*") BytePointer lpszDirID,
        @Cast("DWORD") long dwDirSize,
        @Cast("DWORD") long dwFlags,
        S4CREATEDIRINFO pCreateDirInfo
);
                                                   




/**
                open the EliteIV device using specific mode
                                                        
                \paramter pS4Ctx                 [in][out]    the context pointer of the device
                \paramter pS4OpenInfo            [in]         S4OPENINFO structure pointer
                <p>
                @return value 
                if the function succeeds,the return vlaue is S4_SUCCESS, otherwise return other defined return value.
<p>
*/
public static native @Cast("DWORD") long S4OpenEx(
        SENSE4_CONTEXT pS4Ctx,
        S4OPENINFO pS4OpenInfo
);


public static native @Cast("DWORD") long S4Test(@Cast("char*") BytePointer p);
public static native @Cast("DWORD") long S4Test(@Cast("char*") ByteBuffer p);
public static native @Cast("DWORD") long S4Test(@Cast("char*") byte[] p);


//@}                                              

// #ifdef __cplusplus
// #endif

// #endif  //__SENSE4_H__


}