package de.dasbabypixel.gamelauncher.gles.es30

interface glDeleteQueries {
    /**
    * Name
    * ----
    * 
    * glDeleteQueries — delete named query objects
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glDeleteQueries**(` | GLsizei n, |
    * | --- | --- |
    * |   | const GLuint \* ids`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`n`_
    * 
    * Specifies the number of query objects to be deleted.
    * 
    * _`ids`_
    * 
    * Specifies an array of query objects to be deleted.
    * 
    * Description
    * -----------
    * 
    * `glDeleteQueries` deletes _`n`_ query objects named by the elements of the array _`ids`_. After a query object is deleted, its name is again unused. Unused names in _`ids`_ that have been marked as used for the purposes of [glGenQueries][de.dasbabypixel.gamelauncher.gles.es30.glGenQueries.glGenQueries] are marked as unused again. If an active query object is deleted its name immediately becomes unused, but the underlying object is not deleted until it is no longer active.
    * 
    * `glDeleteQueries` silently ignores 0's and names that do not correspond to existing query objects.
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
    * | glDeleteQueries | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glBeginQuery][de.dasbabypixel.gamelauncher.gles.es30.glBeginQuery.glBeginQuery], [glEndQuery][de.dasbabypixel.gamelauncher.gles.es30.glBeginQuery.glBeginQuery], [glGenQueries][de.dasbabypixel.gamelauncher.gles.es30.glGenQueries.glGenQueries], [glGetQueryiv][de.dasbabypixel.gamelauncher.gles.es30.glGetQueryiv.glGetQueryiv], [glGetQueryObjectuiv][de.dasbabypixel.gamelauncher.gles.es30.glGetQueryObjectuiv.glGetQueryObjectuiv]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2005 Addison-Wesley. Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glDeleteQueries.glDeleteQueries
    */
    fun glDeleteQueries(n: UInt, ids: de.dasbabypixel.gamelauncher.buffers.IntBufferRO)
}