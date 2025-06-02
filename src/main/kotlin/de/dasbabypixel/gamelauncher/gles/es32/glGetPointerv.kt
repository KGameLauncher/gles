package de.dasbabypixel.gamelauncher.gles.es32

interface glGetPointerv {
    /**
    * Name
    * ----
    * 
    * glGetPointerv — return the address of the specified pointer
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGetPointerv**(` | GLenum pname, |
    * | --- | --- |
    * |   | void \*\* params`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`pname`_
    * 
    * Specifies the pointer to be returned. Must be one of `GL_DEBUG_CALLBACK_FUNCTION` or `GL_DEBUG_CALLBACK_USER_PARAM`.
    * 
    * _`params`_
    * 
    * Returns the pointer value specified by _`pname`_.
    * 
    * Description
    * -----------
    * 
    * `glGetPointerv` returns pointer information. _`pname`_ indicates the pointer to be returned, and _`params`_ is a pointer to a location in which to place the returned data. The parameters that may be queried include:
    * 
    * `GL_DEBUG_CALLBACK_FUNCTION`
    * 
    * Returns the current callback function set with the _`callback`_ argument of [glDebugMessageCallback][de.dasbabypixel.gamelauncher.gles.es32.glDebugMessageCallback.glDebugMessageCallback].
    * 
    * `GL_DEBUG_CALLBACK_USER_PARAM`
    * 
    * Returns the user parameter to the current callback function set with the _`userParam`_ argument of [glDebugMessageCallback][de.dasbabypixel.gamelauncher.gles.es32.glDebugMessageCallback.glDebugMessageCallback].
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`pname`_ is not an accepted value.
    * 
    * Version Support
    * ---------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glGetPointerv` | \- | \- | \- | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glDebugMessageCallback][de.dasbabypixel.gamelauncher.gles.es32.glDebugMessageCallback.glDebugMessageCallback]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2014-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es32.glGetPointerv.glGetPointerv
    */
    fun glGetPointerv(pname: Int, params: de.dasbabypixel.gamelauncher.buffers.PointerBuffer)
}