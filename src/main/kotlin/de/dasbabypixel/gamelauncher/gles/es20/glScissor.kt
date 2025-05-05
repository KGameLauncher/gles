package de.dasbabypixel.gamelauncher.gles.es20

interface glScissor {
    /**
    * Name
    * ----
    * 
    * glScissor — define the scissor box
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glScissor**(` | GLint x, |
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
    * Specify the lower left corner of the scissor box. Initially (0, 0).
    * 
    * _`width`_, _`height`_
    * 
    * Specify the width and height of the scissor box. When a GL context is first attached to a window, _`width`_ and _`height`_ are set to the dimensions of that window.
    * 
    * Description
    * -----------
    * 
    * `glScissor` defines a rectangle, called the scissor box, in window coordinates. The first two arguments, _`x`_ and _`y`_, specify the lower left corner of the box. _`width`_ and _`height`_ specify the width and height of the box.
    * 
    * To enable and disable the scissor test, call [glEnable][de.dasbabypixel.gamelauncher.gles.es20.glEnable.glEnable] and [glDisable][de.dasbabypixel.gamelauncher.gles.es20.glEnable.glEnable] with argument `GL_SCISSOR_TEST`. The test is initially disabled. While the test is enabled, only pixels that lie within the scissor box can be modified by drawing commands. Window coordinates have integer values at the shared corners of frame buffer pixels. `glScissor(0,0,1,1)` allows modification of only the lower left pixel in the window, and `glScissor(0,0,0,0)` doesn't allow modification of any pixels in the window.
    * 
    * When the scissor test is disabled, it is as though the scissor box includes the entire window.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if either _`width`_ or _`height`_ is negative.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_SCISSOR_BOX`
    * 
    * [glIsEnabled][de.dasbabypixel.gamelauncher.gles.es20.glIsEnabled.glIsEnabled] with argument `GL_SCISSOR_TEST`
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glScissor | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glEnable][de.dasbabypixel.gamelauncher.gles.es20.glEnable.glEnable], [glViewport][de.dasbabypixel.gamelauncher.gles.es20.glViewport.glViewport]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glScissor.glScissor
    */
    fun glScissor(x: Int, y: Int, width: UInt, height: UInt)
}