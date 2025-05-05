package de.dasbabypixel.gamelauncher.gles.es30

interface glVertexAttribDivisor {
    /**
    * Name
    * ----
    * 
    * glVertexAttribDivisor — modify the rate at which generic vertex attributes advance during instanced rendering
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glVertexAttribDivisor**(` | GLuint index, |
    * | --- | --- |
    * |   | GLuint divisor`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`index`_
    * 
    * Specify the index of the generic vertex attribute.
    * 
    * _`divisor`_
    * 
    * Specify the number of instances that will pass between updates of the generic attribute at slot _`index`_.
    * 
    * Description
    * -----------
    * 
    * `glVertexAttribDivisor` modifies the rate at which generic vertex attributes advance when rendering multiple instances of primitives in a single draw call (see [glDrawArraysInstanced][de.dasbabypixel.gamelauncher.gles.es30.glDrawArraysInstanced.glDrawArraysInstanced] and [glDrawElementsInstanced][de.dasbabypixel.gamelauncher.gles.es30.glDrawElementsInstanced.glDrawElementsInstanced]). If _`divisor`_ is zero, the attribute at slot _`index`_ advances once per vertex. If _`divisor`_ is non-zero, the attribute advances once per _`divisor`_ instances of the set(s) of vertices being rendered. An attribute is referred to as instanced if its `GL_VERTEX_ATTRIB_ARRAY_DIVISOR` value is non-zero.
    * 
    * _`index`_ must be less than the value of `GL_MAX_VERTEX_ATTRIBUTES`.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`index`_ is greater than or equal to the value of `GL_MAX_VERTEX_ATTRIBUTES`.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glVertexAttribDivisor | \- | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glDrawArraysInstanced][de.dasbabypixel.gamelauncher.gles.es30.glDrawArraysInstanced.glDrawArraysInstanced], [glDrawElementsInstanced][de.dasbabypixel.gamelauncher.gles.es30.glDrawElementsInstanced.glDrawElementsInstanced], [glVertexAttribPointer][de.dasbabypixel.gamelauncher.gles.es20.glVertexAttribPointer.glVertexAttribPointer], [glEnableVertexAttribArray][de.dasbabypixel.gamelauncher.gles.es20.glEnableVertexAttribArray.glEnableVertexAttribArray], [glDisableVertexAttribArray][de.dasbabypixel.gamelauncher.gles.es20.glEnableVertexAttribArray.glEnableVertexAttribArray]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es30.glVertexAttribDivisor.glVertexAttribDivisor
    */
    fun glVertexAttribDivisor(index: UInt, divisor: UInt)
}