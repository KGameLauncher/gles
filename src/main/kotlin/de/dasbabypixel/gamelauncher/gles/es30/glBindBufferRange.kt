package de.dasbabypixel.gamelauncher.gles.es30

interface glBindBufferRange {
    /**
    * Name
    * ----
    * 
    * glBindBufferRange — bind a range within a buffer object to an indexed buffer target
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glBindBufferRange**(` | GLenumtarget, |
    * | --- | --- |
    * |   | GLuintindex, |
    * |   | GLuintbuffer, |
    * |   | GLintptroffset, |
    * |   | GLsizeiptrsize`)`; |
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
    * _`offset`_
    * 
    * The starting offset in basic machine units into the buffer object _`buffer`_.
    * 
    * _`size`_
    * 
    * The amount of data in machine units that can be read from the buffet object while used as an indexed target.
    * 
    * Description
    * -----------
    * 
    * `glBindBufferRange` binds a range of the buffer object _`buffer`_ represented by _`offset`_ and _`size`_ to the binding point at index _`index`_ of the array of targets specified by _`target`_. Each _`target`_ represents an indexed array of buffer binding points, as well as a single general binding point that can be used by other buffer manipulation functions such as [glBindBuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindBuffer.glBindBuffer] or [glMapBufferRange][de.dasbabypixel.gamelauncher.gles.es30.glMapBufferRange.glMapBufferRange]. In addition to binding a range of _`buffer`_ to the indexed buffer binding target, `glBindBufferBase` also binds the range to the generic buffer binding point specified by _`target`_.
    * 
    * _`offset`_ specifies the offset in basic machine units into the buffer object _`buffer`_ and _`size`_ specifies the amount of data that can be read from the buffer object while used as an indexed target.
    * 
    * Notes
    * -----
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
    * `GL_INVALID_VALUE` is generated if _`buffer`_ is not zero and _`size`_ is less than or equal to zero.
    * 
    * `GL_INVALID_VALUE` is generated if _`target`_ is `GL_ATOMIC_COUNTER_BUFFER` or `GL_TRANSFORM_FEEDBACK_BUFFER` and _`size`_ or _`offset`_ are not multiples of 4.
    * 
    * `GL_INVALID_VALUE` is generated if _`target`_ is `GL_SHADER_STORAGE_BUFFER` and _`offset`_ is not a multiple of `GL_SHADER_STORAGE_BUFFER_OFFSET_ALIGNMENT`.
    * 
    * `GL_INVALID_VALUE` is generated if _`target`_ is `GL_UNIFORM_BUFFER` and _`offset`_ is not a multiple of `GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT`.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_MAX_ATOMIC_COUNTER_BUFFER_BINDINGS`, `GL_MAX_SHADER_STORAGE_BUFFER_BINDINGS`, `GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS`, `GL_MAX_UNIFORM_BUFFER_BINDINGS`, `GL_SHADER_STORAGE_BUFFER_OFFSET_ALIGNMENT`, or `GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT`.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glBindBufferRange | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGenBuffers][de.dasbabypixel.gamelauncher.gles.es20.glGenBuffers.glGenBuffers], [glDeleteBuffers][de.dasbabypixel.gamelauncher.gles.es20.glDeleteBuffers.glDeleteBuffers], [glBindBuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindBuffer.glBindBuffer], [glBindBufferBase][de.dasbabypixel.gamelauncher.gles.es30.glBindBufferBase.glBindBufferBase], [glMapBufferRange][de.dasbabypixel.gamelauncher.gles.es30.glMapBufferRange.glMapBufferRange], [glUnmapBuffer][de.dasbabypixel.gamelauncher.gles.es30.glMapBufferRange.glMapBufferRange],
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glBindBufferRange.glBindBufferRange
    */
    fun glBindBufferRange(target: Int, index: UInt, buffer: UInt, offset: Long, size: ULong)
}