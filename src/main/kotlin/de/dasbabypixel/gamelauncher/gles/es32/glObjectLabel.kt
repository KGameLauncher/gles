package de.dasbabypixel.gamelauncher.gles.es32

interface glObjectLabel {
    /**
    * Name
    * ----
    * 
    * glObjectLabel — label a named object identified within a namespace
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glObjectLabel**(` | GLenum identifier, |
    * | --- | --- |
    * |   | GLuint name, |
    * |   | GLsizei length, |
    * |   | const char \* label`)`; |
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
    * The name of the object to label.
    * 
    * _`length`_
    * 
    * The length of the label to be used for the object.
    * 
    * _`label`_
    * 
    * The address of a string containing the label to assign to the object.
    * 
    * Description
    * -----------
    * 
    * `glObjectLabel` labels the object identified by _`name`_ within the namespace given by _`identifier`_. _`identifier`_ must be one of `GL_BUFFER`, `GL_SHADER`, `GL_PROGRAM`, `GL_VERTEX_ARRAY`, `GL_QUERY`, `GL_PROGRAM_PIPELINE`, `GL_TRANSFORM_FEEDBACK`, `GL_SAMPLER`, `GL_TEXTURE`, `GL_RENDERBUFFER`, `GL_FRAMEBUFFER`, to indicate the namespace containing the names of buffers, shaders, programs, vertex array objects, query objects, program pipelines, transform feedback objects, samplers, textures, renderbuffers and frame buffers, respectively.
    * 
    * _`label`_ is the address of a string that will be used to label an object. _`length`_ contains the number of characters in _`label`_. If _`length`_ is negative, it is implied that _`label`_ contains a null-terminated string. If _`label`_ is NULL, any debug label is effectively removed from the object.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`identifier`_ is not one of the accepted object types.
    * 
    * `GL_INVALID_OPERATION` is generated if _`name`_ is not the name of an existing object of the type specified by _`identifier`_.
    * 
    * `GL_INVALID_VALUE` is generated if the number of characters in _`label`_, excluding the null terminator when _`length`_ is negative, is greater than the value of `GL_MAX_LABEL_LENGTH`.
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
    * | `glObjectLabel` | \- | \- | \- | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glPushDebugGroup][de.dasbabypixel.gamelauncher.gles.es32.glPushDebugGroup.glPushDebugGroup], [glPopDebugGroup][de.dasbabypixel.gamelauncher.gles.es32.glPopDebugGroup.glPopDebugGroup], [glObjectPtrLabel][de.dasbabypixel.gamelauncher.gles.es32.glObjectPtrLabel.glObjectPtrLabel].
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2013-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es32.glObjectLabel.glObjectLabel
    */
    fun glObjectLabel(identifier: Int, name: UInt, length: UInt, label: String?)
}