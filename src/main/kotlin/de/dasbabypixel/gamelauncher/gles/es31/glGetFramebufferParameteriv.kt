package de.dasbabypixel.gamelauncher.gles.es31

interface glGetFramebufferParameteriv {
    /**
    * Name
    * ----
    * 
    * glGetFramebufferParameteriv — retrieve a named parameter from a framebuffer
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGetFramebufferParameteriv**(` | GLenum target, |
    * | --- | --- |
    * |   | GLenum pname, |
    * |   | GLint \* params`)`; |
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
    * A token indicating the parameter to be retrieved.
    * 
    * _`params`_
    * 
    * The address of a variable to receive the value of the parameter named _`pname`_.
    * 
    * Description
    * -----------
    * 
    * `glGetFramebufferParameteriv` retrieves the current value of the parameter named _`pname`_ from the framebuffer bound to _`target`_. _`target`_ must be `GL_READ_FRAMEBFUFFER`, `GL_DRAW_FRAMEBUFFER` or `GL_FRAMEBUFFER`. The token `GL_FRAMEBUFFER` is treated as `GL_DRAW_FRAMEBUFFER`. A non-default framebuffer must be bound to _`target`_.
    * 
    * _`pname`_ specifies the parameter to be retrieved. The values retrieved from the framebuffer are written into the variable whose address is given by _`params`_. The following symbols are accepted in _`pname`_:
    * 
    * `GL_FRAMEBUFFER_DEFAULT_WIDTH`
    * 
    * The value of `GL_FRAMEBUFFER_DEFAULT_WIDTH` for the framebuffer is written to the single integer variable whose address is given by _`params`_.
    * 
    * `GL_FRAMEBUFFER_DEFAULT_HEIGHT`
    * 
    * The value of `GL_FRAMEBUFFER_DEFAULT_HEIGHT` for the framebuffer is written to the single integer variable whose address is given by _`params`_.
    * 
    * `GL_FRAMEBUFFER_DEFAULT_SAMPLES`
    * 
    * The value of `GL_FRAMEBUFFER_DEFAULT_SAMPLES` for the framebuffer is written to the single integer variable whose address is given by _`params`_.
    * 
    * `GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS`
    * 
    * If the value of `GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS` for the framebuffer is `GL_TRUE` then the single integer variable whose address is in _`params`_ is set to one, otherwise it is set to zero.
    * 
    * `GL_FRAMEBUFFER_DEFAULT_LAYERS`
    * 
    * _`params`_ returns the value of `GL_FRAMEBUFFER_DEFAULT_LAYERS` for the framebuffer.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`target`_ is not one of the accepted framebuffer targets.
    * 
    * `GL_INVALID_ENUM` is generated if _`pname`_ is not one of the accepted parameter names.
    * 
    * `GL_INVALID_OPERATION` is generated if the default framebuffer is bound to _`target`_.
    * 
    * _`params`_ should be the address of a variable to which the client has write access otherwise undefined behavior, including process termination may occur.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glGetFramebufferParameteriv` | \- | \- | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glFramebufferParameteri][de.dasbabypixel.gamelauncher.gles.es31.glFramebufferParameteri.glFramebufferParameteri].
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2012-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es31.glGetFramebufferParameteriv.glGetFramebufferParameteriv
    */
    fun glGetFramebufferParameteriv(target: Int, pname: Int, params: java.nio.IntBuffer)
}