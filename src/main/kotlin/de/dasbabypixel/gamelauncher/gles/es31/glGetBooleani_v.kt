package de.dasbabypixel.gamelauncher.gles.es31

interface glGetBooleani_v {
    /**
    * Name
    * ----
    * 
    * glGet — return the value or values of a selected parameter
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGetBooleanv**(` | GLenum pname, |
    * | --- | --- |
    * |   | GLboolean \* data`)`; |
    * 
    * | `void **glGetFloatv**(` | GLenum pname, |
    * | --- | --- |
    * |   | GLfloat \* data`)`; |
    * 
    * | `void **glGetIntegerv**(` | GLenum pname, |
    * | --- | --- |
    * |   | GLint \* data`)`; |
    * 
    * | `void **glGetInteger64v**(` | GLenum pname, |
    * | --- | --- |
    * |   | GLint64 \* data`)`; |
    * 
    * | `void **glGetBooleani_v**(` | GLenum target, |
    * | --- | --- |
    * |   | GLuint index, |
    * |   | GLboolean \* data`)`; |
    * 
    * | `void **glGetIntegeri_v**(` | GLenum target, |
    * | --- | --- |
    * |   | GLuint index, |
    * |   | GLint \* data`)`; |
    * 
    * | `void **glGetInteger64i_v**(` | GLenum target, |
    * | --- | --- |
    * |   | GLuint index, |
    * |   | GLint64 \* data`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`pname`_
    * 
    * Specifies the parameter value to be returned. The symbolic constants in the list below are accepted.
    * 
    * _`target`_
    * 
    * Specifies the parameter value to be returned for indexed versions of `glGet`. The symbolic constants in the list below are accepted.
    * 
    * _`index`_
    * 
    * Specifies the index of the particular element being queried.
    * 
    * _`data`_
    * 
    * Returns the value or values of the specified parameter.
    * 
    * Description
    * -----------
    * 
    * These commands return values for simple state variables in GL. _`pname`_ is a symbolic constant indicating the state variable to be returned, and _`data`_ is a pointer to an array of the indicated type in which to place the returned data.
    * 
    * Type conversion is performed if _`data`_ has a different type than the state variable value being requested. If `glGetBooleanv` is called, a floating-point (or integer) value is converted to `GL_FALSE` if and only if it is 0.0 (or 0). Otherwise, it is converted to `GL_TRUE`. If `glGetIntegerv` is called, boolean values are returned as `GL_TRUE` or `GL_FALSE`, and most floating-point values are rounded to the nearest integer value. Floating-point colors and normals, however, are returned with a linear mapping that maps 1.0 to the most positive representable integer value and \-1.0 to the most negative representable integer value. If `glGetFloatv` is called, boolean values are returned as `GL_TRUE` or `GL_FALSE`, and integer values are converted to floating-point values.
    * 
    * The following symbolic constants are accepted by _`pname`_:
    * 
    * `GL_ACTIVE_TEXTURE`
    * 
    * _`data`_ returns a single value indicating the active multitexture unit. The initial value is `GL_TEXTURE0`. See [glActiveTexture][de.dasbabypixel.gamelauncher.gles.es20.glActiveTexture.glActiveTexture].
    * 
    * `GL_ALIASED_LINE_WIDTH_RANGE`
    * 
    * _`data`_ returns a pair of values indicating the range of widths supported for aliased lines. See [glLineWidth][de.dasbabypixel.gamelauncher.gles.es20.glLineWidth.glLineWidth].
    * 
    * `GL_ALIASED_POINT_SIZE_RANGE`
    * 
    * _`data`_ returns two values: the smallest and largest supported sizes for points. The smallest size must be at most 1, and the largest size must be at least 1.
    * 
    * `GL_ALPHA_BITS`
    * 
    * _`data`_ returns one value, the number of alpha bitplanes in the color buffer of the currently bound draw framebuffer. This is deﬁned only if all color attachments of the draw framebuffer have identical formats, in which case the number of alpha bits of color attachment zero are returned.
    * 
    * `GL_ARRAY_BUFFER_BINDING`
    * 
    * _`data`_ returns a single value, the name of the buffer object currently bound to the target `GL_ARRAY_BUFFER`. If no buffer object is bound to this target, 0 is returned. The initial value is 0. See [glBindBuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindBuffer.glBindBuffer].
    * 
    * `GL_BLEND`
    * 
    * _`data`_ returns a single boolean value indicating whether blending is enabled. The initial value is `GL_FALSE`. See [glBlendFunc][de.dasbabypixel.gamelauncher.gles.es20.glBlendFunc.glBlendFunc].
    * 
    * `GL_BLEND_COLOR`
    * 
    * _`data`_ returns four values, the red, green, blue, and alpha values which are the components of the blend color. See [glBlendColor][de.dasbabypixel.gamelauncher.gles.es20.glBlendColor.glBlendColor].
    * 
    * `GL_BLEND_DST_ALPHA`
    * 
    * _`data`_ returns one value, the symbolic constant identifying the alpha destination blend function. The initial value is `GL_ZERO`. See [glBlendFunc][de.dasbabypixel.gamelauncher.gles.es20.glBlendFunc.glBlendFunc] and [glBlendFuncSeparate][de.dasbabypixel.gamelauncher.gles.es20.glBlendFuncSeparate.glBlendFuncSeparate].
    * 
    * `GL_BLEND_DST_RGB`
    * 
    * _`data`_ returns one value, the symbolic constant identifying the RGB destination blend function. The initial value is `GL_ZERO`. See [glBlendFunc][de.dasbabypixel.gamelauncher.gles.es20.glBlendFunc.glBlendFunc] and [glBlendFuncSeparate][de.dasbabypixel.gamelauncher.gles.es20.glBlendFuncSeparate.glBlendFuncSeparate].
    * 
    * `GL_BLEND_EQUATION_ALPHA`
    * 
    * _`data`_ returns one value, a symbolic constant indicating whether the Alpha blend equation is `GL_FUNC_ADD`, `GL_FUNC_SUBTRACT`, `GL_FUNC_REVERSE_SUBTRACT`, `GL_MIN` or `GL_MAX`. See [glBlendEquationSeparate][de.dasbabypixel.gamelauncher.gles.es20.glBlendEquationSeparate.glBlendEquationSeparate].
    * 
    * `GL_BLEND_EQUATION_RGB`
    * 
    * _`data`_ returns one value, a symbolic constant indicating whether the RGB blend equation is `GL_FUNC_ADD`, `GL_FUNC_SUBTRACT`, `GL_FUNC_REVERSE_SUBTRACT`, `GL_MIN` or `GL_MAX`. See [glBlendEquationSeparate][de.dasbabypixel.gamelauncher.gles.es20.glBlendEquationSeparate.glBlendEquationSeparate].
    * 
    * `GL_BLEND_SRC_ALPHA`
    * 
    * _`data`_ returns one value, the symbolic constant identifying the alpha source blend function. The initial value is `GL_ONE`. See [glBlendFunc][de.dasbabypixel.gamelauncher.gles.es20.glBlendFunc.glBlendFunc] and [glBlendFuncSeparate][de.dasbabypixel.gamelauncher.gles.es20.glBlendFuncSeparate.glBlendFuncSeparate].
    * 
    * `GL_BLEND_SRC_RGB`
    * 
    * _`data`_ returns one value, the symbolic constant identifying the RGB source blend function. The initial value is `GL_ONE`. See [glBlendFunc][de.dasbabypixel.gamelauncher.gles.es20.glBlendFunc.glBlendFunc] and [glBlendFuncSeparate][de.dasbabypixel.gamelauncher.gles.es20.glBlendFuncSeparate.glBlendFuncSeparate].
    * 
    * `GL_BLUE_BITS`
    * 
    * _`data`_ returns one value, the number of blue bitplanes in the color buffer of the currently bound draw framebuffer. This is deﬁned only if all color attachments of the draw framebuffer have identical formats, in which case the number of blue bits of color attachment zero are returned.
    * 
    * `GL_COLOR_CLEAR_VALUE`
    * 
    * _`data`_ returns four values: the red, green, blue, and alpha values used to clear the color buffers. Integer values, if requested, are linearly mapped from the internal floating-point representation such that 1.0 returns the most positive representable integer value, and \-1.0 returns the most negative representable integer value. The initial value is (0, 0, 0, 0). See [glClearColor][de.dasbabypixel.gamelauncher.gles.es20.glClearColor.glClearColor].
    * 
    * `GL_COLOR_WRITEMASK`
    * 
    * _`data`_ returns four boolean values: the red, green, blue, and alpha write enables for the color buffers. The initial value is (`GL_TRUE`, `GL_TRUE`, `GL_TRUE`, `GL_TRUE`). See [glColorMask][de.dasbabypixel.gamelauncher.gles.es20.glColorMask.glColorMask].
    * 
    * `GL_COMPRESSED_TEXTURE_FORMATS`
    * 
    * _`data`_ returns a list of symbolic constants of length `GL_NUM_COMPRESSED_TEXTURE_FORMATS` indicating which compressed texture formats are available. See [glCompressedTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glCompressedTexImage2D.glCompressedTexImage2D].
    * 
    * `GL_CONTEXT_FLAGS`
    * 
    * _`data`_ returns one value, the flags with which the context was created (such as debugging functionality).
    * 
    * `GL_CONTEXT_ROBUST_ACCESS`
    * 
    * _`data`_ returns one boolean value, indicating if robust buffer access has been enabled at context creation time.
    * 
    * `GL_COPY_READ_BUFFER_BINDING`
    * 
    * _`data`_ returns a single value, the name of the buffer object currently bound to the target `GL_COPY_READ_BUFFER`. If no buffer object is bound to this target, 0 is returned. The initial value is 0. See [glBindBuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindBuffer.glBindBuffer].
    * 
    * `GL_COPY_WRITE_BUFFER_BINDING`
    * 
    * _`data`_ returns a single value, the name of the buffer object currently bound to the target `GL_COPY_WRITE_BUFFER`. If no buffer object is bound to this target, 0 is returned. The initial value is 0. See [glBindBuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindBuffer.glBindBuffer].
    * 
    * `GL_CULL_FACE`
    * 
    * _`data`_ returns a single boolean value indicating whether polygon culling is enabled. The initial value is `GL_FALSE`. See [glCullFace][de.dasbabypixel.gamelauncher.gles.es20.glCullFace.glCullFace].
    * 
    * `GL_CULL_FACE_MODE`
    * 
    * _`data`_ returns a single value indicating the mode of polygon culling. The initial value is `GL_BACK`. See [glCullFace][de.dasbabypixel.gamelauncher.gles.es20.glCullFace.glCullFace].
    * 
    * `GL_CURRENT_PROGRAM`
    * 
    * _`data`_ returns one value, the name of the program object that is currently active, or 0 if no program object is active. See [glUseProgram][de.dasbabypixel.gamelauncher.gles.es20.glUseProgram.glUseProgram].
    * 
    * `GL_DEBUG_GROUP_STACK_DEPTH`
    * 
    * _`data`_ returns a single value, the current depth of the debug message group stack.
    * 
    * `GL_DEBUG_LOGGED_MESSAGES`
    * 
    * _`data`_ returns a single value, the number of messages currently in the debug log.
    * 
    * `GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH`
    * 
    * _`data`_ returns a single value, the length, including the NULL terminator, of the oldest message in the debug log.
    * 
    * `GL_DEPTH_BITS`
    * 
    * _`data`_ returns one value, the number of bitplanes in the depth buffer of the currently bound framebuffer.
    * 
    * `GL_DEPTH_CLEAR_VALUE`
    * 
    * _`data`_ returns one value, the value that is used to clear the depth buffer. Integer values, if requested, are linearly mapped from the internal floating-point representation such that 1.0 returns the most positive representable integer value, and \-1.0 returns the most negative representable integer value. The initial value is 1. See [glClearDepthf][de.dasbabypixel.gamelauncher.gles.es20.glClearDepthf.glClearDepthf].
    * 
    * `GL_DEPTH_FUNC`
    * 
    * _`data`_ returns one value, the symbolic constant that indicates the depth comparison function. The initial value is `GL_LESS`. See [glDepthFunc][de.dasbabypixel.gamelauncher.gles.es20.glDepthFunc.glDepthFunc].
    * 
    * `GL_DEPTH_RANGE`
    * 
    * _`data`_ returns two values: the near and far mapping limits for the depth buffer. Integer values, if requested, are linearly mapped from the internal floating-point representation such that 1.0 returns the most positive representable integer value, and \-1.0 returns the most negative representable integer value. The initial value is (0, 1). See [glDepthRangef][de.dasbabypixel.gamelauncher.gles.es20.glDepthRangef.glDepthRangef].
    * 
    * `GL_DEPTH_TEST`
    * 
    * _`data`_ returns a single boolean value indicating whether depth testing of fragments is enabled. The initial value is `GL_FALSE`. See [glDepthFunc][de.dasbabypixel.gamelauncher.gles.es20.glDepthFunc.glDepthFunc] and [glDepthRangef][de.dasbabypixel.gamelauncher.gles.es20.glDepthRangef.glDepthRangef].
    * 
    * `GL_DEPTH_WRITEMASK`
    * 
    * _`data`_ returns a single boolean value indicating if the depth buffer is enabled for writing. The initial value is `GL_TRUE`. See [glDepthMask][de.dasbabypixel.gamelauncher.gles.es20.glDepthMask.glDepthMask].
    * 
    * `GL_DISPATCH_INDIRECT_BUFFER_BINDING`
    * 
    * _`data`_ returns a single value, the name of the buffer object currently bound to the target `GL_DISPATCH_INDIRECT_BUFFER`. If no buffer object is bound to this target, 0 is returned. The initial value is 0. See [glBindBuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindBuffer.glBindBuffer].
    * 
    * `GL_DITHER`
    * 
    * _`data`_ returns a single boolean value indicating whether dithering of fragment colors and indices is enabled. The initial value is `GL_TRUE`.
    * 
    * `GL_DRAW_BUFFER` _i_
    * 
    * _`data`_ returns one value, a symbolic constant indicating which buffers are being drawn to by the corresponding output color. See [glDrawBuffers][de.dasbabypixel.gamelauncher.gles.es30.glDrawBuffers.glDrawBuffers]. The initial value of `GL_DRAW_BUFFER0` is `GL_BACK`. The initial values of draw buffers for all other output colors is `GL_NONE`.
    * 
    * `GL_DRAW_FRAMEBUFFER_BINDING`
    * 
    * _`data`_ returns one value, the name of the framebuffer object currently bound to the `GL_DRAW_FRAMEBUFFER` target. If the default framebuffer is bound, this value will be zero. The initial value is zero. See [glBindFramebuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindFramebuffer.glBindFramebuffer].
    * 
    * `GL_ELEMENT_ARRAY_BUFFER_BINDING`
    * 
    * _`data`_ returns a single value, the name of the buffer object currently bound to the target `GL_ELEMENT_ARRAY_BUFFER`. If no buffer object is bound to this target, 0 is returned. The initial value is 0. See [glBindBuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindBuffer.glBindBuffer].
    * 
    * `GL_FRAGMENT_INTERPOLATION_OFFSET_BITS`
    * 
    * _`data`_ returns a single integer value indicating the number of subpixels bits available in the offset for interpolation. See [interpolateAtOffset](interpolateAtOffset.xhtml).
    * 
    * `GL_FRAGMENT_SHADER_DERIVATIVE_HINT`
    * 
    * _`data`_ returns one value, a symbolic constant indicating the mode of the derivative accuracy hint for fragment shaders. The initial value is `GL_DONT_CARE`. See [glHint][de.dasbabypixel.gamelauncher.gles.es20.glHint.glHint].
    * 
    * `GL_FRONT_FACE`
    * 
    * _`data`_ returns a single value indicating the winding order of polygon front faces. The initial value is `GL_CCW`. See [glFrontFace][de.dasbabypixel.gamelauncher.gles.es20.glFrontFace.glFrontFace].
    * 
    * `GL_GENERATE_MIPMAP_HINT`
    * 
    * _`data`_ returns one value, a symbolic constant indicating the mode of the generate mipmap quality hint. The initial value is `GL_DONT_CARE`. See [glHint][de.dasbabypixel.gamelauncher.gles.es20.glHint.glHint].
    * 
    * `GL_GREEN_BITS`
    * 
    * _`data`_ returns one value, the number of green bitplanes in the color buffer of the currently bound draw framebuffer. This is deﬁned only if all color attachments of the draw framebuffer have identical formats, in which case the number of green bits of color attachment zero are returned.
    * 
    * `GL_IMAGE_BINDING_LAYERED`
    * 
    * _`data`_ returns one value, corresponding to whether the image bound to the indexed image unit is layered or not.
    * 
    * `GL_IMPLEMENTATION_COLOR_READ_FORMAT`
    * 
    * _`data`_ returns one value, the format chosen by the implementation in which pixels may be read from the color buffer of the currently bound framebuffer in conjunction with `GL_IMPLEMENTATION_COLOR_READ_TYPE`. See [glReadPixels][de.dasbabypixel.gamelauncher.gles.es20.glReadPixels.glReadPixels].
    * 
    * `GL_IMPLEMENTATION_COLOR_READ_TYPE`
    * 
    * _`data`_ returns one value, the type chosen by the implementation with which pixels may be read from the color buffer of the currently bound framebuffer in conjunction with `GL_IMPLEMENTATION_COLOR_READ_FORMAT`. See [glReadPixels][de.dasbabypixel.gamelauncher.gles.es20.glReadPixels.glReadPixels].
    * 
    * `GL_LAYER_PROVOKING_VERTEX`
    * 
    * _`data`_ returns one value, the implementation dependent specifc vertex of a primitive that is used to select the rendering layer. If the value returned is `GL_FIRST_VERTEX_CONVENTION`, then the selection is always taken from the first vertex in the primitive. If the value returned is `GL_LAST_VERTEX_CONVENTION`, then the selection is always taken from the last vertex in the primitive. If the value returned is `GL_UNDEFINED_VERTEX`, then the selection is not guaranteed to be taken from any specific vertex in the primitive. Portable applications will therefore assign the same layer for all vertices in a primitive.
    * 
    * `GL_LINE_WIDTH`
    * 
    * _`data`_ returns one value, the line width as specified with [glLineWidth][de.dasbabypixel.gamelauncher.gles.es20.glLineWidth.glLineWidth]. The initial value is 1.
    * 
    * `GL_MAJOR_VERSION`
    * 
    * _`data`_ returns one value, the major version number of the OpenGL ES API supported by the current context. This must be 3.
    * 
    * `GL_MAX_3D_TEXTURE_SIZE`
    * 
    * _`data`_ returns one value, a rough estimate of the largest 3D texture that the GL can handle. The value must be at least 256. See [glTexImage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexImage3D.glTexImage3D].
    * 
    * `GL_MAX_ARRAY_TEXTURE_LAYERS`
    * 
    * _`data`_ returns one value. The value indicates the maximum number of layers allowed in an array texture, and must be at least 256. See [glTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexImage2D.glTexImage2D].
    * 
    * `GL_MAX_ATOMIC_COUNTER_BUFFER_BINDINGS`
    * 
    * _`data`_ returns one value, the maximum number of atomic counter buffer binding points. The value must be at least 1. See [glBindBuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindBuffer.glBindBuffer], [glBindBufferBase][de.dasbabypixel.gamelauncher.gles.es30.glBindBufferBase.glBindBufferBase], and [glBindBufferRange][de.dasbabypixel.gamelauncher.gles.es30.glBindBufferRange.glBindBufferRange].
    * 
    * `GL_MAX_COLOR_ATTACHMENTS`
    * 
    * _`data`_ returns one value, the maximum number of color attachment points in a framebuffer object. The value must be at least 4. See [glFramebufferRenderbuffer][de.dasbabypixel.gamelauncher.gles.es20.glFramebufferRenderbuffer.glFramebufferRenderbuffer] and [glFramebufferTexture2D][de.dasbabypixel.gamelauncher.gles.es20.glFramebufferTexture2D.glFramebufferTexture2D].
    * 
    * `GL_MAX_COLOR_TEXTURE_SAMPLES`
    * 
    * _`data`_ returns one value, the maximum number of samples in a color multisample texture.
    * 
    * `GL_MAX_COMBINED_ATOMIC_COUNTERS`
    * 
    * _`data`_ returns a single value, the maximum number of atomic counters available to all active shaders.
    * 
    * `GL_MAX_COMBINED_ATOMIC_COUNTER_BUFFERS`
    * 
    * _`data`_ returns a single value, the maximum number of atomic counter buffers that may be accessed by all active shaders.
    * 
    * `GL_MAX_COMBINED_COMPUTE_UNIFORM_COMPONENTS`
    * 
    * _`data`_ returns one value, the number of words for compute shader uniform variables in all uniform blocks (including default). The value must be at least 1. See [glUniform][de.dasbabypixel.gamelauncher.gles.es20.glUniform1f.glUniform1f].
    * 
    * `GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS`
    * 
    * _`data`_ returns one value, the number of words for fragment shader uniform variables in all uniform blocks (including default). The value must be at least `GL_MAX_FRAGMENT_UNIFORM_COMPONENTS` + `GL_MAX_UNIFORM_BLOCK_SIZE` \* `GL_MAX_FRAGMENT_UNIFORM_BLOCKS` / 4. See [glUniform][de.dasbabypixel.gamelauncher.gles.es20.glUniform1f.glUniform1f].
    * 
    * `GL_MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS`
    * 
    * _`data`_ returns one value, the number of words for geometry shader uniform variables in all uniform blocks (including default). The value must be at least `GL_MAX_GEOMETRY_UNIFORM_COMPONENTS` + `GL_MAX_UNIFORM_BLOCK_SIZE` \* `GL_MAX_GEOMETRY_UNIFORM_BLOCKS` / 4. See [glUniform][de.dasbabypixel.gamelauncher.gles.es20.glUniform1f.glUniform1f].
    * 
    * `GL_MAX_COMBINED_SHADER_STORAGE_BLOCKS`
    * 
    * _`data`_ returns one value, the maximum total number of active shader storage blocks that may be accessed by all active shaders.
    * 
    * `GL_MAX_COMBINED_TESS_CONTROL_UNIFORM_COMPONENTS`
    * 
    * _`data`_ returns one value, the number of words for tesselation control shader uniform variables in all uniform blocks (including default). The value must be at least `GL_MAX_TESS_CONTROL_UNIFORM_COMPONENTS` + `GL_MAX_UNIFORM_BLOCK_SIZE` \* `GL_MAX_TESS_CONTROL_UNIFORM_BLOCKS` / 4. See [glUniform][de.dasbabypixel.gamelauncher.gles.es20.glUniform1f.glUniform1f].
    * 
    * `GL_MAX_COMBINED_TESS_EVALUATION_UNIFORM_COMPONENTS`
    * 
    * _`data`_ returns one value, the number of words for tesselation evaluation shader uniform variables in all uniform blocks (including default). The value must be at least `GL_MAX_TESS_EVALUATION_UNIFORM_COMPONENTS` + `GL_MAX_UNIFORM_BLOCK_SIZE` \* `GL_MAX_TESS_EVALUATION_UNIFORM_BLOCKS` / 4. See [glUniform][de.dasbabypixel.gamelauncher.gles.es20.glUniform1f.glUniform1f].
    * 
    * `GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS`
    * 
    * _`data`_ returns one value, the maximum supported texture image units that can be used to access texture maps from the all the shader stages combined. If both the vertex shader and the fragment processing stage access the same texture image unit, then that counts as using two texture image units against this limit. The value must be at least 96. See [glActiveTexture][de.dasbabypixel.gamelauncher.gles.es20.glActiveTexture.glActiveTexture].
    * 
    * `GL_MAX_COMBINED_UNIFORM_BLOCKS`
    * 
    * _`data`_ returns one value, the maximum number of uniform blocks per program. The value must be at least 60. See [glUniformBlockBinding][de.dasbabypixel.gamelauncher.gles.es30.glUniformBlockBinding.glUniformBlockBinding].
    * 
    * `GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS`
    * 
    * _`data`_ returns one value, the number of words for vertex shader uniform variables in all uniform blocks (including default). The value must be at least . `GL_MAX_VERTEX_UNIFORM_COMPONENTS` + `GL_MAX_UNIFORM_BLOCK_SIZE` \* `GL_MAX_VERTEX_UNIFORM_BLOCKS` / 4. See [glUniform][de.dasbabypixel.gamelauncher.gles.es20.glUniform1f.glUniform1f].
    * 
    * `GL_MAX_COMPUTE_ATOMIC_COUNTERS`
    * 
    * _`data`_ returns a single value, the maximum number of atomic counters available to compute shaders.
    * 
    * `GL_MAX_COMPUTE_ATOMIC_COUNTER_BUFFERS`
    * 
    * _`data`_ returns a single value, the maximum number of atomic counter buffers that may be accessed by a compute shader.
    * 
    * `GL_MAX_COMPUTE_IMAGE_UNIFORMS`
    * 
    * _`data`_ returns one value, the maximum supported number of image variables in compute shaders.
    * 
    * `GL_MAX_COMPUTE_SHADER_STORAGE_BLOCKS`
    * 
    * _`data`_ returns one value, the maximum number of active shader storage blocks that may be accessed by a compute shader.
    * 
    * `GL_MAX_COMPUTE_TEXTURE_IMAGE_UNITS`
    * 
    * _`data`_ returns one value, the maximum supported texture image units that can be used to access texture maps from the compute shader. The value may be at least 16. See [glActiveTexture][de.dasbabypixel.gamelauncher.gles.es20.glActiveTexture.glActiveTexture].
    * 
    * `GL_MAX_COMPUTE_UNIFORM_BLOCKS`
    * 
    * _`data`_ returns one value, the maximum number of uniform blocks per compute shader. The value must be at least 14. See [glUniformBlockBinding][de.dasbabypixel.gamelauncher.gles.es30.glUniformBlockBinding.glUniformBlockBinding].
    * 
    * `GL_MAX_COMPUTE_UNIFORM_COMPONENTS`
    * 
    * _`data`_ returns one value, the maximum number of individual floating-point, integer, or boolean values that can be held in uniform variable storage for a compute shader. The value must be at least 1024. See [glUniform][de.dasbabypixel.gamelauncher.gles.es20.glUniform1f.glUniform1f].
    * 
    * `GL_MAX_COMPUTE_WORK_GROUP_INVOCATIONS`
    * 
    * _`data`_ returns one value, the number of invocations in a single local work group (i.e., the product of the three dimensions) that may be dispatched to a compute shader.
    * 
    * `GL_MAX_COMPUTE_WORK_GROUP_COUNT`
    * 
    * Accepted by the indexed versions of `glGet`. _`data`_ the maximum number of work groups that may be dispatched to a compute shader. Indices 0, 1, and 2 correspond to the X, Y and Z dimensions, respectively.
    * 
    * `GL_MAX_COMPUTE_WORK_GROUP_SIZE`
    * 
    * Accepted by the indexed versions of `glGet`. _`data`_ the maximum size of a work groups that may be used during compilation of a compute shader. Indices 0, 1, and 2 correspond to the X, Y and Z dimensions, respectively.
    * 
    * `GL_MAX_CUBE_MAP_TEXTURE_SIZE`
    * 
    * _`data`_ returns one value. The value gives a rough estimate of the largest cube-map texture that the GL can handle. The value must be at least 2048. See [glTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexImage2D.glTexImage2D].
    * 
    * `GL_MAX_DEBUG_GROUP_STACK_DEPTH`
    * 
    * _`data`_ returns a single value, the maximum depth of the debug message group stack.
    * 
    * `GL_MAX_DEBUG_LOGGED_MESSAGES`
    * 
    * _`data`_ returns a single value, the maximum number of messages stored in the debug message log.
    * 
    * `GL_MAX_DEBUG_MESSAGE_LENGTH`
    * 
    * _`data`_ returns a single value, the maximum length of a debug message string, including its null terminator.
    * 
    * `GL_MAX_DEPTH_TEXTURE_SAMPLES`
    * 
    * _`params`_ returns one value, the maximum number of samples in a depth/stencil multisample texture.
    * 
    * `GL_MAX_DRAW_BUFFERS`
    * 
    * _`data`_ returns one value, the maximum number of simultaneous outputs that may be written in a fragment shader. The value must be at least 4. See [glDrawBuffers][de.dasbabypixel.gamelauncher.gles.es30.glDrawBuffers.glDrawBuffers].
    * 
    * `GL_MAX_ELEMENT_INDEX`
    * 
    * _`data`_ returns one value, the maximum index supported by the implementation. The value must be at least 2 24 \- 1 .
    * 
    * `GL_MAX_ELEMENTS_INDICES`
    * 
    * _`data`_ returns one value, the recommended maximum number of vertex array indices. See [glDrawRangeElements][de.dasbabypixel.gamelauncher.gles.es30.glDrawRangeElements.glDrawRangeElements].
    * 
    * `GL_MAX_ELEMENTS_VERTICES`
    * 
    * _`data`_ returns one value, the recommended maximum number of vertex array vertices. See [glDrawRangeElements][de.dasbabypixel.gamelauncher.gles.es30.glDrawRangeElements.glDrawRangeElements].
    * 
    * `GL_MAX_FRAGMENT_ATOMIC_COUNTERS`
    * 
    * _`data`_ returns a single value, the maximum number of atomic counters available to fragment shaders. In GL ES 3.1, the minimum value is 0. In GL ES 3.2, the minimum value is 8.
    * 
    * `GL_MAX_FRAGMENT_ATOMIC_COUNTER_BUFFERS`
    * 
    * _`data`_ returns a single value, the maximum number of atomic counter buffers that may be accessed by a fragment shader. In GL ES 3.1, the minimum value is 0. In GL ES 3.2, the minimum value is 1.
    * 
    * `GL_MAX_FRAGMENT_IMAGE_UNIFORMS`
    * 
    * _`data`_ returns one value, the maximum supported number of image variables in fragment shaders. In GL ES 3.1, the minimum value is 0. In GL ES 3.2, the minimum value is 4.
    * 
    * `GL_MAX_FRAGMENT_INPUT_COMPONENTS`
    * 
    * _`data`_ returns one value, the maximum number of components of the inputs read by the fragment shader, which must be at least 60.
    * 
    * `GL_MAX_FRAGMENT_INTERPOLATION_OFFSET`
    * 
    * _`data`_ returns a single floating-point value indicating the maximum valid offset for interpolation. See [interpolateAtOffset](interpolateAtOffset.xhtml).
    * 
    * `GL_MAX_FRAGMENT_SHADER_STORAGE_BLOCKS`
    * 
    * _`data`_ returns one value, the maximum number of active shader storage blocks that may be accessed by a fragment shader. In GL ES 3.1, the minimum value is 0. In GL ES 3.2, the minimum value is 4.
    * 
    * `GL_MAX_FRAGMENT_UNIFORM_BLOCKS`
    * 
    * _`data`_ returns one value, the maximum number of uniform blocks per fragment shader. The value must be at least 12. See [glUniformBlockBinding][de.dasbabypixel.gamelauncher.gles.es30.glUniformBlockBinding.glUniformBlockBinding].
    * 
    * `GL_MAX_FRAGMENT_UNIFORM_COMPONENTS`
    * 
    * _`data`_ returns one value, the maximum number of individual floating-point, integer, or boolean values that can be held in uniform variable storage for a fragment shader. The value must be at least 896. See [glUniform][de.dasbabypixel.gamelauncher.gles.es20.glUniform1f.glUniform1f].
    * 
    * `GL_MAX_FRAGMENT_UNIFORM_VECTORS`
    * 
    * _`data`_ returns one value, the maximum number of vector floating-point, integer, or boolean values that can be held in uniform variable storage for a fragment shader. The value must be at least 224. See [glUniform][de.dasbabypixel.gamelauncher.gles.es20.glUniform1f.glUniform1f].
    * 
    * `GL_MAX_FRAMEBUFFER_HEIGHT`
    * 
    * _`data`_ returns one value, the maximum height for a framebuffer that has no attachments, which must be at least 16384. See [glFramebufferParameteri][de.dasbabypixel.gamelauncher.gles.es31.glFramebufferParameteri.glFramebufferParameteri].
    * 
    * `GL_MAX_FRAMEBUFFER_LAYERS`
    * 
    * _`data`_ returns one value, the maximum number of layers for a framebuffer that has no attachments, which must be at least 256. See [glFramebufferParameteri][de.dasbabypixel.gamelauncher.gles.es31.glFramebufferParameteri.glFramebufferParameteri].
    * 
    * `GL_MAX_FRAMEBUFFER_SAMPLES`
    * 
    * _`data`_ returns one value, the maximum samples in a framebuffer that has no attachments, which must be at least 4. See [glFramebufferParameteri][de.dasbabypixel.gamelauncher.gles.es31.glFramebufferParameteri.glFramebufferParameteri].
    * 
    * `GL_MAX_FRAMEBUFFER_WIDTH`
    * 
    * _`data`_ returns one value, the maximum width for a framebuffer that has no attachments, which must be at least 16384. See [glFramebufferParameteri][de.dasbabypixel.gamelauncher.gles.es31.glFramebufferParameteri.glFramebufferParameteri].
    * 
    * `GL_MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS`
    * 
    * _`data`_ returns a single value, the maximum number of atomic counter buffers that may be accessed by a geometry shader.
    * 
    * `GL_MAX_GEOMETRY_ATOMIC_COUNTERS`
    * 
    * _`data`_ returns a single value, the maximum number of atomic counters available to geometry shaders.
    * 
    * `GL_MAX_GEOMETRY_IMAGE_UNIFORMS`
    * 
    * _`data`_ returns one value, the maximum supported number of image variables in geometry shaders.
    * 
    * `GL_MAX_GEOMETRY_INPUT_COMPONENTS`
    * 
    * _`data`_ returns one value, the maximum number of components of inputs read by a geometry shader, which must be at least 64.
    * 
    * `GL_MAX_GEOMETRY_OUTPUT_COMPONENTS`
    * 
    * _`data`_ returns one value, the maximum number of components of outputs written by a geometry shader, which must be at least 64.
    * 
    * `GL_MAX_GEOMETRY_OUTPUT_VERTICES`
    * 
    * _`data`_ returns one value, the maximum number of vertices emit by a geometry shader, which must be at least 256.
    * 
    * `GL_MAX_GEOMETRY_SHADER_STORAGE_BLOCKS`
    * 
    * _`data`_ returns one value, the maximum number of active shader storage blocks that may be accessed by a geometry shader.
    * 
    * `GL_MAX_GEOMETRY_SHADER_INVOCATIONS`
    * 
    * _`data`_ returns one value, the maximum supported number of invocations per primitive of a geometry shader.
    * 
    * `GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS`
    * 
    * _`data`_ returns one value, the maximum supported texture image units that can be used to access texture maps from the geometry shader. The value must be at least 16. See [glActiveTexture][de.dasbabypixel.gamelauncher.gles.es20.glActiveTexture.glActiveTexture].
    * 
    * `GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS`
    * 
    * _`data`_ returns one value, the maximum total number of components of active outputs for all vertices written by a geometry shader, which must be at least 1024.
    * 
    * `GL_MAX_GEOMETRY_UNIFORM_BLOCKS`
    * 
    * _`data`_ returns one value, the maximum number of uniform blocks per geometry shader. The value must be at least 12. See [glUniformBlockBinding][de.dasbabypixel.gamelauncher.gles.es30.glUniformBlockBinding.glUniformBlockBinding].
    * 
    * `GL_MAX_GEOMETRY_UNIFORM_COMPONENTS`
    * 
    * _`data`_ returns one value, the maximum number of individual floating-point, integer, or boolean values that can be held in uniform variable storage for a geometry shader. The value must be at least 1024. See [glUniform][de.dasbabypixel.gamelauncher.gles.es20.glUniform1f.glUniform1f].
    * 
    * `GL_MAX_INTEGER_SAMPLES`
    * 
    * _`data`_ returns one value, the maximum number of samples supported in integer format multisample buffers.
    * 
    * `GL_MAX_LABEL_LENGTH`
    * 
    * _`data`_ returns a single value, the maximum length of a label string.
    * 
    * `GL_MAX_PROGRAM_TEXEL_OFFSET`
    * 
    * _`data`_ returns one value, the maximum texel offset allowed in a texture lookup, which must be at least 7.
    * 
    * `GL_MAX_RENDERBUFFER_SIZE`
    * 
    * _`data`_ returns one value. The value indicates the maximum supported size for renderbuffers and must be at least 2048. See [glFramebufferRenderbuffer][de.dasbabypixel.gamelauncher.gles.es20.glFramebufferRenderbuffer.glFramebufferRenderbuffer].
    * 
    * `GL_MAX_SAMPLE_MASK_WORDS`
    * 
    * _`data`_ returns one value, the maximum number of sample mask words.
    * 
    * `GL_MAX_SAMPLES`
    * 
    * _`data`_ returns one value. The value indicates the maximum supported number of samples for multisampling. The value must be at least 4. See [glGetInternalformativ][de.dasbabypixel.gamelauncher.gles.es30.glGetInternalformativ.glGetInternalformativ].
    * 
    * `GL_MAX_SERVER_WAIT_TIMEOUT`
    * 
    * _`data`_ returns one value, the maximum [glWaitSync][de.dasbabypixel.gamelauncher.gles.es30.glWaitSync.glWaitSync] timeout interval.
    * 
    * `GL_MAX_SHADER_STORAGE_BLOCK_SIZE`
    * 
    * _`data`_ returns one value, the maximum size in basic machine units of a shader storage block. The value must be at least 2 27 .
    * 
    * `GL_MAX_SHADER_STORAGE_BUFFER_BINDINGS`
    * 
    * _`data`_ returns one value, the maximum number of shader storage buffer binding points on the context, which must be at least 8.
    * 
    * `GL_MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS`
    * 
    * _`data`_ returns a single value, the maximum number of atomic counter buffers that may be accessed by a tesselation control shader.
    * 
    * `GL_MAX_TESS_CONTROL_ATOMIC_COUNTERS`
    * 
    * _`data`_ returns a single value, the maximum number of atomic counters available to tessellation control shaders.
    * 
    * `GL_MAX_TESS_CONTROL_IMAGE_UNIFORMS`
    * 
    * _`data`_ returns one value, the maximum supported number of image variables in tesselation control shaders.
    * 
    * `GL_MAX_TESS_CONTROL_INPUT_COMPONENTS`
    * 
    * _`data`_ returns one value, the maximum number of components of inputs read by a tesselation control shader, which must be at least 64.
    * 
    * `GL_MAX_TESS_CONTROL_OUTPUT_COMPONENTS`
    * 
    * _`data`_ returns one value, the maximum number of components of outputs written by a tesselation control shader, which must be at least 64.
    * 
    * `GL_MAX_TESS_CONTROL_SHADER_STORAGE_BLOCKS`
    * 
    * _`data`_ returns one value, the maximum number of active shader storage blocks that may be accessed by a tessellation control shader.
    * 
    * `GL_MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS`
    * 
    * _`data`_ returns one value, the maximum supported texture image units that can be used to access texture maps from the tesselation control shader. The value may be at least 16. See [glActiveTexture][de.dasbabypixel.gamelauncher.gles.es20.glActiveTexture.glActiveTexture].
    * 
    * `GL_MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS`
    * 
    * _`data`_ returns one value, the maximum total number of components of active outputs for all vertices written by a tesselation control shader, including per-vertex and per-patch outputs, which must be at least 2048.
    * 
    * `GL_MAX_TESS_CONTROL_UNIFORM_BLOCKS`
    * 
    * _`data`_ returns one value, the maximum number of uniform blocks per tesselation control shader. The value must be at least 12. See [glUniformBlockBinding][de.dasbabypixel.gamelauncher.gles.es30.glUniformBlockBinding.glUniformBlockBinding].
    * 
    * `GL_MAX_TESS_CONTROL_UNIFORM_COMPONENTS`
    * 
    * _`data`_ returns one value, the maximum number of individual floating-point, integer, or boolean values that can be held in uniform variable storage for a tesselation control shader. The value must be at least 1024. See [glUniform][de.dasbabypixel.gamelauncher.gles.es20.glUniform1f.glUniform1f].
    * 
    * `GL_MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS`
    * 
    * _`data`_ returns a single value, the maximum number of atomic counter buffers that may be accessed by a tesselation evaluation shader.
    * 
    * `GL_MAX_TESS_EVALUATION_ATOMIC_COUNTERS`
    * 
    * _`data`_ returns a single value, the maximum number of atomic counters available to tessellation evaluation shaders.
    * 
    * `GL_MAX_TESS_EVALUATION_IMAGE_UNIFORMS`
    * 
    * _`data`_ returns one value, the maximum supported number of image variables in tesselation evaluation shaders.
    * 
    * `GL_MAX_TESS_EVALUATION_INPUT_COMPONENTS`
    * 
    * _`data`_ returns one value, the maximum number of components of inputs read by a tesselation evaluation shader, which must be at least 64.
    * 
    * `GL_MAX_TESS_EVALUATION_OUTPUT_COMPONENTS`
    * 
    * _`data`_ returns one value, the maximum number of components of outputs written by a tesselation evaluation shader, which must be at least 64.
    * 
    * `GL_MAX_TESS_EVALUATION_SHADER_STORAGE_BLOCKS`
    * 
    * _`data`_ returns one value, the maximum number of active shader storage blocks that may be accessed by a tessellation evaluation shader.
    * 
    * `GL_MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS`
    * 
    * _`data`_ returns one value, the maximum supported texture image units that can be used to access texture maps from the tesselation evaluation shader. The value may be at least 16. See [glActiveTexture][de.dasbabypixel.gamelauncher.gles.es20.glActiveTexture.glActiveTexture].
    * 
    * `GL_MAX_TESS_EVALUATION_UNIFORM_BLOCKS`
    * 
    * _`data`_ returns one value, the maximum number of uniform blocks per tesselation evaluation shader. The value must be at least 12. See [glUniformBlockBinding][de.dasbabypixel.gamelauncher.gles.es30.glUniformBlockBinding.glUniformBlockBinding].
    * 
    * `GL_MAX_TESS_EVALUATION_UNIFORM_COMPONENTS`
    * 
    * _`data`_ returns one value, the maximum number of individual floating-point, integer, or boolean values that can be held in uniform variable storage for a tesselation evaluation shader. The value must be at least 1024. See [glUniform][de.dasbabypixel.gamelauncher.gles.es20.glUniform1f.glUniform1f].
    * 
    * `GL_MAX_TESS_GEN_LEVEL`
    * 
    * _`data`_ returns a single value, the maximum tessellation level supported by the tesselation primitive generator.
    * 
    * `GL_MAX_TESS_PATCH_COMPONENTS`
    * 
    * _`data`_ returns one value, the maximum number of components of per-patch outputs written by a tesselation control shader, which must be at least 120.
    * 
    * `GL_MAX_TEXTURE_BUFFER_SIZE`
    * 
    * _`data`_ returns one value. The value gives the maximum number of texels allowed in the texel array of a texture buffer object. Value must be at least 65536.
    * 
    * `GL_MAX_TEXTURE_IMAGE_UNITS`
    * 
    * _`data`_ returns one value, the maximum supported texture image units that can be used to access texture maps from the fragment shader. The value must be at least 16. See [glActiveTexture][de.dasbabypixel.gamelauncher.gles.es20.glActiveTexture.glActiveTexture].
    * 
    * `GL_MAX_TEXTURE_LOD_BIAS`
    * 
    * _`data`_ returns one value, the maximum, absolute value of the texture level-of-detail bias. The value must be at least 2.0.
    * 
    * `GL_MAX_TEXTURE_SIZE`
    * 
    * _`data`_ returns one value. The value gives a rough estimate of the largest texture that the GL can handle. The value must be at least 2048. See [glTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexImage2D.glTexImage2D].
    * 
    * `GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS`
    * 
    * _`data`_ returns one value, the maximum number of components which can be written to a single transform feedback buffer in interleaved mode. The value must be at least 64. See [glTransformFeedbackVaryings][de.dasbabypixel.gamelauncher.gles.es30.glTransformFeedbackVaryings.glTransformFeedbackVaryings].
    * 
    * `GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS`
    * 
    * _`data`_ returns one value, the maximum separate attributes or outputs which can be captured in separate transform feedback mode. The value must be at least 4. See [glTransformFeedbackVaryings][de.dasbabypixel.gamelauncher.gles.es30.glTransformFeedbackVaryings.glTransformFeedbackVaryings].
    * 
    * `GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS`
    * 
    * _`data`_ returns one value, the maximum number of components which can be written per attribute or output in separate transform feedback mode. The value must be at least 4. See [glTransformFeedbackVaryings][de.dasbabypixel.gamelauncher.gles.es30.glTransformFeedbackVaryings.glTransformFeedbackVaryings].
    * 
    * `GL_MAX_UNIFORM_BLOCK_SIZE`
    * 
    * _`data`_ returns one value, the maximum size in basic machine units of a uniform block. The value must be at least 16384. See [glUniformBlockBinding][de.dasbabypixel.gamelauncher.gles.es30.glUniformBlockBinding.glUniformBlockBinding].
    * 
    * `GL_MAX_UNIFORM_BUFFER_BINDINGS`
    * 
    * _`data`_ returns one value, the maximum number of uniform buffer binding points on the context, which must be at least 72.
    * 
    * `GL_MAX_UNIFORM_LOCATIONS`
    * 
    * _`data`_ returns one value, the maximum number of explicitly assignable uniform locations, which must be at least 1024.
    * 
    * `GL_MAX_VARYING_COMPONENTS`
    * 
    * _`data`_ returns one value, the number components for varying variables, which must be at least 60.
    * 
    * `GL_MAX_VARYING_VECTORS`
    * 
    * _`data`_ returns one value, the maximum number of interpolators available for processing varying variables used by vertex and fragment shaders. This value represents the number of vector values that can be interpolated; varying variables declared as matrices and arrays will consume multiple interpolators. The value must be at least 15.
    * 
    * `GL_MAX_VERTEX_ATOMIC_COUNTERS`
    * 
    * _`data`_ returns a single value, the maximum number of atomic counters available to vertex shaders.
    * 
    * `GL_MAX_VERTEX_ATOMIC_COUNTER_BUFFERS`
    * 
    * _`data`_ returns a single value, the maximum number of atomic counter buffers that may be accessed by a vertex shader.
    * 
    * `GL_MAX_VERTEX_ATTRIB_BINDINGS`
    * 
    * _`data`_ returns a single integer value containing the maximum number of vertex buffers that may be bound.
    * 
    * `GL_MAX_VERTEX_ATTRIB_RELATIVE_OFFSET`
    * 
    * _`data`_ returns a single integer value containing the maximum offset that may be added to a vertex binding offset.
    * 
    * `GL_MAX_VERTEX_ATTRIBS`
    * 
    * _`data`_ returns one value, the maximum number of 4-component generic vertex attributes accessible to a vertex shader. The value must be at least 16. See [glVertexAttrib][de.dasbabypixel.gamelauncher.gles.es20.glVertexAttrib1f.glVertexAttrib1f].
    * 
    * `GL_MAX_VERTEX_IMAGE_UNIFORMS`
    * 
    * _`data`_ returns one value, the maximum supported number of image variables in vertex shaders.
    * 
    * `GL_MAX_VERTEX_SHADER_STORAGE_BLOCKS`
    * 
    * _`data`_ returns one value, the maximum number of active shader storage blocks that may be accessed by a vertex shader.
    * 
    * `GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS`
    * 
    * _`data`_ returns one value, the maximum supported texture image units that can be used to access texture maps from the vertex shader. The value may be at least 16. See [glActiveTexture][de.dasbabypixel.gamelauncher.gles.es20.glActiveTexture.glActiveTexture].
    * 
    * `GL_MAX_VERTEX_OUTPUT_COMPONENTS`
    * 
    * _`data`_ returns one value, the maximum number of components of output written by a vertex shader, which must be at least 64.
    * 
    * `GL_MAX_VERTEX_UNIFORM_BLOCKS`
    * 
    * _`data`_ returns one value, the maximum number of uniform blocks per vertex shader. The value must be at least 12. See [glUniformBlockBinding][de.dasbabypixel.gamelauncher.gles.es30.glUniformBlockBinding.glUniformBlockBinding].
    * 
    * `GL_MAX_VERTEX_UNIFORM_COMPONENTS`
    * 
    * _`data`_ returns one value, the maximum number of individual floating-point, integer, or boolean values that can be held in uniform variable storage for a vertex shader. The value must be at least 1024. See [glUniform][de.dasbabypixel.gamelauncher.gles.es20.glUniform1f.glUniform1f].
    * 
    * `GL_MAX_VERTEX_UNIFORM_VECTORS`
    * 
    * _`data`_ returns one value, the maximum number of vector floating-point, integer, or boolean values that can be held in uniform variable storage for a vertex shader. The value must be at least 256. See [glUniform][de.dasbabypixel.gamelauncher.gles.es20.glUniform1f.glUniform1f].
    * 
    * `GL_MAX_VIEWPORT_DIMS`
    * 
    * _`data`_ returns two values: the maximum supported width and height of the viewport. These must be at least as large as the visible dimensions of the display being rendered to. See [glViewport][de.dasbabypixel.gamelauncher.gles.es20.glViewport.glViewport].
    * 
    * `GL_MIN_FRAGMENT_INTERPOLATION_OFFSET`
    * 
    * _`data`_ returns a single floating-point value indicating the minimum valid offset for interpolation. See [interpolateAtOffset](interpolateAtOffset.xhtml).
    * 
    * `GL_MIN_PROGRAM_TEXEL_OFFSET`
    * 
    * _`data`_ returns one value, the minimum texel offset allowed in a texture lookup, which must be at most -8.
    * 
    * `GL_MIN_SAMPLE_SHADING_VALUE`
    * 
    * _`data`_ returns a single floating-point value indicating the minimum sample shading fraction. See [glMinSampleShading][de.dasbabypixel.gamelauncher.gles.es32.glMinSampleShading.glMinSampleShading].
    * 
    * `GL_MINOR_VERSION`
    * 
    * _`data`_ returns one value, the minor version number of the OpenGL ES API supported by the current context.
    * 
    * `GL_MULTISAMPLE_LINE_WIDTH_RANGE`
    * 
    * _`data`_ returns a pair of values indicating the range of widths supported for lines drawn when `GL_SAMPLE_BUFFERS` is one. See [glLineWidth][de.dasbabypixel.gamelauncher.gles.es20.glLineWidth.glLineWidth].
    * 
    * `GL_NUM_COMPRESSED_TEXTURE_FORMATS`
    * 
    * _`data`_ returns a single integer value indicating the number of available compressed texture formats. The minimum value is 38. See [glCompressedTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glCompressedTexImage2D.glCompressedTexImage2D].
    * 
    * `GL_NUM_EXTENSIONS`
    * 
    * _`data`_ returns one value, the number of extensions supported by the GL implementation for the current context. See [glGetString][de.dasbabypixel.gamelauncher.gles.es20.glGetString.glGetString].
    * 
    * `GL_NUM_PROGRAM_BINARY_FORMATS`
    * 
    * _`data`_ returns a single integer value indicating the number of available program binary formats. The minimum value is 0. See [glProgramBinary][de.dasbabypixel.gamelauncher.gles.es30.glProgramBinary.glProgramBinary].
    * 
    * `GL_NUM_SHADER_BINARY_FORMATS`
    * 
    * _`data`_ returns a single integer value indicating the number of available shader binary formats. The minimum value is 0. See [glShaderBinary][de.dasbabypixel.gamelauncher.gles.es20.glShaderBinary.glShaderBinary].
    * 
    * `GL_PACK_ALIGNMENT`
    * 
    * _`data`_ returns one value, the byte alignment used for writing pixel data to memory. The initial value is 4. See [glPixelStorei][de.dasbabypixel.gamelauncher.gles.es20.glPixelStorei.glPixelStorei].
    * 
    * `GL_PACK_ROW_LENGTH`
    * 
    * _`data`_ returns one value, the row length used for writing pixel data to memory. The initial value is 0. See [glPixelStorei][de.dasbabypixel.gamelauncher.gles.es20.glPixelStorei.glPixelStorei].
    * 
    * `GL_PACK_SKIP_PIXELS`
    * 
    * _`data`_ returns one value, the number of pixel locations skipped before the first pixel is written into memory. The initial value is 0. See [glPixelStorei][de.dasbabypixel.gamelauncher.gles.es20.glPixelStorei.glPixelStorei].
    * 
    * `GL_PACK_SKIP_ROWS`
    * 
    * _`data`_ returns one value, the number of rows of pixel locations skipped before the first pixel is written into memory. The initial value is 0. See [glPixelStorei][de.dasbabypixel.gamelauncher.gles.es20.glPixelStorei.glPixelStorei].
    * 
    * `GL_PATCH_VERTICES`
    * 
    * _`data`_ returns one value, the number of vertices in an input patch. The initial value is 3. See [glPatchParameteri][de.dasbabypixel.gamelauncher.gles.es32.glPatchParameteri.glPatchParameteri].
    * 
    * `GL_PIXEL_PACK_BUFFER_BINDING`
    * 
    * _`data`_ returns a single value, the name of the buffer object currently bound to the target `GL_PIXEL_PACK_BUFFER`. If no buffer object is bound to this target, 0 is returned. The initial value is 0. See [glBindBuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindBuffer.glBindBuffer].
    * 
    * `GL_PIXEL_UNPACK_BUFFER_BINDING`
    * 
    * _`data`_ returns a single value, the name of the buffer object currently bound to the target `GL_PIXEL_UNPACK_BUFFER`. If no buffer object is bound to this target, 0 is returned. The initial value is 0. See [glBindBuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindBuffer.glBindBuffer].
    * 
    * `GL_POLYGON_OFFSET_FACTOR`
    * 
    * _`data`_ returns one value, the scaling factor used to determine the variable offset that is added to the depth value of each fragment generated when a polygon is rasterized. The initial value is 0. See [glPolygonOffset][de.dasbabypixel.gamelauncher.gles.es20.glPolygonOffset.glPolygonOffset].
    * 
    * `GL_POLYGON_OFFSET_FILL`
    * 
    * _`data`_ returns a single boolean value indicating whether polygon offset is enabled for polygons. The initial value is `GL_FALSE`. See [glPolygonOffset][de.dasbabypixel.gamelauncher.gles.es20.glPolygonOffset.glPolygonOffset].
    * 
    * `GL_POLYGON_OFFSET_UNITS`
    * 
    * _`data`_ returns one value. This value is multiplied by an implementation-specific value and then added to the depth value of each fragment generated when a polygon is rasterized. The initial value is 0. See [glPolygonOffset][de.dasbabypixel.gamelauncher.gles.es20.glPolygonOffset.glPolygonOffset].
    * 
    * `GL_PRIMITIVE_BOUNDING_BOX`
    * 
    * _`data`_ returns eight values minX, minY, minZ, minW, and maxX, maxY, maxZ, maxW corresponding to the clip space coordinates of the primitive bounding box. See [glPrimitiveBoundingBox][de.dasbabypixel.gamelauncher.gles.es32.glPrimitiveBoundingBox.glPrimitiveBoundingBox].
    * 
    * `GL_PRIMITIVE_RESTART_FIXED_INDEX`
    * 
    * _`data`_ returns a single boolean value indicating whether primitive restart with a fixed index is enabled. The initial value is `GL_FALSE`.
    * 
    * `GL_PROGRAM_BINARY_FORMATS`
    * 
    * _`data`_ returns a list of symbolic constants of length `GL_NUM_PROGRAM_BINARY_FORMATS` indicating which program binary formats are available. See [glProgramBinary][de.dasbabypixel.gamelauncher.gles.es30.glProgramBinary.glProgramBinary].
    * 
    * `GL_PROGRAM_PIPELINE_BINDING`
    * 
    * _`data`_ a single value, the name of the currently bound program pipeline object, or zero if no program pipeline object is bound. See [glBindProgramPipeline][de.dasbabypixel.gamelauncher.gles.es31.glBindProgramPipeline.glBindProgramPipeline].
    * 
    * `GL_RASTERIZER_DISCARD`
    * 
    * _`data`_ returns one value, a single boolean value indicating whether primitives are discarded immediately before the rasterization stage, but after the optional transform feedback stage. See [glEnable][de.dasbabypixel.gamelauncher.gles.es20.glEnable.glEnable].
    * 
    * `GL_READ_BUFFER`
    * 
    * _`data`_ returns one value, a symbolic constant indicating which color buffer is selected for reading. The initial value is `GL_BACK`. See [glReadPixels][de.dasbabypixel.gamelauncher.gles.es20.glReadPixels.glReadPixels].
    * 
    * `GL_READ_FRAMEBUFFER_BINDING`
    * 
    * _`data`_ returns one value, the name of the framebuffer object currently bound to the `GL_READ_FRAMEBUFFER` target. If the default framebuffer is bound, this value will be zero. The initial value is zero. See [glBindFramebuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindFramebuffer.glBindFramebuffer].
    * 
    * `GL_RED_BITS`
    * 
    * _`data`_ returns one value, the number of red bitplanes in the color buffer of the currently bound draw framebuffer. This is deﬁned only if all color attachments of the draw framebuffer have identical formats, in which case the number of red bits of color attachment zero are returned.
    * 
    * `GL_RENDERBUFFER_BINDING`
    * 
    * _`data`_ returns a single value, the name of the renderbuffer object currently bound to the target `GL_RENDERBUFFER`. If no renderbuffer object is bound to this target, 0 is returned. The initial value is 0. See [glBindRenderbuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindRenderbuffer.glBindRenderbuffer].
    * 
    * `GL_RESET_NOTIFICATION_STRATEGY`
    * 
    * _`data`_ returns a single value, the behaviour of reset notification. Valid values are `GL_NO_RESET_NOTIFICATION`, indicating that no reset notification events will be provided by the implementation, or `GL_LOSE_CONTEXT_ON_RESET`, indicating that a reset will result in the loss of graphics context. This loss can be found by querying [glGetGraphicsResetStatus][de.dasbabypixel.gamelauncher.gles.es32.glGetGraphicsResetStatus.glGetGraphicsResetStatus].
    * 
    * `GL_SAMPLE_ALPHA_TO_COVERAGE`
    * 
    * _`data`_ returns a single boolean value indicating whether modification of sample coverage based on alpha is enabled. The initial value is `GL_FALSE`. See [glSampleCoverage][de.dasbabypixel.gamelauncher.gles.es20.glSampleCoverage.glSampleCoverage].
    * 
    * `GL_SAMPLE_BUFFERS`
    * 
    * _`data`_ returns a single integer value indicating the number of sample buffers associated with the framebuffer. See [glSampleCoverage][de.dasbabypixel.gamelauncher.gles.es20.glSampleCoverage.glSampleCoverage].
    * 
    * `GL_SAMPLE_COVERAGE`
    * 
    * _`data`_ returns a single boolean value indicating whether modification of sample coverage based on the value specified by [glSampleCoverage][de.dasbabypixel.gamelauncher.gles.es20.glSampleCoverage.glSampleCoverage] is enabled. The initial value is `GL_FALSE`.
    * 
    * `GL_SAMPLE_COVERAGE_INVERT`
    * 
    * _`data`_ returns a single boolean value indicating if the temporary coverage value should be inverted. See [glSampleCoverage][de.dasbabypixel.gamelauncher.gles.es20.glSampleCoverage.glSampleCoverage].
    * 
    * `GL_SAMPLE_COVERAGE_VALUE`
    * 
    * _`data`_ returns a single positive floating-point value indicating the current sample coverage value. See [glSampleCoverage][de.dasbabypixel.gamelauncher.gles.es20.glSampleCoverage.glSampleCoverage].
    * 
    * `GL_SAMPLE_MASK_VALUE`
    * 
    * _`params`_ returns one value indicating the current sample mask value. See [glSampleMaski][de.dasbabypixel.gamelauncher.gles.es31.glSampleMaski.glSampleMaski].
    * 
    * `GL_SAMPLE_SHADING`
    * 
    * _`data`_ returns a single integer value indicating whether sample rate shading is enabled. See [glEnable][de.dasbabypixel.gamelauncher.gles.es20.glEnable.glEnable].
    * 
    * `GL_SAMPLER_BINDING`
    * 
    * _`data`_ returns a single value, the name of the sampler object currently bound to the active texture unit. The initial value is 0. See [glBindSampler][de.dasbabypixel.gamelauncher.gles.es30.glBindSampler.glBindSampler].
    * 
    * `GL_SAMPLES`
    * 
    * _`data`_ returns a single integer value indicating the coverage mask size. See [glSampleCoverage][de.dasbabypixel.gamelauncher.gles.es20.glSampleCoverage.glSampleCoverage].
    * 
    * `GL_SCISSOR_BOX`
    * 
    * _`data`_ returns four values: the x and y window coordinates of the scissor box, followed by its width and height. Initially the x and y window coordinates are both 0 and the width and height are set to the size of the window. See [glScissor][de.dasbabypixel.gamelauncher.gles.es20.glScissor.glScissor].
    * 
    * `GL_SCISSOR_TEST`
    * 
    * _`data`_ returns a single boolean value indicating whether scissoring is enabled. The initial value is `GL_FALSE`. See [glScissor][de.dasbabypixel.gamelauncher.gles.es20.glScissor.glScissor].
    * 
    * `GL_SHADER_BINARY_FORMATS`
    * 
    * _`data`_ returns a list of symbolic constants of length `GL_NUM_SHADER_BINARY_FORMATS` indicating which shader binary formats are available. See [glShaderBinary][de.dasbabypixel.gamelauncher.gles.es20.glShaderBinary.glShaderBinary].
    * 
    * `GL_SHADER_COMPILER`
    * 
    * _`data`_ returns a single boolean value indicating whether a shader compiler is supported. This value is always `GL_TRUE`. See [glCompileShader][de.dasbabypixel.gamelauncher.gles.es20.glCompileShader.glCompileShader].
    * 
    * `GL_SHADER_STORAGE_BUFFER_BINDING`
    * 
    * When used with non-indexed variants of `glGet` (such as `glGetIntegerv`), _`data`_ returns a single value, the name of the buffer object currently bound to the target `GL_SHADER_STORAGE_BUFFER`. If no buffer object is bound to this target, 0 is returned. When used with indexed variants of `glGet` (such as `glGetIntegeri_v`), _`data`_ returns a single value, the name of the buffer object bound to the indexed shader storage buffer binding points. The initial value is 0 for all targets. See [glBindBuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindBuffer.glBindBuffer], [glBindBufferBase][de.dasbabypixel.gamelauncher.gles.es30.glBindBufferBase.glBindBufferBase], and [glBindBufferRange][de.dasbabypixel.gamelauncher.gles.es30.glBindBufferRange.glBindBufferRange].
    * 
    * `GL_SHADER_STORAGE_BUFFER_OFFSET_ALIGNMENT`
    * 
    * _`data`_ returns a single value, the minimum required alignment for shader storage buffer sizes and offset. The initial value is 1. See [glShaderStorateBlockBinding](glShaderStorateBlockBinding.xhtml).
    * 
    * `GL_SHADER_STORAGE_BUFFER_SIZE`
    * 
    * When used with indexed variants of `glGet` (such as `glGetInteger64i_v`), _`data`_ returns a single value, the size of the binding range for each indexed shader storage buffer binding. The initial value is 0 for all bindings. See [glBindBufferRange][de.dasbabypixel.gamelauncher.gles.es30.glBindBufferRange.glBindBufferRange].
    * 
    * `GL_SHADER_STORAGE_BUFFER_START`
    * 
    * When used with indexed variants of `glGet` (such as `glGetInteger64i_v`), _`data`_ returns a single value, the start offset of the binding range for each indexed shader storage buffer binding. The initial value is 0 for all bindings. See [glBindBufferRange][de.dasbabypixel.gamelauncher.gles.es30.glBindBufferRange.glBindBufferRange].
    * 
    * `GL_STENCIL_BACK_FAIL`
    * 
    * _`data`_ returns one value, a symbolic constant indicating what action is taken for back-facing polygons when the stencil test fails. The initial value is `GL_KEEP`. See [glStencilOpSeparate][de.dasbabypixel.gamelauncher.gles.es20.glStencilOpSeparate.glStencilOpSeparate].
    * 
    * `GL_STENCIL_BACK_FUNC`
    * 
    * _`data`_ returns one value, a symbolic constant indicating what function is used for back-facing polygons to compare the stencil reference value with the stencil buffer value. The initial value is `GL_ALWAYS`. See [glStencilFuncSeparate][de.dasbabypixel.gamelauncher.gles.es20.glStencilFuncSeparate.glStencilFuncSeparate].
    * 
    * `GL_STENCIL_BACK_PASS_DEPTH_FAIL`
    * 
    * _`data`_ returns one value, a symbolic constant indicating what action is taken for back-facing polygons when the stencil test passes, but the depth test fails. The initial value is `GL_KEEP`. See [glStencilOpSeparate][de.dasbabypixel.gamelauncher.gles.es20.glStencilOpSeparate.glStencilOpSeparate].
    * 
    * `GL_STENCIL_BACK_PASS_DEPTH_PASS`
    * 
    * _`data`_ returns one value, a symbolic constant indicating what action is taken for back-facing polygons when the stencil test passes and the depth test passes. The initial value is `GL_KEEP`. See [glStencilOpSeparate][de.dasbabypixel.gamelauncher.gles.es20.glStencilOpSeparate.glStencilOpSeparate].
    * 
    * `GL_STENCIL_BACK_REF`
    * 
    * _`data`_ returns one value, the reference value that is compared with the contents of the stencil buffer for back-facing polygons. The initial value is 0. See [glStencilFuncSeparate][de.dasbabypixel.gamelauncher.gles.es20.glStencilFuncSeparate.glStencilFuncSeparate].
    * 
    * `GL_STENCIL_BACK_VALUE_MASK`
    * 
    * _`data`_ returns one value, the mask that is used for back-facing polygons to mask both the stencil reference value and the stencil buffer value before they are compared. The initial value is all 1's. See [glStencilFuncSeparate][de.dasbabypixel.gamelauncher.gles.es20.glStencilFuncSeparate.glStencilFuncSeparate].
    * 
    * `GL_STENCIL_BACK_WRITEMASK`
    * 
    * _`data`_ returns one value, the mask that controls writing of the stencil bitplanes for back-facing polygons. The initial value is all 1's. See [glStencilMaskSeparate][de.dasbabypixel.gamelauncher.gles.es20.glStencilMaskSeparate.glStencilMaskSeparate].
    * 
    * `GL_STENCIL_BITS`
    * 
    * _`data`_ returns one value, the number of bitplanes in the stencil buffer of the currently bound framebuffer.
    * 
    * `GL_STENCIL_CLEAR_VALUE`
    * 
    * _`data`_ returns one value, the index to which the stencil bitplanes are cleared. The initial value is 0. See [glClearStencil][de.dasbabypixel.gamelauncher.gles.es20.glClearStencil.glClearStencil].
    * 
    * `GL_STENCIL_FAIL`
    * 
    * _`data`_ returns one value, a symbolic constant indicating what action is taken when the stencil test fails. The initial value is `GL_KEEP`. See [glStencilOp][de.dasbabypixel.gamelauncher.gles.es20.glStencilOp.glStencilOp]. This stencil state only affects non-polygons and front-facing polygons. Back-facing polygons use separate stencil state. See [glStencilOpSeparate][de.dasbabypixel.gamelauncher.gles.es20.glStencilOpSeparate.glStencilOpSeparate].
    * 
    * `GL_STENCIL_FUNC`
    * 
    * _`data`_ returns one value, a symbolic constant indicating what function is used to compare the stencil reference value with the stencil buffer value. The initial value is `GL_ALWAYS`. See [glStencilFunc][de.dasbabypixel.gamelauncher.gles.es20.glStencilFunc.glStencilFunc]. This stencil state only affects non-polygons and front-facing polygons. Back-facing polygons use separate stencil state. See [glStencilFuncSeparate][de.dasbabypixel.gamelauncher.gles.es20.glStencilFuncSeparate.glStencilFuncSeparate].
    * 
    * `GL_STENCIL_PASS_DEPTH_FAIL`
    * 
    * _`data`_ returns one value, a symbolic constant indicating what action is taken when the stencil test passes, but the depth test fails. The initial value is `GL_KEEP`. See [glStencilOp][de.dasbabypixel.gamelauncher.gles.es20.glStencilOp.glStencilOp]. This stencil state only affects non-polygons and front-facing polygons. Back-facing polygons use separate stencil state. See [glStencilOpSeparate][de.dasbabypixel.gamelauncher.gles.es20.glStencilOpSeparate.glStencilOpSeparate].
    * 
    * `GL_STENCIL_PASS_DEPTH_PASS`
    * 
    * _`data`_ returns one value, a symbolic constant indicating what action is taken when the stencil test passes and the depth test passes. The initial value is `GL_KEEP`. See [glStencilOp][de.dasbabypixel.gamelauncher.gles.es20.glStencilOp.glStencilOp]. This stencil state only affects non-polygons and front-facing polygons. Back-facing polygons use separate stencil state. See [glStencilOpSeparate][de.dasbabypixel.gamelauncher.gles.es20.glStencilOpSeparate.glStencilOpSeparate].
    * 
    * `GL_STENCIL_REF`
    * 
    * _`data`_ returns one value, the reference value that is compared with the contents of the stencil buffer. The initial value is 0. See [glStencilFunc][de.dasbabypixel.gamelauncher.gles.es20.glStencilFunc.glStencilFunc]. This stencil state only affects non-polygons and front-facing polygons. Back-facing polygons use separate stencil state. See [glStencilFuncSeparate][de.dasbabypixel.gamelauncher.gles.es20.glStencilFuncSeparate.glStencilFuncSeparate].
    * 
    * `GL_STENCIL_TEST`
    * 
    * _`data`_ returns a single boolean value indicating whether stencil testing of fragments is enabled. The initial value is `GL_FALSE`. See [glStencilFunc][de.dasbabypixel.gamelauncher.gles.es20.glStencilFunc.glStencilFunc] and [glStencilOp][de.dasbabypixel.gamelauncher.gles.es20.glStencilOp.glStencilOp].
    * 
    * `GL_STENCIL_VALUE_MASK`
    * 
    * _`data`_ returns one value, the mask that is used to mask both the stencil reference value and the stencil buffer value before they are compared. The initial value is all 1's. See [glStencilFunc][de.dasbabypixel.gamelauncher.gles.es20.glStencilFunc.glStencilFunc]. This stencil state only affects non-polygons and front-facing polygons. Back-facing polygons use separate stencil state. See [glStencilFuncSeparate][de.dasbabypixel.gamelauncher.gles.es20.glStencilFuncSeparate.glStencilFuncSeparate].
    * 
    * `GL_STENCIL_WRITEMASK`
    * 
    * _`data`_ returns one value, the mask that controls writing of the stencil bitplanes. The initial value is all 1's. See [glStencilMask][de.dasbabypixel.gamelauncher.gles.es20.glStencilMask.glStencilMask]. This stencil state only affects non-polygons and front-facing polygons. Back-facing polygons use separate stencil state. See [glStencilMaskSeparate][de.dasbabypixel.gamelauncher.gles.es20.glStencilMaskSeparate.glStencilMaskSeparate].
    * 
    * `GL_SUBPIXEL_BITS`
    * 
    * _`data`_ returns one value, an estimate of the number of bits of subpixel resolution that are used to position rasterized geometry in window coordinates. The value must be at least 4.
    * 
    * `GL_TEXTURE_BINDING_2D`
    * 
    * _`data`_ returns a single value, the name of the texture currently bound to the target `GL_TEXTURE_2D`. The initial value is 0. See [glBindTexture][de.dasbabypixel.gamelauncher.gles.es20.glBindTexture.glBindTexture].
    * 
    * `GL_TEXTURE_BINDING_2D_ARRAY`
    * 
    * _`data`_ returns a single value, the name of the texture currently bound to the target `GL_TEXTURE_2D_ARRAY`. The initial value is 0. See [glBindTexture][de.dasbabypixel.gamelauncher.gles.es20.glBindTexture.glBindTexture].
    * 
    * `GL_TEXTURE_BINDING_3D`
    * 
    * _`data`_ returns a single value, the name of the texture currently bound to the target `GL_TEXTURE_3D`. The initial value is 0. See [glBindTexture][de.dasbabypixel.gamelauncher.gles.es20.glBindTexture.glBindTexture].
    * 
    * `GL_TEXTURE_BINDING_BUFFER`
    * 
    * _`data`_ returns a single value, the name of the texture currently bound to the target `GL_TEXTURE_BUFFER`. The initial value is 0. See [glBindTexture][de.dasbabypixel.gamelauncher.gles.es20.glBindTexture.glBindTexture].
    * 
    * `GL_TEXTURE_BINDING_CUBE_MAP`
    * 
    * _`data`_ returns a single value, the name of the texture currently bound to the target `GL_TEXTURE_CUBE_MAP`. The initial value is 0. See [glBindTexture][de.dasbabypixel.gamelauncher.gles.es20.glBindTexture.glBindTexture].
    * 
    * `GL_TEXTURE_BINDING_2D_MULTISAMPLE`
    * 
    * _`data`_ returns a single value, the name of the texture currently bound to the target `GL_TEXTURE_2D_MULTISAMPLE`. The initial value is 0. See [glBindTexture][de.dasbabypixel.gamelauncher.gles.es20.glBindTexture.glBindTexture].
    * 
    * `GL_TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY`
    * 
    * _`data`_ returns a single value, the name of the texture currently bound to the target `GL_TEXTURE_2D_MULTISAMPLE_ARRAY`. The initial value is 0. See [glBindTexture][de.dasbabypixel.gamelauncher.gles.es20.glBindTexture.glBindTexture].
    * 
    * `GL_TEXTURE_BINDING_CUBE_MAP_ARRAY`
    * 
    * _`data`_ returns a single value, the name of the texture currently bound to the target `GL_TEXTURE_CUBE_MAP_ARRAY`. The initial value is 0. See [glBindTexture][de.dasbabypixel.gamelauncher.gles.es20.glBindTexture.glBindTexture].
    * 
    * `GL_TEXTURE_BUFFER_BINDING`
    * 
    * _`data`_ returns a single value, the name of the buffer object currently bound to the target `GL_TEXTURE_BUFFER`. If no buffer object is bound to this target, 0 is returned. The initial value is 0. See [glBindBuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindBuffer.glBindBuffer].
    * 
    * `GL_TEXTURE_BUFFER_OFFSET_ALIGNMENT`
    * 
    * _`data`_ returns a single value, the minimum required alignment for texture buffer sizes and offset. The initial value is 1. See [glUniformBlockBinding][de.dasbabypixel.gamelauncher.gles.es30.glUniformBlockBinding.glUniformBlockBinding].
    * 
    * `GL_TRANSFORM_FEEDBACK_BINDING`
    * 
    * _`data`_ returns a single value, the name of the transform feedback object currently bound to the `GL_TRANSFORM_FEEDBACK` target. If no transform feedback object is bound to this target, 0 is returned. The initial value is 0. See [glBindTransformFeedback][de.dasbabypixel.gamelauncher.gles.es30.glBindTransformFeedback.glBindTransformFeedback].
    * 
    * `GL_TRANSFORM_FEEDBACK_ACTIVE`
    * 
    * _`data`_ returns a single boolean value indicating if the currently bound transform feedback object is active. See [glBeginTransformFeedback][de.dasbabypixel.gamelauncher.gles.es30.glBeginTransformFeedback.glBeginTransformFeedback] and [glResumeTransformFeedback][de.dasbabypixel.gamelauncher.gles.es30.glResumeTransformFeedback.glResumeTransformFeedback].
    * 
    * `GL_TRANSFORM_FEEDBACK_BUFFER_BINDING`
    * 
    * When used with non-indexed variants of `glGet` (such as `glGetIntegerv`), _`data`_ returns a single value, the name of the buffer object currently bound to the target `GL_TRANSFORM_FEEDBACK_BUFFER`. If no buffer object is bound to this target, 0 is returned. When used with indexed variants of `glGet` (such as `glGetIntegeri_v`), _`data`_ returns a single value, the name of the buffer object bound to the indexed transform feedback attribute stream. The initial value is 0 for all targets. See [glBindBuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindBuffer.glBindBuffer], [glBindBufferBase][de.dasbabypixel.gamelauncher.gles.es30.glBindBufferBase.glBindBufferBase], and [glBindBufferRange][de.dasbabypixel.gamelauncher.gles.es30.glBindBufferRange.glBindBufferRange].
    * 
    * `GL_TRANSFORM_FEEDBACK_PAUSED`
    * 
    * _`data`_ returns a single boolean value indicating if the currently bound transform feedback object is paused. See [glPauseTransformFeedback][de.dasbabypixel.gamelauncher.gles.es30.glPauseTransformFeedback.glPauseTransformFeedback].
    * 
    * `GL_TRANSFORM_FEEDBACK_BUFFER_SIZE`
    * 
    * When used with indexed variants of `glGet` (such as `glGetInteger64i_v`), _`data`_ returns a single value, the size of the binding range for each transform feedback attribute stream. The initial value is 0 for all streams. See [glBindBufferRange][de.dasbabypixel.gamelauncher.gles.es30.glBindBufferRange.glBindBufferRange].
    * 
    * `GL_TRANSFORM_FEEDBACK_BUFFER_START`
    * 
    * When used with indexed variants of `glGet` (such as `glGetInteger64i_v`), _`data`_ returns a single value, the start offset of the binding range for each transform feedback attribute stream. The initial value is 0 for all streams. See [glBindBufferRange][de.dasbabypixel.gamelauncher.gles.es30.glBindBufferRange.glBindBufferRange].
    * 
    * `GL_UNIFORM_BUFFER_BINDING`
    * 
    * When used with non-indexed variants of `glGet` (such as `glGetIntegerv`), _`data`_ returns a single value, the name of the buffer object currently bound to the target `GL_UNIFORM_BUFFER`. If no buffer object is bound to this target, 0 is returned. When used with indexed variants of `glGet` (such as `glGetIntegeri_v`), _`data`_ returns a single value, the name of the buffer object bound to the indexed uniform buffer binding point. The initial value is 0 for all targets. See [glBindBuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindBuffer.glBindBuffer], [glBindBufferBase][de.dasbabypixel.gamelauncher.gles.es30.glBindBufferBase.glBindBufferBase], and [glBindBufferRange][de.dasbabypixel.gamelauncher.gles.es30.glBindBufferRange.glBindBufferRange].
    * 
    * `GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT`
    * 
    * _`data`_ returns a single value, the minimum required alignment for uniform buffer sizes and offset. The initial value is 1. See [glUniformBlockBinding][de.dasbabypixel.gamelauncher.gles.es30.glUniformBlockBinding.glUniformBlockBinding].
    * 
    * `GL_UNIFORM_BUFFER_SIZE`
    * 
    * When used with indexed variants of `glGet` (such as `glGetInteger64i_v`), _`data`_ returns a single value, the size of the binding range for each indexed uniform buffer binding. The initial value is 0 for all bindings. See [glBindBufferRange][de.dasbabypixel.gamelauncher.gles.es30.glBindBufferRange.glBindBufferRange].
    * 
    * `GL_UNIFORM_BUFFER_START`
    * 
    * When used with indexed variants of `glGet` (such as `glGetInteger64i_v`), _`data`_ returns a single value, the start offset of the binding range for each indexed uniform buffer binding. The initial value is 0 for all bindings. See [glBindBufferRange][de.dasbabypixel.gamelauncher.gles.es30.glBindBufferRange.glBindBufferRange].
    * 
    * `GL_UNPACK_ALIGNMENT`
    * 
    * _`data`_ returns one value, the byte alignment used for reading pixel data from memory. The initial value is 4. See [glPixelStorei][de.dasbabypixel.gamelauncher.gles.es20.glPixelStorei.glPixelStorei].
    * 
    * `GL_UNPACK_IMAGE_HEIGHT`
    * 
    * _`data`_ returns one value, the image height used for reading pixel data from memory. The initial is 0. See [glPixelStorei][de.dasbabypixel.gamelauncher.gles.es20.glPixelStorei.glPixelStorei].
    * 
    * `GL_UNPACK_ROW_LENGTH`
    * 
    * _`data`_ returns one value, the row length used for reading pixel data from memory. The initial value is 0. See [glPixelStorei][de.dasbabypixel.gamelauncher.gles.es20.glPixelStorei.glPixelStorei].
    * 
    * `GL_UNPACK_SKIP_IMAGES`
    * 
    * _`data`_ returns one value, the number of pixel images skipped before the first pixel is read from memory. The initial value is 0. See [glPixelStorei][de.dasbabypixel.gamelauncher.gles.es20.glPixelStorei.glPixelStorei].
    * 
    * `GL_UNPACK_SKIP_PIXELS`
    * 
    * _`data`_ returns one value, the number of pixel locations skipped before the first pixel is read from memory. The initial value is 0. See [glPixelStorei][de.dasbabypixel.gamelauncher.gles.es20.glPixelStorei.glPixelStorei].
    * 
    * `GL_UNPACK_SKIP_ROWS`
    * 
    * _`data`_ returns one value, the number of rows of pixel locations skipped before the first pixel is read from memory. The initial value is 0. See [glPixelStorei][de.dasbabypixel.gamelauncher.gles.es20.glPixelStorei.glPixelStorei].
    * 
    * `GL_VERTEX_ARRAY_BINDING`
    * 
    * _`data`_ returns a single value, the name of the vertex array object currently bound. If no vertex array object is bound, 0 is returned. The initial value is 0. See [glBindVertexArray][de.dasbabypixel.gamelauncher.gles.es30.glBindVertexArray.glBindVertexArray].
    * 
    * `GL_VERTEX_BINDING_DIVISOR`
    * 
    * Accepted by the indexed forms. _`data`_ returns a single integer value representing the instance step divisor of the first element in the bound buffer's data store for vertex attribute bound to _`index`_.
    * 
    * `GL_VERTEX_BINDING_OFFSET`
    * 
    * Accepted by the indexed forms. _`data`_ returns a single integer value representing the byte offset of the first element in the bound buffer's data store for vertex attribute bound to _`index`_.
    * 
    * `GL_VERTEX_BINDING_STRIDE`
    * 
    * Accepted by the indexed forms. _`data`_ returns a single integer value representing the byte offset between the start of each element in the bound buffer's data store for vertex attribute bound to _`index`_.
    * 
    * `GL_VIEWPORT`
    * 
    * _`data`_ returns four values: the x and y window coordinates of the viewport, followed by its width and height. Initially the x and y window coordinates are both set to 0, and the width and height are set to the width and height of the window into which the GL will do its rendering. See [glViewport][de.dasbabypixel.gamelauncher.gles.es20.glViewport.glViewport].
    * 
    * Many of the boolean parameters can also be queried more easily using [glIsEnabled][de.dasbabypixel.gamelauncher.gles.es20.glIsEnabled.glIsEnabled].
    * 
    * Notes
    * -----
    * 
    * The following parameters return the associated value for the active texture unit: `GL_TEXTURE_2D`, `GL_TEXTURE_BINDING_2D`, `GL_TEXTURE_3D` and `GL_TEXTURE_BINDING_3D`.
    * 
    * `GL_MAX_VERTEX_ATOMIC_COUNTERS`, `GL_MAX_FRAMGENT_ATOMIC_COUNTERS`, `GL_MAX_COMPUTE_ATOMIC_COUNTERS`, `GL_MAX_COMBINED_ATOMIC_COUNTERS`, `GL_MAX_VERTEX_ATOMIC_COUNTER_BUFFERS`, `GL_MAX_FRAMGENT_ATOMIC_COUNTER_BUFFERS`, `GL_MAX_COMPUTE_ATOMIC_COUNTER_BUFFERS`, `GL_MAX_COMBINED_ATOMIC_COUNTER_BUFFERS`, `GL_MAX_COMPUTE_UNIFORM_BLOCKS`, `GL_MAX_COMPUTE_TEXTURE_IMAGE_UNITS`, `GL_MAX_COMPUTE_UNIFORM_COMPONENTS`, `GL_MAX_COMBINED_COMPUTE_UNIFORM_COMPONENTS`, `GL_MAX_COMPUTE_WORK_GROUP_INVOCATIONS`, `GL_MAX_COMPUTE_WORK_GROUP_COUNT`, `GL_MAX_COMPUTE_WORK_GROUP_SIZE`, `GL_DISPATCH_INDIRECT_BUFFER_BINDING`, `GL_MAX_UNIFORM_LOCATIONS`, `GL_MAX_FRAMEBUFFER_WIDTH`, `GL_MAX_FRAMEBUFFER_HEIGHT`, `GL_MAX_FRAMEBUFFER_SAMPLES`, `GL_MAX_VERTEX_SHADER_STORAGE_BLOCKS`, `GL_MAX_FRAGMENT_SHADER_STORAGE_BLOCKS`, `GL_MAX_COMPUTE_SHADER_STORAGE_BLOCKS`, `GL_MAX_COMBINED_SHADER_STORAGE_BLOCKS`, `GL_VERTEX_BINDING_DIVISOR`, `GL_VERTEX_BINDING_OFFSET`, `GL_VERTEX_BINDING_STRIDE`, `GL_MAX_VERTEX_ATTRIB_RELATIVE_OFFSET` and `GL_MAX_VERTEX_ATTRIB_BINDINGS` are available only if the GL ES version is 3.1 or greater.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`pname`_ is not an accepted value.
    * 
    * `GL_INVALID_VALUE` is generated on either `glGetIntegeri_v`, or `glGetInteger64i_v` if _`index`_ is outside of the valid range for the indexed state _`target`_.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glGetBooleanv` | ✔ | ✔ | ✔ | ✔ |
    * | `glGetBooleani_v` | \- | \- | ✔ | ✔ |
    * | `glGetFloatv` | ✔ | ✔ | ✔ | ✔ |
    * | `glGetIntegerv` | ✔ | ✔ | ✔ | ✔ |
    * | `glGetInteger64v` | \- | ✔ | ✔ | ✔ |
    * | `glGetIntegeri_v` | \- | ✔ | ✔ | ✔ |
    * | `glGetInteger64i_v` | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGetActiveUniform][de.dasbabypixel.gamelauncher.gles.es20.glGetActiveUniform.glGetActiveUniform], [glGetAttachedShaders][de.dasbabypixel.gamelauncher.gles.es20.glGetAttachedShaders.glGetAttachedShaders], [glGetAttribLocation][de.dasbabypixel.gamelauncher.gles.es20.glGetAttribLocation.glGetAttribLocation], [glGetBufferParameter][de.dasbabypixel.gamelauncher.gles.es20.glGetBufferParameteriv.glGetBufferParameteriv], [glGetBufferPointerv][de.dasbabypixel.gamelauncher.gles.es30.glGetBufferPointerv.glGetBufferPointerv], [glGetError][de.dasbabypixel.gamelauncher.gles.es20.glGetError.glGetError], [glGetProgramiv][de.dasbabypixel.gamelauncher.gles.es20.glGetProgramiv.glGetProgramiv], [glGetProgramInfoLog][de.dasbabypixel.gamelauncher.gles.es20.glGetProgramInfoLog.glGetProgramInfoLog], [glGetQueryiv][de.dasbabypixel.gamelauncher.gles.es30.glGetQueryiv.glGetQueryiv], [glGetQueryObjectuiv][de.dasbabypixel.gamelauncher.gles.es30.glGetQueryObjectuiv.glGetQueryObjectuiv], [glGetShaderiv][de.dasbabypixel.gamelauncher.gles.es20.glGetShaderiv.glGetShaderiv], [glGetShaderInfoLog][de.dasbabypixel.gamelauncher.gles.es20.glGetShaderInfoLog.glGetShaderInfoLog], [glGetShaderSource][de.dasbabypixel.gamelauncher.gles.es20.glGetShaderSource.glGetShaderSource], [glGetString][de.dasbabypixel.gamelauncher.gles.es20.glGetString.glGetString], [glGetTexParameter][de.dasbabypixel.gamelauncher.gles.es20.glGetTexParameterfv.glGetTexParameterfv], [glGetUniform][de.dasbabypixel.gamelauncher.gles.es20.glGetUniformfv.glGetUniformfv], [glGetUniformLocation][de.dasbabypixel.gamelauncher.gles.es20.glGetUniformLocation.glGetUniformLocation], [glGetVertexAttrib][de.dasbabypixel.gamelauncher.gles.es20.glGetVertexAttribfv.glGetVertexAttribfv], [glGetVertexAttribPointerv][de.dasbabypixel.gamelauncher.gles.es20.glGetVertexAttribPointerv.glGetVertexAttribPointerv], [glIsEnabled][de.dasbabypixel.gamelauncher.gles.es20.glIsEnabled.glIsEnabled]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv
    * @see de.dasbabypixel.gamelauncher.gles.es31.glGetBooleani_v.glGetBooleani_v
    * @see de.dasbabypixel.gamelauncher.gles.es20.glGetFloatv.glGetFloatv
    * @see de.dasbabypixel.gamelauncher.gles.es20.glGetIntegerv.glGetIntegerv
    * @see de.dasbabypixel.gamelauncher.gles.es30.glGetInteger64v.glGetInteger64v
    * @see de.dasbabypixel.gamelauncher.gles.es30.glGetIntegeri_v.glGetIntegeri_v
    * @see de.dasbabypixel.gamelauncher.gles.es30.glGetInteger64i_v.glGetInteger64i_v
    */
    fun glGetBooleani_v(target: Int, index: UInt, data: java.nio.IntBuffer)
}