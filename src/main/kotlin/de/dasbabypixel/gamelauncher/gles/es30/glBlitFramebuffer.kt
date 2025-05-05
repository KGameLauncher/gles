package de.dasbabypixel.gamelauncher.gles.es30

interface glBlitFramebuffer {
    /**
    * Name
    * ----
    * 
    * glBlitFramebuffer — copy a block of pixels from the read framebuffer to the draw framebuffer
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glBlitFramebuffer**(` | GLint srcX0, |
    * | --- | --- |
    * |   | GLint srcY0, |
    * |   | GLint srcX1, |
    * |   | GLint srcY1, |
    * |   | GLint dstX0, |
    * |   | GLint dstY0, |
    * |   | GLint dstX1, |
    * |   | GLint dstY1, |
    * |   | GLbitfield mask, |
    * |   | GLenum filter`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`srcX0`_, _`srcY0`_, _`srcX1`_, _`srcY1`_
    * 
    * Specify the bounds of the source rectangle within the read buffer of the read framebuffer.
    * 
    * _`dstX0`_, _`dstY0`_, _`dstX1`_, _`dstY1`_
    * 
    * Specify the bounds of the destination rectangle within the write buffer of the write framebuffer.
    * 
    * _`mask`_
    * 
    * The bitwise OR of the flags indicating which buffers are to be copied. The allowed flags are `GL_COLOR_BUFFER_BIT`, `GL_DEPTH_BUFFER_BIT` and `GL_STENCIL_BUFFER_BIT`.
    * 
    * _`filter`_
    * 
    * Specifies the interpolation to be applied if the image is stretched. Must be `GL_NEAREST` or `GL_LINEAR`.
    * 
    * Description
    * -----------
    * 
    * `glBlitFramebuffer` transfers a rectangle of pixel values from one region of the read framebuffer to another region in the draw framebuffer. _`mask`_ is the bitwise OR of a number of values indicating which buffers are to be copied. The values are `GL_COLOR_BUFFER_BIT`, `GL_DEPTH_BUFFER_BIT`, and `GL_STENCIL_BUFFER_BIT`. The pixels corresponding to these buffers are copied from the source rectangle bounded by the locations (_`srcX0`_; _`srcY0`_) and (_`srcX1`_; _`srcY1`_) to the destination rectangle bounded by the locations (_`dstX0`_; _`dstY0`_) and (_`dstX1`_; _`dstY1`_). The lower bounds of the rectangle are inclusive, while the upper bounds are exclusive.
    * 
    * The actual region taken from the read framebuffer is limited to the intersection of the source buffers being transferred, which may include the color buffer selected by the read buffer, the depth buffer, and/or the stencil buffer depending on mask. The actual region written to the draw framebuffer is limited to the intersection of the destination buffers being written, which may include multiple draw buffers, the depth buffer, and/or the stencil buffer depending on mask. Whether or not the source or destination regions are altered due to these limits, the scaling and offset applied to pixels being transferred is performed as though no such limits were present.
    * 
    * If the sizes of the source and destination rectangles are not equal, _`filter`_ specifies the interpolation method that will be applied to resize the source image , and must be `GL_NEAREST` or `GL_LINEAR`. `GL_LINEAR` is only a valid interpolation method for the color buffer. If _`filter`_ is not `GL_NEAREST` and _`mask`_ includes `GL_DEPTH_BUFFER_BIT` or `GL_STENCIL_BUFFER_BIT`, no data is transferred and a `GL_INVALID_OPERATION` error is generated.
    * 
    * If _`filter`_ is `GL_LINEAR` and the source rectangle would require sampling outside the bounds of the source framebuffer, values are read as if the `GL_CLAMP_TO_EDGE` texture wrapping mode were applied.
    * 
    * When the color buffer is transferred, values are taken from the read buffer of the read framebuffer and written to each of the draw buffers of the draw framebuffer.
    * 
    * If _`SAMPLE_BUFFERS`_ for the read framebuffer is greater than zero and _`SAMPLE_BUFFERS`_ for the draw framebuffer is zero, the samples corresponding to each pixel location in the source are converted to a single sample before being written to the destination.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`mask`_ contains any bits other than `GL_COLOR_BUFFER_BIT`, `GL_DEPTH_BUFFER_BIT` or `GL_STENCIL_BUFFER_BIT`.
    * 
    * `GL_INVALID_ENUM` is generated if _`filter`_ is not `GL_LINEAR` or `GL_NEAREST`.
    * 
    * `GL_INVALID_OPERATION` is generated if _`mask`_ contains any of the `GL_DEPTH_BUFFER_BIT` or `GL_STENCIL_BUFFER_BIT` and _`filter`_ is not `GL_NEAREST`.
    * 
    * `GL_INVALID_OPERATION` is generated if the source and destination buffers are identical.
    * 
    * `GL_INVALID_FRAMEBUFFER_OPERATION` is generated if the objects bound to `GL_DRAW_FRAMEBUFFER_BINDING` or `GL_READ_FRAMEBUFFER_BINDING` are not framebuffer complete.
    * 
    * `GL_INVALID_OPERATION` is generated if _`mask`_ contains `GL_DEPTH_BUFFER_BIT` or `GL_STENCIL_BUFFER_BIT` and the source and destination depth and stencil formats do not match.
    * 
    * `GL_INVALID_OPERATION` is generated if _`filter`_ is `GL_LINEAR` and the read buffer contains integer data.
    * 
    * `GL_INVALID_OPERATION` is generated if _`GL_SAMPLE_BUFFERS`_ for the read buffer is greater than zero and the formats of draw and read buffers are not identical, or the source and destination rectangles are not defined with the same (X0, Y0) and (X1, Y1) bounds.
    * 
    * `GL_INVALID_OPERATION` is generated if the value of _`GL_SAMPLE_BUFFERS`_ for the draw buffer is greater than zero.
    * 
    * `GL_INVALID_OPERATION` is generated if _`mask`_ contains `GL_COLOR_BUFFER_BIT` and any of the following conditions hold:
    * 
    * *   The read buffer contains fixed-point or floating-point values and any draw buffer contains neither fixed-point nor floating-point values.
    * 
    * *   The read buffer contains unsigned integer values and any draw buffer does not contain unsigned integer values.
    * 
    * *   The read buffer contains signed integer values and any draw buffer does not contain signed integer values.
    * 
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glBlitFramebuffer | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glReadPixels][de.dasbabypixel.gamelauncher.gles.es20.glReadPixels.glReadPixels] [glCheckFramebufferStatus][de.dasbabypixel.gamelauncher.gles.es20.glCheckFramebufferStatus.glCheckFramebufferStatus], [glGenFramebuffers][de.dasbabypixel.gamelauncher.gles.es20.glGenFramebuffers.glGenFramebuffers] [glBindFramebuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindFramebuffer.glBindFramebuffer] [glDeleteFramebuffers][de.dasbabypixel.gamelauncher.gles.es20.glDeleteFramebuffers.glDeleteFramebuffers]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glBlitFramebuffer.glBlitFramebuffer
    */
    fun glBlitFramebuffer(srcX0: Int, srcY0: Int, srcX1: Int, srcY1: Int, dstX0: Int, dstY0: Int, dstX1: Int, dstY1: Int, mask: Int, filter: Int)
}