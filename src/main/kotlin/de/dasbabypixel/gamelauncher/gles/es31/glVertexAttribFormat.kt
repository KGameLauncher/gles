package de.dasbabypixel.gamelauncher.gles.es31

interface glVertexAttribFormat {
    /**
    * Name
    * ----
    * 
    * glVertexAttribFormat — specify the organization of vertex arrays
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glVertexAttribFormat**(` | GLuint attribindex, |
    * | --- | --- |
    * |   | GLint size, |
    * |   | GLenum type, |
    * |   | GLboolean normalized, |
    * |   | GLuint relativeoffset`)`; |
    * 
    * | `void **glVertexAttribIFormat**(` | GLuint attribindex, |
    * | --- | --- |
    * |   | GLint size, |
    * |   | GLenum type, |
    * |   | GLuint relativeoffset`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`attribindex`_
    * 
    * The generic vertex attribute array being described.
    * 
    * _`size`_
    * 
    * The number of values per vertex that are stored in the array.
    * 
    * _`type`_
    * 
    * The type of the data stored in the array.
    * 
    * _`normalized`_
    * 
    * Specifies whether fixed-point data values should be normalized (`GL_TRUE`) or converted directly as fixed-point values (`GL_FALSE`) when they are accessed. This parameter is ignored if _`type`_ is `GL_FIXED`.
    * 
    * _`relativeoffset`_
    * 
    * An offset to the first element relative to the start of the vertex buffer binding.
    * 
    * Description
    * -----------
    * 
    * `glVertexAttribFormat` and `glVertexAttribIFormat` specify the organization of data in vertex arrays. _`attribindex`_ specifies the index of the generic vertex attribute array whose data layout is being described, and must be less than the value of `GL_MAX_VERTEX_ATTRIBS`.
    * 
    * _`size`_ determines the number of components per vertex are allocated to the specifed attribute and must be 1, 2, 3 or 4. _`type`_ indicates the type of the data. If _`type`_ is one of `GL_BYTE`, `GL_SHORT`, `GL_INT`, `GL_FIXED`, `GL_FLOAT` and `GL_HALF_FLOAT` indicate types `GLbyte`, `GLshort`, `GLint`, `GLfixed`, `GLfloat`, and `GLhalf` respectively; the values `GL_UNSIGNED_BYTE`, `GL_UNSIGNED_SHORT`, and `GL_UNSIGNED_INT` indicate types `GLubyte`, `GLushort`, and `GLuint`, respectively; the values `GL_INT_2_10_10_10_REV` and `GL_UNSIGNED_INT_2_10_10_10_REV` indicating respectively four signed or unsigned elements packed into a single `GLuint`.
    * 
    * For `glVertexAttribFormat`, if _`normalized`_ is `GL_TRUE`, then integer data is normalized to the range \[-1, 1\] or \[0, 1\] if it is signed or unsigned, respectively. If _`normalized`_ is `GL_FALSE` then integer data is directly converted to floating point.
    * 
    * _`relativeoffset`_ is the byte offset of the first element relative to the start of the vertex buffer binding this attribute fetches from.
    * 
    * `glVertexAttribFormat` should be used to describe vertex attribute layout for floating-point vertex attributes and `glVertexAttribIFormat` should be used to describe vertex attribute layout for integer vertex attributes. Data for an array specified by `glVertexAttribIFormat` will always be left as integer values; such data are referred to as pure integers.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`attribindex`_ is greater than or equal to the value of `GL_MAX_VERTEX_ATTRIBS`.
    * 
    * `GL_INVALID_VALUE` is generated if _`size`_ is not one of the accepted values.
    * 
    * `GL_INVALID_VALUE` is generated if _`relativeoffset`_ is greater than the value of `GL_MAX_VERTEX_ATTRIB_RELATIVE_OFFSET`.
    * 
    * `GL_INVALID_ENUM` is generated if _`type`_ is not one of the accepted tokens.
    * 
    * `GL_INVALID_OPERATION` is generated if no vertex array object is bound.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with arguments `GL_MAX_VERTEX_ATTRIB_BINDINGS`, or `GL_MAX_VERTEX_ATTRIB_RELATIVE_OFFSET`.
    * 
    * [glGetVertexAttrib][de.dasbabypixel.gamelauncher.gles.es20.glGetVertexAttribfv.glGetVertexAttribfv] with argument `GL_VERTEX_ATTRIB_RELATIVE_OFFSET`.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glVertexAttribFormat` | \- | \- | ✔ | ✔ |
    * | `glVertexAttribIFormat` | \- | \- | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glBindVertexBuffer][de.dasbabypixel.gamelauncher.gles.es31.glBindVertexBuffer.glBindVertexBuffer], [glVertexAttribBinding][de.dasbabypixel.gamelauncher.gles.es31.glVertexAttribBinding.glVertexAttribBinding], [glVertexAttribPointer][de.dasbabypixel.gamelauncher.gles.es20.glVertexAttribPointer.glVertexAttribPointer], [glVertexBindingDivisor][de.dasbabypixel.gamelauncher.gles.es31.glVertexBindingDivisor.glVertexBindingDivisor], [glVertexAttribPointer][de.dasbabypixel.gamelauncher.gles.es20.glVertexAttribPointer.glVertexAttribPointer].
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2012-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es31.glVertexAttribFormat.glVertexAttribFormat
    * @see de.dasbabypixel.gamelauncher.gles.es31.glVertexAttribIFormat.glVertexAttribIFormat
    */
    fun glVertexAttribFormat(attribindex: UInt, size: Int, type: Int, normalized: Boolean, relativeoffset: UInt)
}