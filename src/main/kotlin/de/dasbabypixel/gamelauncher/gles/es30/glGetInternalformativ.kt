package de.dasbabypixel.gamelauncher.gles.es30

interface glGetInternalformativ {
    /**
    * Name
    * ----
    * 
    * glGetInternalformativ — retrieve information about implementation-dependent support for internal formats
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGetInternalformativ**(` | GLenum target, |
    * | --- | --- |
    * |   | GLenum internalformat, |
    * |   | GLenum pname, |
    * |   | GLsizei bufSize, |
    * |   | GLint \*params`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`target`_
    * 
    * Indicates the usage of the internal format. _`target`_ must be `GL_RENDERBUFFER`, `GL_TEXTURE_2D_MULTISAMPLE`, or `GL_TEXTURE_2D_MULTISAMPLE_ARRAY`.
    * 
    * _`internalformat`_
    * 
    * Specifies the internal format about which to retrieve information.
    * 
    * _`pname`_
    * 
    * Specifies the type of information to query.
    * 
    * _`bufSize`_
    * 
    * Specifies the maximum number of integers that may be written to _`params`_ by the function.
    * 
    * _`params`_
    * 
    * Specifies the address of a variable into which to write the retrieved information.
    * 
    * Description
    * -----------
    * 
    * `glGetInternalformativ` retrieves information about implementation-dependent support for internal formats. _`target`_ indicates the target with which the internal format will be used and must be one of `GL_RENDERBUFFER`, `GL_TEXTURE_2D_MULTISAMPLE`, or `GL_TEXTURE_2D_MULTISAMPLE_ARRAY`, corresponding to usage as a renderbuffer, two-dimensional multisample texture or two-dimensional multisample array texture, respectively.
    * 
    * _`internalformat`_ specifies the internal format about which to retrieve information and must be a color-renderable, depth-renderable or stencil-renderable format.
    * 
    * The information retrieved will be written to memory addressed by the pointer specified in _`params`_. No more than _`bufSize`_ integers will be written to this memory.
    * 
    * If _`pname`_ is `GL_NUM_SAMPLE_COUNTS`, the number of sample counts that would be returned by querying `GL_SAMPLES` will be returned in _`params`_.
    * 
    * If _`pname`_ is `GL_SAMPLES`, the sample counts supported for _`internalformat`_ and _`target`_ are written into _`params`_ in descending numeric order. Only positive values are returned. Querying `GL_SAMPLES` with _`bufSize`_ of one will return just the maximum supported number of samples for this format. The maximum value in `GL_SAMPLES` is guaranteed to be at least the lowest of the following:
    * 
    * *   The value of `GL_MAX_INTEGER_SAMPLES` if _`internalformat`_ is a signed or unsigned integer format.
    * 
    * *   The value of `GL_MAX_DEPTH_TEXTURE_SAMPLES` if _`internalformat`_ is a depth- or stencil-renderable format and _`target`_ is `GL_TEXTURE_2D_MULTISAMPLE` or `GL_TEXTURE_2D_MULTISAMPLE_ARRAY`.
    * 
    * *   The value of `GL_MAX_COLOR_TEXTURE_SAMPLES` if _`internalformat`_ is a color-renderable format and _`target`_ is `GL_TEXTURE_2D_MULTISAMPLE` or `GL_TEXTURE_2D_MULTISAMPLE_ARRAY`.
    * 
    * *   The value of `GL_MAX_SAMPLES`.
    * 
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`bufSize`_ is negative.
    * 
    * `GL_INVALID_ENUM` is generated if _`pname`_ is not `GL_SAMPLES` or `GL_NUM_SAMPLE_COUNTS`.
    * 
    * `GL_INVALID_ENUM` is generated if _`internalformat`_ is not color-, depth-, or stencil-renderable.
    * 
    * `GL_INVALID_ENUM` is generated if _`target`_ is not `GL_RENDERBUFFER`, `GL_TEXTURE_2D_MULTISAMPLE`, or `GL_TEXTURE_2D_MULTISAMPLE_ARRAY`.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glGetInternalformativ | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2011-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glGetInternalformativ.glGetInternalformativ
    */
    fun glGetInternalformativ(target: Int, internalformat: Int, pname: Int, bufSize: UInt, params: java.nio.IntBuffer)
}