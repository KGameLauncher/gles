package de.dasbabypixel.gamelauncher.gles.es20

interface glDepthMask {
    /**
    * Name
    * ----
    * 
    * glDepthMask — enable or disable writing into the depth buffer
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glDepthMask**(` | GLboolean flag`)`; |
    * | --- | --- |
    * 
    * Parameters
    * ----------
    * 
    * _`flag`_
    * 
    * Specifies whether the depth buffer is enabled for writing. If _`flag`_ is `GL_FALSE`, depth buffer writing is disabled. Otherwise, it is enabled. Initially, depth buffer writing is enabled.
    * 
    * Description
    * -----------
    * 
    * `glDepthMask` specifies whether the depth buffer is enabled for writing. If _`flag`_ is `GL_FALSE`, depth buffer writing is disabled. Otherwise, it is enabled. Initially, depth buffer writing is enabled.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_DEPTH_WRITEMASK`
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glDepthMask | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glColorMask][de.dasbabypixel.gamelauncher.gles.es20.glColorMask.glColorMask], [glDepthFunc][de.dasbabypixel.gamelauncher.gles.es20.glDepthFunc.glDepthFunc], [glDepthRangef][de.dasbabypixel.gamelauncher.gles.es20.glDepthRangef.glDepthRangef], [glStencilMask][de.dasbabypixel.gamelauncher.gles.es20.glStencilMask.glStencilMask]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glDepthMask.glDepthMask
    */
    fun glDepthMask(flag: Boolean)
}