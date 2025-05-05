package de.dasbabypixel.gamelauncher.gles.es32

interface glPatchParameteri {
    /**
    * Name
    * ----
    * 
    * glPatchParameteri — specifies the parameters for patch primitives
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glPatchParameteri**(` | GLenum pname, |
    * | --- | --- |
    * |   | GLint value`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`pname`_
    * 
    * Specifies the name of the parameter to set. The symbolc constants `GL_PATCH_VERTICES` is accepted.
    * 
    * _`value`_
    * 
    * Specifies the new value for the parameter given by _`pname`_.
    * 
    * _`values`_
    * 
    * Specifies the address of an array containing the new values for the parameter given by _`pname`_.
    * 
    * Description
    * -----------
    * 
    * `glPatchParameteri` specifies the parameters that will be used for patch primitives. _`pname`_ specifies the parameter to modify and must be `GL_PATCH_VERTICES`. _`value`_ specifies the new value for the parameter specified by _`pname`_.
    * 
    * When _`pname`_ is `GL_PATCH_VERTICES`, _`value`_ specifies the number of vertices that will be used to make up a single patch primitive. Patch primitives are consumed by the tessellation control shader (if present) and subsequently used for tessellation. When primitives are specified using [glDrawArrays][de.dasbabypixel.gamelauncher.gles.es20.glDrawArrays.glDrawArrays] or a similar function, each patch will be made from _`parameter`_ control points, each represented by a vertex taken from the enabeld vertex arrays. _`parameter`_ must be greater than zero, and less than or equal to the value of `GL_MAX_PATCH_VERTICES`.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if _`pname`_ is not an accepted value.
    * 
    * `GL_INVALID_VALUE` is generated if _`pname`_ is `GL_PATCH_VERTICES` and _`value`_ is less than or equal to zero, or greater than the value of `GL_MAX_PATCH_VERTICES`.
    * 
    * Version Support
    * ---------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | `glPatchParameteri` | \- | \- | \- | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glDrawArrays][de.dasbabypixel.gamelauncher.gles.es20.glDrawArrays.glDrawArrays], [glDrawArraysInstanced][de.dasbabypixel.gamelauncher.gles.es30.glDrawArraysInstanced.glDrawArraysInstanced], [glDrawElements][de.dasbabypixel.gamelauncher.gles.es20.glDrawElements.glDrawElements], [glDrawRangeElements][de.dasbabypixel.gamelauncher.gles.es30.glDrawRangeElements.glDrawRangeElements],
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 2010-2015 Khronos Group. This material may be distributed subject to the terms and conditions set forth in the Open Publication License, v 1.0, 8 June 1999. [https://opencontent.org/openpub/](https://opencontent.org/openpub/).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es32.glPatchParameteri.glPatchParameteri
    */
    fun glPatchParameteri(pname: Int, value: Int)
}