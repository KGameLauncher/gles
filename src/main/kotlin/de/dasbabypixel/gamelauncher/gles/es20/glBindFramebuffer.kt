package de.dasbabypixel.gamelauncher.gles.es20

interface glBindFramebuffer {
    /**
    * Name
    * ----
    * 
    * glBindFramebuffer — bind a framebuffer to a framebuffer target
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glBindFramebuffer**(` | GLenum target, |
    * | --- | --- |
    * |   | GLuint framebuffer`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`target`_
    * 
    * Specifies the framebuffer target of the binding operation.
    * 
    * _`framebuffer`_
    * 
    * Specifies the name of the framebuffer object to bind.
    * 
    * Description
    * -----------
    * 
    * `glBindFramebuffer` binds the framebuffer object with name _`framebuffer`_ to the framebuffer target specified by _`target`_. _`target`_ must be either `GL_DRAW_FRAMEBUFFER`, `GL_READ_FRAMEBUFFER` or `GL_FRAMEBUFFER`. If a framebuffer object is bound to `GL_DRAW_FRAMEBUFFER` or `GL_READ_FRAMEBUFFER`, it becomes the target for rendering or readback operations, respectively, until it is deleted or another framebuffer is bound to the corresponding bind point. Calling `glBindFramebuffer` with _`target`_ set to `GL_FRAMEBUFFER` binds _`framebuffer`_ to both the read and draw framebuffer targets.
    * 
    * [glGenFramebuffers][de.dasbabypixel.gamelauncher.gles.es20.glGenFramebuffers.glGenFramebuffers] may be used to generate a set of unused framebuffer object names.
    * 
    * The storage, dimensions, allocation, and format of the images attached to the default framebuffer are managed entirely by the window system. In order that access to the default framebuffer is not lost, it is treated as a framebuffer object with the name of zero. The default framebuffer is therefore rendered to and read from while zero is bound to the corresponding targets.
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
    * | glBindFramebuffer | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGenFramebuffers][de.dasbabypixel.gamelauncher.gles.es20.glGenFramebuffers.glGenFramebuffers], [glDeleteFramebuffers][de.dasbabypixel.gamelauncher.gles.es20.glDeleteFramebuffers.glDeleteFramebuffers], [glFramebufferRenderbuffer][de.dasbabypixel.gamelauncher.gles.es20.glFramebufferRenderbuffer.glFramebufferRenderbuffer], [glFramebufferTexture2D][de.dasbabypixel.gamelauncher.gles.es20.glFramebufferTexture2D.glFramebufferTexture2D], [glFramebufferTextureLayer][de.dasbabypixel.gamelauncher.gles.es30.glFramebufferTextureLayer.glFramebufferTextureLayer], [glIsFramebuffer][de.dasbabypixel.gamelauncher.gles.es20.glIsFramebuffer.glIsFramebuffer]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glBindFramebuffer.glBindFramebuffer
    */
    fun glBindFramebuffer(target: Int, framebuffer: UInt)
}