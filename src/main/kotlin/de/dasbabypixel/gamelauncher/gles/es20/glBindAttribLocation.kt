package de.dasbabypixel.gamelauncher.gles.es20

interface glBindAttribLocation {
    /**
    * Name
    * ----
    * 
    * glBindAttribLocation — Associates a generic vertex attribute index with a named attribute variable
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glBindAttribLocation**(` | GLuint program, |
    * | --- | --- |
    * |   | GLuint index, |
    * |   | const GLchar \*name`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`program`_
    * 
    * Specifies the handle of the program object in which the association is to be made.
    * 
    * _`index`_
    * 
    * Specifies the index of the generic vertex attribute to be bound.
    * 
    * _`name`_
    * 
    * Specifies a null terminated string containing the name of the vertex shader attribute variable to which _`index`_ is to be bound.
    * 
    * Description
    * -----------
    * 
    * `glBindAttribLocation` is used to associate a user-defined attribute variable in the program object specified by _`program`_ with a generic vertex attribute index. The name of the user-defined attribute variable is passed as a null terminated string in _`name`_. The generic vertex attribute index to be bound to this variable is specified by _`index`_. When _`program`_ is made part of current state, values provided via the generic vertex attribute _`index`_ will modify the value of the user-defined attribute variable specified by _`name`_.
    * 
    * If _`name`_ refers to a matrix attribute variable, _`index`_ refers to the first column of the matrix. Other matrix columns are then automatically bound to locations _`index+1`_ for a matrix of type `mat2`; _`index+1`_ and _`index+2`_ for a matrix of type `mat3`; and _`index+1`_, _`index+2`_, and _`index+3`_ for a matrix of type `mat4`.
    * 
    * This command makes it possible for vertex shaders to use descriptive names for attribute variables rather than generic variables that are numbered from zero to the value of `GL_MAX_VERTEX_ATTRIBS` minus one. The values sent to each generic attribute index are part of current state. If a different program object is made current by calling [glUseProgram][de.dasbabypixel.gamelauncher.gles.es20.glUseProgram.glUseProgram], the generic vertex attributes are tracked in such a way that the same values will be observed by attributes in the new program object that are also bound to _`index`_.
    * 
    * Attribute variable name-to-generic attribute index bindings for a program object can be explicitly assigned at any time by calling `glBindAttribLocation`. Attribute bindings do not go into effect until [glLinkProgram][de.dasbabypixel.gamelauncher.gles.es20.glLinkProgram.glLinkProgram] is called. After a program object has been linked successfully, the index values for generic attributes remain fixed (and their values can be queried) until the next link command occurs.
    * 
    * Any attribute binding that occurs after the program object has been linked will not take effect until the next time the program object is linked.
    * 
    * Notes
    * -----
    * 
    * `glBindAttribLocation` can be called before any vertex shader objects are bound to the specified program object. It is also permissible to bind a generic attribute index to an attribute variable name that is never used in a vertex shader.
    * 
    * If _`name`_ was bound previously, that information is lost. Thus you cannot bind one user-defined attribute variable to multiple indices, but you can bind multiple user-defined attribute variables to the same index.
    * 
    * Applications are allowed to bind more than one user-defined attribute variable to the same generic vertex attribute index. This is called _aliasing_, and it is allowed only if just one of the aliased attributes is active in the executable program, or if no path through the shader consumes more than one attribute of a set of attributes aliased to the same location. The compiler and linker are allowed to assume that no aliasing is done and are free to employ optimizations that work only in the absence of aliasing. OpenGL implementations are not required to do error checking to detect aliasing.
    * 
    * Active attributes that are not explicitly bound will be bound by the linker when [glLinkProgram][de.dasbabypixel.gamelauncher.gles.es20.glLinkProgram.glLinkProgram] is called. The locations assigned can be queried by calling [glGetAttribLocation][de.dasbabypixel.gamelauncher.gles.es20.glGetAttribLocation.glGetAttribLocation].
    * 
    * OpenGL copies the _`name`_ string when `glBindAttribLocation` is called, so an application may free its copy of the _`name`_ string immediately after the function returns.
    * 
    * Generic attribute locations may be specified in the shader source text using a `location` layout qualifier. In this case, the location of the attribute specified in the shader's source takes precedence and may be queried by calling [glGetAttribLocation][de.dasbabypixel.gamelauncher.gles.es20.glGetAttribLocation.glGetAttribLocation].
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`index`_ is greater than or equal to `GL_MAX_VERTEX_ATTRIBS`.
    * 
    * `GL_INVALID_OPERATION` is generated if _`name`_ starts with the reserved prefix "gl\_".
    * 
    * `GL_INVALID_VALUE` is generated if _`program`_ is not a value generated by OpenGL.
    * 
    * `GL_INVALID_OPERATION` is generated if _`program`_ is not a program object.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_MAX_VERTEX_ATTRIBS`
    * 
    * [glGetActiveAttrib][de.dasbabypixel.gamelauncher.gles.es20.glGetActiveAttrib.glGetActiveAttrib] with argument _`program`_
    * 
    * [glGetAttribLocation][de.dasbabypixel.gamelauncher.gles.es20.glGetAttribLocation.glGetAttribLocation] with arguments _`program`_ and _`name`_
    * 
    * [glIsProgram][de.dasbabypixel.gamelauncher.gles.es20.glIsProgram.glIsProgram]
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glBindAttribLocation | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glDisableVertexAttribArray][de.dasbabypixel.gamelauncher.gles.es20.glEnableVertexAttribArray.glEnableVertexAttribArray], [glEnableVertexAttribArray][de.dasbabypixel.gamelauncher.gles.es20.glEnableVertexAttribArray.glEnableVertexAttribArray], [glUseProgram][de.dasbabypixel.gamelauncher.gles.es20.glUseProgram.glUseProgram], [glVertexAttrib][de.dasbabypixel.gamelauncher.gles.es20.glVertexAttrib1f.glVertexAttrib1f], [glVertexAttribPointer][de.dasbabypixel.gamelauncher.gles.es20.glVertexAttribPointer.glVertexAttribPointer]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2003-2005 3Dlabs Inc. Ltd. Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glBindAttribLocation.glBindAttribLocation
    */
    fun glBindAttribLocation(program: UInt, index: UInt, name: String?)
}