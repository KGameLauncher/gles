package de.dasbabypixel.gamelauncher.gles.es32

interface glGetObjectLabel {
    /**
    * Name
    * ----
    * 
    * glGetObjectLabel — retrieve the label of a named object identified within a namespace
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGetObjectLabel**(` | GLenum identifier, |
    * | --- | --- |
    * |   | GLuint name, |
    * |   | GLsizei bifSize, |
    * |   | GLsizei \* length, |
    * |   | char \* label`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`identifier`_
    * 
    * The namespace from which the name of the object is allocated.
    * 
    * _`name`_
    * 
    * The name of the object whose label to retrieve.
    * 
    * _`bufSize`_
    * 
    * The length of the buffer whose address is in _`label`_.
    * 
    * _`length`_
    * 
    * The address of a variable to receive the length of the object label.
    * 
    * _`label`_
    * 
    * The address of a string that will receive the object label.
    * 
    * Description
    * -----------
    * 
    * `glGetObjectLabel` retrieves the label of the object identified by _`name`_ within the namespace given by _`identifier`_. _`identifier`_ must be one of `GL_BUFFER`, `GL_SHADER`, `GL_PROGRAM`, `GL_VERTEX_ARRAY`, `GL_QUERY`, `GL_PROGRAM_PIPELINE`, `GL_TRANSFORM_FEEDBACK`, `GL_SAMPLER`, `GL_TEXTURE`, `GL_RENDERBUFFER`, `GL_FRAMEBUFFER`, to indicate the namespace containing the names of buffers, shaders, programs, vertex array objects, query objects, program pipelines, transform feedback objects, samplers, textures, renderbuffers and frame buffers, respectively.
    * 
    * _`label`_ is the address of a string that will be used to store the object label. _`bufSize`_ specifies the number of characters in the array identified by _`label`_. _`length`_ contains the address of a variable which will receive the number of characters in the object label. If _`length`_ is NULL, then it is ignored and no data is written. Likewise, if _`label`_ is NULL, or if _`bufSize`_ is zero then no data is written to _`label`_.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`identifier`_ is not one of the accepted object types.
    * 
    * `GL_INVALID_OPERATION` is generated if _`name`_ is not the name of an existing object of the type specified by _`identifier`_.
    * 
    * `GL_INVALID_VALUE` is generated if _`bufSize`_ is zero.
    * 
    * If not NULL, _`length`_ and _`label`_ should be addresses to which the client has write access, otherwise undefined behavior, including process termination may occur.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_MAX_LABEL_LENGTH`.
    * 
    * Version Support
    * ---------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glGetObjectLabel` | \- | \- | \- | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glPushDebugGroup][de.dasbabypixel.gamelauncher.gles.es32.glPushDebugGroup.glPushDebugGroup], [glPopDebugGroup][de.dasbabypixel.gamelauncher.gles.es32.glPopDebugGroup.glPopDebugGroup], [glObjectLabel][de.dasbabypixel.gamelauncher.gles.es32.glObjectLabel.glObjectLabel], [glGetObjectPtrLabel][de.dasbabypixel.gamelauncher.gles.es32.glGetObjectPtrLabel.glGetObjectPtrLabel].
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2013-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es32.glGetObjectLabel.glGetObjectLabel
    */
    fun glGetObjectLabel(identifier: Int, name: UInt, bifSize: UInt, length: java.nio.IntBuffer, label: String)
}