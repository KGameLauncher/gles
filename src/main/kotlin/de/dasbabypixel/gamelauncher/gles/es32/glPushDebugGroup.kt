package de.dasbabypixel.gamelauncher.gles.es32

interface glPushDebugGroup {
    /**
    * Name
    * ----
    * 
    * glPushDebugGroup — push a named debug group into the command stream
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glPushDebugGroup**(` | GLenum source, |
    * | --- | --- |
    * |   | GLuint id, |
    * |   | GLsizei length, |
    * |   | const char \* message`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`source`_
    * 
    * The source of the debug message.
    * 
    * _`id`_
    * 
    * The identifier of the message.
    * 
    * _`length`_
    * 
    * The length of the message to be sent to the debug output stream.
    * 
    * _`message`_
    * 
    * The a string containing the message to be sent to the debug output stream.
    * 
    * Description
    * -----------
    * 
    * `glPushDebugGroup` pushes a debug group described by the string _`message`_ into the command stream. The value of _`id`_ specifies the ID of messages generated. The parameter _`length`_ contains the number of characters in _`message`_. If _`length`_ is negative, it is implied that _`message`_ contains a null terminated string. The message has the specified _`source`_ and _`id`_, the _`type`_ `GL_DEBUG_TYPE_PUSH_GROUP`, and _`severity`_ `GL_DEBUG_SEVERITY_NOTIFICATION`. The GL will put a new debug group on top of the debug group stack which inherits the control of the volume of debug output of the debug group previously residing on the top of the debug group stack. Because debug groups are strictly hierarchical, any additional control of the debug output volume will only apply within the active debug group and the debug groups pushed on top of the active debug group.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if the value of _`source`_ is neither `GL_DEBUG_SOURCE_APPLICATION` nor `GL_DEBUG_SOURCE_THIRD_PARTY`.
    * 
    * `GL_INVALID_VALUE` is generated if _`length`_ is negative and the number of characters in _`message`_, excluding the null-terminator, is not less than the value of `GL_MAX_DEBUG_MESSAGE_LENGTH`.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_MAX_DEBUG_MESSAGE_LENGTH`.
    * 
    * Version Support
    * ---------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glPushDebugGroup` | \- | \- | \- | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glPopDebugGroup][de.dasbabypixel.gamelauncher.gles.es32.glPopDebugGroup.glPopDebugGroup], [glObjectLabel][de.dasbabypixel.gamelauncher.gles.es32.glObjectLabel.glObjectLabel], [glObjectPtrLabel][de.dasbabypixel.gamelauncher.gles.es32.glObjectPtrLabel.glObjectPtrLabel].
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2013-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es32.glPushDebugGroup.glPushDebugGroup
    */
    fun glPushDebugGroup(source: Int, id: UInt, length: UInt, message: String?)
}