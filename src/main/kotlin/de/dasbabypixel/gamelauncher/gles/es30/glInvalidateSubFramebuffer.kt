package de.dasbabypixel.gamelauncher.gles.es30

interface glInvalidateSubFramebuffer {
    /**
    * Name
    * ----
    * 
    * glInvalidateSubFramebuffer — Invalidate portions of the contents of attachments within a framebuffer
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glInvalidateSubFramebuffer**(` | GLenum target, |
    * | --- | --- |
    * |   | GLsizei numAttachments, |
    * |   | const GLenum \*attachments, |
    * |   | GLintx, |
    * |   | GLinty, |
    * |   | GLsizei width, |
    * |   | GLsizei height`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`target`_
    * 
    * Specifies the target of the invalidate operation.
    * 
    * _`numAttachments`_
    * 
    * Specifies how many attachments are supplied in the _`attachments`_ list.
    * 
    * _`attachments`_
    * 
    * A list of _`numAttachments`_ attachments to invalidate.
    * 
    * _`x`_
    * 
    * Specifies the left origin of the pixel rectangle to invalidate, with lower left hand corner at (0,0).
    * 
    * _`y`_
    * 
    * Specifies the bottom origin of the pixel rectangle to invalidate, with lower left hand corner at (0,0).
    * 
    * _`width`_
    * 
    * Specifies the width of the pixel rectangle to invalidate.
    * 
    * _`height`_
    * 
    * Specifies the height of the pixel rectangle to invalidate.
    * 
    * Description
    * -----------
    * 
    * `glInvalidateSubFramebuffer` signals to the GL that it need not preserve all pixels of a specified region of the framebuffer bound to _`target`_. _`target`_ must be `GL_READ_FRAMEBFUFFER`, `GL_DRAW_FRAMEBUFFER` or `GL_FRAMEBUFFER`. The token `GL_FRAMEBUFFER` is treated as `GL_DRAW_FRAMEBUFFER`. _`attachments`_ contains a list of _`numAttachments`_ to be invalidated. If an attachment is specified that does not exist in the bound framebuffer, it is ignored. _`x`_, _`y`_, _`width`_ and _`height`_ specify the bounds of the pixel rectangle to invalidate. Any of these pixels lying outside of the window allocated to the current GL context, or outside of the image attached to the currently bound framebuffer object, are ignored.
    * 
    * If a framebuffer object is bound, then _`attachments`_ may contain `GL_COLOR_ATTACHMENTi`, `GL_DEPTH_ATTACHMENT`, `GL_STENCIL_ATTACHMENT`, and/or `GL_DEPTH_STENCIL_ATTACHMENT`. If the framebuffer object is not complete, `glInvalidateSubFramebuffer` may be ignored.
    * 
    * If the default framebuffer is bound, then _`attachments`_ may contain `GL_COLOR`, identifying the color buffer; `GL_DEPTH`, identifying the depth buffer; and/or `GL_STENCIL`, identifying the stencil buffer.
    * 
    * Notes
    * -----
    * 
    * The intention of this function is to provide a hint to the GL implementation that there is no longer a need to preserve the contents of particular attachments of a framebuffer object, or the default framebuffer. It is possible, for example, to signal the intention that depth and or stencil data is no longer needed at the end of a scene, or that multisample color buffer data is no longer needed after a resolve through [glBlitFramebuffer][de.dasbabypixel.gamelauncher.gles.es30.glBlitFramebuffer.glBlitFramebuffer].
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`target`_ is not `GL_DRAW_FRAMEBUFFER`, `GL_READ_FRAMEBUFFER`, or `GL_FRAMEBUFFER`.
    * 
    * `GL_INVALID_OPERATION` is generated if _`attachments`_ contains `GL_COLOR_ATTACHMENTm` and m is greater than or equal to the value of `GL_MAX_COLOR_ATTACHMENTS`.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glInvalidateSubFramebuffer | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glBindFramebuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindFramebuffer.glBindFramebuffer], [glBlitFramebuffer][de.dasbabypixel.gamelauncher.gles.es30.glBlitFramebuffer.glBlitFramebuffer] [glFramebufferRenderbuffer][de.dasbabypixel.gamelauncher.gles.es20.glFramebufferRenderbuffer.glFramebufferRenderbuffer], [glFramebufferTexture2D][de.dasbabypixel.gamelauncher.gles.es20.glFramebufferTexture2D.glFramebufferTexture2D], [glFramebufferTextureLayer][de.dasbabypixel.gamelauncher.gles.es30.glFramebufferTextureLayer.glFramebufferTextureLayer], [glInvalidateFramebuffer][de.dasbabypixel.gamelauncher.gles.es30.glInvalidateFramebuffer.glInvalidateFramebuffer]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2014-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glInvalidateSubFramebuffer.glInvalidateSubFramebuffer
    */
    fun glInvalidateSubFramebuffer(target: Int, numAttachments: UInt, attachments: de.dasbabypixel.gamelauncher.buffers.IntBufferRO, x: Int, y: Int, width: UInt, height: UInt)
}