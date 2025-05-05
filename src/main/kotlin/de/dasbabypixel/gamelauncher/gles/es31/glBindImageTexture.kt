package de.dasbabypixel.gamelauncher.gles.es31

interface glBindImageTexture {
    /**
    * Name
    * ----
    * 
    * glBindImageTexture — bind a level of a texture to an image unit
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glBindImageTexture**(` | GLuint unit, |
    * | --- | --- |
    * |   | GLuint texture, |
    * |   | GLint level, |
    * |   | GLboolean layered, |
    * |   | GLint layer, |
    * |   | GLenum access, |
    * |   | GLenum format`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`unit`_
    * 
    * Specifies the index of the image unit to which to bind the texture
    * 
    * _`texture`_
    * 
    * Specifies the name of the texture to bind to the image unit.
    * 
    * _`level`_
    * 
    * Specifies the level of the texture that is to be bound.
    * 
    * _`layered`_
    * 
    * Specifies whether a layered texture binding is to be established.
    * 
    * _`layer`_
    * 
    * If _`layered`_ is `GL_FALSE`, specifies the layer of _`texture`_ to be bound to the image unit. Ignored otherwise.
    * 
    * _`access`_
    * 
    * Specifies a token indicating the type of access that will be performed on the image.
    * 
    * _`format`_
    * 
    * Specifies the format that the elements of the image will be treated as for the purposes of formatted loads and stores.
    * 
    * Description
    * -----------
    * 
    * `glBindImageTexture` binds a single level of a texture to an image unit for the purpose of reading and writing it from shaders. _`unit`_ specifies the zero-based index of the image unit to which to bind the texture level. _`texture`_ specifies the name of an existing immutable texture object to bind to the image unit. If _`texture`_ is zero, then any existing binding to the image unit is broken. _`level`_ specifies the level of the texture to bind to the image unit.
    * 
    * If _`texture`_ is the name of a two-dimensional array texture, a cube map texture, a cube map array or a two-dimensional multisample array texture, then it is possible to bind either the entire array, or only a single layer of the array to the image unit. In such cases, if _`layered`_ is `GL_TRUE`, the entire array is attached to the image unit and _`layer`_ is ignored. However, if _`layered`_ is `GL_FALSE` then _`layer`_ specifies the layer of the array to attach to the image unit. For cube map array textures where _`layered`_ is `GL_FALSE`, the selected layer number is mapped to a texture layer and cube face using the following equations:
    * 
    * layer = floor(layer\_orig / 6)
    * 
    * face = layer\_orig - (layer \* 6)
    * 
    * _`access`_ specifies the access types to be performed by shaders and may be set to `GL_READ_ONLY`, `GL_WRITE_ONLY`, or `GL_READ_WRITE` to indicate read-only, write-only or read-write access, respectively. Violation of the access type specified in _`access`_ (for example, if a shader writes to an image bound with _`access`_ set to `GL_READ_ONLY`) will lead to undefined results, possibly including program termination.
    * 
    * _`format`_ specifies the format that is to be used when performing formatted loads and stores into the image from shaders. _`format`_ must be compatible with the texture's internal format and must be one of the formats listed in the following table.
    * 
    * Table 1. Internal Image Formats
    * 
    * 
    * | **Image Unit Format** | **Format Qualifier** |
    * | --- | --- |
    * | `GL_RGBA32F` | `rgba32f` |
    * | `GL_RGBA16F` | `rgba16f` |
    * | `GL_R32F` | `r32f` |
    * | `GL_RGBA32UI` | `rgba32ui` |
    * | `GL_RGBA16UI` | `rgba16ui` |
    * | `GL_RGBA8UI` | `rgba8ui` |
    * | `GL_R32UI` | `r32ui` |
    * | `GL_RGBA32I` | `rgba32i` |
    * | `GL_RGBA16I` | `rgba16i` |
    * | `GL_RGBA8I` | `rgba8i` |
    * | `GL_R32I` | `r32i` |
    * | `GL_RGBA8` | `rgba8` |
    * | `GL_RGBA8_SNORM` | `rgba8_snorm` |
    * 
    * 
    * 
    * When a texture is bound to an image unit, the _`format`_ parameter for the image unit need not exactly match the texture internal format as long as the formats are considered compatible as defined in the OpenGL ES Specification. The matching criterion used for a given texture may be determined by calling [glGetTexParameter][de.dasbabypixel.gamelauncher.gles.es20.glGetTexParameterfv.glGetTexParameterfv] with _`value`_ set to `GL_IMAGE_FORMAT_COMPATIBILITY_TYPE`, with return values of `GL_IMAGE_FORMAT_COMPATIBILITY_BY_SIZE` and `GL_IMAGE_FORMAT_COMPATIBILITY_BY_CLASS`, specifying matches by size and class, respectively.
    * 
    * Notes
    * -----
    * 
    * The `glBindImageTexture` can only be used with immutable textures and buffer textures. This is intended to guide developers towards immutable textures.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`unit`_ greater than or equal to the value of `GL_MAX_IMAGE_UNITS`.
    * 
    * `GL_INVALID_VALUE` is generated if _`texture`_ is not the name of an existing texture object.
    * 
    * `GL_INVALID_OPERATION` is generated if _`texture`_ is not the name of an immutable texture object or a buffer texture.
    * 
    * `GL_INVALID_VALUE` is generated if _`level`_ or _`layer`_ is less than zero.
    * 
    * `GL_INVALID_ENUM` is generated if _`access`_ or _`format`_ is not one of the supported tokens.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_IMAGE_BINDING_NAME`.
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_IMAGE_BINDING_LEVEL`.
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_IMAGE_BINDING_LAYERED`.
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_IMAGE_BINDING_LAYER`.
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_IMAGE_BINDING_ACCESS`.
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_IMAGE_BINDING_FORMAT`.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glBindImageTexture` | \- | \- | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGenTextures][de.dasbabypixel.gamelauncher.gles.es20.glGenTextures.glGenTextures], [glTexStorage2D][de.dasbabypixel.gamelauncher.gles.es30.glTexStorage2D.glTexStorage2D], [glTexStorage3D][de.dasbabypixel.gamelauncher.gles.es30.glTexStorage3D.glTexStorage3D], [glBindTexture][de.dasbabypixel.gamelauncher.gles.es20.glBindTexture.glBindTexture]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2011-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es31.glBindImageTexture.glBindImageTexture
    */
    fun glBindImageTexture(unit: UInt, texture: UInt, level: Int, layered: Boolean, layer: Int, access: Int, format: Int)
}