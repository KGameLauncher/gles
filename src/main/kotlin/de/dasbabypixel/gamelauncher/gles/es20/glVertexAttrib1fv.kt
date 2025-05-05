package de.dasbabypixel.gamelauncher.gles.es20

interface glVertexAttrib1fv {
    /**
    * Name
    * ----
    * 
    * glVertexAttrib — Specifies the value of a generic vertex attribute
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glVertexAttrib1f**(` | GLuint index, |
    * | --- | --- |
    * |   | GLfloat v0`)`; |
    * 
    * | `void **glVertexAttrib2f**(` | GLuint index, |
    * | --- | --- |
    * |   | GLfloat v0, |
    * |   | GLfloat v1`)`; |
    * 
    * | `void **glVertexAttrib3f**(` | GLuint index, |
    * | --- | --- |
    * |   | GLfloat v0, |
    * |   | GLfloat v1, |
    * |   | GLfloat v2`)`; |
    * 
    * | `void **glVertexAttrib4f**(` | GLuint index, |
    * | --- | --- |
    * |   | GLfloat v0, |
    * |   | GLfloat v1, |
    * |   | GLfloat v2, |
    * |   | GLfloat v3`)`; |
    * 
    * | `void **glVertexAttribI4i**(` | GLuint index, |
    * | --- | --- |
    * |   | GLint v0, |
    * |   | GLint v1, |
    * |   | GLint v2, |
    * |   | GLint v3`)`; |
    * 
    * | `void **glVertexAttribI4ui**(` | GLuint index, |
    * | --- | --- |
    * |   | GLuint v0, |
    * |   | GLuint v1, |
    * |   | GLuint v2, |
    * |   | GLuint v3`)`; |
    * 
    * | `void **glVertexAttrib1fv**(` | GLuint index, |
    * | --- | --- |
    * |   | const GLfloat \*v`)`; |
    * 
    * | `void **glVertexAttrib2fv**(` | GLuint index, |
    * | --- | --- |
    * |   | const GLfloat \*v`)`; |
    * 
    * | `void **glVertexAttrib3fv**(` | GLuint index, |
    * | --- | --- |
    * |   | const GLfloat \*v`)`; |
    * 
    * | `void **glVertexAttrib4fv**(` | GLuint index, |
    * | --- | --- |
    * |   | const GLfloat \*v`)`; |
    * 
    * | `void **glVertexAttribI4iv**(` | GLuint index, |
    * | --- | --- |
    * |   | const GLint \*v`)`; |
    * 
    * | `void **glVertexAttribI4uiv**(` | GLuint index, |
    * | --- | --- |
    * |   | const GLuint \*v`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`index`_
    * 
    * Specifies the index of the generic vertex attribute to be modified.
    * 
    * _`v0`_, _`v1`_, _`v2`_, _`v3`_
    * 
    * For the scalar commands, specifies the new values to be used for the specified vertex attribute.
    * 
    * _`v`_
    * 
    * For the vector commands (`glVertexAttrib*v`), specifies a pointer to an array of values to be used for the generic vertex attribute.
    * 
    * Description
    * -----------
    * 
    * The `glVertexAttrib` family of entry points allows an application to pass generic vertex attributes in numbered locations.
    * 
    * Generic attributes are defined as four-component values that are organized into an array. The first entry of this array is numbered 0, and the size of the array is specified by the implementation-dependent constant `GL_MAX_VERTEX_ATTRIBS`. Individual elements of this array can be modified with a `glVertexAttrib` call that specifies the index of the element to be modified and a value for that element.
    * 
    * These commands can be used to specify one, two, three, or all four components of the generic vertex attribute specified by _`index`_. A `1` in the name of the command indicates that only one value is passed, and it will be used to modify the first component of the generic vertex attribute. The second and third components will be set to 0, and the fourth component will be set to 1. Similarly, a `2` in the name of the command indicates that values are provided for the first two components, the third component will be set to 0, and the fourth component will be set to 1. A `3` in the name of the command indicates that values are provided for the first three components and the fourth component will be set to 1, whereas a `4` in the name indicates that values are provided for all four components.
    * 
    * The letters `f`, `i`, and `ui` indicate whether the arguments are of type float, int, or unsigned int. When `v` is appended to the name, the commands can take a pointer to an array of such values.
    * 
    * Additional capitalized letters can indicate further alterations to the default behavior of the glVertexAttrib function:
    * 
    * The commands containing `I` indicate that the arguments are extended to full signed or unsigned integers.
    * 
    * OpenGL ES Shading Language attribute variables are allowed to be of type mat2, mat3, or mat4. Attributes of these types may be loaded using the `glVertexAttrib` entry points. Matrices must be loaded into successive generic attribute slots in column major order, with one column of the matrix in each generic attribute slot.
    * 
    * A user-defined attribute variable declared in a vertex shader can be bound to a generic attribute index by calling [glBindAttribLocation][de.dasbabypixel.gamelauncher.gles.es20.glBindAttribLocation.glBindAttribLocation]. This allows an application to use more descriptive variable names in a vertex shader. A subsequent change to the specified generic vertex attribute will be immediately reflected as a change to the corresponding attribute variable in the vertex shader.
    * 
    * The binding between a generic vertex attribute index and a user-defined attribute variable in a vertex shader is part of the state of a program object, but the current value of the generic vertex attribute is not. The value of each generic vertex attribute is part of current state, and it is maintained even if a different program object is used.
    * 
    * An application may freely modify generic vertex attributes that are not bound to a named vertex shader attribute variable. These values are simply maintained as part of current state and will not be accessed by the vertex shader. If a generic vertex attribute bound to an attribute variable in a vertex shader is not updated while the vertex shader is executing, the vertex shader will repeatedly use the current value for the generic vertex attribute.
    * 
    * Notes
    * -----
    * 
    * Generic vertex attributes can be updated at any time.
    * 
    * It is possible for an application to bind more than one attribute name to the same generic vertex attribute index. This is referred to as aliasing, and it is allowed only if just one of the aliased attribute variables is active in the vertex shader, or if no path through the vertex shader consumes more than one of the attributes aliased to the same location. OpenGL implementations are not required to do error checking to detect aliasing, they are allowed to assume that aliasing will not occur, and they are allowed to employ optimizations that work only in the absence of aliasing.
    * 
    * The resulting attribute values are undefined if the base type of the shader attribute at slot _`index`_ does not match the type of glUniform command used. If the attribute is floating point, the `glUniform*f[v]` commands should be used. If the attribute is unsigned integer, the `glUniformI4ui*` commands should be used. If the attribute is a signed integer, the `glUniformI4i*` commands should be used.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`index`_ is greater than or equal to `GL_MAX_VERTEX_ATTRIBS`.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with the argument `GL_CURRENT_PROGRAM`
    * 
    * [glGetActiveAttrib][de.dasbabypixel.gamelauncher.gles.es20.glGetActiveAttrib.glGetActiveAttrib] with argument _`program`_ and the index of an active attribute variable
    * 
    * [glGetAttribLocation][de.dasbabypixel.gamelauncher.gles.es20.glGetAttribLocation.glGetAttribLocation] with argument _`program`_ and an attribute variable name
    * 
    * [glGetVertexAttrib][de.dasbabypixel.gamelauncher.gles.es20.glGetVertexAttribfv.glGetVertexAttribfv] with arguments `GL_CURRENT_VERTEX_ATTRIB` and _`index`_
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glVertexAttrib1f` | ✔ | ✔ | ✔ | ✔ |
    * | `glVertexAttrib2f` | ✔ | ✔ | ✔ | ✔ |
    * | `glVertexAttrib3f` | ✔ | ✔ | ✔ | ✔ |
    * | `glVertexAttrib4f` | ✔ | ✔ | ✔ | ✔ |
    * | `glVertexAttribI4i` | \- | ✔ | ✔ | ✔ |
    * | `glVertexAttribI4ui` | \- | ✔ | ✔ | ✔ |
    * | `glVertexAttrib1fv` | ✔ | ✔ | ✔ | ✔ |
    * | `glVertexAttrib2fv` | ✔ | ✔ | ✔ | ✔ |
    * | `glVertexAttrib3fv` | ✔ | ✔ | ✔ | ✔ |
    * | `glVertexAttrib4fv` | ✔ | ✔ | ✔ | ✔ |
    * | `glVertexAttribI4iv` | \- | ✔ | ✔ | ✔ |
    * | `glVertexAttribI4uiv` | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glBindAttribLocation][de.dasbabypixel.gamelauncher.gles.es20.glBindAttribLocation.glBindAttribLocation], [glVertexAttribPointer][de.dasbabypixel.gamelauncher.gles.es20.glVertexAttribPointer.glVertexAttribPointer]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2003-2005 3Dlabs Inc. Ltd. Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glVertexAttrib1f.glVertexAttrib1f
    * @see de.dasbabypixel.gamelauncher.gles.es20.glVertexAttrib2f.glVertexAttrib2f
    * @see de.dasbabypixel.gamelauncher.gles.es20.glVertexAttrib3f.glVertexAttrib3f
    * @see de.dasbabypixel.gamelauncher.gles.es20.glVertexAttrib4f.glVertexAttrib4f
    * @see de.dasbabypixel.gamelauncher.gles.es30.glVertexAttribI4i.glVertexAttribI4i
    * @see de.dasbabypixel.gamelauncher.gles.es30.glVertexAttribI4ui.glVertexAttribI4ui
    * @see de.dasbabypixel.gamelauncher.gles.es20.glVertexAttrib1fv.glVertexAttrib1fv
    * @see de.dasbabypixel.gamelauncher.gles.es20.glVertexAttrib2fv.glVertexAttrib2fv
    * @see de.dasbabypixel.gamelauncher.gles.es20.glVertexAttrib3fv.glVertexAttrib3fv
    * @see de.dasbabypixel.gamelauncher.gles.es20.glVertexAttrib4fv.glVertexAttrib4fv
    * @see de.dasbabypixel.gamelauncher.gles.es30.glVertexAttribI4iv.glVertexAttribI4iv
    * @see de.dasbabypixel.gamelauncher.gles.es30.glVertexAttribI4uiv.glVertexAttribI4uiv
    */
    fun glVertexAttrib1fv(index: UInt, v: java.nio.FloatBuffer)
}