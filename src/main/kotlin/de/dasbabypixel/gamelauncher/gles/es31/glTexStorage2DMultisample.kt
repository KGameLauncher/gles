package de.dasbabypixel.gamelauncher.gles.es31

interface glTexStorage2DMultisample {
    /**
    * Name
    * ----
    * 
    * glTexStorage2DMultisample — specify storage for a two-dimensional multisample texture
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glTexStorage2DMultisample**(` | GLenum target, |
    * | --- | --- |
    * |   | GLsizei samples, |
    * |   | GLenum internalformat, |
    * |   | GLsizei width, |
    * |   | GLsizei height, |
    * |   | GLboolean fixedsamplelocations`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`target`_
    * 
    * Specify the target of the operation. _`target`_ must be `GL_TEXTURE_2D_MULTISAMPLE`.
    * 
    * _`samples`_
    * 
    * Specify the number of samples in the texture.
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
    * _`fixedsamplelocations`_
    * 
    * Specifies whether the image will use identical sample locations and the same number of samples for all texels in the image, and the sample locations will not depend on the internal format or size of the image.
    * 
    * Description
    * -----------
    * 
    * `glTexStorage2DMultisample` specifies the storage requirements for a two-dimensional multisample texture. Once a texture is specified with this command, its format and dimensions become immutable. The contents of the image may still be modified, however, its storage requirements may not change. Such a texture is referred to as an _immutable-format_ texture.
    * 
    * _`samples`_ specifies the number of samples to be used for the texture and must be greater than zero and less than or equal to the value of `GL_MAX_SAMPLES`. _`internalformat`_ must be a color-renderable, depth-renderable, or stencil-renderable format. _`width`_ and _`height`_ specify the width and height, respectively, of the texture. If _`fixedsamplelocations`_ is `GL_TRUE`, the image will use identical sample locations and the same number of samples for all texels in the image, and the sample locations will not depend on the internal format or size of the image.
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
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`internalformat`_ is not a valid color-renderable, depth-renderable or stencil-renderable format.
    * 
    * `GL_INVALID_ENUM` is generated if _`target`_ is not one of the accepted target enumerants.
    * 
    * `GL_INVALID_VALUE` is generated if _`width`_ or _`height`_ are less than 1 or greater than the value of `GL_MAX_TEXTURE_SIZE`.
    * 
    * `GL_INVALID_VALUE` is generated if _`samples`_ is zero.
    * 
    * `GL_INVALID_OPERATION` is generated if _`samples`_ is greater than the maximum number of samples supported for this _`target`_ and _`internalformat`_.
    * 
    * `GL_INVALID_OPERATION` is generated if the value of `GL_TEXTURE_IMMUTABLE_FORMAT` for the texture bound to _`target`_ is not `GL_FALSE`.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGetInteger](glGetInteger.xhtml) with arguments `GL_MAX_TEXTURE_SIZE`, `GL_MAX_SAMPLES`, or `GL_TEXTURE_IMMUTABLE_LEVELS`.
    * 
    * [glGetInternalformativ][de.dasbabypixel.gamelauncher.gles.es30.glGetInternalformativ.glGetInternalformativ] with arguments `GL_SAMPLES`.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glTexStorage2DMultisample` | \- | \- | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glTexImage2D][de.dasbabypixel.gamelauncher.gles.es20.glTexImage2D.glTexImage2D], [glTexImage2DMultisample](glTexImage2DMultisample.xhtml), [glTexStorage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexStorage3D.glTexStorage3D].
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2012-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es31.glTexStorage2DMultisample.glTexStorage2DMultisample
    */
    fun glTexStorage2DMultisample(target: Int, samples: UInt, internalformat: Int, width: UInt, height: UInt, fixedsamplelocations: Boolean)
}