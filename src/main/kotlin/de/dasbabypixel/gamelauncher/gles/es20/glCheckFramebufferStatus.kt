package de.dasbabypixel.gamelauncher.gles.es20

interface glCheckFramebufferStatus {
    /**
    * Name
    * ----
    * 
    * glCheckFramebufferStatus — check the completeness status of a framebuffer
    * 
    * C Specification
    * ---------------
    * 
    * | `GLenum **glCheckFramebufferStatus**(` | GLenum target`)`; |
    * | --- | --- |
    * 
    * Parameters
    * ----------
    * 
    * _`target`_
    * 
    * Specify the target of the framebuffer completeness check.
    * 
    * Description
    * -----------
    * 
    * `glCheckFramebufferStatus` queries the completeness status of the framebuffer object currently bound to _`target`_. _`target`_ must be `GL_DRAW_FRAMEBUFFER`, `GL_READ_FRAMEBUFFER` or `GL_FRAMEBUFFER`. `GL_FRAMEBUFFER` is equivalent to `GL_DRAW_FRAMEBUFFER`.
    * 
    * The return value is `GL_FRAMEBUFFER_COMPLETE` if the framebuffer bound to _`target`_ is complete. Otherwise, the return value is determined as follows:
    * 
    * *   `GL_FRAMEBUFFER_UNDEFINED` is returned if _`target`_ is the default framebuffer, but the default framebuffer does not exist.
    * 
    * *   `GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT` is returned if any of the framebuffer attachment points are framebuffer incomplete.
    * 
    * *   `GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT` is returned if the framebuffer does not have at least one image attached to it.
    * 
    * *   `GL_FRAMEBUFFER_UNSUPPORTED` is returned if depth and stencil attachments, if present, are not the same renderbuffer, or if the combination of internal formats of the attached images violates an implementation-dependent set of restrictions.
    * 
    * *   `GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE` is returned if the value of `GL_RENDERBUFFER_SAMPLES` is not the same for all attached renderbuffers or, if the attached images are a mix of renderbuffers and textures, the value of `GL_RENDERBUFFER_SAMPLES` is not zero.
    * 
    * *   `GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS` is returned if any framebuffer attachment is layered, and any populated attachment is not layered, or if all populated color attachments are not from textures of the same target.
    * 
    * 
    * Additionally, if an error occurs, zero is returned.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`target`_ is not `GL_DRAW_FRAMEBUFFER`, `GL_READ_FRAMEBUFFER` or `GL_FRAMEBUFFER`.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glCheckFramebufferStatus | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGenFramebuffers][de.dasbabypixel.gamelauncher.gles.es20.glGenFramebuffers.glGenFramebuffers], [glDeleteFramebuffers][de.dasbabypixel.gamelauncher.gles.es20.glDeleteFramebuffers.glDeleteFramebuffers] [glBindFramebuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindFramebuffer.glBindFramebuffer]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glCheckFramebufferStatus.glCheckFramebufferStatus
    */
    fun glCheckFramebufferStatus(target: Int): Int
}