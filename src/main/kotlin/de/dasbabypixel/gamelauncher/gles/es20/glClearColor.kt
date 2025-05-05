package de.dasbabypixel.gamelauncher.gles.es20

interface glClearColor {
    /**
    * Name
    * ----
    * 
    * glClearColor — specify clear values for the color buffers
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glClearColor**(` | GLfloat red, |
    * | --- | --- |
    * |   | GLfloat green, |
    * |   | GLfloat blue, |
    * |   | GLfloat alpha`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`red`_, _`green`_, _`blue`_, _`alpha`_
    * 
    * Specify the red, green, blue, and alpha values used when the color buffers are cleared. The initial values are all 0.
    * 
    * Description
    * -----------
    * 
    * `glClearColor` specifies the red, green, blue, and alpha values used by [glClear][de.dasbabypixel.gamelauncher.gles.es20.glClear.glClear] to clear fixed- and floating-point color buffers. Unsigned normalized fixed point RGBA color buffers are cleared to color values derived by clamping each component of the clear color to the range 0 1 , then converting the (possibly sRGB converted and/or dithered) color to fixed-point.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_COLOR_CLEAR_VALUE`
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glClearColor | ✔ | ✔ | ✔ | ✔ |
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
    * @see de.dasbabypixel.gamelauncher.gles.es20.glClearColor.glClearColor
    */
    fun glClearColor(red: Float, green: Float, blue: Float, alpha: Float)
}