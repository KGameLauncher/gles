package de.dasbabypixel.gamelauncher.gles.es20

interface glStencilMaskSeparate {
    /**
    * Name
    * ----
    * 
    * glStencilMaskSeparate — control the front and/or back writing of individual bits in the stencil planes
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glStencilMaskSeparate**(` | GLenum face, |
    * | --- | --- |
    * |   | GLuint mask`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`face`_
    * 
    * Specifies whether the front and/or back stencil writemask is updated. Three symbolic constants are valid: `GL_FRONT`, `GL_BACK`, and `GL_FRONT_AND_BACK`.
    * 
    * _`mask`_
    * 
    * Specifies a bit mask to enable and disable writing of individual bits in the stencil planes. Initially, the mask is all 1's.
    * 
    * Description
    * -----------
    * 
    * `glStencilMaskSeparate` controls the writing of individual bits in the stencil planes. The least significant n bits of _`mask`_, where n is the number of bits in the stencil buffer, specify a mask. Where a 1 appears in the mask, it's possible to write to the corresponding bit in the stencil buffer. Where a 0 appears, the corresponding bit is write-protected. Initially, all bits are enabled for writing.
    * 
    * There can be two separate _`mask`_ writemasks; one affects back-facing polygons, and the other affects front-facing polygons as well as other non-polygon primitives. [glStencilMask][de.dasbabypixel.gamelauncher.gles.es20.glStencilMask.glStencilMask] sets both front and back stencil writemasks to the same values, as if [glStencilMaskSeparate][de.dasbabypixel.gamelauncher.gles.es20.glStencilMaskSeparate.glStencilMaskSeparate] were called with _`face`_ set to `GL_FRONT_AND_BACK`.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`face`_ is not one of the accepted tokens.
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
    * | glStencilMaskSeparate | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glColorMask][de.dasbabypixel.gamelauncher.gles.es20.glColorMask.glColorMask], [glDepthMask][de.dasbabypixel.gamelauncher.gles.es20.glDepthMask.glDepthMask], [glStencilFunc][de.dasbabypixel.gamelauncher.gles.es20.glStencilFunc.glStencilFunc], [glStencilFuncSeparate][de.dasbabypixel.gamelauncher.gles.es20.glStencilFuncSeparate.glStencilFuncSeparate], [glStencilMask][de.dasbabypixel.gamelauncher.gles.es20.glStencilMask.glStencilMask], [glStencilOp][de.dasbabypixel.gamelauncher.gles.es20.glStencilOp.glStencilOp], [glStencilOpSeparate][de.dasbabypixel.gamelauncher.gles.es20.glStencilOpSeparate.glStencilOpSeparate]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glStencilMaskSeparate.glStencilMaskSeparate
    */
    fun glStencilMaskSeparate(face: Int, mask: UInt)
}