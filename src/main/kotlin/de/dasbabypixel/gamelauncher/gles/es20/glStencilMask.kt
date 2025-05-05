package de.dasbabypixel.gamelauncher.gles.es20

interface glStencilMask {
    /**
    * Name
    * ----
    * 
    * glStencilMask — control the front and back writing of individual bits in the stencil planes
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glStencilMask**(` | GLuint mask`)`; |
    * | --- | --- |
    * 
    * Parameters
    * ----------
    * 
    * _`mask`_
    * 
    * Specifies a bit mask to enable and disable writing of individual bits in the stencil planes. Initially, the mask is all 1's.
    * 
    * Description
    * -----------
    * 
    * `glStencilMask` controls the writing of individual bits in the stencil planes. The least significant n bits of _`mask`_, where n is the number of bits in the stencil buffer, specify a mask. Where a 1 appears in the mask, it's possible to write to the corresponding bit in the stencil buffer. Where a 0 appears, the corresponding bit is write-protected. Initially, all bits are enabled for writing.
    * 
    * There can be two separate _`mask`_ writemasks; one affects back-facing polygons, and the other affects front-facing polygons as well as other non-polygon primitives. `glStencilMask` sets both front and back stencil writemasks to the same values. Use [glStencilMaskSeparate][de.dasbabypixel.gamelauncher.gles.es20.glStencilMaskSeparate.glStencilMaskSeparate] to set front and back stencil writemasks to different values.
    * 
    * Notes
    * -----
    * 
    * `glStencilMask` is the same as calling [glStencilMaskSeparate][de.dasbabypixel.gamelauncher.gles.es20.glStencilMaskSeparate.glStencilMaskSeparate] with _`face`_ set to `GL_FRONT_AND_BACK`.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_STENCIL_WRITEMASK`, `GL_STENCIL_BACK_WRITEMASK`, or `GL_STENCIL_BITS`
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glStencilMask | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glColorMask][de.dasbabypixel.gamelauncher.gles.es20.glColorMask.glColorMask], [glDepthMask][de.dasbabypixel.gamelauncher.gles.es20.glDepthMask.glDepthMask], [glStencilFunc][de.dasbabypixel.gamelauncher.gles.es20.glStencilFunc.glStencilFunc], [glStencilFuncSeparate][de.dasbabypixel.gamelauncher.gles.es20.glStencilFuncSeparate.glStencilFuncSeparate], [glStencilMaskSeparate][de.dasbabypixel.gamelauncher.gles.es20.glStencilMaskSeparate.glStencilMaskSeparate], [glStencilOp][de.dasbabypixel.gamelauncher.gles.es20.glStencilOp.glStencilOp], [glStencilOpSeparate][de.dasbabypixel.gamelauncher.gles.es20.glStencilOpSeparate.glStencilOpSeparate]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glStencilMask.glStencilMask
    */
    fun glStencilMask(mask: UInt)
}