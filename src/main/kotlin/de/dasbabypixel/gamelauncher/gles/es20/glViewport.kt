package de.dasbabypixel.gamelauncher.gles.es20

interface glViewport {
    /**
    * Name
    * ----
    * 
    * glViewport — set the viewport
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glViewport**(` | GLint x, |
    * | --- | --- |
    * |   | GLint y, |
    * |   | GLsizei width, |
    * |   | GLsizei height`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`x`_, _`y`_
    * 
    * Specify the lower left corner of the viewport rectangle, in pixels. The initial value is (0,0).
    * 
    * _`width`_, _`height`_
    * 
    * Specify the width and height of the viewport. When a GL context is first attached to a window, _`width`_ and _`height`_ are set to the dimensions of that window.
    * 
    * Description
    * -----------
    * 
    * `glViewport` specifies the affine transformation of x and y from normalized device coordinates to window coordinates. Let x nd y nd be normalized device coordinates. Then the window coordinates x w y w are computed as follows:
    * 
    * x w \= x nd + 1 ⁢ width 2 + x
    * 
    * y w \= y nd + 1 ⁢ height 2 + y
    * 
    * Viewport width and height are silently clamped to a range that depends on the implementation. To query this range, call [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_MAX_VIEWPORT_DIMS`.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if either _`width`_ or _`height`_ is negative.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_VIEWPORT`
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_MAX_VIEWPORT_DIMS`
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glViewport | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glDepthRangef][de.dasbabypixel.gamelauncher.gles.es20.glDepthRangef.glDepthRangef]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glViewport.glViewport
    */
    fun glViewport(x: Int, y: Int, width: UInt, height: UInt)
}