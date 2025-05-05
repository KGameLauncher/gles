package de.dasbabypixel.gamelauncher.gles.es30

interface glTexStorage3D {
    /**
    * Name
    * ----
    * 
    * glTexStorage3D — simultaneously specify storage for all levels of a three-dimensional, two-dimensional array, or cube map array texture
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glTexStorage3D**(` | GLenum target, |
    * | --- | --- |
    * |   | GLsizei levels, |
    * |   | GLenum internalformat, |
    * |   | GLsizei width, |
    * |   | GLsizei height, |
    * |   | GLsizei depth`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`target`_
    * 
    * Specify the target of the operation. _`target`_ must be one of `GL_TEXTURE_3D`, `GL_TEXTURE_2D_ARRAY`, or `GL_TEXTURE_CUBE_MAP_ARRAY`.
    * 
    * _`levels`_
    * 
    * Specify the number of texture levels.
    * 
    * _`internalformat`_
    * 
    * Specifies the sized internal format to be used to store texture image data.
    * 
    * _`width`_
    * 
    * Specifies the width of the texture, in texels.
    * 
    * _`height`_
    * 
    * Specifies the height of the texture, in texels.
    * 
    * _`depth`_
    * 
    * Specifies the depth of the texture, in texels.
    * 
    * Description
    * -----------
    * 
    * `glTexStorage3D` specifies the storage requirements for all levels of a three-dimensional or two-dimensional array texture simultaneously. Once a texture is specified with this command, the format and dimensions of all levels become immutable. The contents of the image may still be modified, however, its storage requirements may not change. Such a texture is referred to as an _immutable-format_ texture.
    * 
    * The behavior of `glTexStorage3D` depends on the _`target`_ parameter. When _`target`_ is `GL_TEXTURE_3D`, calling `glTexStorage3D` is equivalent, assuming no errors are generated, to executing the following pseudo-code:
    * 
    *     for (i = 0; i < levels; i++)
    *     {
    *         glTexImage3D(target, i, internalformat, width, height, depth, 0, format, type, NULL);
    *         width = max(1, (width / 2));
    *         height = max(1, (height / 2));
    *         depth = max(1, (depth / 2));
    *     }
    * 
    * When _`target`_ is `GL_TEXTURE_2D_ARRAY` or `GL_TEXTURE_CUBE_MAP_ARRAY`, `glTexStorage3D` is equivalent to:
    * 
    *     for (i = 0; i < levels; i++)
    *     {
    *         glTexImage3D(target, i, internalformat, width, height, depth, 0, format, type, NULL);
    *         width = max(1, (width / 2));
    *         height = max(1, (height / 2));
    *     }
    * 
    * Since no texture data is actually provided, the values used in the pseudo-code for _`format`_ and _`type`_ are irrelevant and may be considered to be any values that are legal for the chosen _`internalformat`_ enumerant. _`internalformat`_ must be one of the sized internal formats given in Table 1, or one of the compressed internal formats given in Table 2 below. Upon success, the value of `GL_TEXTURE_IMMUTABLE_FORMAT` becomes `GL_TRUE`. The value of `GL_TEXTURE_IMMUTABLE_FORMAT` may be discovered by calling [glGetTexParameter][de.dasbabypixel.gamelauncher.gles.es20.glGetTexParameterfv.glGetTexParameterfv] with _`pname`_ set to `GL_TEXTURE_IMMUTABLE_FORMAT`. No further changes to the dimensions or format of the texture object may be made. Using any command that might alter the dimensions or format of the texture object (such as [glTexImage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexImage3D.glTexImage3D] or another call to `glTexStorage3D`) will result in the generation of a `GL_INVALID_OPERATION` error, even if it would not, in fact, alter the dimensions or format of the object.
    * 
    * Table 1. Sized Internal Formats
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
    * Table 2. Compressed Internal Formats
    * 
    * 
    * | **Compressed Internal Format** | **Base Internal Format** | **Image Size** |
    * | --- | --- | --- |
    * | `GL_COMPRESSED_R11_EAC` | `GL_RED` | ceil(_`width`_/4) \* ceil(_`height`_/4) \* 8 |
    * | `GL_COMPRESSED_SIGNED_R11_EAC` | `GL_RED` | ceil(_`width`_/4) \* ceil(_`height`_/4) \* 8 |
    * | `GL_COMPRESSED_RG11_EAC` | `GL_RG` | ceil(_`width`_/4) \* ceil(_`height`_/4) \* 16 |
    * | `GL_COMPRESSED_SIGNED_RG11_EAC` | `GL_RG` | ceil(_`width`_/4) \* ceil(_`height`_/4) \* 16 |
    * | `GL_COMPRESSED_RGB8_ETC2` | `GL_RGB` | ceil(_`width`_/4) \* ceil(_`height`_/4) \* 8 |
    * | `GL_COMPRESSED_SRGB8_ETC2` | `GL_RGB` | ceil(_`width`_/4) \* ceil(_`height`_/4) \* 8 |
    * | `GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2` | `GL_RGBA` | ceil(_`width`_/4) \* ceil(_`height`_/4) \* 8 |
    * | `GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2` | `GL_RGBA` | ceil(_`width`_/4) \* ceil(_`height`_/4) \* 8 |
    * | `GL_COMPRESSED_RGBA8_ETC2_EAC` | `GL_RGBA` | ceil(_`width`_/4) \* ceil(_`height`_/4) \* 16 |
    * | `GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC` | `GL_RGBA` | ceil(_`width`_/4) \* ceil(_`height`_/4) \* 16 |
    * | `GL_COMPRESSED_RGBA_ASTC_4x4` | `GL_RGBA` | ceil(_`width`_/4) \* ceil(_`height`_/4) \* 16 |
    * | `GL_COMPRESSED_RGBA_ASTC_5x4` | `GL_RGBA` | ceil(_`width`_/5) \* ceil(_`height`_/4) \* 16 |
    * | `GL_COMPRESSED_RGBA_ASTC_5x5` | `GL_RGBA` | ceil(_`width`_/5) \* ceil(_`height`_/5) \* 16 |
    * | `GL_COMPRESSED_RGBA_ASTC_6x5` | `GL_RGBA` | ceil(_`width`_/6) \* ceil(_`height`_/5) \* 16 |
    * | `GL_COMPRESSED_RGBA_ASTC_6x6` | `GL_RGBA` | ceil(_`width`_/6) \* ceil(_`height`_/6) \* 16 |
    * | `GL_COMPRESSED_RGBA_ASTC_8x5` | `GL_RGBA` | ceil(_`width`_/8) \* ceil(_`height`_/5) \* 16 |
    * | `GL_COMPRESSED_RGBA_ASTC_8x6` | `GL_RGBA` | ceil(_`width`_/8) \* ceil(_`height`_/6) \* 16 |
    * | `GL_COMPRESSED_RGBA_ASTC_8x8` | `GL_RGBA` | ceil(_`width`_/8) \* ceil(_`height`_/8) \* 16 |
    * | `GL_COMPRESSED_RGBA_ASTC_10x5` | `GL_RGBA` | ceil(_`width`_/10) \* ceil(_`height`_/5) \* 16 |
    * | `GL_COMPRESSED_RGBA_ASTC_10x6` | `GL_RGBA` | ceil(_`width`_/10) \* ceil(_`height`_/6) \* 16 |
    * | `GL_COMPRESSED_RGBA_ASTC_10x8` | `GL_RGBA` | ceil(_`width`_/10) \* ceil(_`height`_/8) \* 16 |
    * | `GL_COMPRESSED_RGBA_ASTC_10x10` | `GL_RGBA` | ceil(_`width`_/10) \* ceil(_`height`_/10) \* 16 |
    * | `GL_COMPRESSED_RGBA_ASTC_12x10` | `GL_RGBA` | ceil(_`width`_/12) \* ceil(_`height`_/10) \* 16 |
    * | `GL_COMPRESSED_RGBA_ASTC_12x12` | `GL_RGBA` | ceil(_`width`_/12) \* ceil(_`height`_/12) \* 16 |
    * | `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_4x4` | `GL_RGBA` | ceil(_`width`_/4) \* ceil(_`height`_/4) \* 16 |
    * | `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x4` | `GL_RGBA` | ceil(_`width`_/5) \* ceil(_`height`_/4) \* 16 |
    * | `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5x5` | `GL_RGBA` | ceil(_`width`_/5) \* ceil(_`height`_/5) \* 16 |
    * | `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x5` | `GL_RGBA` | ceil(_`width`_/6) \* ceil(_`height`_/5) \* 16 |
    * | `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6x6` | `GL_RGBA` | ceil(_`width`_/6) \* ceil(_`height`_/6) \* 16 |
    * | `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x5` | `GL_RGBA` | ceil(_`width`_/8) \* ceil(_`height`_/5) \* 16 |
    * | `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x6` | `GL_RGBA` | ceil(_`width`_/8) \* ceil(_`height`_/6) \* 16 |
    * | `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8x8` | `GL_RGBA` | ceil(_`width`_/8) \* ceil(_`height`_/8) \* 16 |
    * | `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x5` | `GL_RGBA` | ceil(_`width`_/10) \* ceil(_`height`_/5) \* 16 |
    * | `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x6` | `GL_RGBA` | ceil(_`width`_/10) \* ceil(_`height`_/6) \* 16 |
    * | `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x8` | `GL_RGBA` | ceil(_`width`_/10) \* ceil(_`height`_/8) \* 16 |
    * | `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10x10` | `GL_RGBA` | ceil(_`width`_/10) \* ceil(_`height`_/10) \* 16 |
    * | `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x10` | `GL_RGBA` | ceil(_`width`_/12) \* ceil(_`height`_/10) \* 16 |
    * | `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12x12` | `GL_RGBA` | ceil(_`width`_/12) \* ceil(_`height`_/12) \* 16 |
    * 
    * 
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_OPERATION` is generated if the default texture object is curently bound to _`target`_.
    * 
    * `GL_INVALID_OPERATION` is generated if the texture object curently bound to _`target`_ already has `GL_TEXTURE_IMMUTABLE_FORMAT` set to `GL_TRUE`.
    * 
    * `GL_INVALID_ENUM` is generated if _`internalformat`_ is not a valid sized internal format.
    * 
    * `GL_INVALID_ENUM` is generated if _`target`_ is not one of the accepted target enumerants.
    * 
    * `GL_INVALID_VALUE` is generated if _`width`_, _`height`_, _`depth`_ or _`levels`_ are less than 1.
    * 
    * `GL_INVALID_VALUE` is generated if _`target`_ is `GL_TEXTURE_2D_ARRAY` or `GL_TEXTURE_CUBE_MAP_ARRAY` and _`width`_ and _`height`_ are not equal, or _`depth`_ is not a multiple of six.
    * 
    * `GL_INVALID_OPERATION` is generated if _`target`_ is `GL_TEXTURE_3D` and _`levels`_ is greater than log 2 max width ,   height ,   depth + 1 .
    * 
    * `GL_INVALID_OPERATION` is generated if _`target`_ is `GL_TEXTURE_2D_ARRAY` or `GL_TEXTURE_CUBE_MAP_ARRAY`, and _`levels`_ is greater than log 2 max width ,   height + 1 .
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glTexStorage3D | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glTexImage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexImage3D.glTexImage3D], [glCompressedTexImage3D][de.dasbabypixel.gamelauncher.gles.es30.glCompressedTexImage3D.glCompressedTexImage3D], [glTexStorage2D][de.dasbabypixel.gamelauncher.gles.es30.glTexStorage2D.glTexStorage2D].
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2011-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glTexStorage3D.glTexStorage3D
    */
    fun glTexStorage3D(target: Int, levels: UInt, internalformat: Int, width: UInt, height: UInt, depth: UInt)
}