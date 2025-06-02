package de.dasbabypixel.gamelauncher.gles.es20

interface glTexImage2D {
    /**
    * Name
    * ----
    * 
    * glTexImage2D — specify a two-dimensional texture image
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glTexImage2D**(` | GLenum target, |
    * | --- | --- |
    * |   | GLint level, |
    * |   | GLint internalFormat, |
    * |   | GLsizei width, |
    * |   | GLsizei height, |
    * |   | GLint border, |
    * |   | GLenum format, |
    * |   | GLenum type, |
    * |   | const void \* data`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`target`_
    * 
    * Specifies the target texture. Must be `GL_TEXTURE_2D`, `GL_TEXTURE_CUBE_MAP_POSITIVE_X`, `GL_TEXTURE_CUBE_MAP_NEGATIVE_X`, `GL_TEXTURE_CUBE_MAP_POSITIVE_Y`, `GL_TEXTURE_CUBE_MAP_NEGATIVE_Y`, `GL_TEXTURE_CUBE_MAP_POSITIVE_Z`, or `GL_TEXTURE_CUBE_MAP_NEGATIVE_Z`.
    * 
    * _`level`_
    * 
    * Specifies the level-of-detail number. Level 0 is the base image level. Level _n_ is the _n_th mipmap reduction image.
    * 
    * _`internalFormat`_
    * 
    * Specifies the number of color components in the texture. Must be one of base internal formats given in Table 1, or one of the sized internal formats given in Table 2, below.
    * 
    * _`width`_
    * 
    * Specifies the width of the texture image. All implementations support texture images that are at least 2048 texels wide.
    * 
    * _`height`_
    * 
    * Specifies the height of the texture image. All implementations support texture images that are at least 2048 texels high.
    * 
    * _`border`_
    * 
    * This value must be 0.
    * 
    * _`format`_
    * 
    * Specifies the format of the pixel data. The following symbolic values are accepted: `GL_RED`, `GL_RED_INTEGER`, `GL_RG`, `GL_RG_INTEGER`, `GL_RGB`, `GL_RGB_INTEGER`, `GL_RGBA`, `GL_RGBA_INTEGER`, `GL_DEPTH_COMPONENT`, `GL_DEPTH_STENCIL`, `GL_STENCIL_INDEX`, `GL_LUMINANCE_ALPHA`, `GL_LUMINANCE`, and `GL_ALPHA`.
    * 
    * _`type`_
    * 
    * Specifies the data type of the pixel data. The following symbolic values are accepted: `GL_UNSIGNED_BYTE`, `GL_BYTE`, `GL_UNSIGNED_SHORT`, `GL_SHORT`, `GL_UNSIGNED_INT`, `GL_INT`, `GL_HALF_FLOAT`, `GL_FLOAT`, `GL_UNSIGNED_SHORT_5_6_5`, `GL_UNSIGNED_SHORT_4_4_4_4`, `GL_UNSIGNED_SHORT_5_5_5_1`, `GL_UNSIGNED_INT_2_10_10_10_REV`, `GL_UNSIGNED_INT_10F_11F_11F_REV`, `GL_UNSIGNED_INT_5_9_9_9_REV`, `GL_UNSIGNED_INT_24_8`, and `GL_FLOAT_32_UNSIGNED_INT_24_8_REV`.
    * 
    * _`data`_
    * 
    * Specifies a pointer to the image data in memory.
    * 
    * Description
    * -----------
    * 
    * Texturing allows elements of an image array to be read by shaders.
    * 
    * To define texture images, call `glTexImage2D`. The arguments describe the parameters of the texture image, such as height, width, width of the border, level-of-detail number (see [glTexParameter][de.dasbabypixel.gamelauncher.gles.es20.glTexParameterf.glTexParameterf]), and number of color components provided. The last three arguments describe how the image is represented in memory.
    * 
    * If _`target`_ is `GL_TEXTURE_2D` or one of the `GL_TEXTURE_CUBE_MAP` targets, data is read from _`data`_ as a sequence of signed or unsigned bytes, shorts, or longs, or single-precision floating-point values, depending on _`type`_. These values are grouped into sets of one, two, three, or four values, depending on _`format`_, to form elements.
    * 
    * If a non-zero named buffer object is bound to the `GL_PIXEL_UNPACK_BUFFER` target (see [glBindBuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindBuffer.glBindBuffer]) while a texture image is specified, _`data`_ is treated as a byte offset into the buffer object's data store.
    * 
    * The first element corresponds to the lower left corner of the texture image. Subsequent elements progress left-to-right through the remaining texels in the lowest row of the texture image, and then in successively higher rows of the texture image. The final element corresponds to the upper right corner of the texture image.
    * 
    * _`format`_ determines the composition of each element in _`data`_. It can assume one of these symbolic values:
    * 
    * `GL_RED`
    * 
    * Each element is a single red component. For fixed point normalized components, the GL converts it to floating point, clamps to the range \[0,1\], and assembles it into an RGBA element by attaching 0.0 for green and blue, and 1.0 for alpha.
    * 
    * `GL_RED_INTEGER`
    * 
    * Each element is a single red component. The GL performs assembles it into an RGBA element by attaching 0 for green and blue, and 1 for alpha.
    * 
    * `GL_RG`
    * 
    * Each element is a red/green double. For fixed point normalized components, the GL converts each component to floating point, clamps to the range \[0,1\], and assembles them into an RGBA element by attaching 0.0 for blue, and 1.0 for alpha.
    * 
    * `GL_RG_INTEGER`
    * 
    * Each element is a red/green double. The GL assembles them into an RGBA element by attaching 0 for blue, and 1 for alpha.
    * 
    * `GL_RGB`
    * 
    * Each element is an RGB triple. For fixed point normalized components, the GL converts each component to floating point, clamps to the range \[0,1\], and assembles them into an RGBA element by attaching 1.0 for alpha.
    * 
    * `GL_RGB_INTEGER`
    * 
    * Each element is an RGB triple. The GL assembles them into an RGBA element by attaching 1 for alpha.
    * 
    * `GL_RGBA`
    * 
    * Each element contains all four components. For fixed point normalized components, the GL converts each component to floating point and clamps them to the range \[0,1\].
    * 
    * `GL_RGBA_INTEGER`
    * 
    * Each element contains all four components.
    * 
    * `GL_DEPTH_COMPONENT`
    * 
    * Each element is a single depth value. The GL converts it to floating point, and clamps to the range \[0,1\].
    * 
    * `GL_DEPTH_STENCIL`
    * 
    * Each element is a pair of depth and stencil values. The depth component of the pair is interpreted as in `GL_DEPTH_COMPONENT`. The stencil component is interpreted based on specified the depth + stencil internal format.
    * 
    * `GL_STENCIL_INDEX`
    * 
    * Each element is a single stencil value.
    * 
    * `GL_LUMINANCE_ALPHA`
    * 
    * Each element is an luminance/alpha double. The GL converts each component to floating point, clamps to the range \[0,1\], and assembles them into an RGBA element by placing the luminance value in the red, green and blue channels.
    * 
    * `GL_LUMINANCE`
    * 
    * Each element is a single luminance component. The GL converts it to floating point, clamps to the range \[0,1\], and assembles it into an RGBA element by placing the luminance value in the red, green and blue channels, and attaching 1.0 to the alpha channel.
    * 
    * `GL_ALPHA`
    * 
    * Each element is a single alpha component. The GL converts it to floating point, clamps to the range \[0,1\], and assembles it into an RGBA element by placing attaching 0.0 to the red, green and blue channels.
    * 
    * If an application wants to store the texture at a certain resolution or in a certain format, it can request the resolution and format with _`internalFormat`_. The GL will choose an internal representation with least the internal component sizes, and exactly the component types shown for that format, although it may not match exactly.
    * 
    * _`internalFormat`_ may be one of the unsized (base) internal formats shown, together with valid _`format`_ and _`type`_ combinations, in Table 1, below
    * 
    * Table 1. Unsized Internal Formats
    * 
    * 
    * | **Unsized Internal Format** | **Format** | **Type** | **RGBA and Luminance Values** | **Internal Components** |
    * | --- | --- | --- | --- | --- |
    * | `GL_RGB` | `GL_RGB` | `GL_UNSIGNED_BYTE`, `GL_UNSIGNED_SHORT_5_6_5` | Red, Green, Blue | R, G, B |
    * | `GL_RGBA` | `GL_RGBA` | `GL_UNSIGNED_BYTE`, `GL_UNSIGNED_SHORT_4_4_4_4`, `GL_UNSIGNED_SHORT_5_5_5_1` | Red, Green, Blue, Alpha | R, G, B, A |
    * | `GL_LUMINANCE_ALPHA` | `GL_LUMINANCE_ALPHA` | `GL_UNSIGNED_BYTE` | Luminance, Alpha | L, A |
    * | `GL_LUMINANCE` | `GL_LUMINANCE` | `GL_UNSIGNED_BYTE` | Luminance | L |
    * | `GL_ALPHA` | `GL_ALPHA` | `GL_UNSIGNED_BYTE` | Alpha | A |
    * 
    * 
    * 
    * _`internalFormat`_ may also be one of the sized internal formats shown, together with valid _`format`_ and _`type`_ combinations, in Table 2, below
    * 
    * Table 2. Sized Internal Formats
    * 
         
    * | **Sized Internal Format** | **Format** | **Type** | **Red Bits** | **Green Bits** | **Blue Bits** | **Alpha Bits** | **Shared Bits** | **Color renderable** | **Texture filterable** |
    * | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
    * | `GL_R8` | `GL_RED` | `GL_UNSIGNED_BYTE` | 8 |   |   |   |   | Y | Y |
    * | `GL_R8_SNORM` | `GL_RED` | `GL_BYTE` | s8 |   |   |   |   |   | Y |
    * | `GL_R16F` | `GL_RED` | `GL_HALF_FLOAT`,`GL_FLOAT` | f16 |   |   |   |   | Y | Y |
    * | `GL_R32F` | `GL_RED` | `GL_FLOAT` | f32 |   |   |   |   | Y |   |
    * | `GL_R8UI` | `GL_RED_INTEGER` | `GL_UNSIGNED_BYTE` | ui8 |   |   |   |   | Y |   |
    * | `GL_R8I` | `GL_RED_INTEGER` | `GL_BYTE` | i8 |   |   |   |   | Y |   |
    * | `GL_R16UI` | `GL_RED_INTEGER` | `GL_UNSIGNED_SHORT` | ui16 |   |   |   |   | Y |   |
    * | `GL_R16I` | `GL_RED_INTEGER` | `GL_SHORT` | i16 |   |   |   |   | Y |   |
    * | `GL_R32UI` | `GL_RED_INTEGER` | `GL_UNSIGNED_INT` | ui32 |   |   |   |   | Y |   |
    * | `GL_R32I` | `GL_RED_INTEGER` | `GL_INT` | i32 |   |   |   |   | Y |   |
    * | `GL_RG8` | `GL_RG` | `GL_UNSIGNED_BYTE` | 8 | 8 |   |   |   | Y | Y |
    * | `GL_RG8_SNORM` | `GL_RG` | `GL_BYTE` | s8 | s8 |   |   |   |   | Y |
    * | `GL_RG16F` | `GL_RG` | `GL_HALF_FLOAT`,`GL_FLOAT` | f16 | f16 |   |   |   | Y | Y |
    * | `GL_RG32F` | `GL_RG` | `GL_FLOAT` | f32 | f32 |   |   |   | Y |   |
    * | `GL_RG8UI` | `GL_RG_INTEGER` | `GL_UNSIGNED_BYTE` | ui8 | ui8 |   |   |   | Y |   |
    * | `GL_RG8I` | `GL_RG_INTEGER` | `GL_BYTE` | i8 | i8 |   |   |   | Y |   |
    * | `GL_RG16UI` | `GL_RG_INTEGER` | `GL_UNSIGNED_SHORT` | ui16 | ui16 |   |   |   | Y |   |
    * | `GL_RG16I` | `GL_RG_INTEGER` | `GL_SHORT` | i16 | i16 |   |   |   | Y |   |
    * | `GL_RG32UI` | `GL_RG_INTEGER` | `GL_UNSIGNED_INT` | ui32 | ui32 |   |   |   | Y |   |
    * | `GL_RG32I` | `GL_RG_INTEGER` | `GL_INT` | i32 | i32 |   |   |   | Y |   |
    * | `GL_RGB8` | `GL_RGB` | `GL_UNSIGNED_BYTE` | 8 | 8 | 8 |   |   | Y | Y |
    * | `GL_SRGB8` | `GL_RGB` | `GL_UNSIGNED_BYTE` | 8 | 8 | 8 |   |   |   | Y |
    * | `GL_RGB565` | `GL_RGB` | `GL_UNSIGNED_BYTE`, `GL_UNSIGNED_SHORT_5_6_5` | 5 | 6 | 5 |   |   | Y | Y |
    * | `GL_RGB8_SNORM` | `GL_RGB` | `GL_BYTE` | s8 | s8 | s8 |   |   |   | Y |
    * | `GL_R11F_G11F_B10F` | `GL_RGB` | `GL_UNSIGNED_INT_10F_11F_11F_REV`, `GL_HALF_FLOAT`, `GL_FLOAT` | f11 | f11 | f10 |   |   | Y | Y |
    * | `GL_RGB9_E5` | `GL_RGB` | `GL_UNSIGNED_INT_5_9_9_9_REV`, `GL_HALF_FLOAT`, `GL_FLOAT` | 9 | 9 | 9 |   | 5 |   | Y |
    * | `GL_RGB16F` | `GL_RGB` | `GL_HALF_FLOAT`, `GL_FLOAT` | f16 | f16 | f16 |   |   |   | Y |
    * | `GL_RGB32F` | `GL_RGB` | `GL_FLOAT` | f32 | f32 | f32 |   |   |   |   |
    * | `GL_RGB8UI` | `GL_RGB_INTEGER` | `GL_UNSIGNED_BYTE` | ui8 | ui8 | ui8 |   |   |   |   |
    * | `GL_RGB8I` | `GL_RGB_INTEGER` | `GL_BYTE` | i8 | i8 | i8 |   |   |   |   |
    * | `GL_RGB16UI` | `GL_RGB_INTEGER` | `GL_UNSIGNED_SHORT` | ui16 | ui16 | ui16 |   |   |   |   |
    * | `GL_RGB16I` | `GL_RGB_INTEGER` | `GL_SHORT` | i16 | i16 | i16 |   |   |   |   |
    * | `GL_RGB32UI` | `GL_RGB_INTEGER` | `GL_UNSIGNED_INT` | ui32 | ui32 | ui32 |   |   |   |   |
    * | `GL_RGB32I` | `GL_RGB_INTEGER` | `GL_INT` | i32 | i32 | i32 |   |   |   |   |
    * | `GL_RGBA8` | `GL_RGBA` | `GL_UNSIGNED_BYTE` | 8 | 8 | 8 | 8 |   | Y | Y |
    * | `GL_SRGB8_ALPHA8` | `GL_RGBA` | `GL_UNSIGNED_BYTE` | 8 | 8 | 8 | 8 |   | Y | Y |
    * | `GL_RGBA8_SNORM` | `GL_RGBA` | `GL_BYTE` | s8 | s8 | s8 | s8 |   |   | Y |
    * | `GL_RGB5_A1` | `GL_RGBA` | `GL_UNSIGNED_BYTE`, `GL_UNSIGNED_SHORT_5_5_5_1`, `GL_UNSIGNED_INT_2_10_10_10_REV` | 5 | 5 | 5 | 1 |   | Y | Y |
    * | `GL_RGBA4` | `GL_RGBA` | `GL_UNSIGNED_BYTE`, `GL_UNSIGNED_SHORT_4_4_4_4` | 4 | 4 | 4 | 4 |   | Y | Y |
    * | `GL_RGB10_A2` | `GL_RGBA` | `GL_UNSIGNED_INT_2_10_10_10_REV` | 10 | 10 | 10 | 2 |   | Y | Y |
    * | `GL_RGBA16F` | `GL_RGBA` | `GL_HALF_FLOAT`, `GL_FLOAT` | f16 | f16 | f16 | f16 |   | Y | Y |
    * | `GL_RGBA32F` | `GL_RGBA` | `GL_FLOAT` | f32 | f32 | f32 | f32 |   | Y |   |
    * | `GL_RGBA8UI` | `GL_RGBA_INTEGER` | `GL_UNSIGNED_BYTE` | ui8 | ui8 | ui8 | ui8 |   | Y |   |
    * | `GL_RGBA8I` | `GL_RGBA_INTEGER` | `GL_BYTE` | i8 | i8 | i8 | i8 |   | Y |   |
    * | `GL_RGB10_A2UI` | `GL_RGBA_INTEGER` | `GL_UNSIGNED_INT_2_10_10_10_REV` | ui10 | ui10 | ui10 | ui2 |   | Y |   |
    * | `GL_RGBA16UI` | `GL_RGBA_INTEGER` | `GL_UNSIGNED_SHORT` | ui16 | ui16 | ui16 | ui16 |   | Y |   |
    * | `GL_RGBA16I` | `GL_RGBA_INTEGER` | `GL_SHORT` | i16 | i16 | i16 | i16 |   | Y |   |
    * | `GL_RGBA32I` | `GL_RGBA_INTEGER` | `GL_INT` | i32 | i32 | i32 | i32 |   | Y |   |
    * | `GL_RGBA32UI` | `GL_RGBA_INTEGER` | `GL_UNSIGNED_INT` | ui32 | ui32 | ui32 | ui32 |   | Y |   |
    * 
    * 
    * | **Sized Internal Format** | **Format** | **Type** | **Depth Bits** | **Stencil Bits** |
    * | --- | --- | --- | --- | --- |
    * | `GL_DEPTH_COMPONENT16` | `GL_DEPTH_COMPONENT` | `GL_UNSIGNED_SHORT`, `GL_UNSIGNED_INT` | 16 |   |
    * | `GL_DEPTH_COMPONENT24` | `GL_DEPTH_COMPONENT` | `GL_UNSIGNED_INT` | 24 |   |
    * | `GL_DEPTH_COMPONENT32F` | `GL_DEPTH_COMPONENT` | `GL_FLOAT` | f32 |   |
    * | `GL_DEPTH24_STENCIL8` | `GL_DEPTH_STENCIL` | `GL_UNSIGNED_INT_24_8` | 24 | 8 |
    * | `GL_DEPTH32F_STENCIL8` | `GL_DEPTH_STENCIL` | `GL_FLOAT_32_UNSIGNED_INT_24_8_REV` | f32 | 8 |
    * | `GL_STENCIL_INDEX8` | `GL_STENCIL_INDEX` | `GL_UNSIGNED_BYTE` |   | 8 |
    * 
    * 
    * 
    * If the _`internalFormat`_ parameter is `GL_SRGB8`, or `GL_SRGB8_ALPHA8`, the texture is treated as if the red, green, or blue components are encoded in the sRGB color space. Any alpha component is left unchanged. The conversion from the sRGB encoded component c s to a linear component c l is:
    * 
    * c l \= { c s 12.92 if c s ≤ 0.04045 ( c s + 0.055 1.055 ) 2.4 if c s \> 0.04045
    * 
    * Assume c s is the sRGB component in the range \[0,1\].
    * 
    * A one-component texture image uses only the red component of the RGBA color extracted from _`data`_. A two-component image uses the R and G values. A three-component image uses the R, G, and B values. A four-component image uses all of the RGBA components.
    * 
    * Image-based shadowing can be enabled by comparing texture r coordinates to depth texture values to generate a boolean result. See [glTexParameter][de.dasbabypixel.gamelauncher.gles.es20.glTexParameterf.glTexParameterf] for details on texture comparison.
    * 
    * Notes
    * -----
    * 
    * The [glPixelStorei][de.dasbabypixel.gamelauncher.gles.es20.glPixelStorei.glPixelStorei] mode affects texture images.
    * 
    * _`data`_ may be a null pointer. In this case, texture memory is allocated to accommodate a texture of width _`width`_ and height _`height`_. You can then download subtextures to initialize this texture memory. The image is undefined if the user tries to apply an uninitialized portion of the texture image to a primitive.
    * 
    * `glTexImage2D` specifies the two-dimensional texture for the texture object bound to the current texture unit, specified with [glActiveTexture][de.dasbabypixel.gamelauncher.gles.es20.glActiveTexture.glActiveTexture].
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`target`_ is not `GL_TEXTURE_2D`, `GL_TEXTURE_CUBE_MAP_POSITIVE_X`, `GL_TEXTURE_CUBE_MAP_NEGATIVE_X`, `GL_TEXTURE_CUBE_MAP_POSITIVE_Y`, `GL_TEXTURE_CUBE_MAP_NEGATIVE_Y`, `GL_TEXTURE_CUBE_MAP_POSITIVE_Z`, or `GL_TEXTURE_CUBE_MAP_NEGATIVE_Z`.
    * 
    * `GL_INVALID_VALUE` is generated if _`target`_ is one of the six cube map 2D image targets and the width and height parameters are not equal.
    * 
    * `GL_INVALID_ENUM` is generated if _`type`_ is not a type constant.
    * 
    * `GL_INVALID_VALUE` is generated if _`width`_ is less than 0 or greater than `GL_MAX_TEXTURE_SIZE`.
    * 
    * `GL_INVALID_VALUE` is generated if _`level`_ is less than 0.
    * 
    * `GL_INVALID_VALUE` may be generated if _`level`_ is greater than log 2 ⁡ max , where _max_ is the returned value of `GL_MAX_TEXTURE_SIZE`.
    * 
    * `GL_INVALID_ENUM` is generated if _`internalFormat`_ is not one of the accepted resolution and format symbolic constants.
    * 
    * `GL_INVALID_VALUE` is generated if _`width`_ or _`height`_ is less than 0 or greater than `GL_MAX_TEXTURE_SIZE`.
    * 
    * `GL_INVALID_VALUE` is generated if _`border`_ is not 0.
    * 
    * `GL_INVALID_OPERATION` is generated if the combination of _`internalFormat`_, _`format`_ and _`type`_ is not one of those in the tables above.
    * 
    * `GL_INVALID_OPERATION` is generated if a non-zero buffer object name is bound to the `GL_PIXEL_UNPACK_BUFFER` target and the buffer object's data store is currently mapped.
    * 
    * `GL_INVALID_OPERATION` is generated if a non-zero buffer object name is bound to the `GL_PIXEL_UNPACK_BUFFER` target and the data would be unpacked from the buffer object such that the memory reads required would exceed the data store size.
    * 
    * `GL_INVALID_OPERATION` is generated if a non-zero buffer object name is bound to the `GL_PIXEL_UNPACK_BUFFER` target and _`data`_ is not evenly divisible into the number of bytes needed to store in memory a datum indicated by _`type`_.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_PIXEL_UNPACK_BUFFER_BINDING`
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glTexImage2D | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glActiveTexture][de.dasbabypixel.gamelauncher.gles.es20.glActiveTexture.glActiveTexture], [glCopyTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glCopyTexImage2D.glCopyTexImage2D], [glCopyTexSubImage2D][de.dasbabypixel.gamelauncher.gles.es20.glCopyTexSubImage2D.glCopyTexSubImage2D], [glCopyTexSubImage3D][de.dasbabypixel.gamelauncher.gles.es30.glCopyTexSubImage3D.glCopyTexSubImage3D], [glPixelStorei][de.dasbabypixel.gamelauncher.gles.es20.glPixelStorei.glPixelStorei], [glTexImage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexImage3D.glTexImage3D], [glTexStorage2D][de.dasbabypixel.gamelauncher.gles.es30.glTexStorage2D.glTexStorage2D], [glTexStorage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexStorage3D.glTexStorage3D], [glTexSubImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexSubImage2D.glTexSubImage2D], [glTexSubImage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexSubImage3D.glTexSubImage3D], [glTexParameter][de.dasbabypixel.gamelauncher.gles.es20.glTexParameterf.glTexParameterf]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glTexImage2D.glTexImage2D
    */
    fun glTexImage2D(target: Int, level: Int, internalFormat: Int, width: UInt, height: UInt, border: Int, format: Int, type: Int, data: java.nio.Buffer)
}