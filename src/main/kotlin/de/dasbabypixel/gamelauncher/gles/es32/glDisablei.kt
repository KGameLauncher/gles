package de.dasbabypixel.gamelauncher.gles.es32

interface glDisablei {
    /**
    * Name
    * ----
    * 
    * glEnable — enable or disable server-side GL capabilities
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glEnable**(` | GLenum cap`)`; |
    * | --- | --- |
    * 
    * | `void **glDisable**(` | GLenum cap`)`; |
    * | --- | --- |
    * 
    * | `void **glEnablei**(` | GLenum cap, |
    * | --- | --- |
    * |   | GLuint index`)`; |
    * 
    * | `void **glDisablei**(` | GLenum cap, |
    * | --- | --- |
    * |   | GLuint index`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`cap`_
    * 
    * Specifies a symbolic constant indicating a GL capability.
    * 
    * _`index`_
    * 
    * Specifies the index of the switch to disable (for `glEnablei` and `glDisablei` only).
    * 
    * Description
    * -----------
    * 
    * `glEnable` and [glDisable][de.dasbabypixel.gamelauncher.gles.es20.glEnable.glEnable] enable and disable various capabilities. Use [glIsEnabled][de.dasbabypixel.gamelauncher.gles.es20.glIsEnabled.glIsEnabled] or [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] to determine the current setting of any capability. The initial value for each capability with the exception of `GL_DITHER` is `GL_FALSE`. The initial value for `GL_DITHER` is `GL_TRUE`.
    * 
    * Both `glEnable` and [glDisable][de.dasbabypixel.gamelauncher.gles.es20.glEnable.glEnable] take a single argument, _`cap`_, which can assume one of the following values:
    * 
    * Some of the GL's capabilities are indexed. `glEnablei` and `glDisablei` enable and disable indexed capabilities.
    * 
    * `GL_BLEND`
    * 
    * If enabled, blend the computed fragment color values with the values in the color buffers. See [glBlendFunc][de.dasbabypixel.gamelauncher.gles.es20.glBlendFunc.glBlendFunc].
    * 
    * `GL_CULL_FACE`
    * 
    * If enabled, cull polygons based on their winding in window coordinates. See [glCullFace][de.dasbabypixel.gamelauncher.gles.es20.glCullFace.glCullFace].
    * 
    * `GL_DEBUG_OUTPUT`
    * 
    * If enabled, debug messages are produced by a debug context. When disabled, the debug message log is silenced. Note that in a non-debug context, very few, if any messages might be produced, even when `GL_DEBUG_OUTPUT` is enabled.
    * 
    * `GL_DEBUG_OUTPUT_SYNCHRONOUS`
    * 
    * If enabled, debug messages are produced synchronously by a debug context. If disabled, debug messages may be produced asynchronously. In particular, they may be delayed relative to the execution of GL commands, and the debug callback function may be called from a thread other than that in which the commands are executed. See [glDebugMessageCallback][de.dasbabypixel.gamelauncher.gles.es32.glDebugMessageCallback.glDebugMessageCallback].
    * 
    * `GL_DEPTH_TEST`
    * 
    * If enabled, do depth comparisons and update the depth buffer. Note that even if the depth buffer exists and the depth mask is non-zero, the depth buffer is not updated if the depth test is disabled. See [glDepthFunc][de.dasbabypixel.gamelauncher.gles.es20.glDepthFunc.glDepthFunc] and [glDepthRangef][de.dasbabypixel.gamelauncher.gles.es20.glDepthRangef.glDepthRangef].
    * 
    * `GL_DITHER`
    * 
    * If enabled, dither color components or indices before they are written to the color buffer.
    * 
    * `GL_POLYGON_OFFSET_FILL`
    * 
    * If enabled, an offset is added to depth values of a polygon's fragments before the depth comparison is performed. See [glPolygonOffset][de.dasbabypixel.gamelauncher.gles.es20.glPolygonOffset.glPolygonOffset].
    * 
    * `GL_PRIMITIVE_RESTART_FIXED_INDEX`
    * 
    * Enables primitive restarting. If enabled, any one of the draw commands which transfers a set of generic attribute array elements to the GL will restart the primitive when the index of the vertex is equal to 2 n − 1 where _n_ is 8, 16 or 32 if the type is `GL_UNSIGNED_BYTE`, `GL_UNSIGNED_SHORT`, or `GL_UNSIGNED_INT`, respectively.
    * 
    * `GL_RASTERIZER_DISCARD`
    * 
    * If enabled, primitives are discarded immediately before the rasterization stage, but after the optional transform feedback stage. [glClear][de.dasbabypixel.gamelauncher.gles.es20.glClear.glClear] and [glClearBuffer][de.dasbabypixel.gamelauncher.gles.es30.glClearBufferiv.glClearBufferiv]\* commands are also ignored.
    * 
    * `GL_SAMPLE_ALPHA_TO_COVERAGE`
    * 
    * If enabled, compute a temporary coverage value where each bit is determined by the alpha value at the corresponding sample location. The temporary coverage value is then ANDed with the fragment coverage value.
    * 
    * `GL_SAMPLE_COVERAGE`
    * 
    * If enabled, the fragment's coverage is ANDed with the temporary coverage value. If `GL_SAMPLE_COVERAGE_INVERT` is set to `GL_TRUE`, invert the coverage value. See [glSampleCoverage][de.dasbabypixel.gamelauncher.gles.es20.glSampleCoverage.glSampleCoverage].
    * 
    * `GL_SAMPLE_MASK`
    * 
    * If enabled, the fragment's coverage is ANDed with the coverage value `GL_SAMPLE_MASK_VALUE`. See [glSampleMaski][de.dasbabypixel.gamelauncher.gles.es31.glSampleMaski.glSampleMaski].
    * 
    * `GL_SCISSOR_TEST`
    * 
    * If enabled, discard fragments that are outside the scissor rectangle. See [glScissor][de.dasbabypixel.gamelauncher.gles.es20.glScissor.glScissor].
    * 
    * `GL_STENCIL_TEST`
    * 
    * If enabled, do stencil testing and update the stencil buffer. See [glStencilFunc][de.dasbabypixel.gamelauncher.gles.es20.glStencilFunc.glStencilFunc] and [glStencilOp][de.dasbabypixel.gamelauncher.gles.es20.glStencilOp.glStencilOp].
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`cap`_ is not one of the values listed previously.
    * 
    * `GL_INVALID_VALUE` is generated by `glEnablei` and `glDisablei` if _`index`_ is greater than or equal to the number of indexed capabilities for _`cap`_.
    * 
    * Notes
    * -----
    * 
    * Any token accepted by `glEnable` or `glDisable` is also accepted by `glEnablei` and `glDisablei`, but if the capability is not indexed, the maximum value that _`index`_ may take is zero.
    * 
    * In general, passing an indexed capability to `glEnable` or `glDisable` will enable or disable that capability for all indices, respectively.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glIsEnabled][de.dasbabypixel.gamelauncher.gles.es20.glIsEnabled.glIsEnabled]
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv]
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glEnable` | ✔ | ✔ | ✔ | ✔ |
    * | `glDisable` | ✔ | ✔ | ✔ | ✔ |
    * | `glEnablei` | \- | \- | \- | ✔ |
    * | `glDisablei` | \- | \- | \- | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glBlendFunc][de.dasbabypixel.gamelauncher.gles.es20.glBlendFunc.glBlendFunc], [glCullFace][de.dasbabypixel.gamelauncher.gles.es20.glCullFace.glCullFace], [glDepthFunc][de.dasbabypixel.gamelauncher.gles.es20.glDepthFunc.glDepthFunc], [glDepthRangef][de.dasbabypixel.gamelauncher.gles.es20.glDepthRangef.glDepthRangef], [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv], [glIsEnabled][de.dasbabypixel.gamelauncher.gles.es20.glIsEnabled.glIsEnabled], [glPolygonOffset][de.dasbabypixel.gamelauncher.gles.es20.glPolygonOffset.glPolygonOffset], [glSampleCoverage][de.dasbabypixel.gamelauncher.gles.es20.glSampleCoverage.glSampleCoverage], [glScissor][de.dasbabypixel.gamelauncher.gles.es20.glScissor.glScissor], [glStencilFunc][de.dasbabypixel.gamelauncher.gles.es20.glStencilFunc.glStencilFunc], [glStencilOp][de.dasbabypixel.gamelauncher.gles.es20.glStencilOp.glStencilOp],
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glEnable.glEnable
    * @see de.dasbabypixel.gamelauncher.gles.es20.glDisable.glDisable
    * @see de.dasbabypixel.gamelauncher.gles.es32.glEnablei.glEnablei
    * @see de.dasbabypixel.gamelauncher.gles.es32.glDisablei.glDisablei
    */
    fun glDisablei(cap: Int, index: UInt)
}