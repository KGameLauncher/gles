package de.dasbabypixel.gamelauncher.gles.es20

interface glReadPixels {
    /**
    * Name
    * ----
    * 
    * glReadPixels, glReadnPixels — read a block of pixels from the frame buffer
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glReadPixels**(` | GLint x, |
    * | --- | --- |
    * |   | GLint y, |
    * |   | GLsizei width, |
    * |   | GLsizei height, |
    * |   | GLenum format, |
    * |   | GLenum type, |
    * |   | void \* data`)`; |
    * 
    * | `void **glReadnPixels**(` | GLint x, |
    * | --- | --- |
    * |   | GLint y, |
    * |   | GLsizei width, |
    * |   | GLsizei height, |
    * |   | GLenum format, |
    * |   | GLenum type, |
    * |   | GLsizei bufSize, |
    * |   | void \* data`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`x`_, _`y`_
    * 
    * Specify the window coordinates of the first pixel that is read from the frame buffer. This location is the lower left corner of a rectangular block of pixels.
    * 
    * _`width`_, _`height`_
    * 
    * Specify the dimensions of the pixel rectangle. _`width`_ and _`height`_ of one correspond to a single pixel.
    * 
    * _`format`_
    * 
    * Specifies the format of the pixel data. The following symbolic values are accepted: `GL_RGBA`, and `GL_RGBA_INTEGER`. An implementation-chosen format will also be accepted. This can be queried with [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] and `GL_IMPLEMENTATION_COLOR_READ_FORMAT`.
    * 
    * _`type`_
    * 
    * Specifies the data type of the pixel data. Must be one of `GL_UNSIGNED_BYTE`, `GL_UNSIGNED_INT`, `GL_UNSIGNED_INT_2_10_10_10_REV`, `GL_INT`, or `GL_FLOAT`. An implementation-chosen type will also be accepted. This can be queried with [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] and `GL_IMPLEMENTATION_COLOR_READ_TYPE`.
    * 
    * _`bufSize`_
    * 
    * Specifies the size of the buffer _`data`_ for `glReadnPixels` function.
    * 
    * _`data`_
    * 
    * Returns the pixel data.
    * 
    * Description
    * -----------
    * 
    * `glReadPixels` and `glReadnPixels` return pixel data from the frame buffer, starting with the pixel whose lower left corner is at location (_`x`_, _`y`_), into client memory starting at location _`data`_. Several parameters control the processing of the pixel data before it is placed into client memory. These parameters are set with [glPixelStorei][de.dasbabypixel.gamelauncher.gles.es20.glPixelStorei.glPixelStorei]. This reference page describes the effects on `glReadPixels` and `glReadnPixels` of most, but not all of the parameters specified by these three commands.
    * 
    * If a non-zero named buffer object is bound to the `GL_PIXEL_PACK_BUFFER` target (see [glBindBuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindBuffer.glBindBuffer]) while a block of pixels is requested, _`data`_ is treated as a byte offset into the buffer object's data store rather than a pointer to client memory.
    * 
    * `glReadPixels` and `glReadnPixels` return values from each pixel with lower left corner at x + i y + j for 0 <= i < width and 0 <= j < height . This pixel is said to be the ith pixel in the jth row. Pixels are returned in row order from the lowest to the highest row, left to right in each row.
    * 
    * _`format`_ specifies the format for the returned pixel values; accepted values are `GL_RED`, `GL_RED_INTEGER`, `GL_RG`, `GL_RG_INTEGER`, `GL_RGB`, `GL_RGB_INTEGER`, `GL_RGBA`, `GL_RGBA_INTEGER`, `GL_LUMINANCE_ALPHA`, `GL_LUMINANCE`, and `GL_ALPHA`
    * 
    * Finally, the indices or components are converted to the proper format, as specified by _`type`_. If _`type`_ is `GL_FLOAT`, then each integer index is converted to single-precision floating-point format.
    * 
    * If _`format`_ is `GL_RED`, `GL_RG`, `GL_RGB`, or `GL_RGBA`, and _`type`_ is not `GL_FLOAT`, each component is multiplied by the multiplier shown in the following table. If type is `GL_FLOAT`, then each component is passed as is (or converted to the client's single-precision floating-point format if it is different from the one used by the GL).
    * 
    * 
    * | _`type`_ | **Index Mask** | **Component Conversion** |   |   |
    * | --- | --- | --- | --- | --- |
    * | `GL_UNSIGNED_BYTE` | 2 8 \- 1 | 2 8 \- 1 ⁢ c |   |   |
    * | `GL_BYTE` | 2 7 \- 1 | 2 8 \- 1 ⁢ c \- 1 2 |   |   |
    * | `GL_HALF_FLOAT` | none | c |   |   |
    * | `GL_FLOAT` | none | c |   |   |
    * | `GL_UNSIGNED_SHORT_5_6_5` | 2 N \- 1 | 2 N \- 1 ⁢ c |   |   |
    * | `GL_UNSIGNED_SHORT_4_4_4_4` | 2 N \- 1 | 2 N \- 1 ⁢ c |   |   |
    * | `GL_UNSIGNED_SHORT_5_5_5_1` | 2 N \- 1 | 2 N \- 1 ⁢ c |   |   |
    * | `GL_UNSIGNED_INT_2_10_10_10_REV` | 2 N \- 1 | 2 N \- 1 ⁢ c |   |   |
    * | `GL_UNSIGNED_INT_10F_11F_11F_REV` | \-- | Special |   |   |
    * | `GL_UNSIGNED_INT_5_9_9_9_REV` | \-- | Special |   |   |
    * 
    * Return values are placed in memory as follows. If _`format`_ is `GL_RED`, or `GL_RED_INTEGER`, a single value is returned and the data for the ith pixel in the jth row is placed in location j ⁢ width + i . `GL_RG` and `GL_RG_INTEGER` return two values, `GL_RGB` and `GL_RGB_INTEGER` return three values, `GL_RGBA` and `GL_RGBA_INTEGER` return four values for each pixel, with all values corresponding to a single pixel occupying contiguous space in _`data`_. See [glPixelStorei][de.dasbabypixel.gamelauncher.gles.es20.glPixelStorei.glPixelStorei] for a description of parameters which affect the packing of data into memory.
    * 
    * `glReadnPixels` function will only handle the call if _`bufSize`_ is at least of the size required to store the requested data. Otherwise, it will generate a `GL_INVALID_OPERATION` error.
    * 
    * Notes
    * -----
    * 
    * Values for pixels that lie outside the window connected to the current GL context are undefined.
    * 
    * If an error is generated, no change is made to the contents of _`data`_.
    * 
    * Only three _`format`_/_`type`_ parameter pairs are accepted. For normalized fixed point rendering surfaces, `GL_RGBA`/`GL_UNSIGNED_BYTE` is accepted. For signed integer rendering surfaces, `GL_RGBA_INTEGER`/`GL_INT` is accepted. For unsigned integer rendering surfaces, `GL_RGBA_INTEGER`/`GL_UNSIGNED_INT` is accepted. For `GL_RGBA10_A2` rendering surfaces, `GL_RGBA`/`GL_UNSIGNED_INT_2_10_10_10_REV` is accepted. The other acceptable pair can be discovered by querying `GL_IMPLEMENTATION_COLOR_READ_FORMAT` and `GL_IMPLEMENTATION_COLOR_READ_TYPE`. The implementation chosen format may also vary depending on the format of the currently bound rendering surface.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`format`_ or _`type`_ is not an accepted value.
    * 
    * `GL_INVALID_VALUE` is generated if either _`width`_ or _`height`_ is negative.
    * 
    * `GL_INVALID_OPERATION` is generated if a non-zero buffer object name is bound to the `GL_PIXEL_PACK_BUFFER` target and the buffer object's data store is currently mapped.
    * 
    * `GL_INVALID_OPERATION` is generated if a non-zero buffer object name is bound to the `GL_PIXEL_PACK_BUFFER` target and the data would be packed to the buffer object such that the memory writes required would exceed the data store size.
    * 
    * `GL_INVALID_OPERATION` is generated if `GL_READ_BUFFER` is `GL_NONE` or if `GL_READ_FRAMEBUFFER_BINDING` is non-zero and the read buffer selects an attachment that has no image attached.
    * 
    * `GL_INVALID_OPERATION` is generated if `GL_READ_FRAMEBUFFER_BINDING` is non-zero, the read framebuffer is complete, and the value of `GL_SAMPLE_BUFFERS` for the read framebuffer is greater than zero.
    * 
    * `GL_INVALID_OPERATION` is generated if the readbuffer of the currently bound framebuffer is a fixed point normalized surface and _`format`_ and _`type`_ are neither `GL_RGBA` and `GL_UNSIGNED_BYTE`, respectively, nor the format/type pair returned by querying `GL_IMPLEMENTATION_COLOR_READ_FORMAT` and `GL_IMPLEMENTATION_COLOR_READ_TYPE`.
    * 
    * `GL_INVALID_OPERATION` is generated if the readbuffer of the currently bound framebuffer is a floating point surface and _`format`_ and _`type`_ are neither `GL_RGBA` and `GL_FLOAT`, respectively, nor the format/type pair returned by querying `GL_IMPLEMENTATION_COLOR_READ_FORMAT` and `GL_IMPLEMENTATION_COLOR_READ_TYPE`.
    * 
    * `GL_INVALID_OPERATION` is generated if the readbuffer of the currently bound framebuffer is a signed integer surface and _`format`_ and _`type`_ are neither `GL_RGBA_INTEGER` and `GL_INT`, respectively, nor the format/type pair returned by querying `GL_IMPLEMENTATION_COLOR_READ_FORMAT` and `GL_IMPLEMENTATION_COLOR_READ_TYPE`.
    * 
    * `GL_INVALID_OPERATION` is generated if the readbuffer of the currently bound framebuffer is an unsigned integer surface and _`format`_ and _`type`_ are neither `GL_RGBA_INTEGER` and `GL_UNSIGNED_INT`, respectively, nor the format/type pair returned by querying `GL_IMPLEMENTATION_COLOR_READ_FORMAT` and `GL_IMPLEMENTATION_COLOR_READ_TYPE`.
    * 
    * `GL_INVALID_FRAMEBUFFER_OPERATION` is generated if the currently bound framebuffer is not framebuffer complete (i.e. the return value from [glCheckFramebufferStatus][de.dasbabypixel.gamelauncher.gles.es20.glCheckFramebufferStatus.glCheckFramebufferStatus] is not `GL_FRAMEBUFFER_COMPLETE`).
    * 
    * `GL_INVALID_OPERATION` is generated by `glReadnPixels` if the buffer size required to store the requested data is greater than _`bufSize`_.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_PIXEL_PACK_BUFFER_BINDING`
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glReadPixels | ✔ | ✔ | ✔ | ✔ |
    * | glReadnPixels | \- | \- | \- | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glPixelStorei][de.dasbabypixel.gamelauncher.gles.es20.glPixelStorei.glPixelStorei], [glReadBuffer][de.dasbabypixel.gamelauncher.gles.es30.glReadBuffer.glReadBuffer]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glReadPixels.glReadPixels
    * @see de.dasbabypixel.gamelauncher.gles.es32.glReadnPixels.glReadnPixels
    */
    fun glReadPixels(x: Int, y: Int, width: UInt, height: UInt, format: Int, type: Int, data: java.nio.Buffer)
}