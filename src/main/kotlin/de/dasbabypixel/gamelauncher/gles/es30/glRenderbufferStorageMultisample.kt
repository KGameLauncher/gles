package de.dasbabypixel.gamelauncher.gles.es30

interface glRenderbufferStorageMultisample {
    /**
    * Name
    * ----
    * 
    * glRenderbufferStorageMultisample — establish data storage, format, dimensions and sample count of a renderbuffer object's image
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glRenderbufferStorageMultisample**(` | GLenum target, |
    * | --- | --- |
    * |   | GLsizei samples, |
    * |   | GLenum internalformat, |
    * |   | GLsizei width, |
    * |   | GLsizei height`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`target`_
    * 
    * Specifies a binding to which the target of the allocation and must be `GL_RENDERBUFFER`.
    * 
    * _`samples`_
    * 
    * Specifies the number of samples to be used for the renderbuffer object's storage.
    * 
    * _`internalformat`_
    * 
    * Specifies the internal format to use for the renderbuffer object's image.
    * 
    * _`width`_
    * 
    * Specifies the width of the renderbuffer, in pixels.
    * 
    * _`height`_
    * 
    * Specifies the height of the renderbuffer, in pixels.
    * 
    * Description
    * -----------
    * 
    * `glRenderbufferStorageMultisample` establishes the data storage, format, dimensions and number of samples of a renderbuffer object's image.
    * 
    * The target of the operation, specified by _`target`_ must be `GL_RENDERBUFFER`. _`internalformat`_ specifies the internal format to be used for the renderbuffer object's storage and must be a color-renderable, depth-renderable, or stencil-renderable format, as shown in Table 1 below. _`width`_ and _`height`_ are the dimensions, in pixels, of the renderbuffer. Both _`width`_ and _`height`_ must be less than or equal to the value of `GL_MAX_RENDERBUFFER_SIZE`. _`samples`_ specifies the number of samples to be used for the renderbuffer object's image. If _`internalformat`_ is a signed or unsigned integer format then _`samples`_ must be 0. Otherwise, _`samples`_ must be less than or equal to the maximum number of samples supported for _`internalformat`_. (see [glGetInternalformativ][de.dasbabypixel.gamelauncher.gles.es30.glGetInternalformativ.glGetInternalformativ]).
    * 
    * Upon success, `glRenderbufferStorageMultisample` deletes any existing data store for the renderbuffer image and the contents of the data store after calling `glRenderbufferStorageMultisample` are undefined.
    * 
    * Table 1. Sized Internal Formats
    * 
    * 
    * | **Sized Internal Format** | **Base Format** | **Red Bits** | **Green Bits** | **Blue Bits** | **Alpha Bits** |
    * | --- | --- | --- | --- | --- | --- |
    * | `GL_R8` | `GL_RED` | 8 |   |   |   |
    * | `GL_R8UI` | `GL_RED_INTEGER` | ui8 |   |   |   |
    * | `GL_R8I` | `GL_RED_INTEGER` | i8 |   |   |   |
    * | `GL_R16UI` | `GL_RED_INTEGER` | ui16 |   |   |   |
    * | `GL_R16I` | `GL_RED_INTEGER` | i16 |   |   |   |
    * | `GL_R32UI` | `GL_RED_INTEGER` | ui32 |   |   |   |
    * | `GL_R32I` | `GL_RED_INTEGER` | i32 |   |   |   |
    * | `GL_RG8` | `GL_RG` | 8 | 8 |   |   |
    * | `GL_RG8UI` | `GL_RG_INTEGER` | ui8 | ui8 |   |   |
    * | `GL_RG8I` | `GL_RG_INTEGER` | i8 | i8 |   |   |
    * | `GL_RG16UI` | `GL_RG_INTEGER` | ui16 | ui16 |   |   |
    * | `GL_RG16I` | `GL_RG_INTEGER` | i16 | i16 |   |   |
    * | `GL_RG32UI` | `GL_RG_INTEGER` | ui32 | ui32 |   |   |
    * | `GL_RG32I` | `GL_RG_INTEGER` | i32 | i32 |   |   |
    * | `GL_RGB8` | `GL_RGB` | 8 | 8 | 8 |   |
    * | `GL_RGB565` | `GL_RGB` | 5 | 6 | 5 |   |
    * | `GL_RGBA8` | `GL_RGBA` | 8 | 8 | 8 | 8 |
    * | `GL_SRGB8_ALPHA8` | `GL_RGBA` | 8 | 8 | 8 | 8 |
    * | `GL_RGB5_A1` | `GL_RGBA` | 5 | 5 | 5 | 1 |
    * | `GL_RGBA4` | `GL_RGBA` | 4 | 4 | 4 | 4 |
    * | `GL_RGB10_A2` | `GL_RGBA` | 10 | 10 | 10 | 2 |
    * | `GL_RGBA8UI` | `GL_RGBA_INTEGER` | ui8 | ui8 | ui8 | ui8 |
    * | `GL_RGBA8I` | `GL_RGBA_INTEGER` | i8 | i8 | i8 | i8 |
    * | `GL_RGB10_A2UI` | `GL_RGBA_INTEGER` | ui10 | ui10 | ui10 | ui2 |
    * | `GL_RGBA16UI` | `GL_RGBA_INTEGER` | ui16 | ui16 | ui16 | ui16 |
    * | `GL_RGBA16I` | `GL_RGBA_INTEGER` | i16 | i16 | i16 | i16 |
    * | `GL_RGBA32I` | `GL_RGBA_INTEGER` | i32 | i32 | i32 | i32 |
    * | `GL_RGBA32UI` | `GL_RGBA_INTEGER` | ui32 | ui32 | ui32 | ui32 |
    * 
    * 
    * | **Sized Internal Format** | **Base Format** | **Depth Bits** | **Stencil Bits** |   |
    * | --- | --- | --- | --- | --- |
    * | `GL_DEPTH_COMPONENT16` | `GL_DEPTH_COMPONENT` | 16 |   |   |
    * | `GL_DEPTH_COMPONENT24` | `GL_DEPTH_COMPONENT` | 24 |   |   |
    * | `GL_DEPTH_COMPONENT32F` | `GL_DEPTH_COMPONENT` | f32 |   |   |
    * | `GL_DEPTH24_STENCIL8` | `GL_DEPTH_STENCIL` | 24 | 8 |   |
    * | `GL_DEPTH32F_STENCIL8` | `GL_DEPTH_STENCIL` | f32 | 8 |   |
    * | `GL_STENCIL_INDEX8` | `GL_STENCIL` |   | 8 |   |
    * 
    * 
    * 
    * Notes
    * -----
    * 
    * Since different implementations may support different sample counts for multisample rendering, the actual number of samples allocated for the renderbuffer image is implementation-dependent. However, the resulting value for `GL_RENDERBUFFER_SAMPLES` is guaranteed to be greater than or equal to _`samples`_ and no more than the next larger sample count supported by the implementation.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`target`_ is not `GL_RENDERBUFFER`.
    * 
    * `GL_INVALID_OPERATION` is generated if _`samples`_ is greater than the maximum number of samples supported for _`internalformat`_.
    * 
    * `GL_INVALID_ENUM` is generated if _`internalformat`_ is not a color-renderable, depth-renderable, or stencil-renderable format.
    * 
    * `GL_INVALID_OPERATION` is generated if _`internalformat`_ is a signed or unsigned integer format and _`samples`_ is greater than 0.
    * 
    * `GL_INVALID_VALUE` is generated if either of _`width`_ or _`height`_ is negative, or greater than the value of `GL_MAX_RENDERBUFFER_SIZE`.
    * 
    * `GL_OUT_OF_MEMORY` is generated if the GL is unable to create a data store of the requested size.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glRenderbufferStorageMultisample | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGenRenderbuffers][de.dasbabypixel.gamelauncher.gles.es20.glGenRenderbuffers.glGenRenderbuffers], [glGetInternalformativ][de.dasbabypixel.gamelauncher.gles.es30.glGetInternalformativ.glGetInternalformativ], [glBindRenderbuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindRenderbuffer.glBindRenderbuffer], [glRenderbufferStorage][de.dasbabypixel.gamelauncher.gles.es20.glRenderbufferStorage.glRenderbufferStorage], [glFramebufferRenderbuffer][de.dasbabypixel.gamelauncher.gles.es20.glFramebufferRenderbuffer.glFramebufferRenderbuffer], [glDeleteRenderbuffers][de.dasbabypixel.gamelauncher.gles.es20.glDeleteRenderbuffers.glDeleteRenderbuffers]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glRenderbufferStorageMultisample.glRenderbufferStorageMultisample
    */
    fun glRenderbufferStorageMultisample(target: Int, samples: UInt, internalformat: Int, width: UInt, height: UInt)
}