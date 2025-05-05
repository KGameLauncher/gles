package de.dasbabypixel.gamelauncher.gles.es20

interface glGetFramebufferAttachmentParameteriv {
    /**
    * Name
    * ----
    * 
    * glGetFramebufferAttachmentParameteriv — retrieve information about attachments of a bound framebuffer object
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGetFramebufferAttachmentParameteriv**(` | GLenum target, |
    * | --- | --- |
    * |   | GLenum attachment, |
    * |   | GLenum pname, |
    * |   | GLint \*params`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`target`_
    * 
    * Specifies the target of the query operation.
    * 
    * _`attachment`_
    * 
    * Specifies the attachment within _`target`_
    * 
    * _`pname`_
    * 
    * Specifies the parameter of _`attachment`_ to query.
    * 
    * _`params`_
    * 
    * Specifies the address of a variable receive the value of _`pname`_ for _`attachment`_.
    * 
    * Description
    * -----------
    * 
    * `glGetFramebufferAttachmentParameteriv` returns information about attachments of a bound framebuffer object. _`target`_ specifies the framebuffer binding point and must be `GL_DRAW_FRAMEBUFFER`, `GL_READ_FRAMEBUFFER` or `GL_FRAMEBUFFER`. `GL_FRAMEBUFFER` is equivalent to `GL_DRAW_FRAMEBUFFER`.
    * 
    * If the default framebuffer is bound to _`target`_ then _`attachment`_ must be one of `GL_BACK`, identifying a color buffer, `GL_DEPTH`, identifying the depth buffer, or `GL_STENCIL`, identifying the stencil buffer.
    * 
    * If a framebuffer object is bound, then _`attachment`_ must be one of `GL_COLOR_ATTACHMENT`_i_, `GL_DEPTH_ATTACHMENT`, `GL_STENCIL_ATTACHMENT`, or `GL_DEPTH_STENCIL_ATTACHMENT`. _i_ in `GL_COLOR_ATTACHMENT`_i_ must be in the range zero to the value of `GL_MAX_COLOR_ATTACHMENTS` minus one.
    * 
    * If _`attachment`_ is `GL_DEPTH_STENCIL_ATTACHMENT` and different objects are bound to the depth and stencil attachment points of _`target`_ the query will fail. If the same object is bound to both attachment points, information about that object will be returned.
    * 
    * Upon successful return from `glGetFramebufferAttachmentParameteriv`, if _`pname`_ is `GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE`, then _`params`_ will contain one of `GL_NONE`, `GL_FRAMEBUFFER_DEFAULT`, `GL_TEXTURE`, or `GL_RENDERBUFFER`, identifying the type of object which contains the attached image. Other values accepted for _`pname`_ depend on the type of object, as described below.
    * 
    * If the value of `GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE` is `GL_NONE`, no framebuffer is bound to _`target`_. In this case querying _`pname`_ `GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME` will return zero, and all other queries will generate an error.
    * 
    * If the value of `GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE` is not `GL_NONE`, these queries apply to all other framebuffer types:
    * 
    * *   If _`pname`_ is `GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE`, `GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE`, `GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE`, `GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE`, `GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE`, or `GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE`, then _`params`_ will contain the number of bits in the corresponding red, green, blue, alpha, depth, or stencil component of the specified attachment. Zero is returned if the requested component is not present in _`attachment`_.
    * 
    * *   If _`pname`_ is `GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE`, _`params`_ will contain the format of components of the specified attachment, one of `GL_FLOAT`, _`GL_INT`_, _`GL_UNSIGNED_INT`_, _`GL_SIGNED_NORMALIZED`_, or _`GL_UNSIGNED_NORMALIZED`_ for floating-point, signed integer, unsigned integer, signed normalized fixed-point, or unsigned normalized fixed-point components respectively. Only color buffers may have integer components.
    * 
    * *   If _`pname`_ is `GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING`, _`param`_ will contain the encoding of components of the specified attachment, one of `GL_LINEAR` or `GL_SRGB` for linear or sRGB-encoded components, respectively. Only color buffer components may be sRGB-encoded. For the default framebuffer, color encoding is determined by the implementation. For framebuffer objects, components are sRGB-encoded if the internal format of a color attachment is one of the color-renderable SRGB formats.
    * 
    * 
    * If the value of `GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE` is `GL_RENDERBUFFER`, then:
    * 
    * *   If _`pname`_ is `GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME`, _`params`_ will contain the name of the renderbuffer object which contains the attached image.
    * 
    * 
    * If the value of `GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE` is `GL_TEXTURE`, then:
    * 
    * *   If _`pname`_ is `GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME`, then _`params`_ will contain the name of the texture object which contains the attached image.
    * 
    * *   If _`pname`_ is `GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL`, then _`params`_ will contain the mipmap level of the texture object which contains the attached image.
    * 
    * *   If _`pname`_ is `GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE` and the texture object named `GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME` is a cube map texture, then _`params`_ will contain the cube map face of the cubemap texture object which contains the attached image. Otherwise _`params`_ will contain the value zero.
    * 
    * *   If _`pname`_ is `GL_FRAMEBUFFER_ATTACHMENT_LAYERED`, then _`params`_ will contain `GL_TRUE` if an entire level of a three-dimensional texture, cube map texture, two-dimensional array, or two-dimensional multisample array texture is attached. Otherwise, _`params`_ will contain `GL_FALSE`.
    * 
    * *   If _`pname`_ is `GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER` and the texture object named `GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME` is a three-dimensional texture or a two-dimensional array texture, and the value of `GL_FRAMEBUFFER_ATTACHMENT_LAYERED` is `GL_FALSE`, then _`params`_ will contain the number of the texture layer which contains the attached image. Otherwise _`params`_ will contain the value zero.
    * 
    * 
    * Any combinations of framebuffer type and _`pname`_ not described above will generate an error.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`target`_ is not one of the accepted tokens.
    * 
    * `GL_INVALID_ENUM` is generated if _`pname`_ is not valid for the value of `GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE`.
    * 
    * `GL_INVALID_OPERATION` is generated if _`attachment`_ is not the accepted values for _`target`_.
    * 
    * `GL_INVALID_OPERATION` is generated if _`attachment`_ is `GL_DEPTH_STENCIL_ATTACHMENT` and different objects are bound to the depth and stencil attachment points of _`target`_.
    * 
    * `GL_INVALID_OPERATION` is generated if the value of `GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE` is `GL_NONE` and _`pname`_ is not `GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME`.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glGetFramebufferAttachmentParameteriv | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGenFramebuffers][de.dasbabypixel.gamelauncher.gles.es20.glGenFramebuffers.glGenFramebuffers], [glBindFramebuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindFramebuffer.glBindFramebuffer]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glGetFramebufferAttachmentParameteriv.glGetFramebufferAttachmentParameteriv
    */
    fun glGetFramebufferAttachmentParameteriv(target: Int, attachment: Int, pname: Int, params: java.nio.IntBuffer)
}