package de.dasbabypixel.gamelauncher.gles.es30

interface glCopyBufferSubData {
    /**
    * Name
    * ----
    * 
    * glCopyBufferSubData — copy part of the data store of a buffer object to the data store of another buffer object
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glCopyBufferSubData**(` | GLenum readtarget, |
    * | --- | --- |
    * |   | GLenum writetarget, |
    * |   | GLintptr readoffset, |
    * |   | GLintptr writeoffset, |
    * |   | GLsizeiptr size`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`readtarget`_
    * 
    * Specifies the target from whose data store data should be read.
    * 
    * _`writetarget`_
    * 
    * Specifies the target to whose data store data should be written.
    * 
    * _`readoffset`_
    * 
    * Specifies the offset, in basic machine units, within the data store of _`readtarget`_ from which data should be read.
    * 
    * _`writeoffset`_
    * 
    * Specifies the offset, in basic machine units, within the data store of _`writetarget`_ to which data should be written.
    * 
    * _`size`_
    * 
    * Specifies the size, in basic machine units, of the data to be copied from _`readtarget`_ to _`writetarget`_.
    * 
    * Description
    * -----------
    * 
    * `glCopyBufferSubData` copies part of the data store attached to _`readtarget`_ to the data store attached to _`writetarget`_. The number of basic machine units indicated by _`size`_ is copied from the source, at offset _`readoffset`_ to the destination at _`writeoffset`_, also in basic machine units.
    * 
    * _`readTarget`_ and _`writeTarget`_ specify the targets to which the source and destination buffer objects are bound, and must each be one of the buffer binding targets in the following table:
    * 
    * 
    * | **Buffer Binding Target** | **Purpose** |
    * | --- | --- |
    * | `GL_ARRAY_BUFFER` | Vertex attributes |
    * | `GL_ATOMIC_COUNTER_BUFFER` | Atomic counter storage |
    * | `GL_COPY_READ_BUFFER` | Buffer copy source |
    * | `GL_COPY_WRITE_BUFFER` | Buffer copy destination |
    * | `GL_DISPATCH_INDIRECT_BUFFER` | Indirect compute dispatch commands |
    * | `GL_DRAW_INDIRECT_BUFFER` | Indirect command arguments |
    * | `GL_ELEMENT_ARRAY_BUFFER` | Vertex array indices |
    * | `GL_PIXEL_PACK_BUFFER` | Pixel read target |
    * | `GL_PIXEL_UNPACK_BUFFER` | Texture data source |
    * | `GL_SHADER_STORAGE_BUFFER` | Read-write storage for shaders |
    * | `GL_TEXTURE_BUFFER` | Texture data buffer |
    * | `GL_TRANSFORM_FEEDBACK_BUFFER` | Transform feedback buffer |
    * | `GL_UNIFORM_BUFFER` | Uniform block storage |
    * 
    * Any of these targets may be used, but the targets `GL_COPY_READ_BUFFER` and `GL_COPY_WRITE_BUFFER` are provided specifically to allow copies between buffers without disturbing other GL state.
    * 
    * _`readoffset`_, _`writeoffset`_ and _`size`_ must all be greater than or equal to zero. Furthermore, _`readoffset`_ + _`size`_ must not exceeed the size of the buffer object bound to _`readtarget`_, and _`writeoffset`_ + _`size`_ must not exceeed the size of the buffer bound to _`writetarget`_. If the same buffer object is bound to both _`readtarget`_ and _`writetarget`_, then the ranges specified by _`readoffset`_, _`writeoffset`_ and _`size`_ must not overlap.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if any of _`readoffset`_, _`writeoffset`_ or _`size`_ is negative, if _`readoffset`_ + _`size`_ exceeds the size of the buffer object bound to _`readtarget`_ or if _`writeoffset`_ + _`size`_ exceeds the size of the buffer object bound to _`writetarget`_.
    * 
    * `GL_INVALID_VALUE` is generated if the same buffer object is bound to both _`readtarget`_ and _`writetarget`_ and the ranges \[_`readoffset`_, _`readoffset`_ + _`size`_) and \[_`writeoffset`_, _`writeoffset`_ + _`size`_) overlap.
    * 
    * `GL_INVALID_OPERATION` is generated if zero is bound to _`readtarget`_ or _`writetarget`_.
    * 
    * `GL_INVALID_OPERATION` is generated if the buffer object bound to either _`readtarget`_ or _`writetarget`_ is mapped.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glCopyBufferSubData | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGenBuffers][de.dasbabypixel.gamelauncher.gles.es20.glGenBuffers.glGenBuffers], [glBindBuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindBuffer.glBindBuffer], [glBufferData][de.dasbabypixel.gamelauncher.gles.es20.glBufferData.glBufferData], [glBufferSubData][de.dasbabypixel.gamelauncher.gles.es20.glBufferSubData.glBufferSubData],
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glCopyBufferSubData.glCopyBufferSubData
    */
    fun glCopyBufferSubData(readtarget: Int, writetarget: Int, readoffset: Long, writeoffset: Long, size: ULong)
}