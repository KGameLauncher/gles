package de.dasbabypixel.gamelauncher.gles.es20

interface glGetRenderbufferParameteriv {
    /**
    * Name
    * ----
    * 
    * glGetRenderbufferParameteriv — retrieve information about a bound renderbuffer object
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGetRenderbufferParameteriv**(` | GLenum target, |
    * | --- | --- |
    * |   | GLenum pname, |
    * |   | GLint \*params`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`target`_
    * 
    * Specifies the target of the query operation. _`target`_ must be `GL_RENDERBUFFER`.
    * 
    * _`pname`_
    * 
    * Specifies the parameter whose value to retrieve from the renderbuffer bound to _`target`_.
    * 
    * _`params`_
    * 
    * Specifies the address of an array to receive the value of the queried parameter.
    * 
    * Description
    * -----------
    * 
    * `glGetRenderbufferParameteriv` retrieves information about a bound renderbuffer object. _`target`_ specifies the target of the query operation and must be `GL_RENDERBUFFER`. _`pname`_ specifies the parameter whose value to query and must be one of `GL_RENDERBUFFER_WIDTH`, `GL_RENDERBUFFER_HEIGHT`, `GL_RENDERBUFFER_INTERNAL_FORMAT`, `GL_RENDERBUFFER_RED_SIZE`, `GL_RENDERBUFFER_GREEN_SIZE`, `GL_RENDERBUFFER_BLUE_SIZE`, `GL_RENDERBUFFER_ALPHA_SIZE`, `GL_RENDERBUFFER_DEPTH_SIZE`, `GL_RENDERBUFFER_STENCIL_SIZE`, or `GL_RENDERBUFFER_SAMPLES`.
    * 
    * Upon a successful return from `glGetRenderbufferParameteriv`, if _`pname`_ is `GL_RENDERBUFFER_WIDTH`, `GL_RENDERBUFFER_HEIGHT`, `GL_RENDERBUFFER_INTERNAL_FORMAT`, or `GL_RENDERBUFFER_SAMPLES`, then _`params`_ will contain the width in pixels, the height in pixels, the internal format, or the number of samples, respectively, of the image of the renderbuffer currently bound to _`target`_.
    * 
    * If _`pname`_ is `GL_RENDERBUFFER_RED_SIZE`, `GL_RENDERBUFFER_GREEN_SIZE`, `GL_RENDERBUFFER_BLUE_SIZE`, `GL_RENDERBUFFER_ALPHA_SIZE`, `GL_RENDERBUFFER_DEPTH_SIZE`, or `GL_RENDERBUFFER_STENCIL_SIZE`, then _`params`_ will contain the actual resolutions (not the resolutions specified when the image array was defined) for the red, green, blue, alpha depth, or stencil components, respectively, of the image of the renderbuffer currently bound to _`target`_.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`pname`_ is not one of the accepted tokens.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glGetRenderbufferParameteriv | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGenRenderbuffers][de.dasbabypixel.gamelauncher.gles.es20.glGenRenderbuffers.glGenRenderbuffers], [glFramebufferRenderbuffer][de.dasbabypixel.gamelauncher.gles.es20.glFramebufferRenderbuffer.glFramebufferRenderbuffer], [glBindRenderbuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindRenderbuffer.glBindRenderbuffer], [glRenderbufferStorage][de.dasbabypixel.gamelauncher.gles.es20.glRenderbufferStorage.glRenderbufferStorage], [glRenderbufferStorageMultisample][de.dasbabypixel.gamelauncher.gles.es30.glRenderbufferStorageMultisample.glRenderbufferStorageMultisample]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glGetRenderbufferParameteriv.glGetRenderbufferParameteriv
    */
    fun glGetRenderbufferParameteriv(target: Int, pname: Int, params: java.nio.IntBuffer)
}