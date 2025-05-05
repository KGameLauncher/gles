package de.dasbabypixel.gamelauncher.gles.es32

interface glDebugMessageCallback {
    /**
    * Name
    * ----
    * 
    * glDebugMessageCallback — specify a callback to receive debugging messages from the GL
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glDebugMessageCallback**(` | DEBUGPROC callback, |
    * | --- | --- |
    * |   | const void \* userParam`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`callback`_
    * 
    * The address of a callback function that will be called when a debug message is generated.
    * 
    * _`userParam`_
    * 
    * A user supplied pointer that will be passed on each invocation of _`callback`_.
    * 
    * Description
    * -----------
    * 
    * `glDebugMessageCallback` sets the current debug output callback function to the function whose address is given in _`callback`_. The callback function should have the following prototype (in C), or be otherwise compatible with such a prototype:
    * 
    *         typedef void (APIENTRY \*DEBUGPROC)(GLenum source,
    *             GLenum type,
    *             GLuint id,
    *             GLenum severity,
    *             GLsizei length,
    *             const GLchar \*message,
    *             const void \*userParam);
    * 
    * This function is defined to have the same calling convention as the GL API functions. In most cases this is defined as `APIENTRY`, although it will vary depending on platform, language and compiler.
    * 
    * Each time a debug message is generated the debug callback function will be invoked with _`source`_, _`type`_, _`id`_, and _`severity`_ associated with the message, and _`length`_ set to the length of debug message whose character string is in the array pointed to by _`message`_. _`userParam`_ will be set to the value passed in the _`userParam`_ parameter to the most recent call to `glDebugMessageCallback`.
    * 
    * Notes
    * -----
    * 
    * When the GL is in use remotely, the server may not be able to call functions in the client's address space. In such cases, the callback function may not be invoked and the user should retrieve debug messages from the context's debug message log by calling [glGetDebugMessageLog][de.dasbabypixel.gamelauncher.gles.es32.glGetDebugMessageLog.glGetDebugMessageLog].
    * 
    * Version Support
    * ---------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glDebugMessageCallback` | \- | \- | \- | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glDebugMessageControl][de.dasbabypixel.gamelauncher.gles.es32.glDebugMessageControl.glDebugMessageControl], [glDebugMessageInsert][de.dasbabypixel.gamelauncher.gles.es32.glDebugMessageInsert.glDebugMessageInsert], [glGetDebugMessageLog][de.dasbabypixel.gamelauncher.gles.es32.glGetDebugMessageLog.glGetDebugMessageLog].
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2013-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es32.glDebugMessageCallback.glDebugMessageCallback
    */
    fun glDebugMessageCallback(callback: DebugProc, userParam: Long)
}