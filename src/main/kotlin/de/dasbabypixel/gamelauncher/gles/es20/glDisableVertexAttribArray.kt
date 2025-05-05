package de.dasbabypixel.gamelauncher.gles.es20

interface glDisableVertexAttribArray {
    /**
    * Name
    * ----
    * 
    * glEnableVertexAttribArray — Enable or disable a generic vertex attribute array
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glEnableVertexAttribArray**(` | GLuint index`)`; |
    * | --- | --- |
    * 
    * | `void **glDisableVertexAttribArray**(` | GLuint index`)`; |
    * | --- | --- |
    * 
    * Parameters
    * ----------
    * 
    * _`index`_
    * 
    * Specifies the index of the generic vertex attribute to be enabled or disabled.
    * 
    * Description
    * -----------
    * 
    * `glEnableVertexAttribArray` enables the generic vertex attribute array specified by _`index`_. `glDisableVertexAttribArray` disables the generic vertex attribute array specified by _`index`_. By default, all generic vertex attribute arrays are disabled. If enabled, the values in the generic vertex attribute array will be accessed and used for rendering when calls are made to vertex array commands such as [glDrawArrays][de.dasbabypixel.gamelauncher.gles.es20.glDrawArrays.glDrawArrays], [glDrawArraysInstanced][de.dasbabypixel.gamelauncher.gles.es30.glDrawArraysInstanced.glDrawArraysInstanced], [glDrawElements][de.dasbabypixel.gamelauncher.gles.es20.glDrawElements.glDrawElements], [glDrawElementsInstanced][de.dasbabypixel.gamelauncher.gles.es30.glDrawElementsInstanced.glDrawElementsInstanced], or [glDrawRangeElements][de.dasbabypixel.gamelauncher.gles.es30.glDrawRangeElements.glDrawRangeElements].
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`index`_ is greater than or equal to `GL_MAX_VERTEX_ATTRIBS`.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_MAX_VERTEX_ATTRIBS`
    * 
    * [glGetVertexAttrib][de.dasbabypixel.gamelauncher.gles.es20.glGetVertexAttribfv.glGetVertexAttribfv] with arguments _`index`_ and `GL_VERTEX_ATTRIB_ARRAY_ENABLED`
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
    * | `glEnableVertexAttribArray` | ✔ | ✔ | ✔ | ✔ |
    * | `glDisableVertexAttribArray` | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glBindAttribLocation][de.dasbabypixel.gamelauncher.gles.es20.glBindAttribLocation.glBindAttribLocation], [glDrawArrays][de.dasbabypixel.gamelauncher.gles.es20.glDrawArrays.glDrawArrays], [glDrawArraysInstanced][de.dasbabypixel.gamelauncher.gles.es30.glDrawArraysInstanced.glDrawArraysInstanced], [glDrawElements][de.dasbabypixel.gamelauncher.gles.es20.glDrawElements.glDrawElements], [glDrawElementsInstanced][de.dasbabypixel.gamelauncher.gles.es30.glDrawElementsInstanced.glDrawElementsInstanced], [glDrawRangeElements][de.dasbabypixel.gamelauncher.gles.es30.glDrawRangeElements.glDrawRangeElements], [glVertexAttrib][de.dasbabypixel.gamelauncher.gles.es20.glVertexAttrib1f.glVertexAttrib1f], [glVertexAttribPointer][de.dasbabypixel.gamelauncher.gles.es20.glVertexAttribPointer.glVertexAttribPointer]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2003-2005 3Dlabs Inc. Ltd. Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glEnableVertexAttribArray.glEnableVertexAttribArray
    * @see de.dasbabypixel.gamelauncher.gles.es20.glDisableVertexAttribArray.glDisableVertexAttribArray
    */
    fun glDisableVertexAttribArray(index: UInt)
}