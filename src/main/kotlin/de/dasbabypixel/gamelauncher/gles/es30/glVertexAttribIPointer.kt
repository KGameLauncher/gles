package de.dasbabypixel.gamelauncher.gles.es30

interface glVertexAttribIPointer {
    /**
    * Name
    * ----
    * 
    * glVertexAttribPointer — define an array of generic vertex attribute data
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glVertexAttribPointer**(` | GLuint index, |
    * | --- | --- |
    * |   | GLint size, |
    * |   | GLenum type, |
    * |   | GLboolean normalized, |
    * |   | GLsizei stride, |
    * |   | const void \* pointer`)`; |
    * 
    * | `void **glVertexAttribIPointer**(` | GLuint index, |
    * | --- | --- |
    * |   | GLint size, |
    * |   | GLenum type, |
    * |   | GLsizei stride, |
    * |   | const void \* pointer`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`index`_
    * 
    * Specifies the index of the generic vertex attribute to be modified.
    * 
    * _`size`_
    * 
    * Specifies the number of components per generic vertex attribute. Must be 1, 2, 3, 4. The initial value is 4.
    * 
    * _`type`_
    * 
    * Specifies the data type of each component in the array. The symbolic constants `GL_BYTE`, `GL_UNSIGNED_BYTE`, `GL_SHORT`, `GL_UNSIGNED_SHORT`, `GL_INT`, and `GL_UNSIGNED_INT` are accepted by both functions. Additionally `GL_HALF_FLOAT`, `GL_FLOAT`, `GL_FIXED`, `GL_INT_2_10_10_10_REV`, and `GL_UNSIGNED_INT_2_10_10_10_REV` are accepted by `glVertexAttribPointer`. The initial value is `GL_FLOAT`.
    * 
    * _`normalized`_
    * 
    * For `glVertexAttribPointer`, specifies whether fixed-point data values should be normalized (`GL_TRUE`) or converted directly as fixed-point values (`GL_FALSE`) when they are accessed. This parameter is ignored if _`type`_ is `GL_FIXED`.
    * 
    * _`stride`_
    * 
    * Specifies the byte offset between consecutive generic vertex attributes. If _`stride`_ is 0, the generic vertex attributes are understood to be tightly packed in the array. The initial value is 0.
    * 
    * _`pointer`_
    * 
    * Specifies a pointer to the first generic vertex attribute in the array. If a non-zero buffer is currently bound to the `GL_ARRAY_BUFFER` target, _`pointer`_ specifies an offset of into the array in the data store of that buffer. The initial value is 0.
    * 
    * Description
    * -----------
    * 
    * `glVertexAttribPointer` and `glVertexAttribIPointer` specify the location and data format of the array of generic vertex attributes at index _`index`_ to use when rendering. _`size`_ specifies the number of components per attribute and must be 1, 2, 3 or 4. _`type`_ specifies the data type of each component, and _`stride`_ specifies the byte stride from one attribute to the next, allowing vertices and attributes to be packed into a single array or stored in separate arrays.
    * 
    * For `glVertexAttribPointer`, if _`normalized`_ is set to `GL_TRUE`, it indicates that values stored in an integer format are to be mapped to the range \[-1,1\] (for signed values) or \[0,1\] (for unsigned values) when they are accessed and converted to floating point. Otherwise, values will be converted to floats directly without normalization.
    * 
    * For `glVertexAttribIPointer`, only the integer types `GL_BYTE`, `GL_UNSIGNED_BYTE`, `GL_SHORT`, `GL_UNSIGNED_SHORT`, `GL_INT`, `GL_UNSIGNED_INT` are accepted. Values are always left as integer values.
    * 
    * If a non-zero named buffer object is bound to the `GL_ARRAY_BUFFER` target (see [glBindBuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindBuffer.glBindBuffer]), _`pointer`_ is treated as a byte offset into the buffer object's data store and the buffer object binding (`GL_ARRAY_BUFFER_BINDING`) is saved as generic vertex attribute array state (`GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING`) for index _`index`_.
    * 
    * Client vertex arrays (a binding of zero to the `GL_ARRAY_BUFFER` target) are only valid in conjunction with the zero named vertex array object. This is provided for backwards compatibility with OpenGL ES 2.0.
    * 
    * When a generic vertex attribute array is specified, _`size`_, _`type`_, _`normalized`_, _`stride`_, and _`pointer`_ are saved as vertex array state, in addition to the current vertex array buffer object binding.
    * 
    * To enable and disable a generic vertex attribute array, call [glEnableVertexAttribArray][de.dasbabypixel.gamelauncher.gles.es20.glEnableVertexAttribArray.glEnableVertexAttribArray] and [glDisableVertexAttribArray][de.dasbabypixel.gamelauncher.gles.es20.glEnableVertexAttribArray.glEnableVertexAttribArray] with _`index`_. If enabled, the generic vertex attribute array is used when [glDrawArrays][de.dasbabypixel.gamelauncher.gles.es20.glDrawArrays.glDrawArrays], [glDrawArraysInstanced][de.dasbabypixel.gamelauncher.gles.es30.glDrawArraysInstanced.glDrawArraysInstanced], [glDrawElements][de.dasbabypixel.gamelauncher.gles.es20.glDrawElements.glDrawElements], [glDrawElementsIntanced](glDrawElementsIntanced.xhtml), or [glDrawRangeElements][de.dasbabypixel.gamelauncher.gles.es30.glDrawRangeElements.glDrawRangeElements] is called.
    * 
    * Notes
    * -----
    * 
    * Each generic vertex attribute array is initially disabled and isn't accessed when [glDrawElements][de.dasbabypixel.gamelauncher.gles.es20.glDrawElements.glDrawElements], [glDrawRangeElements][de.dasbabypixel.gamelauncher.gles.es30.glDrawRangeElements.glDrawRangeElements], [glDrawArrays][de.dasbabypixel.gamelauncher.gles.es20.glDrawArrays.glDrawArrays], [glDrawArraysInstanced][de.dasbabypixel.gamelauncher.gles.es30.glDrawArraysInstanced.glDrawArraysInstanced], or [glDrawElementsInstanced][de.dasbabypixel.gamelauncher.gles.es30.glDrawElementsInstanced.glDrawElementsInstanced] is called.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`index`_ is greater than or equal to `GL_MAX_VERTEX_ATTRIBS`.
    * 
    * `GL_INVALID_VALUE` is generated if _`size`_ is not 1, 2, 3 or 4.
    * 
    * `GL_INVALID_ENUM` is generated if _`type`_ is not an accepted value.
    * 
    * `GL_INVALID_VALUE` is generated if _`stride`_ is negative.
    * 
    * `GL_INVALID_OPERATION` is generated if _`type`_ is `GL_INT_2_10_10_10_REV` or `GL_UNSIGNED_INT_2_10_10_10_REV` and _`size`_ is not 4.
    * 
    * `GL_INVALID_OPERATION` is generated a non-zero vertex array object is bound, zero is bound to the `GL_ARRAY_BUFFER` buffer object binding point and the _`pointer`_ argument is not `NULL`.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_MAX_VERTEX_ATTRIBS`
    * 
    * [glGetVertexAttrib][de.dasbabypixel.gamelauncher.gles.es20.glGetVertexAttribfv.glGetVertexAttribfv] with arguments _`index`_ and `GL_VERTEX_ATTRIB_ARRAY_ENABLED`
    * 
    * [glGetVertexAttrib][de.dasbabypixel.gamelauncher.gles.es20.glGetVertexAttribfv.glGetVertexAttribfv] with arguments _`index`_ and `GL_VERTEX_ATTRIB_ARRAY_SIZE`
    * 
    * [glGetVertexAttrib][de.dasbabypixel.gamelauncher.gles.es20.glGetVertexAttribfv.glGetVertexAttribfv] with arguments _`index`_ and `GL_VERTEX_ATTRIB_ARRAY_TYPE`
    * 
    * [glGetVertexAttrib][de.dasbabypixel.gamelauncher.gles.es20.glGetVertexAttribfv.glGetVertexAttribfv] with arguments _`index`_ and `GL_VERTEX_ATTRIB_ARRAY_NORMALIZED`
    * 
    * [glGetVertexAttrib][de.dasbabypixel.gamelauncher.gles.es20.glGetVertexAttribfv.glGetVertexAttribfv] with arguments _`index`_ and `GL_VERTEX_ATTRIB_ARRAY_STRIDE`
    * 
    * [glGetVertexAttrib][de.dasbabypixel.gamelauncher.gles.es20.glGetVertexAttribfv.glGetVertexAttribfv] with arguments _`index`_ and `GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING`
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_ARRAY_BUFFER_BINDING`
    * 
    * [glGetVertexAttribPointerv][de.dasbabypixel.gamelauncher.gles.es20.glGetVertexAttribPointerv.glGetVertexAttribPointerv] with arguments _`index`_ and `GL_VERTEX_ATTRIB_ARRAY_POINTER`
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glVertexAttribPointer` | ✔ | ✔ | ✔ | ✔ |
    * | `glVertexAttribIPointer` | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glBindAttribLocation][de.dasbabypixel.gamelauncher.gles.es20.glBindAttribLocation.glBindAttribLocation], [glBindBuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindBuffer.glBindBuffer], [glDisableVertexAttribArray][de.dasbabypixel.gamelauncher.gles.es20.glEnableVertexAttribArray.glEnableVertexAttribArray], [glDrawArrays][de.dasbabypixel.gamelauncher.gles.es20.glDrawArrays.glDrawArrays], [glDrawElements][de.dasbabypixel.gamelauncher.gles.es20.glDrawElements.glDrawElements], [glDrawRangeElements][de.dasbabypixel.gamelauncher.gles.es30.glDrawRangeElements.glDrawRangeElements], [glEnableVertexAttribArray][de.dasbabypixel.gamelauncher.gles.es20.glEnableVertexAttribArray.glEnableVertexAttribArray], [glDrawArraysInstanced][de.dasbabypixel.gamelauncher.gles.es30.glDrawArraysInstanced.glDrawArraysInstanced], [glDrawElementsIntanced](glDrawElementsIntanced.xhtml), [glVertexAttrib][de.dasbabypixel.gamelauncher.gles.es20.glVertexAttrib1f.glVertexAttrib1f]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2003-2005 3Dlabs Inc. Ltd. Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glVertexAttribPointer.glVertexAttribPointer
    * @see de.dasbabypixel.gamelauncher.gles.es30.glVertexAttribIPointer.glVertexAttribIPointer
    */
    fun glVertexAttribIPointer(index: UInt, size: Int, type: Int, stride: UInt, pointer: Long)
}