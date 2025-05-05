package de.dasbabypixel.gamelauncher.gles.es31

interface glFramebufferParameteri {
    /**
    * Name
    * ----
    * 
    * glFramebufferParameteri — set a named parameter of a framebuffer
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glFramebufferParameteri**(` | GLenum target, |
    * | --- | --- |
    * |   | GLenum pname, |
    * |   | GLint param`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`target`_
    * 
    * The target of the operation, which must be `GL_READ_FRAMEBUFFER`, `GL_DRAW_FRAMEBUFFER` or `GL_FRAMEBUFFER`.
    * 
    * _`pname`_
    * 
    * A token indicating the parameter to be modified.
    * 
    * _`param`_
    * 
    * The new value for the parameter named _`pname`_.
    * 
    * Description
    * -----------
    * 
    * `glFramebufferParameteri` modifies the current value of the parameter named _`pname`_ in the framebuffer bound to _`target`_. _`target`_ must be `GL_READ_FRAMEBFUFFER`, `GL_DRAW_FRAMEBUFFER` or `GL_FRAMEBUFFER`. The token `GL_FRAMEBUFFER` is treated as `GL_DRAW_FRAMEBUFFER`. A non-default framebuffer must be bound to _`target`_.
    * 
    * _`pname`_ specifies the parameter to be modified. The following symbols are accepted in _`pname`_:
    * 
    * `GL_FRAMEBUFFER_DEFAULT_WIDTH`
    * 
    * _`param`_ specifies the assumed width for a framebuffer object with no attachments. If a framebuffer has attachments then the width of those attachments is used, otherwise the value of `GL_FRAMEBUFFER_DEFAULT_WIDTH` is used for the framebuffer. _`param`_ must be greater than or equal to zero and less than or equal to the value of `GL_MAX_FRAMEBUFFER_WIDTH`.
    * 
    * `GL_FRAMEBUFFER_DEFAULT_HEIGHT`
    * 
    * _`param`_ specifies the assumed height for a framebuffer object with no attachments. If a framebuffer has attachments then the height of those attachments is used, otherwise the value of `GL_FRAMEBUFFER_DEFAULT_HEIGHT` is used for the framebuffer. _`param`_ must be greater than or equal to zero and less than or equal to the value of `GL_MAX_FRAMEBUFFER_HEIGHT`.
    * 
    * `GL_FRAMEBUFFER_DEFAULT_SAMPLES`
    * 
    * _`param`_ specifies the assumed number of samples in a framebuffer object with no attachments. If a framebuffer has attachments then the sample count of those attachments is used, otherwise the value of `GL_FRAMEBUFFER_DEFAULT_SAMPLES` is used for the framebuffer. _`param`_ must be greater than or equal to zero and less than or equal to the value of `GL_MAX_FRAMEBUFFER_SAMPLE`.
    * 
    * `GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS`
    * 
    * _`param`_ specifies whether the framebuffer should assume identical sample locations and the same number of samples for all texels in the virtual image. If _`param`_ is zero, then the implementation may vary the position or the count of samples within the virtual image from pixel to pixel, otherwise it will use the same sample position and count for all pixels in the virtual image.
    * 
    * `GL_FRAMEBUFFER_DEFAULT_LAYERS`
    * 
    * _`param`_ specifies the assumed number of layers for a framebuffer object with no attachments. If a framebuffer has attachments then the layer count of those attachments is used, otherwise the value of `GL_FRAMEBUFFER_DEFAULT_LAYERS` is used for the framebuffer. _`param`_ must be greater than or equal to zero and less than or equal to the value of `GL_MAX_FRAMEBUFFER_LAYERS`.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`target`_ is not one of the accepted framebuffer targets.
    * 
    * `GL_INVALID_VALUE` is generated if _`pname`_ is `GL_FRAMEBUFFER_DEFAULT_WIDTH` and _`param`_ is less than zero or greater than the value of `GL_MAX_FRAMEBUFFER_WIDTH`.
    * 
    * `GL_INVALID_VALUE` is generated if _`pname`_ is `GL_FRAMEBUFFER_DEFAULT_HEIGHT` and _`param`_ is less than zero or greater than the value of `GL_MAX_FRAMEBUFFER_HEIGHT`.
    * 
    * `GL_INVALID_VALUE` is generated if _`pname`_ is `GL_FRAMEBUFFER_DEFAULT_SAMPLES` and _`param`_ is less than zero or greater than the value of `GL_MAX_FRAMEBUFFER_SAMPLES`.
    * 
    * `GL_INVALID_VALUE` is generated if _`pname`_ is `GL_FRAMEBUFFER_DEFAULT_LAYERS` and _`param`_ is less than zero or greater than the value of `GL_MAX_FRAMEBUFFER_LAYERS`.
    * 
    * `GL_INVALID_OPERATION` is generated if the default framebuffer is bound to _`target`_.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGetFramebufferParameteriv][de.dasbabypixel.gamelauncher.gles.es31.glGetFramebufferParameteriv.glGetFramebufferParameteriv].
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glFramebufferParameteri` | \- | \- | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glBindFramebuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindFramebuffer.glBindFramebuffer],
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2012-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es31.glFramebufferParameteri.glFramebufferParameteri
    */
    fun glFramebufferParameteri(target: Int, pname: Int, param: Int)
}