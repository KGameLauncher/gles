package de.dasbabypixel.gamelauncher.gles.es20

interface glStencilFunc {
    /**
    * Name
    * ----
    * 
    * glStencilFunc — set front and back function and reference value for stencil testing
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glStencilFunc**(` | GLenum func, |
    * | --- | --- |
    * |   | GLint ref, |
    * |   | GLuint mask`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`func`_
    * 
    * Specifies the test function. Eight symbolic constants are valid: `GL_NEVER`, `GL_LESS`, `GL_LEQUAL`, `GL_GREATER`, `GL_GEQUAL`, `GL_EQUAL`, `GL_NOTEQUAL`, and `GL_ALWAYS`. The initial value is `GL_ALWAYS`.
    * 
    * _`ref`_
    * 
    * Specifies the reference value for the stencil test. Stencil comparison operations and queries of _`ref`_ clamp its value to the range 0 2 n \- 1 , where n is the number of bitplanes in the stencil buffer. The initial value is 0.
    * 
    * _`mask`_
    * 
    * Specifies a mask that is ANDed with both the reference value and the stored stencil value when the test is done. The initial value is all 1's.
    * 
    * Description
    * -----------
    * 
    * Stenciling, like depth-buffering, enables and disables drawing on a per-pixel basis. Stencil planes are first drawn into using GL drawing primitives, then geometry and images are rendered using the stencil planes to mask out portions of the screen. Stenciling is typically used in multipass rendering algorithms to achieve special effects, such as decals, outlining, and constructive solid geometry rendering.
    * 
    * The stencil test conditionally eliminates a pixel based on the outcome of a comparison between the reference value and the value in the stencil buffer. To enable and disable the test, call [glEnable][de.dasbabypixel.gamelauncher.gles.es20.glEnable.glEnable] and [glDisable][de.dasbabypixel.gamelauncher.gles.es20.glEnable.glEnable] with argument `GL_STENCIL_TEST`. To specify actions based on the outcome of the stencil test, call [glStencilOp][de.dasbabypixel.gamelauncher.gles.es20.glStencilOp.glStencilOp] or [glStencilOpSeparate][de.dasbabypixel.gamelauncher.gles.es20.glStencilOpSeparate.glStencilOpSeparate].
    * 
    * There can be two separate sets of _`func`_, _`ref`_, and _`mask`_ parameters; one affects back-facing polygons, and the other affects front-facing polygons as well as other non-polygon primitives. `glStencilFunc` sets both front and back stencil state to the same values. Use [glStencilFuncSeparate][de.dasbabypixel.gamelauncher.gles.es20.glStencilFuncSeparate.glStencilFuncSeparate] to set front and back stencil state to different values.
    * 
    * _`func`_ is a symbolic constant that determines the stencil comparison function. It accepts one of eight values, shown in the following list. _`ref`_ is an integer reference value that is used in the stencil comparison. Stencil comparison operations and queries clamp the value to the range 0 2 n \- 1 , where n is the number of bitplanes in the stencil buffer. _`mask`_ is bitwise ANDed with both the reference value and the stored stencil value, with the ANDed values participating in the comparison.
    * 
    * If _stencil_ represents the value stored in the corresponding stencil buffer location, the following list shows the effect of each comparison function that can be specified by _`func`_. Only if the comparison succeeds is the pixel passed through to the next stage in the rasterization process (see [glStencilOp][de.dasbabypixel.gamelauncher.gles.es20.glStencilOp.glStencilOp]). All tests treat _stencil_ values as unsigned integers in the range 0 2 n \- 1 , where n is the number of bitplanes in the stencil buffer.
    * 
    * The following values are accepted by _`func`_:
    * 
    * `GL_NEVER`
    * 
    * Always fails.
    * 
    * `GL_LESS`
    * 
    * Passes if ( _`ref`_ & _`mask`_ ) < ( _stencil_ & _`mask`_ ).
    * 
    * `GL_LEQUAL`
    * 
    * Passes if ( _`ref`_ & _`mask`_ ) <= ( _stencil_ & _`mask`_ ).
    * 
    * `GL_GREATER`
    * 
    * Passes if ( _`ref`_ & _`mask`_ ) > ( _stencil_ & _`mask`_ ).
    * 
    * `GL_GEQUAL`
    * 
    * Passes if ( _`ref`_ & _`mask`_ ) >= ( _stencil_ & _`mask`_ ).
    * 
    * `GL_EQUAL`
    * 
    * Passes if ( _`ref`_ & _`mask`_ ) = ( _stencil_ & _`mask`_ ).
    * 
    * `GL_NOTEQUAL`
    * 
    * Passes if ( _`ref`_ & _`mask`_ ) != ( _stencil_ & _`mask`_ ).
    * 
    * `GL_ALWAYS`
    * 
    * Always passes.
    * 
    * Notes
    * -----
    * 
    * Initially, the stencil test is disabled. If there is no stencil buffer, no stencil modification can occur and it is as if the stencil test always passes.
    * 
    * `glStencilFunc` is the same as calling [glStencilFuncSeparate][de.dasbabypixel.gamelauncher.gles.es20.glStencilFuncSeparate.glStencilFuncSeparate] with _`face`_ set to `GL_FRONT_AND_BACK`.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`func`_ is not one of the eight accepted values.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_STENCIL_FUNC`, `GL_STENCIL_VALUE_MASK`, `GL_STENCIL_REF`, `GL_STENCIL_BACK_FUNC`, `GL_STENCIL_BACK_VALUE_MASK`, `GL_STENCIL_BACK_REF`, or `GL_STENCIL_BITS`
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
    * | glStencilFunc | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glDepthFunc][de.dasbabypixel.gamelauncher.gles.es20.glDepthFunc.glDepthFunc], [glEnable][de.dasbabypixel.gamelauncher.gles.es20.glEnable.glEnable], [glStencilFuncSeparate][de.dasbabypixel.gamelauncher.gles.es20.glStencilFuncSeparate.glStencilFuncSeparate], [glStencilMask][de.dasbabypixel.gamelauncher.gles.es20.glStencilMask.glStencilMask], [glStencilMaskSeparate][de.dasbabypixel.gamelauncher.gles.es20.glStencilMaskSeparate.glStencilMaskSeparate], [glStencilOp][de.dasbabypixel.gamelauncher.gles.es20.glStencilOp.glStencilOp], [glStencilOpSeparate][de.dasbabypixel.gamelauncher.gles.es20.glStencilOpSeparate.glStencilOpSeparate]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glStencilFunc.glStencilFunc
    */
    fun glStencilFunc(func: Int, ref: Int, mask: UInt)
}