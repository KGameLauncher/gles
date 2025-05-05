package de.dasbabypixel.gamelauncher.gles.es32

interface glTexParameterIiv {
    /**
    * Name
    * ----
    * 
    * glTexParameter — set texture parameters
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glTexParameterf**(` | GLenum target, |
    * | --- | --- |
    * |   | GLenum pname, |
    * |   | GLfloat param`)`; |
    * 
    * | `void **glTexParameteri**(` | GLenum target, |
    * | --- | --- |
    * |   | GLenum pname, |
    * |   | GLint param`)`; |
    * 
    * | `void **glTexParameterfv**(` | GLenum target, |
    * | --- | --- |
    * |   | GLenum pname, |
    * |   | const GLfloat \* params`)`; |
    * 
    * | `void **glTexParameteriv**(` | GLenum target, |
    * | --- | --- |
    * |   | GLenum pname, |
    * |   | const GLint \* params`)`; |
    * 
    * | `void **glTexParameterIiv**(` | GLenum target, |
    * | --- | --- |
    * |   | GLenum pname, |
    * |   | const GLint \* params`)`; |
    * 
    * | `void **glTexParameterIuiv**(` | GLenum target, |
    * | --- | --- |
    * |   | GLenum pname, |
    * |   | const GLuint \* params`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`target`_
    * 
    * Specifies the target texture, which must be either `GL_TEXTURE_2D`, `GL_TEXTURE_3D`, `GL_TEXTURE_2D_ARRAY`, `GL_TEXTURE_2D_MULTISAMPLE`, `GL_TEXTURE_2D_MULTISAMPLE_ARRAY`, `GL_TEXTURE_CUBE_MAP`, or `GL_TEXTURE_CUBE_MAP_ARRAY`.
    * 
    * _`pname`_
    * 
    * Specifies the symbolic name of a single-valued texture parameter. _`pname`_ can be one of the following: `GL_DEPTH_STENCIL_TEXTURE_MODE`, `GL_TEXTURE_BASE_LEVEL`, `GL_TEXTURE_COMPARE_FUNC`, `GL_TEXTURE_COMPARE_MODE`, `GL_TEXTURE_MIN_FILTER`, `GL_TEXTURE_MAG_FILTER`, `GL_TEXTURE_MIN_LOD`, `GL_TEXTURE_MAX_LOD`, `GL_TEXTURE_MAX_LEVEL`, `GL_TEXTURE_SWIZZLE_R`, `GL_TEXTURE_SWIZZLE_G`, `GL_TEXTURE_SWIZZLE_B`, `GL_TEXTURE_SWIZZLE_A`, `GL_TEXTURE_WRAP_S`, `GL_TEXTURE_WRAP_T`, `GL_TEXTURE_WRAP_R`.
    * 
    * For the vector commands (`glTexParameter*v`), _`pname`_ can also be `GL_TEXTURE_BORDER_COLOR`.
    * 
    * _`param`_
    * 
    * Specifies the value of _`pname`_.
    * 
    * _`params`_
    * 
    * For the vector commands, specifies a pointer to an array where the value or values of _`pname`_ are stored.
    * 
    * Description
    * -----------
    * 
    * `glTexParameter` assigns the value or values in _`params`_ to the texture parameter specified as _`pname`_. _`target`_ defines the target texture, either `GL_TEXTURE_2D`, `GL_TEXTURE_CUBE_MAP`, `GL_TEXTURE_2D_ARRAY`, `GL_TEXTURE_CUBE_MAP_ARRAY`, `GL_TEXTURE_2D_MULTISAMPLE`, `GL_TEXTURE_2D_MULTISAMPLE_ARRAY`, or `GL_TEXTURE_3D`. The following symbols are accepted in _`pname`_:
    * 
    * `GL_DEPTH_STENCIL_TEXTURE_MODE`
    * 
    * Specifies the mode used to read from depth-stencil format textures. _`params`_ must be one of `GL_DEPTH_COMPONENT` or `GL_STENCIL_INDEX`. If the depth stencil mode is `GL_DEPTH_COMPONENT`, then reads from depth-stencil format textures will return the depth component of the texel in Rt and the stencil component will be discarded. If the depth stencil mode is `GL_STENCIL_INDEX` then the stencil component is returned in Rt and the depth component is discarded. The initial value is `GL_DEPTH_COMPONENT`.
    * 
    * `GL_TEXTURE_BASE_LEVEL`
    * 
    * Specifies the index of the lowest defined mipmap level. This is an integer value. The initial value is 0.
    * 
    * `GL_TEXTURE_COMPARE_FUNC`
    * 
    * Specifies the comparison operator used when `GL_TEXTURE_COMPARE_MODE` is set to `GL_COMPARE_REF_TO_TEXTURE`. Permissible values are:
    * 
    * 
    * | **Texture Comparison Function** | **Computed result** |
    * | --- | --- |
    * | `GL_LEQUAL` | result \= 1.0 0.0 ⁢   r <= D t r \> D t |
    * | `GL_GEQUAL` | result \= 1.0 0.0 ⁢   r \>= D t r < D t |
    * | `GL_LESS` | result \= 1.0 0.0 ⁢   r < D t r \>= D t |
    * | `GL_GREATER` | result \= 1.0 0.0 ⁢   r \> D t r <= D t |
    * | `GL_EQUAL` | result \= 1.0 0.0 ⁢   r \= D t r ≠ D t |
    * | `GL_NOTEQUAL` | result \= 1.0 0.0 ⁢   r ≠ D t r \= D t |
    * | `GL_ALWAYS` | result \= 1.0 |
    * | `GL_NEVER` | result \= 0.0 |
    * 
    * where r is the current interpolated texture coordinate, and D t is the depth texture value sampled from the currently bound depth texture. result is assigned to the red channel.
    * 
    * `GL_TEXTURE_COMPARE_MODE`
    * 
    * Specifies the texture comparison mode for currently bound depth textures. That is, a texture whose internal format is `GL_DEPTH_COMPONENT_*`; see [glTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexImage2D.glTexImage2D]) Permissible values are:
    * 
    * `GL_COMPARE_REF_TO_TEXTURE`
    * 
    * Specifies that the interpolated and clamped r texture coordinate should be compared to the value in the currently bound depth texture. See the discussion of `GL_TEXTURE_COMPARE_FUNC` for details of how the comparison is evaluated. The result of the comparison is assigned to the red channel.
    * 
    * `GL_NONE`
    * 
    * Specifies that the red channel should be assigned the appropriate value from the currently bound depth texture.
    * 
    * `GL_TEXTURE_MIN_FILTER`
    * 
    * The texture minifying function is used whenever the level-of-detail function used when sampling from the texture determines that the texture should be minified. There are six defined minifying functions. Two of them use either the nearest texture elements or a weighted average of multiple texture elements to compute the texture value. The other four use mipmaps.
    * 
    * A mipmap is an ordered set of arrays representing the same image at progressively lower resolutions. If the texture has dimensions 2 n × 2 m , there are max ⁡ n m + 1 mipmaps. The first mipmap is the original texture, with dimensions 2 n × 2 m . Each subsequent mipmap has dimensions 2 k \- 1 × 2 l \- 1 , where 2 k × 2 l are the dimensions of the previous mipmap, until either k \= 0 or l \= 0 . At that point, subsequent mipmaps have dimension 1 × 2 l \- 1 or 2 k \- 1 × 1 until the final mipmap, which has dimension 1 × 1 . To define the mipmaps, call [glTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexImage2D.glTexImage2D], [glTexImage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexImage3D.glTexImage3D], or [glCopyTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glCopyTexImage2D.glCopyTexImage2D] with the _level_ argument indicating the order of the mipmaps. Level 0 is the original texture; level max ⁡ n m is the final 1 × 1 mipmap.
    * 
    * _`params`_ supplies a function for minifying the texture as one of the following:
    * 
    * `GL_NEAREST`
    * 
    * Returns the value of the texture element that is nearest (in Manhattan distance) to the specified texture coordinates.
    * 
    * `GL_LINEAR`
    * 
    * Returns the weighted average of the four texture elements that are closest to the specified texture coordinates. These can include items wrapped or repeated from other parts of a texture, depending on the values of `GL_TEXTURE_WRAP_S` and `GL_TEXTURE_WRAP_T`, and on the exact mapping.
    * 
    * `GL_NEAREST_MIPMAP_NEAREST`
    * 
    * Chooses the mipmap that most closely matches the size of the pixel being textured and uses the `GL_NEAREST` criterion (the texture element closest to the specified texture coordinates) to produce a texture value.
    * 
    * `GL_LINEAR_MIPMAP_NEAREST`
    * 
    * Chooses the mipmap that most closely matches the size of the pixel being textured and uses the `GL_LINEAR` criterion (a weighted average of the four texture elements that are closest to the specified texture coordinates) to produce a texture value.
    * 
    * `GL_NEAREST_MIPMAP_LINEAR`
    * 
    * Chooses the two mipmaps that most closely match the size of the pixel being textured and uses the `GL_NEAREST` criterion (the texture element closest to the specified texture coordinates ) to produce a texture value from each mipmap. The final texture value is a weighted average of those two values.
    * 
    * `GL_LINEAR_MIPMAP_LINEAR`
    * 
    * Chooses the two mipmaps that most closely match the size of the pixel being textured and uses the `GL_LINEAR` criterion (a weighted average of the texture elements that are closest to the specified texture coordinates) to produce a texture value from each mipmap. The final texture value is a weighted average of those two values.
    * 
    * As more texture elements are sampled in the minification process, fewer aliasing artifacts will be apparent. While the `GL_NEAREST` and `GL_LINEAR` minification functions can be faster than the other four, they sample only one or multiple texture elements to determine the texture value of the pixel being rendered and can produce moire patterns or ragged transitions. The initial value of `GL_TEXTURE_MIN_FILTER` is `GL_NEAREST_MIPMAP_LINEAR`.
    * 
    * `GL_TEXTURE_MAG_FILTER`
    * 
    * The texture magnification function is used whenever the level-of-detail function used when sampling from the texture determines that the texture should be magified. It sets the texture magnification function to either `GL_NEAREST` or `GL_LINEAR` (see below). `GL_NEAREST` is generally faster than `GL_LINEAR`, but it can produce textured images with sharper edges because the transition between texture elements is not as smooth. The initial value of `GL_TEXTURE_MAG_FILTER` is `GL_LINEAR`.
    * 
    * `GL_NEAREST`
    * 
    * Returns the value of the texture element that is nearest (in Manhattan distance) to the specified texture coordinates.
    * 
    * `GL_LINEAR`
    * 
    * Returns the weighted average of the texture elements that are closest to the specified texture coordinates. These can include items wrapped or repeated from other parts of a texture, depending on the values of `GL_TEXTURE_WRAP_S` and `GL_TEXTURE_WRAP_T`, and on the exact mapping.
    * 
    * `GL_TEXTURE_MIN_LOD`
    * 
    * Sets the minimum level-of-detail parameter. This floating-point value limits the selection of highest resolution mipmap (lowest mipmap level). The initial value is -1000.
    * 
    * `GL_TEXTURE_MAX_LOD`
    * 
    * Sets the maximum level-of-detail parameter. This floating-point value limits the selection of the lowest resolution mipmap (highest mipmap level). The initial value is 1000.
    * 
    * `GL_TEXTURE_MAX_LEVEL`
    * 
    * Sets the index of the highest defined mipmap level. This is an integer value. The initial value is 1000.
    * 
    * `GL_TEXTURE_SWIZZLE_R`
    * 
    * Sets the swizzle that will be applied to the r component of a texel before it is returned to the shader. Valid values for _`param`_ are `GL_RED`, `GL_GREEN`, `GL_BLUE`, `GL_ALPHA`, `GL_ZERO` and `GL_ONE`. If `GL_TEXTURE_SWIZZLE_R` is `GL_RED`, the value for r will be taken from the first channel of the fetched texel. If `GL_TEXTURE_SWIZZLE_R` is `GL_GREEN`, the value for r will be taken from the second channel of the fetched texel. If `GL_TEXTURE_SWIZZLE_R` is `GL_BLUE`, the value for r will be taken from the third channel of the fetched texel. If `GL_TEXTURE_SWIZZLE_R` is `GL_ALPHA`, the value for r will be taken from the fourth channel of the fetched texel. If `GL_TEXTURE_SWIZZLE_R` is `GL_ZERO`, the value for r will be subtituted with 0. If `GL_TEXTURE_SWIZZLE_R` is `GL_ONE`, the value for r will be subtituted with 1 for integer texture components, otherwise 1.0. The initial value is `GL_RED`.
    * 
    * `GL_TEXTURE_SWIZZLE_G`
    * 
    * Sets the swizzle that will be applied to the g component of a texel before it is returned to the shader. Valid values for _`param`_ and their effects are similar to those of `GL_TEXTURE_SWIZZLE_R`. The initial value is `GL_GREEN`.
    * 
    * `GL_TEXTURE_SWIZZLE_B`
    * 
    * Sets the swizzle that will be applied to the b component of a texel before it is returned to the shader. Valid values for _`param`_ and their effects are similar to those of `GL_TEXTURE_SWIZZLE_R`. The initial value is `GL_BLUE`.
    * 
    * `GL_TEXTURE_SWIZZLE_A`
    * 
    * Sets the swizzle that will be applied to the a component of a texel before it is returned to the shader. Valid values for _`param`_ and their effects are similar to those of `GL_TEXTURE_SWIZZLE_R`. The initial value is `GL_ALPHA`.
    * 
    * `GL_TEXTURE_WRAP_S`
    * 
    * Sets the wrap parameter for texture coordinate s to either `GL_CLAMP_TO_EDGE`, `GL_MIRRORED_REPEAT`, `GL_REPEAT`, or `GL_CLAMP_TO_BORDER`.
    * 
    * `GL_CLAMP_TO_EDGE` causes s coordinates to be clamped to the range 1 2N 1 \- 1 2N , where N is the size of the texture in the direction of clamping.
    * 
    * `GL_REPEAT` causes the integer part of the s coordinate to be ignored; the GL uses only the fractional part, thereby creating a repeating pattern.
    * 
    * `GL_MIRRORED_REPEAT` causes the s coordinate to be set to the fractional part of the texture coordinate if the integer part of s is even; if the integer part of s is odd, then the s texture coordinate is set to 1 \- frac ⁡ s , where frac ⁡ s represents the fractional part of s.
    * 
    * `GL_CLAMP_TO_BORDER` evaluates s coordinates in a similar manner to `GL_CLAMP_TO_EDGE`. However, in cases where clamping would have occurred in `GL_CLAMP_TO_EDGE` mode, the fetched texel data is substituted with the values specified by `GL_TEXTURE_BORDER_COLOR`.
    * 
    * Initially, `GL_TEXTURE_WRAP_S` is set to `GL_REPEAT`.
    * 
    * `GL_TEXTURE_WRAP_T`
    * 
    * Sets the wrap parameter for texture coordinate t to either `GL_CLAMP_TO_EDGE`, `GL_MIRRORED_REPEAT`, `GL_REPEAT`, or `GL_CLAMP_TO_BORDER`. See the discussion under `GL_TEXTURE_WRAP_S`. Initially, `GL_TEXTURE_WRAP_T` is set to `GL_REPEAT`.
    * 
    * `GL_TEXTURE_WRAP_R`
    * 
    * Sets the wrap parameter for texture coordinate r to either `GL_CLAMP_TO_EDGE`, `GL_MIRRORED_REPEAT`, `GL_REPEAT`, or `GL_CLAMP_TO_BORDER`. See the discussion under `GL_TEXTURE_WRAP_S`. Initially, `GL_TEXTURE_WRAP_R` is set to `GL_REPEAT`.
    * 
    * `GL_TEXTURE_BORDER_COLOR`
    * 
    * The data in _`params`_ specifies four values that define the border values that should be used for border texels. If a texel is sampled from the border of the texture, the values of `GL_TEXTURE_BORDER_COLOR` are interpreted as an RGBA color to match the texture's internal format and substituted for the non-existent texel data. If the texture contains depth components, the first component of `GL_TEXTURE_BORDER_COLOR` is interpreted as a depth value. The initial value is 0.0 , 0.0 , 0.0 , 0.0 .
    * 
    * If the values for `GL_TEXTURE_BORDER_COLOR` are specified with `glTexParameterIiv` or `glTexParameterIuiv`, the values are stored unmodified with an internal data type of integer. If specified with `glTexParameteriv`, they are converted to floating point with the following equation: f \= 2 c + 1 2 b \- 1 . If specified with `glTexParameterfv`, they are stored unmodified as floating-point values.
    * 
    * Notes
    * -----
    * 
    * Suppose that a program attempts to sample from a texture and has set `GL_TEXTURE_MIN_FILTER` to one of the functions that requires a mipmap. If either the dimensions of the texture images currently defined (with previous calls to [glTexStorage2D][de.dasbabypixel.gamelauncher.gles.es30.glTexStorage2D.glTexStorage2D], [glTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexImage2D.glTexImage2D], [glTexStorage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexStorage3D.glTexStorage3D], [glTexImage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexImage3D.glTexImage3D], or [glCopyTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glCopyTexImage2D.glCopyTexImage2D]) do not follow the proper sequence for mipmaps (described above), or there are fewer texture images defined than are needed, or the set of texture images have differing numbers of texture components, then the texture is considered _incomplete_.
    * 
    * Linear filtering accesses the four nearest texture elements only in 2D textures. In 3D textures, linear filtering accesses the eight nearest texture elements.
    * 
    * `glTexParameter` specifies the texture parameters for the texture object bound to the active texture unit, specified by calling [glActiveTexture][de.dasbabypixel.gamelauncher.gles.es20.glActiveTexture.glActiveTexture].
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`target`_ or _`pname`_ is not one of the accepted defined values.
    * 
    * `GL_INVALID_ENUM` is generated if _`params`_ should have a defined constant value (based on the value of _`pname`_) and does not.
    * 
    * `GL_INVALID_ENUM` is generated if the target is `GL_TEXTURE_2D_MULTISAMPLE` or `GL_TEXTURE_2D_MULTISAMPLE_ARRAY`, and _`pname`_ is any of the sampler states.
    * 
    * `GL_INVALID_OPERATION` is generated if the target is `GL_TEXTURE_2D_MULTISAMPLE` or `GL_TEXTURE_2D_MULTISAMPLE_ARRAY`, and pname `GL_TEXTURE_BASE_LEVEL` is set to a value other than zero.
    * 
    * `GL_INVALID_VALUE` is generated if _`pname`_ is `GL_TEXTURE_BASE_LEVEL` or `GL_TEXTURE_MAX_LEVEL`, and _`param`_ or _`params`_ is negative.
    * 
    * `GL_INVALID_ENUM` is generated if `glTexParameter{if}` is called for a non-scalar parameter (pname `GL_TEXTURE_BORDER_COLOR`).
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGetTexParameter][de.dasbabypixel.gamelauncher.gles.es20.glGetTexParameterfv.glGetTexParameterfv]
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glTexParameterf` | ✔ | ✔ | ✔ | ✔ |
    * | `glTexParameterfv` | ✔ | ✔ | ✔ | ✔ |
    * | `glTexParameteri` | ✔ | ✔ | ✔ | ✔ |
    * | `glTexParameteriv` | ✔ | ✔ | ✔ | ✔ |
    * | `glTexParameterIiv` | \- | \- | \- | ✔ |
    * | `glTexParameterIuiv` | \- | \- | \- | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glActiveTexture][de.dasbabypixel.gamelauncher.gles.es20.glActiveTexture.glActiveTexture], [glBindTexture][de.dasbabypixel.gamelauncher.gles.es20.glBindTexture.glBindTexture], [glCopyTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glCopyTexImage2D.glCopyTexImage2D], [glCopyTexSubImage2D][de.dasbabypixel.gamelauncher.gles.es20.glCopyTexSubImage2D.glCopyTexSubImage2D], [glCopyTexSubImage3D][de.dasbabypixel.gamelauncher.gles.es30.glCopyTexSubImage3D.glCopyTexSubImage3D], [glPixelStorei][de.dasbabypixel.gamelauncher.gles.es20.glPixelStorei.glPixelStorei], [glSamplerParameter][de.dasbabypixel.gamelauncher.gles.es30.glSamplerParameterf.glSamplerParameterf], [glTexStorage2D][de.dasbabypixel.gamelauncher.gles.es30.glTexStorage2D.glTexStorage2D], [glTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexImage2D.glTexImage2D], [glTexStorage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexStorage3D.glTexStorage3D], [glTexImage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexImage3D.glTexImage3D], [glTexSubImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexSubImage2D.glTexSubImage2D], [glTexSubImage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexSubImage3D.glTexSubImage3D]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glTexParameterf.glTexParameterf
    * @see de.dasbabypixel.gamelauncher.gles.es20.glTexParameterfv.glTexParameterfv
    * @see de.dasbabypixel.gamelauncher.gles.es20.glTexParameteri.glTexParameteri
    * @see de.dasbabypixel.gamelauncher.gles.es20.glTexParameteriv.glTexParameteriv
    * @see de.dasbabypixel.gamelauncher.gles.es32.glTexParameterIiv.glTexParameterIiv
    * @see de.dasbabypixel.gamelauncher.gles.es32.glTexParameterIuiv.glTexParameterIuiv
    */
    fun glTexParameterIiv(target: Int, pname: Int, params: java.nio.IntBuffer)
}