package de.dasbabypixel.gamelauncher.gles.es20

interface glGetError {
    /**
    * Name
    * ----
    * 
    * glGetError — return error information
    * 
    * C Specification
    * ---------------
    * 
    * | `GLenum **glGetError**(` | void`)`; |
    * | --- | --- |
    * 
    * Description
    * -----------
    * 
    * `glGetError` returns the value of the error flag. Each detectable error is assigned a numeric code and symbolic name. When an error occurs, the error flag is set to the appropriate error code value. No other errors are recorded until `glGetError` is called, the error code is returned, and the flag is reset to `GL_NO_ERROR`. If a call to `glGetError` returns `GL_NO_ERROR`, there has been no detectable error since the last call to `glGetError`, or since the GL was initialized.
    * 
    * To allow for distributed implementations, there may be several error flags. If any single error flag has recorded an error, the value of that flag is returned and that flag is reset to `GL_NO_ERROR` when `glGetError` is called. If more than one flag has recorded an error, `glGetError` returns and clears an arbitrary error flag value. Thus, `glGetError` should always be called in a loop, until it returns `GL_NO_ERROR`, if all error flags are to be reset.
    * 
    * Initially, all error flags are set to `GL_NO_ERROR`.
    * 
    * The following errors are currently defined:
    * 
    * `GL_NO_ERROR`
    * 
    * No error has been recorded. The value of this symbolic constant is guaranteed to be 0.
    * 
    * `GL_INVALID_ENUM`
    * 
    * An unacceptable value is specified for an enumerated argument. The offending command is ignored and has no other side effect than to set the error flag.
    * 
    * `GL_INVALID_VALUE`
    * 
    * A numeric argument is out of range. The offending command is ignored and has no other side effect than to set the error flag.
    * 
    * `GL_INVALID_OPERATION`
    * 
    * The specified operation is not allowed in the current state. The offending command is ignored and has no other side effect than to set the error flag.
    * 
    * `GL_INVALID_FRAMEBUFFER_OPERATION`
    * 
    * The framebuffer object is not complete. The offending command is ignored and has no other side effect than to set the error flag.
    * 
    * `GL_OUT_OF_MEMORY`
    * 
    * There is not enough memory left to execute the command. The state of the GL is undefined, except for the state of the error flags, after this error is recorded.
    * 
    * When an error flag is set, results of a GL operation are undefined only if `GL_OUT_OF_MEMORY` has occurred. In all other cases, the command generating the error is ignored and has no effect on the GL state or frame buffer contents. If the generating command returns a value, it returns 0. If `glGetError` itself generates an error, it returns 0.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glGetError | ✔ | ✔ | ✔ | ✔ |
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glGetError.glGetError
    */
    fun glGetError(): Int
}