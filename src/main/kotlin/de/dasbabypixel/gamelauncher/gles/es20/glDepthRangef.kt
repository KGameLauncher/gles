package de.dasbabypixel.gamelauncher.gles.es20

interface glDepthRangef {
    /**
    * Name
    * ----
    * 
    * glDepthRangef — specify mapping of depth values from normalized device coordinates to window coordinates
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glDepthRangef**(` | GLfloat n, |
    * | --- | --- |
    * |   | GLfloat f`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`n`_
    * 
    * Specifies the mapping of the near clipping plane to window coordinates. The initial value is 0.
    * 
    * _`f`_
    * 
    * Specifies the mapping of the far clipping plane to window coordinates. The initial value is 1.
    * 
    * Description
    * -----------
    * 
    * After clipping and division by _w_, depth coordinates range from \-1 to 1, corresponding to the near and far clipping planes. `glDepthRangef` specifies a linear mapping of the normalized depth coordinates in this range to window depth coordinates. If a fixed-point depth representation is used, the parameters _`n`_ and _`f`_ are clamped to the range \[0, 1\] when specified.
    * 
    * The setting of (0,1) maps the near plane to 0 and the far plane to 1. With this mapping, the depth buffer range is fully utilized.
    * 
    * Notes
    * -----
    * 
    * It is not necessary that _`n`_ be less than _`f`_. Reverse mappings such as n \= 1 , and f \= 0 are acceptable.
    * 
    * Associated Gets
    * ---------------
    * 
    * [glGet][de.dasbabypixel.gamelauncher.gles.es20.glGetBooleanv.glGetBooleanv] with argument `GL_DEPTH_RANGE`
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glDepthRangef | ✔ | ✔ | ✔ | ✔ |
    * 
    * See Also
    * --------
    * 
    * [glDepthFunc][de.dasbabypixel.gamelauncher.gles.es20.glDepthFunc.glDepthFunc], [glPolygonOffset][de.dasbabypixel.gamelauncher.gles.es20.glPolygonOffset.glPolygonOffset], [glViewport][de.dasbabypixel.gamelauncher.gles.es20.glViewport.glViewport]
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glDepthRangef.glDepthRangef
    */
    fun glDepthRangef(n: Float, f: Float)
}