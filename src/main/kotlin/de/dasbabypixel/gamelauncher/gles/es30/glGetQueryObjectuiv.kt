package de.dasbabypixel.gamelauncher.gles.es30

interface glGetQueryObjectuiv {
    /**
    * Name
    * ----
    * 
    * glGetQueryObjectuiv — return parameters of a query object
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGetQueryObjectuiv**(` | GLuint id, |
    * | --- | --- |
    * |   | GLenum pname, |
    * |   | GLuint \* params`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`id`_
    * 
    * Specifies the name of a query object.
    * 
    * _`pname`_
    * 
    * Specifies the symbolic name of a query object parameter. Accepted values are `GL_QUERY_RESULT` or `GL_QUERY_RESULT_AVAILABLE`.
    * 
    * _`params`_
    * 
    * Returns the requested data.
    * 
    * Description
    * -----------
    * 
    * `glGetQueryObjectuiv` returns in _`params`_ a selected parameter of the query object specified by _`id`_.
    * 
    * _`pname`_ names a specific query object parameter. _`pname`_ can be as follows:
    * 
    * `GL_QUERY_RESULT`
    * 
    * _`params`_ returns the value of the query object's passed samples counter. The initial value is 0.
    * 
    * `GL_QUERY_RESULT_AVAILABLE`
    * 
    * _`params`_ returns whether the passed samples counter is immediately available. If a delay would occur waiting for the query result, `GL_FALSE` is returned. Otherwise, `GL_TRUE` is returned, which also indicates that the results of all previous queries of the same type are available as well.
    * 
    * Notes
    * -----
    * 
    * If an error is generated, no change is made to the contents of _`params`_.
    * 
    * When _`pname`_ is `GL_QUERY_RESULT`, `glGetQueryObjectuiv` implicitly flushes the GL pipeline so that any incomplete rendering delimited by the occlusion query completes in finite time.
    * 
    * Repeatedly querying the `GL_QUERY_RESULT_AVAILABLE` state for any given query object is guaranteed to return true eventually. Note that multiple queries to the same occlusion object may result in a significant performance loss. For better performance it is recommended to wait N frames before querying this state. N is implementation-dependent but is generally between one and three.
    * 
    * If multiple queries are issued using the same query object _`id`_ before calling `glGetQueryObjectuiv`, the results of the most recent query will be returned. In this case, when issuing a new query, the results of the previous query are discarded.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`pname`_ is not an accepted value.
    * 
    * `GL_INVALID_OPERATION` is generated if _`id`_ is not the name of a query object.
    * 
    * `GL_INVALID_OPERATION` is generated if _`id`_ is the name of a currently active query object.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glGetQueryObjectuiv | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glBeginQuery][de.dasbabypixel.gamelauncher.gles.es30.glBeginQuery.glBeginQuery], [glEndQuery][de.dasbabypixel.gamelauncher.gles.es30.glBeginQuery.glBeginQuery], [glGetQueryiv][de.dasbabypixel.gamelauncher.gles.es30.glGetQueryiv.glGetQueryiv], [glIsQuery][de.dasbabypixel.gamelauncher.gles.es30.glIsQuery.glIsQuery],
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2005 Addison-Wesley. Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glGetQueryObjectuiv.glGetQueryObjectuiv
    */
    fun glGetQueryObjectuiv(id: UInt, pname: Int, params: de.dasbabypixel.gamelauncher.buffers.IntBuffer)
}