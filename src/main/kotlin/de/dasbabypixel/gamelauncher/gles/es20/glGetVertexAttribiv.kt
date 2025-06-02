package de.dasbabypixel.gamelauncher.gles.es20

interface glGetVertexAttribiv {
    /**
    * Name
    * ----
    * 
    * glGetVertexAttrib — Return a generic vertex attribute parameter
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGetVertexAttribfv**(` | GLuint index, |
    * | --- | --- |
    * |   | GLenum pname, |
    * |   | GLfloat \*params`)`; |
    * 
    * | `void **glGetVertexAttribiv**(` | GLuint index, |
    * | --- | --- |
    * |   | GLenum pname, |
    * |   | GLint \*params`)`; |
    * 
    * | `void **glGetVertexAttribIiv**(` | GLuint index, |
    * | --- | --- |
    * |   | GLenum pname, |
    * |   | GLint \*params`)`; |
    * 
    * | `void **glGetVertexAttribIuiv**(` | GLuint index, |
    * | --- | --- |
    * |   | GLenum pname, |
    * |   | GLuint \*params`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`index`_
    * 
    * Specifies the generic vertex attribute parameter to be queried.
    * 
    * _`pname`_
    * 
    * Specifies the symbolic name of the vertex attribute parameter to be queried. Accepted values are `GL_CURRENT_VERTEX_ATTRIB`, `GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING`, `GL_VERTEX_ATTRIB_ARRAY_ENABLED`, `GL_VERTEX_ATTRIB_ARRAY_SIZE`, `GL_VERTEX_ATTRIB_ARRAY_STRIDE`, `GL_VERTEX_ATTRIB_ARRAY_TYPE`, `GL_VERTEX_ATTRIB_ARRAY_NORMALIZED`, `GL_VERTEX_ATTRIB_ARRAY_INTEGER`, `GL_VERTEX_ATTRIB_ARRAY_DIVISOR`, or `GL_VERTEX_ATTRIB_BINDING`.
    * 
    * _`params`_
    * 
    * Returns the requested data.
    * 
    * Description
    * -----------
    * 
    * `glGetVertexAttrib` returns in _`params`_ the value of a generic vertex attribute parameter. The generic vertex attribute to be queried is specified by _`index`_, and the parameter to be queried is specified by _`pname`_.
    * 
    * The accepted parameter names are as follows:
    * 
    * `GL_CURRENT_VERTEX_ATTRIB`
    * 
    * _`params`_ returns four values that represent the current value for the generic vertex attribute specified by index. The initial value for all generic vertex attributes is (0,0,0,1).
    * 
    * `GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING`
    * 
    * _`params`_ returns a single value, the name of the buffer object currently bound to the binding point corresponding to generic vertex attribute array _`index`_. If no buffer object is bound, 0 is returned. The initial value is 0.
    * 
    * `GL_VERTEX_ATTRIB_ARRAY_ENABLED`
    * 
    * _`params`_ returns a single value that is non-zero (true) if the vertex attribute array for _`index`_ is enabled and 0 (false) if it is disabled. The initial value is `GL_FALSE`.
    * 
    * `GL_VERTEX_ATTRIB_ARRAY_SIZE`
    * 
    * _`params`_ returns a single value, the size of the vertex attribute array for _`index`_. The size is the number of values for each element of the vertex attribute array, and it will be 1, 2, 3, or 4. The initial value is 4.
    * 
    * `GL_VERTEX_ATTRIB_ARRAY_STRIDE`
    * 
    * _`params`_ returns a single value, the array stride for (number of bytes between successive elements in) the vertex attribute array for _`index`_. A value of 0 indicates that the array elements are stored sequentially in memory. The initial value is 0.
    * 
    * `GL_VERTEX_ATTRIB_ARRAY_TYPE`
    * 
    * _`params`_ returns a single value, a symbolic constant indicating the array type for the vertex attribute array for _`index`_. Possible values are `GL_BYTE`, `GL_UNSIGNED_BYTE`, `GL_SHORT`, `GL_UNSIGNED_SHORT`, `GL_INT`, `GL_INT_2_10_10_10_REV`, `GL_UNSIGNED_INT`, `GL_FIXED`, `GL_HALF_FLOAT`, and `GL_FLOAT`. The initial value is `GL_FLOAT`.
    * 
    * `GL_VERTEX_ATTRIB_ARRAY_NORMALIZED`
    * 
    * _`params`_ returns a single value that is non-zero (true) if fixed-point data types for the vertex attribute array indicated by _`index`_ are normalized when they are converted to floating point, and 0 (false) otherwise. The initial value is `GL_FALSE`.
    * 
    * `GL_VERTEX_ATTRIB_ARRAY_INTEGER`
    * 
    * _`params`_ returns a single value that is non-zero (true) if fixed-point data types for the vertex attribute array indicated by _`index`_ have integer data types, and 0 (false) otherwise. The initial value is 0 (`GL_FALSE`).
    * 
    * `GL_VERTEX_ATTRIB_ARRAY_DIVISOR`
    * 
    * _`params`_ returns a single value that is the frequency divisor used for instanced rendering. See [glVertexAttribDivisor][de.dasbabypixel.gamelauncher.gles.es30.glVertexAttribDivisor.glVertexAttribDivisor]. The initial value is 0.
    * 
    * `GL_VERTEX_ATTRIB_BINDING`
    * 
    * _`params`_ returns a single value that is the current vertex buffer binding of the vertex attribute. See [glVertexAttribBinding][de.dasbabypixel.gamelauncher.gles.es31.glVertexAttribBinding.glVertexAttribBinding].
    * 
    * All of the parameters except `GL_CURRENT_VERTEX_ATTRIB` represent state stored in the currently bound vertex array object. If the zero object is bound, these values are client state.
    * 
    * Notes
    * -----
    * 
    * If an error is generated, no change is made to the contents of _`params`_.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`index`_ is greater than or equal to `GL_MAX_VERTEX_ATTRIBS`.
    * 
    * `GL_INVALID_ENUM` is generated if _`pname`_ is not an accepted value.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_MAX_VERTEX_ATTRIBS`
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
    * | `glGetVertexAttribfv` | ✔ | ✔ | ✔ | ✔ |
    * | `glGetVertexAttribiv` | ✔ | ✔ | ✔ | ✔ |
    * | `glGetVertexAttribIiv` | \- | ✔ | ✔ | ✔ |
    * | `glGetVertexAttribIuiv` | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glBindAttribLocation][de.dasbabypixel.gamelauncher.gles.es20.glBindAttribLocation.glBindAttribLocation], [glBindBuffer][de.dasbabypixel.gamelauncher.gles.es20.glBindBuffer.glBindBuffer], [glDisableVertexAttribArray][de.dasbabypixel.gamelauncher.gles.es20.glEnableVertexAttribArray.glEnableVertexAttribArray], [glEnableVertexAttribArray][de.dasbabypixel.gamelauncher.gles.es20.glEnableVertexAttribArray.glEnableVertexAttribArray], [glVertexAttrib][de.dasbabypixel.gamelauncher.gles.es20.glVertexAttrib1f.glVertexAttrib1f], [glVertexAttribDivisor][de.dasbabypixel.gamelauncher.gles.es30.glVertexAttribDivisor.glVertexAttribDivisor], [glVertexAttribPointer][de.dasbabypixel.gamelauncher.gles.es20.glVertexAttribPointer.glVertexAttribPointer]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2003-2005 3Dlabs Inc. Ltd. Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glGetVertexAttribfv.glGetVertexAttribfv
    * @see de.dasbabypixel.gamelauncher.gles.es20.glGetVertexAttribiv.glGetVertexAttribiv
    * @see de.dasbabypixel.gamelauncher.gles.es30.glGetVertexAttribIiv.glGetVertexAttribIiv
    * @see de.dasbabypixel.gamelauncher.gles.es30.glGetVertexAttribIuiv.glGetVertexAttribIuiv
    */
    fun glGetVertexAttribiv(index: UInt, pname: Int, params: de.dasbabypixel.gamelauncher.buffers.IntBuffer)
}