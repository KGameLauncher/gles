package de.dasbabypixel.gamelauncher.gles.es20

interface glClearStencil {
    /**
    * Name
    * ----
    * 
    * glClearStencil — specify the clear value for the stencil buffer
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glClearStencil**(` | GLint s`)`; |
    * | --- | --- |
    * 
    * Parameters
    * ----------
    * 
    * _`s`_
    * 
    * Specifies the index used when the stencil buffer is cleared. The initial value is 0.
    * 
    * Description
    * -----------
    * 
    * `glClearStencil` specifies the index used by [glClear][de.dasbabypixel.gamelauncher.gles.es20.glClear.glClear] to clear the stencil buffer. When clearing a stencil buffer, _`s`_ is masked with 2 m \- 1 , where m is the number of bits in the stencil buffer.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_STENCIL_CLEAR_VALUE`
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_STENCIL_BITS`
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glClearStencil | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glClear][de.dasbabypixel.gamelauncher.gles.es20.glClear.glClear], [glStencilFunc][de.dasbabypixel.gamelauncher.gles.es20.glStencilFunc.glStencilFunc], [glStencilFuncSeparate][de.dasbabypixel.gamelauncher.gles.es20.glStencilFuncSeparate.glStencilFuncSeparate], [glStencilMask][de.dasbabypixel.gamelauncher.gles.es20.glStencilMask.glStencilMask], [glStencilMaskSeparate][de.dasbabypixel.gamelauncher.gles.es20.glStencilMaskSeparate.glStencilMaskSeparate], [glStencilOp][de.dasbabypixel.gamelauncher.gles.es20.glStencilOp.glStencilOp], [glStencilOpSeparate][de.dasbabypixel.gamelauncher.gles.es20.glStencilOpSeparate.glStencilOpSeparate]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glClearStencil.glClearStencil
    */
    fun glClearStencil(s: Int)
}