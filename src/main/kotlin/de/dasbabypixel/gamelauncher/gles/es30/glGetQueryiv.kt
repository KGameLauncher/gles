package de.dasbabypixel.gamelauncher.gles.es30

interface glGetQueryiv {
    /**
    * Name
    * ----
    * 
    * glGetQueryiv — return parameters of a query object target
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGetQueryiv**(` | GLenum target, |
    * | --- | --- |
    * |   | GLenum pname, |
    * |   | GLint \* params`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`target`_
    * 
    * Specifies a query object target. Must be `GL_ANY_SAMPLES_PASSED`, `GL_ANY_SAMPLES_PASSED_CONSERVATIVE`, `GL_PRIMITIVES_GENERATED`, or `GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN`.
    * 
    * _`pname`_
    * 
    * Specifies the symbolic name of a query object target parameter. Must be `GL_CURRENT_QUERY`.
    * 
    * _`params`_
    * 
    * Returns the requested data.
    * 
    * Description
    * -----------
    * 
    * `glGetQueryiv` returns in _`params`_ a selected parameter of the query object target specified by _`target`_.
    * 
    * _`pname`_ names a specific query object target parameter. When _`pname`_ is `GL_CURRENT_QUERY`, the name of the currently active query for _`target`_, or zero if no query is active, will be placed in _`params`_.
    * 
    * Notes
    * -----
    * 
    * If an error is generated, no change is made to the contents of _`params`_.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`target`_ or _`pname`_ is not an accepted value.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glGetQueryiv | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glGetQueryObjectuiv][de.dasbabypixel.gamelauncher.gles.es30.glGetQueryObjectuiv.glGetQueryObjectuiv], [glIsQuery][de.dasbabypixel.gamelauncher.gles.es30.glIsQuery.glIsQuery]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2005 Addison-Wesley. Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glGetQueryiv.glGetQueryiv
    */
    fun glGetQueryiv(target: Int, pname: Int, params: java.nio.IntBuffer)
}