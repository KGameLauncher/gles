package de.dasbabypixel.gamelauncher.gles.es20

interface glFramebufferTexture2D {
    /**
    * Name
    * ----
    * 
    * glFramebufferTexture2D — attach a level of a texture object as a logical buffer to the currently bound framebuffer object
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glFramebufferTexture2D**(` | GLenum target, |
    * | --- | --- |
    * |   | GLenum attachment, |
    * |   | GLenum textarget, |
    * |   | GLuint texture, |
    * |   | GLint level`)`; |
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
    * _`textarget`_
    * 
    * Specifies a 2D texture target, 2D multisample texture target, or for cube map textures, which face is to be attached.
    * 
    * _`texture`_
    * 
    * Specifies the texture object to attach to the framebuffer attachment point named by _`attachment`_.
    * 
    * _`level`_
    * 
    * Specifies the mipmap level of _`texture`_ to attach.
    * 
    * Description
    * -----------
    * 
    * `glFramebufferTexture2D` attaches a selected mipmap level or image of a texture object as one of the logical buffers of the framebuffer object currently bound to _`target`_. _`target`_ must be `GL_DRAW_FRAMEBUFFER`, `GL_READ_FRAMEBUFFER`, or `GL_FRAMEBUFFER`. `GL_FRAMEBUFFER` is equivalent to `GL_DRAW_FRAMEBUFFER`.
    * 
    * _`attachment`_ specifies the logical attachment of the framebuffer and must be `GL_COLOR_ATTACHMENT`_i_, `GL_DEPTH_ATTACHMENT`, `GL_STENCIL_ATTACHMENT` or `GL_DEPTH_STENCIL_ATTACHMENT`. _i_ in `GL_COLOR_ATTACHMENT`_i_ may range from zero to the value of `GL_MAX_COLOR_ATTACHMENTS` - 1. Attaching a level of a texture to `GL_DEPTH_STENCIL_ATTACHMENT` is equivalent to attaching that level to both the `GL_DEPTH_ATTACHMENT` _and_ the `GL_STENCIL_ATTACHMENT` attachment points simultaneously.
    * 
    * _`textarget`_ specifies what type of texture is named by _`texture`_, and for cube map textures, specifies the face that is to be attached. If _`texture`_ is not zero, it must be the name of an existing two dimensional texture with _`textarget`_ set to `GL_TEXTURE_2D`, or an existing two dimensional multisample texture with _`textarget`_ set to `GL_TEXTURE_2D_MULTISAMPLE`, unless it is a cube map texture, in which case _`textarget`_ must be `GL_TEXTURE_CUBE_MAP_POSITIVE_X` `GL_TEXTURE_CUBE_MAP_NEGATIVE_X`, `GL_TEXTURE_CUBE_MAP_POSITIVE_Y`, `GL_TEXTURE_CUBE_MAP_NEGATIVE_Y`, `GL_TEXTURE_CUBE_MAP_POSITIVE_Z`, or `GL_TEXTURE_CUBE_MAP_NEGATIVE_Z`.
    * 
    * If _`texture`_ is non-zero, the specified _`level`_ of the texture object named _`texture`_ is attached to the framebuffer attachment point named by _`attachment`_.
    * 
    * If _`textarget`_ is one of `GL_TEXTURE_CUBE_MAP_POSITIVE_X`, `GL_TEXTURE_CUBE_MAP_POSITIVE_Y`, `GL_TEXTURE_CUBE_MAP_POSITIVE_Z`, `GL_TEXTURE_CUBE_MAP_NEGATIVE_X`, `GL_TEXTURE_CUBE_MAP_NEGATIVE_Y`, or `GL_TEXTURE_CUBE_MAP_NEGATIVE_Z`, then _`level`_ must be greater than or equal to zero and less than or equal to log2 of the value of `GL_MAX_CUBE_MAP_TEXTURE_SIZE`. If _`textarget`_ is `GL_TEXTURE_2D`, _`level`_ must be greater than or equal to zero and no larger than log2 of the value of `GL_MAX_TEXTURE_SIZE`. If _`textarget`_ is `GL_TEXTURE_2D_MULTISAMPLE`, _`level`_ must be equal to zero.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`target`_ is not one of the accepted tokens.
    * 
    * `GL_INVALID_ENUM` is generated if _`attachment`_ is not one of the attachment points listed above.
    * 
    * `GL_INVALID_OPERATION` is generated if zero is bound to _`target`_.
    * 
    * `GL_INVALID_OPERATION` is generated if _`textarget`_ and _`texture`_ are not compatible.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glFramebufferTexture2D | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGenFramebuffers][de.dasbabypixel.gamelauncher.gles.es20.glGenFramebuffers.glGenFramebuffers], [glBindFramebuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindFramebuffer.glBindFramebuffer], [glGenRenderbuffers][de.dasbabypixel.gamelauncher.gles.es20.glGenRenderbuffers.glGenRenderbuffers], [glFramebufferRenderbuffer][de.dasbabypixel.gamelauncher.gles.es20.glFramebufferRenderbuffer.glFramebufferRenderbuffer], [glFramebufferTextureLayer][de.dasbabypixel.gamelauncher.gles.es30.glFramebufferTextureLayer.glFramebufferTextureLayer],
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glFramebufferTexture2D.glFramebufferTexture2D
    */
    fun glFramebufferTexture2D(target: Int, attachment: Int, textarget: Int, texture: UInt, level: Int)
}