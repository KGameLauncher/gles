package de.dasbabypixel.gamelauncher.gles.es32

interface glSamplerParameterIuiv {
    /**
    * Name
    * ----
    * 
    * glSamplerParameter — set sampler parameters
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glSamplerParameterf**(` | GLuint sampler, |
    * | --- | --- |
    * |   | GLenum pname, |
    * |   | GLfloat param`)`; |
    * 
    * | `void **glSamplerParameteri**(` | GLuint sampler, |
    * | --- | --- |
    * |   | GLenum pname, |
    * |   | GLint param`)`; |
    * 
    * | `void **glSamplerParameterfv**(` | GLuint sampler, |
    * | --- | --- |
    * |   | GLenum pname, |
    * |   | const GLfloat \* params`)`; |
    * 
    * | `void **glSamplerParameteriv**(` | GLuint sampler, |
    * | --- | --- |
    * |   | GLenum pname, |
    * |   | const GLint \* params`)`; |
    * 
    * | `void **glSamplerParameterIiv**(` | GLuint sampler, |
    * | --- | --- |
    * |   | GLenum pname, |
    * |   | const GLint \*params`)`; |
    * 
    * | `void **glSamplerParameterIuiv**(` | GLuint sampler, |
    * | --- | --- |
    * |   | GLenum pname, |
    * |   | const GLuint \*params`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`sampler`_
    * 
    * Specifies the sampler object whose parameter to modify.
    * 
    * _`pname`_
    * 
    * Specifies the symbolic name of a single-valued sampler parameter. _`pname`_ can be one of the following: `GL_TEXTURE_WRAP_S`, `GL_TEXTURE_WRAP_T`, `GL_TEXTURE_WRAP_R`, `GL_TEXTURE_MIN_FILTER`, `GL_TEXTURE_MAG_FILTER`, `GL_TEXTURE_MIN_LOD`, `GL_TEXTURE_MAX_LOD`, `GL_TEXTURE_COMPARE_MODE`, `GL_TEXTURE_COMPARE_FUNC`.
    * 
    * For the vector commands (`glSamplerParameter*v`), _`pname`_ can also be `GL_TEXTURE_BORDER_COLOR`.
    * 
    * _`param`_
    * 
    * For the scalar commands, specifies the value of _`pname`_.
    * 
    * _`params`_
    * 
    * For the vector commands (`glSamplerParameter*v`), specifies a pointer to an array where the value or values of _`pname`_ are stored.
    * 
    * Description
    * -----------
    * 
    * `glSamplerParameter` assigns the value or values in _`params`_ to the sampler parameter specified as _`pname`_. _`sampler`_ specifies the sampler object to be modified, and must be the name of a sampler object previously returned from a call to [glGenSamplers][de.dasbabypixel.gamelauncher.gles.es30.glGenSamplers.glGenSamplers]. The following symbols are accepted in _`pname`_:
    * 
    * `GL_TEXTURE_MIN_FILTER`
    * 
    * The texture minifying function is used whenever the pixel being textured maps to an area greater than one texture element. There are six defined minifying functions. Two of them use the nearest one or nearest four texture elements to compute the texture value. The other four use mipmaps.
    * 
    * A mipmap is an ordered set of arrays representing the same image at progressively lower resolutions. If the texture has dimensions 2 n × 2 m , there are max ⁡ n m + 1 mipmaps. The first mipmap is the original texture, with dimensions 2 n × 2 m . Each subsequent mipmap has dimensions 2 k \- 1 × 2 l \- 1 , where 2 k × 2 l are the dimensions of the previous mipmap, until either k \= 0 or l \= 0 . At that point, subsequent mipmaps have dimension 1 × 2 l \- 1 or 2 k \- 1 × 1 until the final mipmap, which has dimension 1 × 1 . To define the mipmaps, call [glTexStorage2D][de.dasbabypixel.gamelauncher.gles.es30.glTexStorage2D.glTexStorage2D], [glTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexImage2D.glTexImage2D], [glTexStorage2D][de.dasbabypixel.gamelauncher.gles.es30.glTexStorage2D.glTexStorage2D], [glTexImage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexImage3D.glTexImage3D], or [glCopyTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glCopyTexImage2D.glCopyTexImage2D] with the _level_ argument indicating the order of the mipmaps. Level 0 is the original texture; level max ⁡ n m is the final 1 × 1 mipmap.
    * 
    * _`params`_ supplies a function for minifying the texture as one of the following:
    * 
    * `GL_NEAREST`
    * 
    * Returns the value of the texture element that is nearest (in Manhattan distance) to the center of the pixel being textured.
    * 
    * `GL_LINEAR`
    * 
    * Returns the weighted average of the four texture elements that are closest to the center of the pixel being textured.
    * 
    * `GL_NEAREST_MIPMAP_NEAREST`
    * 
    * Chooses the mipmap that most closely matches the size of the pixel being textured and uses the `GL_NEAREST` criterion (the texture element nearest to the center of the pixel) to produce a texture value.
    * 
    * `GL_LINEAR_MIPMAP_NEAREST`
    * 
    * Chooses the mipmap that most closely matches the size of the pixel being textured and uses the `GL_LINEAR` criterion (a weighted average of the four texture elements that are closest to the center of the pixel) to produce a texture value.
    * 
    * `GL_NEAREST_MIPMAP_LINEAR`
    * 
    * Chooses the two mipmaps that most closely match the size of the pixel being textured and uses the `GL_NEAREST` criterion (the texture element nearest to the center of the pixel) to produce a texture value from each mipmap. The final texture value is a weighted average of those two values.
    * 
    * `GL_LINEAR_MIPMAP_LINEAR`
    * 
    * Chooses the two mipmaps that most closely match the size of the pixel being textured and uses the `GL_LINEAR` criterion (a weighted average of the four texture elements that are closest to the center of the pixel) to produce a texture value from each mipmap. The final texture value is a weighted average of those two values.
    * 
    * As more texture elements are sampled in the minification process, fewer aliasing artifacts will be apparent. While the `GL_NEAREST` and `GL_LINEAR` minification functions can be faster than the other four, they sample only one or four texture elements to determine the texture value of the pixel being rendered and can produce moire patterns or ragged transitions. The initial value of `GL_TEXTURE_MIN_FILTER` is `GL_NEAREST_MIPMAP_LINEAR`.
    * 
    * `GL_TEXTURE_MAG_FILTER`
    * 
    * The texture magnification function is used when the pixel being textured maps to an area less than or equal to one texture element. It sets the texture magnification function to either `GL_NEAREST` or `GL_LINEAR` (see below). `GL_NEAREST` is generally faster than `GL_LINEAR`, but it can produce textured images with sharper edges because the transition between texture elements is not as smooth. The initial value of `GL_TEXTURE_MAG_FILTER` is `GL_LINEAR`.
    * 
    * `GL_NEAREST`
    * 
    * Returns the value of the texture element that is nearest (in Manhattan distance) to the center of the pixel being textured.
    * 
    * `GL_LINEAR`
    * 
    * Returns the weighted average of the four texture elements that are closest to the center of the pixel being textured.
    * 
    * `GL_TEXTURE_MIN_LOD`
    * 
    * Sets the minimum level-of-detail parameter. This floating-point value limits the selection of highest resolution mipmap (lowest mipmap level). The initial value is -1000.
    * 
    * `GL_TEXTURE_MAX_LOD`
    * 
    * Sets the maximum level-of-detail parameter. This floating-point value limits the selection of the lowest resolution mipmap (highest mipmap level). The initial value is 1000.
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
    * `GL_TEXTURE_COMPARE_MODE`
    * 
    * Specifies the texture comparison mode for currently bound textures. That is, a texture whose base internal format is `GL_DEPTH_COMPONENT` or `GL_DEPTH_STENCIL`; see [glTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexImage2D.glTexImage2D]) Permissible values are:
    * 
    * `GL_COMPARE_REF_TO_TEXTURE`
    * 
    * Specifies that the interpolated and clamped r texture coordinate should be compared to the value in the currently bound texture. See the discussion of `GL_TEXTURE_COMPARE_FUNC` for details of how the comparison is evaluated. The result of the comparison is assigned to the red channel.
    * 
    * `GL_NONE`
    * 
    * Specifies that the red channel should be assigned the appropriate value from the currently bound texture.
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
    * where r is the current interpolated texture coordinate, and D t is the texture value sampled from the currently bound texture. result is assigned to R t .
    * 
    * `GL_TEXTURE_BORDER_COLOR`
    * 
    * The data in _`params`_ specifies four values that define the border values that should be used for border texels. If a texel is sampled from the border of the texture, the values of `GL_TEXTURE_BORDER_COLOR` are interpreted as an RGBA color to match the texture's internal format and substituted for the non-existent texel data. If the texture contains depth components, the first component of `GL_TEXTURE_BORDER_COLOR` is interpreted as a depth value. The initial value is 0.0 , 0.0 , 0.0 , 0.0 .
    * 
    * If the values for `GL_TEXTURE_BORDER_COLOR` are specified with `glSamplerParameterIiv` or `glSamplerParameterIuiv`, the values are stored unmodified with an internal data type of integer. If specified with `glSamplerParameteriv`, they are converted to floating point with the following equation: f \= 2 c + 1 2 b \- 1 . If specified with `glSamplerParameterfv`, they are stored unmodified as floating-point values.
    * 
    * Notes
    * -----
    * 
    * If a sampler object is bound to a texture unit and that unit is used to sample from a texture, the parameters in the sampler are used to sample from the texture, rather than the equivalent parameters in the texture object bound to that unit. This introduces the possibility of sampling from the same texture object with different sets of sampler state, which may lead to a condition where a texture is _incomplete_ with respect to one sampler object and not with respect to another. Thus, completeness can be considered a function of a sampler object and a texture object bound to a single texture unit, rather than a property of the texture object itself.
    * 
    * The results of a texture lookup are undefined if:
    * 
    * *   The sampler used in a texture lookup function is not one of the shadow sampler types, the texture object's base internal format is `GL_DEPTH_COMPONENT` or `GL_DEPTH_STENCIL`, and the `GL_TEXTURE_COMPARE_MODE` is not `GL_NONE`.
    * 
    * *   The sampler used in a texture lookup function is one of the shadow sampler types, the texture object's base internal format is `GL_DEPTH_COMPONENT` or `GL_DEPTH_STENCIL`, and the `GL_TEXTURE_COMPARE_MODE` is `GL_NONE`.
    * 
    * *   The sampler used in a texture lookup function is one of the shadow sampler types, and the texture object's base internal format is not `GL_DEPTH_COMPONENT` or `GL_DEPTH_STENCIL`.
    * 
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_OPERATION` is generated if _`sampler`_ is not the name of a sampler object previously returned from a call to [glGenSamplers][de.dasbabypixel.gamelauncher.gles.es30.glGenSamplers.glGenSamplers].
    * 
    * `GL_INVALID_ENUM` is generated if _`params`_ should have a defined constant value (based on the value of _`pname`_) and does not.
    * 
    * `GL_INVALID_ENUM` is generated if `glSamplerParameter{if}` is called for a non-scalar parameter (pname `GL_TEXTURE_BORDER_COLOR`).
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGetSamplerParameter][de.dasbabypixel.gamelauncher.gles.es30.glGetSamplerParameterfv.glGetSamplerParameterfv]
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glSamplerParameterf` | \- | ✔ | ✔ | ✔ |
    * | `glSamplerParameteri` | \- | ✔ | ✔ | ✔ |
    * | `glSamplerParameteriv` | \- | ✔ | ✔ | ✔ |
    * | `glSamplerParameterfv` | \- | ✔ | ✔ | ✔ |
    * | `glSamplerParameterIiv` | \- | \- | \- | ✔ |
    * | `glSamplerParameterIuiv` | \- | \- | \- | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGenSamplers][de.dasbabypixel.gamelauncher.gles.es30.glGenSamplers.glGenSamplers], [glBindSampler][de.dasbabypixel.gamelauncher.gles.es30.glBindSampler.glBindSampler], [glDeleteSamplers][de.dasbabypixel.gamelauncher.gles.es30.glDeleteSamplers.glDeleteSamplers], [glIsSampler][de.dasbabypixel.gamelauncher.gles.es30.glIsSampler.glIsSampler], [glBindTexture][de.dasbabypixel.gamelauncher.gles.es20.glBindTexture.glBindTexture], [glTexParameter][de.dasbabypixel.gamelauncher.gles.es20.glTexParameterf.glTexParameterf]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glSamplerParameterf.glSamplerParameterf
    * @see de.dasbabypixel.gamelauncher.gles.es30.glSamplerParameteri.glSamplerParameteri
    * @see de.dasbabypixel.gamelauncher.gles.es30.glSamplerParameteriv.glSamplerParameteriv
    * @see de.dasbabypixel.gamelauncher.gles.es30.glSamplerParameterfv.glSamplerParameterfv
    * @see de.dasbabypixel.gamelauncher.gles.es32.glSamplerParameterIiv.glSamplerParameterIiv
    * @see de.dasbabypixel.gamelauncher.gles.es32.glSamplerParameterIuiv.glSamplerParameterIuiv
    */
    fun glSamplerParameterIuiv(sampler: UInt, pname: Int, params: java.nio.IntBuffer)
}