package de.dasbabypixel.gamelauncher.gles.es30

interface glBindBufferBase {
    /**
    * Name
    * ----
    * 
    * glBindBufferBase — bind a buffer object to an indexed buffer target
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glBindBufferBase**(` | GLenum target, |
    * | --- | --- |
    * |   | GLuint index, |
    * |   | GLuint buffer`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`target`_
    * 
    * Specify the target of the bind operation. _`target`_ must be one of `GL_ATOMIC_COUNTER_BUFFER`, `GL_SHADER_STORAGE_BUFFER`, `GL_TRANSFORM_FEEDBACK_BUFFER` or `GL_UNIFORM_BUFFER`.
    * 
    * _`index`_
    * 
    * Specify the index of the binding point within the array specified by _`target`_.
    * 
    * _`buffer`_
    * 
    * The name of a buffer object to bind to the specified binding point.
    * 
    * Description
    * -----------
    * 
    * `glBindBufferBase` binds the buffer object _`buffer`_ to the binding point at index _`index`_ of the array of targets specified by _`target`_. Each _`target`_ represents an indexed array of buffer binding points, as well as a single general binding point that can be used by other buffer manipulation functions such as [glBindBuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindBuffer.glBindBuffer] or [glMapBufferRange][de.dasbabypixel.gamelauncher.gles.es30.glMapBufferRange.glMapBufferRange]. In addition to binding _`buffer`_ to the indexed buffer binding target, `glBindBufferBase` also binds _`buffer`_ to the generic buffer binding point specified by _`target`_.
    * 
    * Notes
    * -----
    * 
    * Calling `glBindBufferBase` binds the entire buffer, even when the size of the buffer is changed after the binding is established. The starting offset is zero, and the amount of data that can be read from or written to the buffer is determined by the size of the bound buffer at the time the binding is used.
    * 
    * The `GL_ATOMIC_COUNTER_BUFFER` and `GL_SHADER_STORAGE_BUFFER` targets are available only if the GL ES version is 3.1 or greater.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`target`_ is not `GL_ATOMIC_COUNTER_BUFFER`, `GL_SHADER_STORAGE_BUFFER`, `GL_TRANSFORM_FEEDBACK_BUFFER` or `GL_UNIFORM_BUFFER`.
    * 
    * `GL_INVALID_VALUE` is generated if _`index`_ is greater than or equal to the number of _`target`_\-specific indexed binding points.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_MAX_ATOMIC_COUNTER_BUFFER_BINDINGS`, `GL_MAX_SHADER_STORAGE_BUFFER_BINDINGS`, `GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS` or `GL_MAX_UNIFORM_BUFFER_BINDINGS`.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glBindBufferBase | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGenBuffers][de.dasbabypixel.gamelauncher.gles.es20.glGenBuffers.glGenBuffers], [glDeleteBuffers][de.dasbabypixel.gamelauncher.gles.es20.glDeleteBuffers.glDeleteBuffers], [glBindBuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindBuffer.glBindBuffer], [glBindBufferRange][de.dasbabypixel.gamelauncher.gles.es30.glBindBufferRange.glBindBufferRange], [glMapBufferRange][de.dasbabypixel.gamelauncher.gles.es30.glMapBufferRange.glMapBufferRange], [glUnmapBuffer][de.dasbabypixel.gamelauncher.gles.es30.glMapBufferRange.glMapBufferRange],
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glBindBufferBase.glBindBufferBase
    */
    fun glBindBufferBase(target: Int, index: UInt, buffer: UInt)
}