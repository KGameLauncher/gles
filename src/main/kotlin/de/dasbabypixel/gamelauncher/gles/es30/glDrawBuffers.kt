package de.dasbabypixel.gamelauncher.gles.es30

interface glDrawBuffers {
    /**
    * Name
    * ----
    * 
    * glDrawBuffers — Specifies a list of color buffers to be drawn into
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glDrawBuffers**(` | GLsizei n, |
    * | --- | --- |
    * |   | const GLenum \*bufs`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`n`_
    * 
    * Specifies the number of buffers in _`bufs`_.
    * 
    * _`bufs`_
    * 
    * Points to an array of symbolic constants specifying the buffers into which fragment colors or data values will be written.
    * 
    * Description
    * -----------
    * 
    * `glDrawBuffers` defines an array of buffers into which outputs from the fragment shader data will be written. If a fragment shader writes a value to one or more user defined output variables, then the value of each variable will be written into the buffer specified at a location within _`bufs`_ corresponding to the location assigned to that user defined output. The draw buffer used for user defined outputs assigned to locations greater than or equal to _`n`_ is implicitly set to `GL_NONE` and any data written to such an output is discarded.
    * 
    * The symbolic constants contained in _`bufs`_ must be one of the following, depending on whether GL is bound to the default framebuffer or not:
    * 
    * `GL_NONE`
    * 
    * The fragment shader output value is not written into any color buffer.
    * 
    * `GL_BACK`
    * 
    * The fragment shader output value is written into the back color buffer.
    * 
    * `GL_COLOR_ATTACHMENT` _n_
    * 
    * The fragment shader output value is written into the _n_th color attachment of the current framebuffer. _n_ may range from zero to the value of `GL_MAX_COLOR_ATTACHMENTS`.
    * 
    * Except for `GL_NONE`, the preceding symbolic constants may not appear more than once in _`bufs`_. The maximum number of draw buffers supported is implementation dependent and can be queried by calling [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with the argument `GL_MAX_DRAW_BUFFERS`.
    * 
    * Notes
    * -----
    * 
    * If a fragment shader does not write to a user defined output variable, the values of the fragment colors following shader execution are undefined. For each fragment generated in this situation, a different value may be written into each of the buffers specified by _`bufs`_.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if one of the values in _`bufs`_ is not an accepted value.
    * 
    * `GL_INVALID_OPERATION` is generated if the GL is bound to the default framebuffer and _`n`_ is not 1, or if the value in _`bufs`_ is one of the `GL_COLOR_ATTACHMENT`_n_ tokens.
    * 
    * `GL_INVALID_OPERATION` is generated if the GL is bound to a framebuffer object and the ith buffer listed in _`bufs`_ is anything other than `GL_NONE` or `GL_COLOR_ATTACHMENTS`_i_.
    * 
    * `GL_INVALID_VALUE` is generated if _`n`_ is less than 0 or greater than `GL_MAX_DRAW_BUFFERS`.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_MAX_DRAW_BUFFERS`
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_DRAW_BUFFER`_i_ where _i_ indicates the number of the draw buffer whose value is to be queried.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glDrawBuffers | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glReadBuffer][de.dasbabypixel.gamelauncher.gles.es30.glReadBuffer.glReadBuffer]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2003-2005 3Dlabs Inc. Ltd. Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glDrawBuffers.glDrawBuffers
    */
    fun glDrawBuffers(n: UInt, bufs: java.nio.IntBuffer)
}