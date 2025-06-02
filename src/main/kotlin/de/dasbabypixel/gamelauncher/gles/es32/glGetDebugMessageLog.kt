package de.dasbabypixel.gamelauncher.gles.es32

interface glGetDebugMessageLog {
    /**
    * Name
    * ----
    * 
    * glGetDebugMessageLog — retrieve messages from the debug message log
    * 
    * C Specification
    * ---------------
    * 
    * | `GLuint **glGetDebugMessageLog**(` | GLuint count, |
    * | --- | --- |
    * |   | GLsizei bufSize, |
    * |   | GLenum \*sources, |
    * |   | GLenum \*types, |
    * |   | GLuint \*ids, |
    * |   | GLenum \*severities, |
    * |   | GLsizei \*lengths, |
    * |   | GLchar \*messageLog`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`count`_
    * 
    * The number of debug messages to retrieve from the log.
    * 
    * _`bufSize`_
    * 
    * The size of the buffer whose address is given by _`messageLog`_.
    * 
    * _`sources`_
    * 
    * The address of an array of variables to receive the sources of the retrieved messages.
    * 
    * _`types`_
    * 
    * The address of an array of variables to receive the types of the retrieved messages.
    * 
    * _`ids`_
    * 
    * The address of an array of unsigned integers to receive the ids of the retrieved messages.
    * 
    * _`severities`_
    * 
    * The address of an array of variables to receive the severites of the retrieved messages.
    * 
    * _`lengths`_
    * 
    * The address of an array of variables to receive the lengths of the received messages.
    * 
    * _`messageLog`_
    * 
    * The address of an array of characters that will receive the messages.
    * 
    * Description
    * -----------
    * 
    * `glGetDebugMessageLog` retrieves messages from the debug message log. A maximum of _`count`_ messages are retrieved from the log. If _`sources`_ is not NULL then the source of each message is written into up to _`count`_ elements of the array. If _`types`_ is not NULL then the type of each message is written into up to _`count`_ elements of the array. If _`id`_ is not NULL then the identifier of each message is written into up to _`count`_ elements of the array. If _`severities`_ is not NULL then the severity of each message is written into up to _`count`_ elements of the array. If _`lengths`_ is not NULL then the length of each message is written into up to _`count`_ elements of the array.
    * 
    * _`messageLog`_ specifies the address of a character array into which the debug messages will be written. Each message will be concatenated onto the array starting at the first element of _`messageLog`_. _`bufSize`_ specifies the size of the array _`messageLog`_. If a message will not fit into the remaining space in _`messageLog`_ then the function terminates and returns the number of messages written so far, which may be zero.
    * 
    * If `glGetDebugMessageLog` returns zero then no messages are present in the debug log, or there was not enough space in _`messageLog`_ to retrieve the first message in the queue. If _`messageLog`_ is NULL then no messages are written and the value of _`bufSize`_ is ignored.
    * 
    * Notes
    * -----
    * 
    * Although debug messages may be enabled in a non-debug context, the quantity and detail of such messages may be substantially inferior to those in a debug context. In particular, a valid implementation of the debug message queue in a non-debug context may produce no messages at all.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`count`_ or _`bufSize`_ is negative.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_DEBUG_LOGGED_MESSAGES`
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH`
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_MAX_DEBUG_MESSAGE_LENGTH`
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_MAX_DEBUG_LOGGED_MESSAGES`
    * 
    * Version Support
    * ---------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glGetDebugMessageLog` | \- | \- | \- | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glDebugMessageInsert][de.dasbabypixel.gamelauncher.gles.es32.glDebugMessageInsert.glDebugMessageInsert], [glDebugMessageCallback][de.dasbabypixel.gamelauncher.gles.es32.glDebugMessageCallback.glDebugMessageCallback], [glDebugMessageControl][de.dasbabypixel.gamelauncher.gles.es32.glDebugMessageControl.glDebugMessageControl].
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2013-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es32.glGetDebugMessageLog.glGetDebugMessageLog
    */
    fun glGetDebugMessageLog(count: UInt, bufSize: UInt, sources: de.dasbabypixel.gamelauncher.buffers.IntBuffer, types: de.dasbabypixel.gamelauncher.buffers.IntBuffer, ids: de.dasbabypixel.gamelauncher.buffers.IntBuffer, severities: de.dasbabypixel.gamelauncher.buffers.IntBuffer, lengths: de.dasbabypixel.gamelauncher.buffers.IntBuffer, messageLog: de.dasbabypixel.gamelauncher.buffers.ByteBuffer): UInt
}