package de.dasbabypixel.gamelauncher.gles.es20

interface glLineWidth {
    /**
    * Name
    * ----
    * 
    * glLineWidth — specify the width of rasterized lines
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glLineWidth**(` | GLfloat width`)`; |
    * | --- | --- |
    * 
    * Parameters
    * ----------
    * 
    * _`width`_
    * 
    * Specifies the width of rasterized lines. The initial value is 1.
    * 
    * Description
    * -----------
    * 
    * `glLineWidth` specifies the rasterized width of lines.
    * 
    * The actual width is determined by rounding the supplied width to the nearest integer. (If the rounding results in the value 0, it is as if the line width were 1.) If Δ x \>= Δ y , _i_ pixels are filled in each column that is rasterized, where _i_ is the rounded value of _`width`_. Otherwise, _i_ pixels are filled in each row that is rasterized.
    * 
    * There is a range of supported line widths. Only width 1 is guaranteed to be supported; others depend on the implementation. To query the range of supported widths, call [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_ALIASED_LINE_WIDTH_RANGE`.
    * 
    * Notes
    * -----
    * 
    * The line width specified by `glLineWidth` is always returned when `GL_LINE_WIDTH` is queried. Clamping and rounding have no effect on the specified value.
    * 
    * Line width may be clamped to an implementation-dependent maximum. Call [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with `GL_ALIASED_LINE_WIDTH_RANGE` to determine the maximum width.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_VALUE` is generated if _`width`_ is less than or equal to 0.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_LINE_WIDTH`
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_ALIASED_LINE_WIDTH_RANGE`
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glLineWidth | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glEnable][de.dasbabypixel.gamelauncher.gles.es20.glEnable.glEnable]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glLineWidth.glLineWidth
    */
    fun glLineWidth(width: Float)
}