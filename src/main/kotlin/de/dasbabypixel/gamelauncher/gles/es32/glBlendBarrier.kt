package de.dasbabypixel.gamelauncher.gles.es32

interface glBlendBarrier {
    /**
    * Name
    * ----
    * 
    * glBlendBarrier — specifies a boundary between advanced blending passes
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glBlendBarrier**(` | void`)`; |
    * | --- | --- |
    * 
    * Description
    * -----------
    * 
    * `glBlendBarrier` specifies a boundary between passes when using advanced blend equations. Any command that causes the value of a sample to be modified using the framebuffer is considered to touch the sample, including clears, blended or unblended primitives, and BlitFramebuffer copies. Defined results are guaranteed only if each sample is touched no more than once in any single rendering pass.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with an argument of `GL_BLEND_EQUATION_RGB`
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glBlendBarrier | \- | \- | \- | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glBlendEquation][de.dasbabypixel.gamelauncher.gles.es20.glBlendEquation.glBlendEquation], [glBlendEquationi][de.dasbabypixel.gamelauncher.gles.es20.glBlendEquation.glBlendEquation], [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es32.glBlendBarrier.glBlendBarrier
    */
    fun glBlendBarrier()
}