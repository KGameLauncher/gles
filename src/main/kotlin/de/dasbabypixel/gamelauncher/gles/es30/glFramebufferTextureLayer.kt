package de.dasbabypixel.gamelauncher.gles.es30

interface glFramebufferTextureLayer {
    /**
    * Name
    * ----
    * 
    * glFramebufferTextureLayer — attach a single layer of a texture to a framebuffer
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glFramebufferTextureLayer**(` | GLenum target, |
    * | --- | --- |
    * |   | GLenum attachment, |
    * |   | GLuint texture, |
    * |   | GLint level, |
    * |   | GLint layer`)`; |
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
    * Specifies the attachment point of the framebuffer. _`attachment`_ must be `GL_COLOR_ATTACHMENT`_i_, `GL_DEPTH_ATTACHMENT`, `GL_STENCIL_ATTACHMENT` or `GL_DEPTH_STENCIL_ATTACHMENT`.
    * 
    * _`texture`_
    * 
    * Specifies the texture object to attach to the framebuffer attachment point named by _`attachment`_.
    * 
    * _`level`_
    * 
    * Specifies the mipmap level of _`texture`_ to attach.
    * 
    * _`layer`_
    * 
    * Specifies the layer of _`texture`_ to attach.
    * 
    * Description
    * -----------
    * 
    * `glFramebufferTextureLayer` operates like [glFramebufferTexture2D][de.dasbabypixel.gamelauncher.gles.es20.glFramebufferTexture2D.glFramebufferTexture2D], except that only a single layer of the texture level, given by _`layer`_, is attached to the attachment point. If _`texture`_ is not zero, _`layer`_ must be greater than or equal to zero. _`texture`_ must either be zero or the name of an existing three-dimensional texture, two-dimensional array texture, cube map array texture, or a two-dimensional multisample array texture.
    * 
    * If _`texture`_ is a 3D texture, then _`level`_ must be greater than or equal to zero and less than or equal to log2 of the value of `GL_MAX_3D_TEXTURE_SIZE`. If _`texture`_ is a 2D array or cube map array texture, _`level`_ must be greater than or equal to zero and no larger than log2 of the value of `GL_MAX_TEXTURE_SIZE`. If _`texture`_ is a 2D multisample array texture, _`level`_ must be equal to zero.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`target`_ is not one of the accepted tokens.
    * 
    * `GL_INVALID_ENUM` is generated if _`attachment`_ is not one of the accepted tokens.
    * 
    * `GL_INVALID_VALUE` is generated if _`texture`_ is not zero or the name of an existing texture object.
    * 
    * `GL_INVALID_VALUE` is generated if _`texture`_ is not zero and _`layer`_ is negative.
    * 
    * `GL_INVALID_VALUE` is generated if _`texture`_ is not zero and _`layer`_ is greater than the value of `GL_MAX_3D_TEXTURE_SIZE` minus one for a 3D texture or greater than the value of `GL_MAX_ARRAY_TEXTURE_LAYERS` minus one for a 2D array or 2D multisample array texture.
    * 
    * `GL_INVALID_OPERATION` is generated if zero is bound to _`target`_.
    * 
    * `GL_INVALID_OPERATION` is generated if _`texture`_ is not zero or the name of an existing three-dimensional, two-dimensional array, cube map array, or two-dimensional multisample array texture.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glFramebufferTextureLayer | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGenFramebuffers][de.dasbabypixel.gamelauncher.gles.es20.glGenFramebuffers.glGenFramebuffers], [glBindFramebuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindFramebuffer.glBindFramebuffer], [glGenRenderbuffers][de.dasbabypixel.gamelauncher.gles.es20.glGenRenderbuffers.glGenRenderbuffers], [glFramebufferRenderbuffer][de.dasbabypixel.gamelauncher.gles.es20.glFramebufferRenderbuffer.glFramebufferRenderbuffer], [glFramebufferTexture2D][de.dasbabypixel.gamelauncher.gles.es20.glFramebufferTexture2D.glFramebufferTexture2D],
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glFramebufferTextureLayer.glFramebufferTextureLayer
    */
    fun glFramebufferTextureLayer(target: Int, attachment: Int, texture: UInt, level: Int, layer: Int)
}