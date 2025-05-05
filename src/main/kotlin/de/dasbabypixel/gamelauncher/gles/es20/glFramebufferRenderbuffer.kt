package de.dasbabypixel.gamelauncher.gles.es20

interface glFramebufferRenderbuffer {
    /**
    * Name
    * ----
    * 
    * glFramebufferRenderbuffer — attach a renderbuffer as a logical buffer to the currently bound framebuffer object
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glFramebufferRenderbuffer**(` | GLenum target, |
    * | --- | --- |
    * |   | GLenum attachment, |
    * |   | GLenum renderbuffertarget, |
    * |   | GLuint renderbuffer`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`target`_
    * 
    * Specifies the framebuffer target. _`target`_ must be `GL_DRAW_FRAMEBUFFER`, `GL_READ_FRAMEBUFFER`, or `GL_FRAMEBUFFER`. `GL_FRAMEBUFFER` is equivalent to `GL_DRAW_FRAMEBUFFER`.
    * 
    * _`attachment`_
    * 
    * Specifies the attachment point of the framebuffer.
    * 
    * _`renderbuffertarget`_
    * 
    * Specifies the renderbuffer target and must be `GL_RENDERBUFFER`.
    * 
    * _`renderbuffer`_
    * 
    * Specifies the name of an existing renderbuffer object of type _`renderbuffertarget`_ to attach.
    * 
    * Description
    * -----------
    * 
    * `glFramebufferRenderbuffer` attaches a renderbuffer as one of the logical buffers of the currently bound framebuffer object. _`renderbuffer`_ is the name of the renderbuffer object to attach and must be either zero, or the name of an existing renderbuffer object of type _`renderbuffertarget`_. If _`renderbuffer`_ is not zero and if `glFramebufferRenderbuffer` is successful, then the renderbuffer name _`renderbuffer`_ will be used as the logical buffer identified by _`attachment`_ of the framebuffer currently bound to _`target`_.
    * 
    * The value of `GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE` for the specified attachment point is set to `GL_RENDERBUFFER` and the value of `GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME` is set to _`renderbuffer`_. All other state values of the attachment point specified by _`attachment`_ are set to their default values. No change is made to the state of the renderbuuffer object and any previous attachment to the _`attachment`_ logical buffer of the framebuffer _`target`_ is broken.
    * 
    * Calling `glFramebufferRenderbuffer` with the renderbuffer name zero will detach the image, if any, identified by _`attachment`_, in the framebuffer currently bound to _`target`_. All state values of the attachment point specified by attachment in the object bound to target are set to their default values.
    * 
    * Setting _`attachment`_ to the value `GL_DEPTH_STENCIL_ATTACHMENT` is a special case causing both the depth and stencil attachments of the framebuffer object to be set to _`renderbuffer`_, which should have the base internal format `GL_DEPTH_STENCIL`.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`target`_ is not one of the accepted tokens.
    * 
    * `GL_INVALID_ENUM` is generated if _`renderbuffertarget`_ is not `GL_RENDERBUFFER`.
    * 
    * `GL_INVALID_OPERATION` is generated if zero is bound to _`target`_.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glFramebufferRenderbuffer | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGenFramebuffers][de.dasbabypixel.gamelauncher.gles.es20.glGenFramebuffers.glGenFramebuffers], [glBindFramebuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindFramebuffer.glBindFramebuffer], [glGenRenderbuffers][de.dasbabypixel.gamelauncher.gles.es20.glGenRenderbuffers.glGenRenderbuffers], [glFramebufferTexture][de.dasbabypixel.gamelauncher.gles.es32.glFramebufferTexture.glFramebufferTexture], [glFramebufferTexture2D][de.dasbabypixel.gamelauncher.gles.es20.glFramebufferTexture2D.glFramebufferTexture2D], [glFramebufferTextureLayer][de.dasbabypixel.gamelauncher.gles.es30.glFramebufferTextureLayer.glFramebufferTextureLayer]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glFramebufferRenderbuffer.glFramebufferRenderbuffer
    */
    fun glFramebufferRenderbuffer(target: Int, attachment: Int, renderbuffertarget: Int, renderbuffer: UInt)
}