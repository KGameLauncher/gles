package de.dasbabypixel.gamelauncher.gles.es32

interface glGetObjectPtrLabel {
    /**
    * Name
    * ----
    * 
    * glGetObjectPtrLabel — retrieve the label of a sync object identified by a pointer
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glGetObjectPtrLabel**(` | void \* ptr, |
    * | --- | --- |
    * |   | GLsizei bifSize, |
    * |   | GLsizei \* length, |
    * |   | char \* label`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`ptr`_
    * 
    * The name of the sync object whose label to retrieve.
    * 
    * _`bufSize`_
    * 
    * The length of the buffer whose address is in _`label`_.
    * 
    * _`length`_
    * 
    * The address of a variable to receive the length of the object label.
    * 
    * _`label`_
    * 
    * The address of a string that will receive the object label.
    * 
    * Description
    * -----------
    * 
    * `glGetObjectPtrLabel` retrieves the label of the sync object identified by _`ptr`_.
    * 
    * _`label`_ is the address of a string that will be used to store the object label. _`bufSize`_ specifies the number of characters in the array identified by _`label`_. _`length`_ contains the address of a variable which will receive the number of characters in the object label. If _`length`_ is NULL, then it is ignored and no data is written. Likewise, if _`label`_ is NULL, or if _`bufSize`_ is zero then no data is written to _`label`_.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`identifier`_ is not one of the accepted object types.
    * 
    * `GL_INVALID_VALUE` is generated if _`ptr`_ is not the name of an existing sync object.
    * 
    * `GL_INVALID_VALUE` is generated if _`bufSize`_ is zero.
    * 
    * If not NULL, _`length`_ and _`label`_ should be addresses to which the client has write access, otherwise undefined behavior, including process termination may occur.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_MAX_LABEL_LENGTH`.
    * 
    * Version Support
    * ---------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glGetObjectPtrLabel` | \- | \- | \- | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glPushDebugGroup][de.dasbabypixel.gamelauncher.gles.es32.glPushDebugGroup.glPushDebugGroup], [glPopDebugGroup][de.dasbabypixel.gamelauncher.gles.es32.glPopDebugGroup.glPopDebugGroup], [glObjectLabel][de.dasbabypixel.gamelauncher.gles.es32.glObjectLabel.glObjectLabel], [glGetObjectLabel][de.dasbabypixel.gamelauncher.gles.es32.glGetObjectLabel.glGetObjectLabel].
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2013-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es32.glGetObjectPtrLabel.glGetObjectPtrLabel
    */
    fun glGetObjectPtrLabel(ptr: Long, bifSize: UInt, length: java.nio.IntBuffer, label: String)
}