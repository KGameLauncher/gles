package de.dasbabypixel.gamelauncher.gles.es20

interface glClear {
    /**
    * Name
    * ----
    * 
    * glClear — clear buffers to preset values
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glClear**(` | GLbitfield mask`)`; |
    * | --- | --- |
    * 
    * Parameters
    * ----------
    * 
    * _`mask`_
    * 
    * Bitwise OR of masks that indicate the buffers to be cleared. The three masks are `GL_COLOR_BUFFER_BIT`, `GL_DEPTH_BUFFER_BIT`, and `GL_STENCIL_BUFFER_BIT`.
    * 
    * Description
    * -----------
    * 
    * `glClear` sets the bitplane area of the window to values previously selected by `glClearColor`, `glClearDepthf`, and `glClearStencil`. Multiple color buffers can be cleared simultaneously by selecting more than one buffer at a time using [glDrawBuffers][de.dasbabypixel.gamelauncher.gles.es30.glDrawBuffers.glDrawBuffers].
    * 
    * The pixel ownership test, the scissor test, sRGB conversion, dithering, and the buffer writemasks affect the operation of `glClear`. The scissor box bounds the cleared region. Alpha function, blend function, stenciling, texture mapping, and depth-buffering are ignored by `glClear`.
    * 
    * `glClear` takes a single argument that is the bitwise OR of several values indicating which buffer is to be cleared.
    * 
    * The values are as follows:
    * 
    * `GL_COLOR_BUFFER_BIT`
    * 
    * Indicates the buffers currently enabled for color writing.
    * 
    * `GL_DEPTH_BUFFER_BIT`
    * 
    * Indicates the depth buffer.
    * 
    * `GL_STENCIL_BUFFER_BIT`
    * 
    * Indicates the stencil buffer.
    * 
    * The value to which each buffer is cleared depends on the setting of the clear value for that buffer.
    * 
    * Notes
    * -----
    * 
    * If a buffer is not present, then a `glClear` directed at that buffer has no effect.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if any bit other than the three defined bits is set in _`mask`_.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_DEPTH_CLEAR_VALUE`
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_COLOR_CLEAR_VALUE`
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_STENCIL_CLEAR_VALUE`
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glClear | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glClearBuffer][de.dasbabypixel.gamelauncher.gles.es30.glClearBufferiv.glClearBufferiv], [glClearColor][de.dasbabypixel.gamelauncher.gles.es20.glClearColor.glClearColor], [glClearDepthf][de.dasbabypixel.gamelauncher.gles.es20.glClearDepthf.glClearDepthf], [glClearStencil][de.dasbabypixel.gamelauncher.gles.es20.glClearStencil.glClearStencil], [glColorMask][de.dasbabypixel.gamelauncher.gles.es20.glColorMask.glColorMask], [glDepthMask][de.dasbabypixel.gamelauncher.gles.es20.glDepthMask.glDepthMask], [glDrawBuffers][de.dasbabypixel.gamelauncher.gles.es30.glDrawBuffers.glDrawBuffers], [glScissor][de.dasbabypixel.gamelauncher.gles.es20.glScissor.glScissor], [glStencilMask][de.dasbabypixel.gamelauncher.gles.es20.glStencilMask.glStencilMask]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glClear.glClear
    */
    fun glClear(mask: Int)
}