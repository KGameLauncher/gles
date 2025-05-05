package de.dasbabypixel.gamelauncher.gles.es30

interface glGenQueries {
    /**
    * Name
    * ----
    * 
    * glGenQueries — generate query object names
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGenQueries**(` | GLsizei n, |
    * | --- | --- |
    * |   | GLuint \* ids`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`n`_
    * 
    * Specifies the number of query object names to be generated.
    * 
    * _`ids`_
    * 
    * Specifies an array in which the generated query object names are stored.
    * 
    * Description
    * -----------
    * 
    * `glGenQueries` returns _`n`_ query object names in _`ids`_. There is no guarantee that the names form a contiguous set of integers; however, it is guaranteed that none of the returned names was in use immediately before the call to `glGenQueries`.
    * 
    * Query object names returned by a call to `glGenQueries` are not returned by subsequent calls, unless they are first deleted with [glDeleteQueries][de.dasbabypixel.gamelauncher.gles.es30.glDeleteQueries.glDeleteQueries].
    * 
    * The names returned in _`ids`_ are marked as used, for the purposes of `glGenQueries` only, but no query objects are associated with the returned query object names until they are first used by calling [glBeginQuery][de.dasbabypixel.gamelauncher.gles.es30.glBeginQuery.glBeginQuery].
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`n`_ is negative.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glIsQuery][de.dasbabypixel.gamelauncher.gles.es30.glIsQuery.glIsQuery]
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glGenQueries | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glBeginQuery][de.dasbabypixel.gamelauncher.gles.es30.glBeginQuery.glBeginQuery], [glDeleteQueries][de.dasbabypixel.gamelauncher.gles.es30.glDeleteQueries.glDeleteQueries], [glEndQuery][de.dasbabypixel.gamelauncher.gles.es30.glBeginQuery.glBeginQuery], [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2005 Addison-Wesley. Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glGenQueries.glGenQueries
    */
    fun glGenQueries(n: UInt, ids: java.nio.IntBuffer)
}