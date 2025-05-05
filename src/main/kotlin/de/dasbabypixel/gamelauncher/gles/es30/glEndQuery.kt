package de.dasbabypixel.gamelauncher.gles.es30

interface glEndQuery {
    /**
    * Name
    * ----
    * 
    * glBeginQuery — delimit the boundaries of a query object
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glBeginQuery**(` | GLenum target, |
    * | --- | --- |
    * |   | GLuint id`)`; |
    * 
    * | `void **glEndQuery**(` | GLenum target`)`; |
    * | --- | --- |
    * 
    * Parameters for `glBeginQuery`
    * -----------------------------
    * 
    * _`target`_
    * 
    * Specifies the target type of query object established between `glBeginQuery` and the subsequent `glEndQuery`. The symbolic constant must be one of `GL_ANY_SAMPLES_PASSED`, `GL_ANY_SAMPLES_PASSED_CONSERVATIVE`, `GL_PRIMITIVES_GENERATED`, or `GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN`.
    * 
    * _`id`_
    * 
    * Specifies the name of a query object.
    * 
    * Parameters for `glEndQuery`
    * ---------------------------
    * 
    * _`target`_
    * 
    * Specifies the target type of query object to be concluded. The symbolic constant must be one of `GL_ANY_SAMPLES_PASSED`, `GL_ANY_SAMPLES_PASSED_CONSERVATIVE`, `GL_PRIMITIVES_GENERATED`, or `GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN`.
    * 
    * Description
    * -----------
    * 
    * `glBeginQuery` and [glEndQuery][de.dasbabypixel.gamelauncher.gles.es30.glBeginQuery.glBeginQuery] delimit the boundaries of a query object. _`query`_ must be a name previously returned from a call to [glGenQueries][de.dasbabypixel.gamelauncher.gles.es30.glGenQueries.glGenQueries]. If a query object with name _`id`_ does not yet exist it is created with the type determined by _`target`_. _`target`_ must be one of `GL_ANY_SAMPLES_PASSED`, `GL_ANY_SAMPLES_PASSED_CONSERVATIVE`, `GL_PRIMITIVES_GENERATED`, or `GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN`. The behavior of the query object depends on its type and is as follows.
    * 
    * If _`target`_ is `GL_ANY_SAMPLES_PASSED`, _`id`_ must be an unused name, or the name of an existing boolean occlusion query object. When `glBeginQuery` is executed, the query object's samples-passed flag is reset to `GL_FALSE`. Subsequent rendering causes the flag to be set to `GL_TRUE` if any sample passes the depth test. When `glEndQuery` is executed, the samples-passed flag is assigned to the query object's result value. This value can be queried by calling [glGetQueryObjectuiv][de.dasbabypixel.gamelauncher.gles.es30.glGetQueryObjectuiv.glGetQueryObjectuiv] with _`pname`_ `GL_QUERY_RESULT`.
    * 
    * If _`target`_ is `GL_ANY_SAMPLES_PASSED_CONSERVATIVE`, _`id`_ must be an unused name, or the name of an existing boolean occlusion query object. When `glBeginQuery` is executed, the query object's samples-passed flag is reset to `GL_FALSE`. Subsequent rendering causes the flag to be set to `GL_TRUE` if any sample passes the depth test. The implementation may choose to use a less precision version of the test, which can additionally set the samples-passed flag to `GL_TRUE` in some other implementation-dependent cases. When `glEndQuery` is executed, the samples-passed flag is assigned to the query object's result value. This value can be queried by calling [glGetQueryObjectuiv][de.dasbabypixel.gamelauncher.gles.es30.glGetQueryObjectuiv.glGetQueryObjectuiv] with _`pname`_ `GL_QUERY_RESULT`.
    * 
    * If _`target`_ is `GL_PRIMITIVES_GENERATED`, _`id`_ must be an unused name, or the name of an existing primitive query object. When `glBeginQuery` is executed, the query object's primitives-generated counter is reset to 0. Subsequent rendering will increment the counter once for every vertex that is emitted from the geometry shader, or from the vertex shader if no geometry shader is present. When `glEndQuery` is executed, the primitives-generated counter is assigned to the query object's result value. This value can be queried by calling [glGetQueryObject](glGetQueryObject.xhtml) with _`pname`_ `GL_QUERY_RESULT`.
    * 
    * If _`target`_ is `GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN`, _`id`_ must be an unused name, or the name of an existing primitive query object previously bound to the `GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN` query binding. When `glBeginQuery` is executed, the query object's primitives-written counter is reset to 0. Subsequent rendering will increment the counter once for every vertex that is written into the bound transform feedback buffer(s). If transform feedback mode is not activated between the call to `glBeginQuery` and `glEndQuery`, the counter will not be incremented. When `glEndQuery` is executed, the primitives-written counter is assigned to the query object's result value. This value can be queried by calling [glGetQueryObjectuiv][de.dasbabypixel.gamelauncher.gles.es30.glGetQueryObjectuiv.glGetQueryObjectuiv] with _`pname`_ `GL_QUERY_RESULT`.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`target`_ is not one of the accepted tokens.
    * 
    * `GL_INVALID_OPERATION` is generated if `glBeginQuery` is executed while a query object of the same _`target`_ is already active. Note: `GL_ANY_SAMPLES_PASSED` and `GL_ANY_SAMPLES_PASSED_CONSERVATIVE` alias to the same target for the purposes of this error.
    * 
    * `GL_INVALID_OPERATION` is generated if `glEndQuery` is executed when a query object of the same _`target`_ is not active.
    * 
    * `GL_INVALID_OPERATION` is generated if _`id`_ is 0.
    * 
    * `GL_INVALID_OPERATION` is generated if _`id`_ not a name returned from a previous call to `glGenQueries`, or if such a name has since been deleted with `glDeleteQueries`.
    * 
    * `GL_INVALID_OPERATION` is generated if _`id`_ is the name of an already active query object.
    * 
    * `GL_INVALID_OPERATION` is generated if _`id`_ refers to an existing query object whose type does not does not match _`target`_.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glBeginQuery` | \- | ✔ | ✔ | ✔ |
    * | `glEndQuery` | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glDeleteQueries][de.dasbabypixel.gamelauncher.gles.es30.glDeleteQueries.glDeleteQueries], [glGenQueries][de.dasbabypixel.gamelauncher.gles.es30.glGenQueries.glGenQueries], [glGetQueryiv][de.dasbabypixel.gamelauncher.gles.es30.glGetQueryiv.glGetQueryiv], [glGetQueryObjectuiv][de.dasbabypixel.gamelauncher.gles.es30.glGetQueryObjectuiv.glGetQueryObjectuiv], [glIsQuery][de.dasbabypixel.gamelauncher.gles.es30.glIsQuery.glIsQuery]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2005 Addison-Wesley. Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glBeginQuery.glBeginQuery
    * @see de.dasbabypixel.gamelauncher.gles.es30.glEndQuery.glEndQuery
    */
    fun glEndQuery(target: Int)
}