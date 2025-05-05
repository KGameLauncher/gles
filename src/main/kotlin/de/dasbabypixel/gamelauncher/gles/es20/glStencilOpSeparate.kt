package de.dasbabypixel.gamelauncher.gles.es20

interface glStencilOpSeparate {
    /**
    * Name
    * ----
    * 
    * glStencilOpSeparate — set front and/or back stencil test actions
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glStencilOpSeparate**(` | GLenum face, |
    * | --- | --- |
    * |   | GLenum sfail, |
    * |   | GLenum dpfail, |
    * |   | GLenum dppass`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`face`_
    * 
    * Specifies whether front and/or back stencil state is updated. Three symbolic constants are valid: `GL_FRONT`, `GL_BACK`, and `GL_FRONT_AND_BACK`.
    * 
    * _`sfail`_
    * 
    * Specifies the action to take when the stencil test fails. Eight symbolic constants are accepted: `GL_KEEP`, `GL_ZERO`, `GL_REPLACE`, `GL_INCR`, `GL_INCR_WRAP`, `GL_DECR`, `GL_DECR_WRAP`, and `GL_INVERT`. The initial value is `GL_KEEP`.
    * 
    * _`dpfail`_
    * 
    * Specifies the stencil action when the stencil test passes, but the depth test fails. _`dpfail`_ accepts the same symbolic constants as _`sfail`_. The initial value is `GL_KEEP`.
    * 
    * _`dppass`_
    * 
    * Specifies the stencil action when both the stencil test and the depth test pass, or when the stencil test passes and either there is no depth buffer or depth testing is not enabled. _`dppass`_ accepts the same symbolic constants as _`sfail`_. The initial value is `GL_KEEP`.
    * 
    * Description
    * -----------
    * 
    * Stenciling, like depth-buffering, enables and disables drawing on a per-pixel basis. You draw into the stencil planes using GL drawing primitives, then render geometry and images, using the stencil planes to mask out portions of the screen. Stenciling is typically used in multipass rendering algorithms to achieve special effects, such as decals, outlining, and constructive solid geometry rendering.
    * 
    * The stencil test conditionally eliminates a pixel based on the outcome of a comparison between the value in the stencil buffer and a reference value. To enable and disable the test, call [glEnable][de.dasbabypixel.gamelauncher.gles.es20.glEnable.glEnable] and [glDisable][de.dasbabypixel.gamelauncher.gles.es20.glEnable.glEnable] with argument `GL_STENCIL_TEST`; to control it, call [glStencilFunc][de.dasbabypixel.gamelauncher.gles.es20.glStencilFunc.glStencilFunc] or [glStencilFuncSeparate][de.dasbabypixel.gamelauncher.gles.es20.glStencilFuncSeparate.glStencilFuncSeparate].
    * 
    * There can be two separate sets of _`sfail`_, _`dpfail`_, and _`dppass`_ parameters; one affects back-facing polygons, and the other affects front-facing polygons as well as other non-polygon primitives. [glStencilOp][de.dasbabypixel.gamelauncher.gles.es20.glStencilOp.glStencilOp] sets both front and back stencil state to the same values, as if `glStencilOpSeparate` were called with _`face`_ set to `GL_FRONT_AND_BACK`.
    * 
    * `glStencilOpSeparate` takes three arguments that indicate what happens to the stored stencil value while stenciling is enabled. If the stencil test fails, no change is made to the pixel's color or depth buffers, and _`sfail`_ specifies what happens to the stencil buffer contents. The following eight actions are possible.
    * 
    * `GL_KEEP`
    * 
    * Keeps the current value.
    * 
    * `GL_ZERO`
    * 
    * Sets the stencil buffer value to 0.
    * 
    * `GL_REPLACE`
    * 
    * Sets the stencil buffer value to _ref_, as specified by [glStencilFunc][de.dasbabypixel.gamelauncher.gles.es20.glStencilFunc.glStencilFunc].
    * 
    * `GL_INCR`
    * 
    * Increments the current stencil buffer value. Clamps to the maximum representable unsigned value.
    * 
    * `GL_INCR_WRAP`
    * 
    * Increments the current stencil buffer value. Wraps stencil buffer value to zero when incrementing the maximum representable unsigned value.
    * 
    * `GL_DECR`
    * 
    * Decrements the current stencil buffer value. Clamps to 0.
    * 
    * `GL_DECR_WRAP`
    * 
    * Decrements the current stencil buffer value. Wraps stencil buffer value to the maximum representable unsigned value when decrementing a stencil buffer value of zero.
    * 
    * `GL_INVERT`
    * 
    * Bitwise inverts the current stencil buffer value.
    * 
    * Stencil buffer values are treated as unsigned integers. When incremented and decremented, values are clamped to 0 and 2 n \- 1 , where n is the value returned by querying `GL_STENCIL_BITS`.
    * 
    * The other two arguments to `glStencilOpSeparate` specify stencil buffer actions that depend on whether subsequent depth buffer tests succeed (_`dppass`_) or fail (_`dpfail`_) (see [glDepthFunc][de.dasbabypixel.gamelauncher.gles.es20.glDepthFunc.glDepthFunc]). The actions are specified using the same eight symbolic constants as _`sfail`_. Note that _`dpfail`_ is ignored when there is no depth buffer, or when the depth buffer is not enabled. In these cases, _`sfail`_ and _`dppass`_ specify stencil action when the stencil test fails and passes, respectively.
    * 
    * Notes
    * -----
    * 
    * Initially the stencil test is disabled. If there is no stencil buffer, no stencil modification can occur and it is as if the stencil test always passes.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`face`_ is any value other than `GL_FRONT`, `GL_BACK`, or `GL_FRONT_AND_BACK`.
    * 
    * `GL_INVALID_ENUM` is generated if _`sfail`_, _`dpfail`_, or _`dppass`_ is any value other than the eight defined constant values.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_STENCIL_FAIL`, `GL_STENCIL_PASS_DEPTH_PASS`, `GL_STENCIL_PASS_DEPTH_FAIL`, `GL_STENCIL_BACK_FAIL`, `GL_STENCIL_BACK_PASS_DEPTH_PASS`, `GL_STENCIL_BACK_PASS_DEPTH_FAIL`, or `GL_STENCIL_BITS`
    * 
    * [glIsEnabled][de.dasbabypixel.gamelauncher.gles.es20.glIsEnabled.glIsEnabled] with argument `GL_STENCIL_TEST`
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glStencilOpSeparate | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glDepthFunc][de.dasbabypixel.gamelauncher.gles.es20.glDepthFunc.glDepthFunc], [glEnable][de.dasbabypixel.gamelauncher.gles.es20.glEnable.glEnable], [glStencilFunc][de.dasbabypixel.gamelauncher.gles.es20.glStencilFunc.glStencilFunc], [glStencilFuncSeparate][de.dasbabypixel.gamelauncher.gles.es20.glStencilFuncSeparate.glStencilFuncSeparate], [glStencilMask][de.dasbabypixel.gamelauncher.gles.es20.glStencilMask.glStencilMask], [glStencilMaskSeparate][de.dasbabypixel.gamelauncher.gles.es20.glStencilMaskSeparate.glStencilMaskSeparate], [glStencilOp][de.dasbabypixel.gamelauncher.gles.es20.glStencilOp.glStencilOp]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glStencilOpSeparate.glStencilOpSeparate
    */
    fun glStencilOpSeparate(face: Int, sfail: Int, dpfail: Int, dppass: Int)
}