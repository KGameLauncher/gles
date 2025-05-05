package de.dasbabypixel.gamelauncher.gles.es20

interface glDepthFunc {
    /**
    * Name
    * ----
    * 
    * glDepthFunc — specify the value used for depth buffer comparisons
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glDepthFunc**(` | GLenum func`)`; |
    * | --- | --- |
    * 
    * Parameters
    * ----------
    * 
    * _`func`_
    * 
    * Specifies the depth comparison function. Symbolic constants `GL_NEVER`, `GL_LESS`, `GL_EQUAL`, `GL_LEQUAL`, `GL_GREATER`, `GL_NOTEQUAL`, `GL_GEQUAL`, and `GL_ALWAYS` are accepted. The initial value is `GL_LESS`.
    * 
    * Description
    * -----------
    * 
    * `glDepthFunc` specifies the function used to compare each incoming pixel depth value with the depth value present in the depth buffer. The comparison is performed only if depth testing is enabled. (See [glEnable][de.dasbabypixel.gamelauncher.gles.es20.glEnable.glEnable] and [glDisable][de.dasbabypixel.gamelauncher.gles.es20.glEnable.glEnable] of `GL_DEPTH_TEST`.)
    * 
    * _`func`_ specifies the conditions under which the pixel will be drawn. The comparison functions are as follows:
    * 
    * `GL_NEVER`
    * 
    * Never passes.
    * 
    * `GL_LESS`
    * 
    * Passes if the incoming depth value is less than the stored depth value.
    * 
    * `GL_EQUAL`
    * 
    * Passes if the incoming depth value is equal to the stored depth value.
    * 
    * `GL_LEQUAL`
    * 
    * Passes if the incoming depth value is less than or equal to the stored depth value.
    * 
    * `GL_GREATER`
    * 
    * Passes if the incoming depth value is greater than the stored depth value.
    * 
    * `GL_NOTEQUAL`
    * 
    * Passes if the incoming depth value is not equal to the stored depth value.
    * 
    * `GL_GEQUAL`
    * 
    * Passes if the incoming depth value is greater than or equal to the stored depth value.
    * 
    * `GL_ALWAYS`
    * 
    * Always passes.
    * 
    * The initial value of _`func`_ is `GL_LESS`. Initially, depth testing is disabled. If depth testing is disabled or if no depth buffer exists, it is as if the depth test always passes.
    * 
    * Notes
    * -----
    * 
    * Even if the depth buffer exists and the depth mask is non-zero, the depth buffer is not updated if the depth test is disabled. In order to unconditionally write to the depth buffer, the depth test should be enabled and set to `GL_ALWAYS`.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`func`_ is not an accepted value.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_DEPTH_FUNC`
    * 
    * [glIsEnabled][de.dasbabypixel.gamelauncher.gles.es20.glIsEnabled.glIsEnabled] with argument `GL_DEPTH_TEST`
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glDepthFunc | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glDepthRangef][de.dasbabypixel.gamelauncher.gles.es20.glDepthRangef.glDepthRangef], [glEnable][de.dasbabypixel.gamelauncher.gles.es20.glEnable.glEnable], [glPolygonOffset][de.dasbabypixel.gamelauncher.gles.es20.glPolygonOffset.glPolygonOffset]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glDepthFunc.glDepthFunc
    */
    fun glDepthFunc(func: Int)
}