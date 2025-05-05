package de.dasbabypixel.gamelauncher.gles.es32

interface glCopyImageSubData {
    /**
    * Name
    * ----
    * 
    * glCopyImageSubData — perform a raw data copy between two images
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glCopyImageSubData**(` | GLuint srcName, |
    * | --- | --- |
    * |   | GLenum srcTarget, |
    * |   | GLint srcLevel, |
    * |   | GLint srcX, |
    * |   | GLint srcY, |
    * |   | GLint srcZ, |
    * |   | GLuint dstName, |
    * |   | GLenum dstTarget, |
    * |   | GLint dstLevel, |
    * |   | GLint dstX, |
    * |   | GLint dstY, |
    * |   | GLint dstZ, |
    * |   | GLsizei srcWidth, |
    * |   | GLsizei srcHeight, |
    * |   | GLsizei srcDepth`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`srcName`_
    * 
    * The name of a texture or renderbuffer object from which to copy.
    * 
    * _`srcTarget`_
    * 
    * The target representing the namespace of the source name _`srcName`_.
    * 
    * _`srcLevel`_
    * 
    * The mipmap level to read from the source.
    * 
    * _`srcX`_
    * 
    * The X coordinate of the left edge of the souce region to copy.
    * 
    * _`srcY`_
    * 
    * The Y coordinate of the top edge of the souce region to copy.
    * 
    * _`srcZ`_
    * 
    * The Z coordinate of the near edge of the souce region to copy.
    * 
    * _`dstName`_
    * 
    * The name of a texture or renderbuffer object to which to copy.
    * 
    * _`dstTarget`_
    * 
    * The target representing the namespace of the destination name _`dstName`_.
    * 
    * _`dstX`_
    * 
    * The X coordinate of the left edge of the destination region.
    * 
    * _`dstY`_
    * 
    * The Y coordinate of the top edge of the destination region.
    * 
    * _`dstZ`_
    * 
    * The Z coordinate of the near edge of the destination region.
    * 
    * _`srcWidth`_
    * 
    * The width of the region to be copied.
    * 
    * _`srcHeight`_
    * 
    * The height of the region to be copied.
    * 
    * _`srcDepth`_
    * 
    * The depth of the region to be copied.
    * 
    * Description
    * -----------
    * 
    * `glCopyImageSubData` may be used to copy data from one image (i.e. texture or renderbuffer) to another. `glCopyImageSubData` does not perform general-purpose conversions such as scaling, resizing, blending, color-space, or format conversions. It should be considered to operate in a manner similar to a CPU memcpy. CopyImageSubData can copy between images with different internal formats, provided the formats are compatible.
    * 
    * `glCopyImageSubData` also allows copying between certain types of compressed and uncompressed internal formats. This copy does not perform on-the-fly compression or decompression. When copying from an uncompressed internal format to a compressed internal format, each texel of uncompressed data becomes a single block of compressed data. When copying from a compressed internal format to an uncompressed internal format, a block of compressed data becomes a single texel of uncompressed data. The texel size of the uncompressed format must be the same size the block size of the compressed formats. Thus it is permitted to copy between a 128-bit uncompressed format and a compressed format which uses 8-bit 4x4 blocks, or between a 64-bit uncompressed format and a compressed format which uses 4-bit 4x4 blocks.
    * 
    * The source object is identified by _`srcName`_ and _`srcTarget`_ and the destination object is identified by _`dstName`_ and _`dstTarget`_. The interpretation of the name depends on the value of the corresponding _`target`_ parameter. If _`target`_ is `GL_RENDERBUFFER`, the name is interpreted as the name of a renderbuffer object. If the target parameter is a texture target, the name is interpreted as a texture object. All texture targets are accepted, with the exception of `GL_TEXTURE_BUFFER` and the cubemap face selectors.
    * 
    * _`srcLevel`_ and _`dstLevel`_ identify the source and destination level of detail. For textures, this must be a valid level of detail in the texture object. For renderbuffers, this value must be zero.
    * 
    * _`srcX`_, _`srcY`_, and _`srcZ`_ specify the lower left texel coordinates of a _`srcWidth`_\-wide by _`srcHeight`_\-high by _`srcDepth`_\-deep rectangular subregion of the source texel array. Similarly, _`dstX`_, _`dstY`_ and _`dstZ`_ specify the coordinates of a subregion of the destination texel array. The source and destination subregions must be contained entirely within the specified level of the corresponding image objects.
    * 
    * The dimensions are always specified in texels, even for compressed texture formats. However, it should be noted that if only one of the source and destination textures is compressed then the number of texels touched in the compressed image will be a factor of the block size larger than in the uncompressed image.
    * 
    * Slices of a `GL_TEXTURE_2D_ARRAY`, `GL_TEXTURE_CUBE_MAP_ARRAY` `GL_TEXTURE_3D` and faces of `GL_TEXTURE_CUBE_MAP` are all compatible provided they share a compatible internal format, and multiple slices or faces may be copied between these objects with a single call by specifying the starting slice with _`srcZ`_ and _`dstZ`_, and the number of slices to be copied with _`srcDepth`_. Cubemap textures always have six faces which are selected by a zero-based face index.
    * 
    * For the purposes of CopyImageSubData, two internal formats are considered compatible if any of the following conditions are met:
    * 
    * *   the formats are the same,
    * 
    * *   the formats are considered compatible if both internal formats are listed in the same entry of Table 1, or
    * 
    * *   one format is compressed and the other is uncompressed and Table 2 lists the two formats in the same row.
    * 
    * 
    * If the formats are not compatible, an INVALID\_OPERATION error is generated.
    * 
    * Table 1. Compatible internal formats for glCopyImageSubData
    * 
    * 
    * | **Class** | **Internal Formats** |
    * | --- | --- |
    * | 128-bit | `GL_RGBA32UI`, `GL_RGBA32I`, `GL_RGBA32F` |
    * | 96-bit | `GL_RGB32UI`, `GL_RGB32I`, `GL_RGB32F` |
    * | 64-bit | `GL_RGBA16UI`, `GL_RGBA16I`, `GL_RGBA16F`, `GL_RG32F`, `GL_RG32I`, `GL_RG32UI` |
    * | 48-bit | `GL_RGB16UI`, `GL_RGB16I`, `GL_RGB16F` |
    * | 32-bit | `GL_RGBA8UI`, `GL_RGBA8I`, `GL_RGBA8`, `GL_RGBA8_SNORM`, `GL_SRGB8_ALPHA8`, `GL_RGB9_E5`, `GL_RG16F`, `GL_RG16I`, `GL_RG16UI`, `GL_R11F_G11F_B10F`, `GL_RGB10_A2UI`, `GL_R32F`, `GL_R32UI`, `GL_R32I`, `GL_RGB10_A2` |
    * | 24-bit | `GL_RGB8UI`, `GL_RGB8I`, `GL_RGB8`, `GL_RGB8_SNORM`, `GL_SRGB8` |
    * | 16-bit | `GL_RG8`, `GL_RG8_SNORM`, `GL_RG8I`, `GL_RG8UI`, `GL_R16F`, `GL_R16I`, `GL_R16UI` |
    * | 8-bit | `GL_R8`, `GL_R8_SNORM`, `GL_R8I`, `GL_R8UI` |
    * | EAC\_R11 | `GL_COMPRESSED_R11_EAC`, `GL_COMPRESSED_SIGNED_R11_EAC` |
    * | EAC\_RG11 | `GL_COMPRESSED_RG11_EAC`, `GL_COMPRESSED_SIGNED_RG11_EAC` |
    * | ETC2\_RGB | `GL_COMPRESSED_RGB8_ETC2`, `GL_COMPRESSED_SRGB8_ETC2` |
    * | ETC2\_RGBA | `GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2`, `GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2` |
    * | ETC2\_EAC\_RGBA | `GL_COMPRESSED_RGBA8_ETC2_EAC`, `GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC` |
    * | ASTC\_4X4\_RGBA | `GL_COMPRESSED_RGBA_ASTC_4X4`, `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_4X4` |
    * | ASTC\_5X4\_RGBA | `GL_COMPRESSED_RGBA_ASTC_5X4`, `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5X4` |
    * | ASTC\_5X5\_RGBA | `GL_COMPRESSED_RGBA_ASTC_5X5`, `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5X5` |
    * | ASTC\_6X5\_RGBA | `GL_COMPRESSED_RGBA_ASTC_6X5`, `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6X5` |
    * | ASTC\_6X6\_RGBA | `GL_COMPRESSED_RGBA_ASTC_6X6`, `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6X6` |
    * | ASTC\_8X5\_RGBA | `GL_COMPRESSED_RGBA_ASTC_8X5`, `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8X5` |
    * | ASTC\_8X6\_RGBA | `GL_COMPRESSED_RGBA_ASTC_8X6`, `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8X6` |
    * | ASTC\_8X8\_RGBA | `GL_COMPRESSED_RGBA_ASTC_8X8`, `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8X8` |
    * | ASTC\_10X5\_RGBA | `GL_COMPRESSED_RGBA_ASTC_10X5`, `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10X5` |
    * | ASTC\_10X6\_RGBA | `GL_COMPRESSED_RGBA_ASTC_10X6`, `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10X6` |
    * | ASTC\_10X8\_RGBA | `GL_COMPRESSED_RGBA_ASTC_10X8`, `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10X8` |
    * | ASTC\_10X10\_RGBA | `GL_COMPRESSED_RGBA_ASTC_10X10`, `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10X10` |
    * | ASTC\_12X10\_RGBA | `GL_COMPRESSED_RGBA_ASTC_12X10`, `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12X10` |
    * | ASTC\_12X12\_RGBA | `GL_COMPRESSED_RGBA_ASTC_12X12`, `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12X12` |
    * 
    * 
    * 
    * Table 2. Compatible formats for copying between compressed and uncompressed internal formats
    * 
    * 
    * | **Texel / Block Size** | **Uncompressed Internal Format** | **Compressed Internal Format(s)** |
    * | --- | --- | --- |
    * | 64-bit | `GL_RGBA32UI`, `GL_RGBA32I`, `GL_RGBA32F` | `GL_COMPRESSED_RGBA_ETC2_EAC`, `GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC`, `GL_COMPRESSED_RG11_EAC`, `GL_COMPRESSED_SIGNED_RG11_EAC`, `GL_COMPRESSED_RGBA_ASTC_4X4`, `GL_COMPRESSED_RGBA_ASTC_5X4`, `GL_COMPRESSED_RGBA_ASTC_5X5`, `GL_COMPRESSED_RGBA_ASTC_6X5`, `GL_COMPRESSED_RGBA_ASTC_6X6`, `GL_COMPRESSED_RGBA_ASTC_8X5`, `GL_COMPRESSED_RGBA_ASTC_8X6`, `GL_COMPRESSED_RGBA_ASTC_8X8`, `GL_COMPRESSED_RGBA_ASTC_10X5`, `GL_COMPRESSED_RGBA_ASTC_10X6`, `GL_COMPRESSED_RGBA_ASTC_10X8`, `GL_COMPRESSED_RGBA_ASTC_10X10`, `GL_COMPRESSED_RGBA_ASTC_12X10`, `GL_COMPRESSED_RGBA_ASTC_12X12`, `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_4X4`, `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5X4`, `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_5X5`, `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6X5`, `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_6X6`, `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8X5`, `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8X6`, `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_8X8`, `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10X5`, `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10X6`, `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10X8`, `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_10X10`, `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12X10`, `GL_COMPRESSED_SRGB8_ALPHA8_ASTC_12X12` |
    * | 128-bit | `GL_RGBA16UI`, `GL_RGBA16I`, `GL_RGBA16F`, `GL_RG32F`, `GL_RG32UI`, `GL_RG32I` | `GL_COMPRESSED_RGB8_ETC2`, `GL_COMPRESSED_SRGB8_ETC2`, `GL_COMPRESSED_R11_EAC`, `GL_COMPRESSED_SIGNED_R11_EAC`, `GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2`, `GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2` |
    * 
    * 
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_OPERATION` is generated if the texel size of the uncompressed image is not equal to the block size of the compressed image.
    * 
    * `GL_INVALID_ENUM` is generated if either target parameter is not `GL_RENDERBUFFER`, a valid texture target other than `GL_TEXTURE_BUFFER`, or is one of the cubemap face selectors.
    * 
    * `GL_INVALID_ENUM` is generated if _`target`_ does not match the type of the object.
    * 
    * `GL_INVALID_OPERATION` is generated if either object is a texture and the texture is not complete.
    * 
    * `GL_INVALID_OPERATION` is generated if the source and destination internal formats are not compatible, or if the number of samples do not match.
    * 
    * `GL_INVALID_VALUE` is generated if either name does not correspond to a valid renderbuffer or texture object according to the corresponding target parameter.
    * 
    * `GL_INVALID_VALUE` is generated if the specified level of either the source or destination is not a valid level for the corresponding image.
    * 
    * `GL_INVALID_VALUE` is generated if the dimensions of the either subregion exceeds the boundaries of the corresponding image object, or if the image format is compressed and the dimensions of the subregion fail to meet the alignment constraints of the format.
    * 
    * Version Support
    * ---------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glCopyImageSubData` | \- | \- | \- | ✔ |
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2013-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es32.glCopyImageSubData.glCopyImageSubData
    */
    fun glCopyImageSubData(srcName: UInt, srcTarget: Int, srcLevel: Int, srcX: Int, srcY: Int, srcZ: Int, dstName: UInt, dstTarget: Int, dstLevel: Int, dstX: Int, dstY: Int, dstZ: Int, srcWidth: UInt, srcHeight: UInt, srcDepth: UInt)
}