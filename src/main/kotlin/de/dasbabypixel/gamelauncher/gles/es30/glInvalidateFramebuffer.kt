package de.dasbabypixel.gamelauncher.gles.es30

interface glInvalidateFramebuffer {
    /**
    * Name
    * ----
    * 
    * glInvalidateFramebuffer — Invalidate the contents of attachments within a framebuffer
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glInvalidateFramebuffer**(` | GLenum target, |
    * | --- | --- |
    * |   | GLsizei numAttachments, |
    * |   | const GLenum \*attachments`)`; |
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
    * Description
    * -----------
    * 
    * `glInvalidateFramebuffer` signals to the GL that it need not preserve all pixels of the framebuffer bound to _`target`_. _`target`_ must be `GL_READ_FRAMEBFUFFER`, `GL_DRAW_FRAMEBUFFER` or `GL_FRAMEBUFFER`. The token `GL_FRAMEBUFFER` is treated as `GL_DRAW_FRAMEBUFFER`. _`attachments`_ contains a list of _`numAttachments`_ to be invalidated. If an attachment is specified that does not exist in the bound framebuffer, it is ignored.
    * 
    * If a framebuffer object is bound, then _`attachments`_ may contain `GL_COLOR_ATTACHMENTi`, `GL_DEPTH_ATTACHMENT`, `GL_STENCIL_ATTACHMENT`, and/or `GL_DEPTH_STENCIL_ATTACHMENT`. If the framebuffer object is not complete, `glInvalidateFramebuffer` may be ignored.
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
    * | glInvalidateFramebuffer | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glBindFramebuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindFramebuffer.glBindFramebuffer], [glBlitFramebuffer][de.dasbabypixel.gamelauncher.gles.es30.glBlitFramebuffer.glBlitFramebuffer] [glFramebufferRenderbuffer][de.dasbabypixel.gamelauncher.gles.es20.glFramebufferRenderbuffer.glFramebufferRenderbuffer], [glFramebufferTexture2D][de.dasbabypixel.gamelauncher.gles.es20.glFramebufferTexture2D.glFramebufferTexture2D], [glFramebufferTextureLayer][de.dasbabypixel.gamelauncher.gles.es30.glFramebufferTextureLayer.glFramebufferTextureLayer], [glInvalidateSubFramebuffer][de.dasbabypixel.gamelauncher.gles.es30.glInvalidateSubFramebuffer.glInvalidateSubFramebuffer]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2014-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glInvalidateFramebuffer.glInvalidateFramebuffer
    */
    fun glInvalidateFramebuffer(target: Int, numAttachments: UInt, attachments: java.nio.IntBuffer)
}