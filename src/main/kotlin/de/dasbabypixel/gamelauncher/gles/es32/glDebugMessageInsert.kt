package de.dasbabypixel.gamelauncher.gles.es32

interface glDebugMessageInsert {
    /**
    * Name
    * ----
    * 
    * glDebugMessageInsert — inject an application-supplied message into the debug message queue
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glDebugMessageInsert**(` | GLenum source, |
    * | --- | --- |
    * |   | GLenum type, |
    * |   | GLuint id, |
    * |   | GLenum severity, |
    * |   | GLsizei length, |
    * |   | const char \*message`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`source`_
    * 
    * The source of the debug message to insert.
    * 
    * _`type`_
    * 
    * The type of the debug message insert.
    * 
    * _`id`_
    * 
    * The user-supplied identifier of the message to insert.
    * 
    * _`severity`_
    * 
    * The severity of the debug messages to insert.
    * 
    * _`length`_
    * 
    * The length string contained in the character array whose address is given by _`message`_.
    * 
    * _`message`_
    * 
    * The address of a character array containing the message to insert.
    * 
    * Description
    * -----------
    * 
    * `glDebugMessageInsert` inserts a user-supplied message into the debug output queue. _`source`_ specifies the source that will be used to classify the message and must be `GL_DEBUG_SOURCE_APPLICATION` or `GL_DEBUG_SOURCE_THIRD_PARTY`. All other sources are reserved for use by the GL implementation. _`type`_ indicates the type of the message to be inserted and may be one of `GL_DEBUG_TYPE_ERROR`, `GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR`, `GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR`, `GL_DEBUG_TYPE_PORTABILITY`, `GL_DEBUG_TYPE_PERFORMANCE`, `GL_DEBUG_TYPE_MARKER`, `GL_DEBUG_TYPE_PUSH_GROUP`, `GL_DEBUG_TYPE_POP_GROUP`, or `GL_DEBUG_TYPE_OTHER`. _`severity`_ indicates the severity of the message and may be `GL_DEBUG_SEVERITY_LOW`, `GL_DEBUG_SEVERITY_MEDIUM`, `GL_DEBUG_SEVERITY_HIGH` or `GL_DEBUG_SEVERITY_NOTIFICATION`. _`id`_ is available for application defined use and may be any value. This value will be recorded and used to identify the message.
    * 
    * _`length`_ contains a count of the characters in the character array whose address is given in _`message`_. If _`length`_ is negative then _`message`_ is treated as a null-terminated string. The length of the message, whether specified explicitly or implicitly, must be less than or equal to the implementation defined constant `GL_MAX_DEBUG_MESSAGE_LENGTH`.
    * 
    * Notes
    * -----
    * 
    * `GL_DEBUG_TYPE_MARKER`, `GL_DEBUG_TYPE_PUSH_GROUP`, `GL_DEBUG_TYPE_POP_GROUP`, and `GL_DEBUG_SEVERITY_NOTIFICATION` are available only if the GL version is 4.3 or higher.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if any of _`source`_, _`type`_ or _`severity`_ is not one of the accepted interface types.
    * 
    * `GL_INVALID_VALUE` is generated if the length of the message is greater than the value of `GL_MAX_DEBUG_MESSAGE_LENGTH`.
    * 
    * Version Support
    * ---------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glDebugMessageInsert` | \- | \- | \- | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glDebugMessageControl][de.dasbabypixel.gamelauncher.gles.es32.glDebugMessageControl.glDebugMessageControl], [glDebugMessageCallback][de.dasbabypixel.gamelauncher.gles.es32.glDebugMessageCallback.glDebugMessageCallback], [glGetDebugMessageLog][de.dasbabypixel.gamelauncher.gles.es32.glGetDebugMessageLog.glGetDebugMessageLog].
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2013-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es32.glDebugMessageInsert.glDebugMessageInsert
    */
    fun glDebugMessageInsert(source: Int, type: Int, id: UInt, severity: Int, length: UInt, message: String?)
}