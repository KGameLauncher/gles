package de.dasbabypixel.gamelauncher.gles.es20

interface glClearDepthf {
    /**
    * Name
    * ----
    * 
    * glClearDepthf — specify the clear value for the depth buffer
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glClearDepthf**(` | GLfloat depth`)`; |
    * | --- | --- |
    * 
    * Parameters
    * ----------
    * 
    * _`depth`_
    * 
    * Specifies the depth value used when the depth buffer is cleared. The initial value is 1.
    * 
    * Description
    * -----------
    * 
    * `glClearDepthf` specifies the depth value used by [glClear][de.dasbabypixel.gamelauncher.gles.es20.glClear.glClear] to clear the depth buffer. When clearing a fixed-point depth buffer, values specified by `glClearDepthf` are clamped to the range 0 1 , and converted to fixed-point. No clamping or conversion is applied when clearing a floating-point depth buffer.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_DEPTH_CLEAR_VALUE`
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glClearDepthf | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glClear][de.dasbabypixel.gamelauncher.gles.es20.glClear.glClear]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glClearDepthf.glClearDepthf
    */
    fun glClearDepthf(depth: Float)
}