package de.dasbabypixel.gamelauncher.gles.es30

interface glGetSynciv {
    /**
    * Name
    * ----
    * 
    * glGetSynciv — query the properties of a sync object
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGetSynciv**(` | GLsync sync, |
    * | --- | --- |
    * |   | GLenum pname, |
    * |   | GLsizei bufSize, |
    * |   | GLsizei \*length, |
    * |   | GLint \*values`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`sync`_
    * 
    * Specifies the sync object whose properties to query.
    * 
    * _`pname`_
    * 
    * Specifies the parameter whose value to retrieve from the sync object specified in _`sync`_.
    * 
    * _`bufSize`_
    * 
    * Specifies the size of the buffer whose address is given in _`values`_.
    * 
    * _`length`_
    * 
    * Specifies the address of an variable to receive the number of integers placed in _`values`_.
    * 
    * _`values`_
    * 
    * Specifies the address of an array to receive the values of the queried parameter.
    * 
    * Description
    * -----------
    * 
    * `glGetSynciv` retrieves properties of a sync object. _`sync`_ specifies the name of the sync object whose properties to retrieve.
    * 
    * On success, `glGetSynciv` replaces up to _`bufSize`_ integers in _`values`_ with the corresponding property values of the object being queried. The actual number of integers replaced is returned in the variable whose address is specified in _`length`_. If _`length`_ is `NULL`, no length is returned.
    * 
    * If _`pname`_ is `GL_OBJECT_TYPE`, a single value representing the specific type of the sync object is placed in _`values`_. The only type supported is `GL_SYNC_FENCE`.
    * 
    * If _`pname`_ is `GL_SYNC_STATUS`, a single value representing the status of the sync object (`GL_SIGNALED` or `GL_UNSIGNALED`) is placed in _`values`_.
    * 
    * If _`pname`_ is `GL_SYNC_CONDITION`, a single value representing the condition of the sync object is placed in _`values`_. The only condition supported is `GL_SYNC_GPU_COMMANDS_COMPLETE`.
    * 
    * If _`pname`_ is `GL_SYNC_FLAGS`, a single value representing the flags with which the sync object was created is placed in _`values`_. No flags are currently supported[\[1\]](#ftn.id-1.6.7.4).
    * 
    * If an error occurs, nothing will be written to _`values`_ or _`length`_.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`sync`_ is not the name of a sync object.
    * 
    * `GL_INVALID_ENUM` is generated if _`pname`_ is not one of the accepted tokens.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glGetSynciv | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glFenceSync][de.dasbabypixel.gamelauncher.gles.es30.glFenceSync.glFenceSync], [glWaitSync][de.dasbabypixel.gamelauncher.gles.es30.glWaitSync.glWaitSync], [glClientWaitSync][de.dasbabypixel.gamelauncher.gles.es30.glClientWaitSync.glClientWaitSync]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * 
    * 
    * * * *
    * 
    * [\[1\]](#id-1.6.7.4) _`flags`_ is expected to be used in future extensions to the sync objects.
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glGetSynciv.glGetSynciv
    */
    fun glGetSynciv(sync: Long, pname: Int, bufSize: UInt, length: java.nio.IntBuffer, values: java.nio.IntBuffer)
}