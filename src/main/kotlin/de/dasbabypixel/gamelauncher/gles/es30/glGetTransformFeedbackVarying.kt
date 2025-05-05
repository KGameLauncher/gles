package de.dasbabypixel.gamelauncher.gles.es30

interface glGetTransformFeedbackVarying {
    /**
    * Name
    * ----
    * 
    * glGetTransformFeedbackVarying — retrieve information about varying variables selected for transform feedback
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGetTransformFeedbackVarying**(` | GLuint program, |
    * | --- | --- |
    * |   | GLuint index, |
    * |   | GLsizei bufSize, |
    * |   | GLsizei \* length, |
    * |   | GLsizei \* size, |
    * |   | GLenum \* type, |
    * |   | char \* name`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`program`_
    * 
    * The name of the target program object.
    * 
    * _`index`_
    * 
    * The index of the varying variable whose information to retrieve.
    * 
    * _`bufSize`_
    * 
    * The maximum number of characters, including the null terminator, that may be written into _`name`_.
    * 
    * _`length`_
    * 
    * The address of a variable which will receive the number of characters written into _`name`_, excluding the null-terminator. If _`length`_ is `NULL` no length is returned.
    * 
    * _`size`_
    * 
    * The address of a variable that will receive the size of the varying.
    * 
    * _`type`_
    * 
    * The address of a variable that will receive the type of the varying.
    * 
    * _`name`_
    * 
    * The address of a buffer into which will be written the name of the varying.
    * 
    * Description
    * -----------
    * 
    * Information about the set of varying variables in a linked program that will be captured during transform feedback may be retrieved by calling `glGetTransformFeedbackVarying`. `glGetTransformFeedbackVarying` provides information about the varying variable selected by _`index`_. An _`index`_ of 0 selects the first varying variable specified in the _`varyings`_ array passed to [glTransformFeedbackVaryings][de.dasbabypixel.gamelauncher.gles.es30.glTransformFeedbackVaryings.glTransformFeedbackVaryings], and an _`index`_ of `GL_TRANSFORM_FEEDBACK_VARYINGS-1` selects the last such variable.
    * 
    * The name of the selected varying is returned as a null-terminated string in _`name`_. The actual number of characters written into _`name`_, excluding the null terminator, is returned in _`length`_. If _`length`_ is NULL, no length is returned. The maximum number of characters that may be written into _`name`_, including the null terminator, is specified by _`bufSize`_.
    * 
    * The length of the longest varying name in program is given by `GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH`, which can be queried with [glGetProgramiv][de.dasbabypixel.gamelauncher.gles.es20.glGetProgramiv.glGetProgramiv].
    * 
    * For the selected varying variable, its type is returned into _`type`_. The size of the varying is returned into _`size`_. The value in _`size`_ is in units of the type returned in _`type`_. The type returned can be any of the scalar, vector, or matrix attribute types returned by [glGetActiveAttrib][de.dasbabypixel.gamelauncher.gles.es20.glGetActiveAttrib.glGetActiveAttrib]. If an error occurred, the return parameters _`length`_, _`size`_, _`type`_ and _`name`_ will be unmodified. This command will return as much information about the varying variables as possible. If no information is available, _`length`_ will be set to zero and _`name`_ will be an empty string. This situation could arise if `glGetTransformFeedbackVarying` is called after a failed link.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`program`_ is not the name of a program object.
    * 
    * `GL_INVALID_VALUE` is generated if _`index`_ is greater or equal to the value of `GL_TRANSFORM_FEEDBACK_VARYINGS`.
    * 
    * `GL_INVALID_OPERATION` is generated _`program`_ has not been linked.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGetProgramiv][de.dasbabypixel.gamelauncher.gles.es20.glGetProgramiv.glGetProgramiv] with argument `GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH` or `GL_TRANSFORM_FEEDBACK_VARYINGS`.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glGetTransformFeedbackVarying | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glBeginTransformFeedback][de.dasbabypixel.gamelauncher.gles.es30.glBeginTransformFeedback.glBeginTransformFeedback], [glEndTransformFeedback][de.dasbabypixel.gamelauncher.gles.es30.glBeginTransformFeedback.glBeginTransformFeedback], [glTransformFeedbackVaryings][de.dasbabypixel.gamelauncher.gles.es30.glTransformFeedbackVaryings.glTransformFeedbackVaryings], [glGetProgramiv][de.dasbabypixel.gamelauncher.gles.es20.glGetProgramiv.glGetProgramiv]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glGetTransformFeedbackVarying.glGetTransformFeedbackVarying
    */
    fun glGetTransformFeedbackVarying(program: UInt, index: UInt, bufSize: UInt, length: java.nio.IntBuffer, size: java.nio.IntBuffer, type: java.nio.IntBuffer, name: String)
}