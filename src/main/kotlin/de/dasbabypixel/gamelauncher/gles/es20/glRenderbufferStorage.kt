package de.dasbabypixel.gamelauncher.gles.es20

interface glRenderbufferStorage {
    /**
    * Name
    * ----
    * 
    * glRenderbufferStorage — establish data storage, format and dimensions of a renderbuffer object's image
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glRenderbufferStorage**(` | GLenum target, |
    * | --- | --- |
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
    * `glRenderbufferStorage` is equivalent to calling [glRenderbufferStorageMultisample][de.dasbabypixel.gamelauncher.gles.es30.glRenderbufferStorageMultisample.glRenderbufferStorageMultisample] with the _`samples`_ set to zero.
    * 
    * The target of the operation, specified by _`target`_ must be `GL_RENDERBUFFER`. _`internalformat`_ specifies the internal format to be used for the renderbuffer object's storage and must be a color-renderable, depth-renderable, or stencil-renderable format, as shown in Table 1 below. _`width`_ and _`height`_ are the dimensions, in pixels, of the renderbuffer. Both _`width`_ and _`height`_ must be less than or equal to the value of `GL_MAX_RENDERBUFFER_SIZE`.
    * 
    * Upon success, `glRenderbufferStorage` deletes any existing data store for the renderbuffer image and the contents of the data store after calling `glRenderbufferStorage` are undefined.
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
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`target`_ is not `GL_RENDERBUFFER`.
    * 
    * `GL_INVALID_VALUE` is generated if either of _`width`_ or _`height`_ is negative, or greater than the value of `GL_MAX_RENDERBUFFER_SIZE`.
    * 
    * `GL_INVALID_ENUM` is generated if _`internalformat`_ is not a color-renderable, depth-renderable, or stencil-renderable format.
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
    * | glRenderbufferStorage | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGenRenderbuffers][de.dasbabypixel.gamelauncher.gles.es20.glGenRenderbuffers.glGenRenderbuffers], [glBindRenderbuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindRenderbuffer.glBindRenderbuffer], [glRenderbufferStorageMultisample][de.dasbabypixel.gamelauncher.gles.es30.glRenderbufferStorageMultisample.glRenderbufferStorageMultisample], [glFramebufferRenderbuffer][de.dasbabypixel.gamelauncher.gles.es20.glFramebufferRenderbuffer.glFramebufferRenderbuffer], [glDeleteRenderbuffers][de.dasbabypixel.gamelauncher.gles.es20.glDeleteRenderbuffers.glDeleteRenderbuffers]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glRenderbufferStorage.glRenderbufferStorage
    */
    fun glRenderbufferStorage(target: Int, internalformat: Int, width: UInt, height: UInt)
}