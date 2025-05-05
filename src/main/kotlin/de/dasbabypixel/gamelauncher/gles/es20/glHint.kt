package de.dasbabypixel.gamelauncher.gles.es20

interface glHint {
    /**
    * Name
    * ----
    * 
    * glHint — specify implementation-specific hints
    * 
    * C Specification
    * ---------------
    * 
    * | `void **glHint**(` | GLenum target, |
    * | --- | --- |
    * |   | GLenum mode`)`; |
    * 
    * Parameters
    * ----------
    * 
    * _`target`_
    * 
    * Specifies a symbolic constant indicating the behavior to be controlled. `GL_FRAGMENT_SHADER_DERIVATIVE_HINT`, and `GL_GENERATE_MIPMAP_HINT` are accepted.
    * 
    * _`mode`_
    * 
    * Specifies a symbolic constant indicating the desired behavior. `GL_FASTEST`, `GL_NICEST`, and `GL_DONT_CARE` are accepted.
    * 
    * Description
    * -----------
    * 
    * Certain aspects of GL behavior, when there is room for interpretation, can be controlled with hints. A hint is specified with two arguments. _`target`_ is a symbolic constant indicating the behavior to be controlled, and _`mode`_ is another symbolic constant indicating the desired behavior. The initial value for each _`target`_ is `GL_DONT_CARE`. _`mode`_ can be one of the following:
    * 
    * `GL_FASTEST`
    * 
    * The most efficient option should be chosen.
    * 
    * `GL_NICEST`
    * 
    * The most correct, or highest quality, option should be chosen.
    * 
    * `GL_DONT_CARE`
    * 
    * No preference.
    * 
    * Though the implementation aspects that can be hinted are well defined, the interpretation of the hints depends on the implementation. The hint aspects that can be specified with _`target`_, along with suggested semantics, are as follows:
    * 
    * `GL_FRAGMENT_SHADER_DERIVATIVE_HINT`
    * 
    * Indicates the accuracy of the derivative calculation for the GL shading language fragment processing built-in functions: `dFdx`, `dFdy`, and `fwidth`.
    * 
    * `GL_GENERATE_MIPMAP_HINT`
    * 
    * Indicates the quality of filtering when generating mipmap images with [glGenerateMipmap][de.dasbabypixel.gamelauncher.gles.es20.glGenerateMipmap.glGenerateMipmap].
    * 
    * Notes
    * -----
    * 
    * The interpretation of hints depends on the implementation. Some implementations ignore `glHint` settings.
    * 
    * Errors
    * ------
    * 
    * `GL_INVALID_ENUM` is generated if either _`target`_ or _`mode`_ is not an accepted value.
    * 
    * API Version Support
    * -------------------
    * 
    * 
    * |  | **OpenGL ES API Version** |  |  |  |
    * | --- | --- | --- | --- | --- |
    * | **Function Name** | **2.0** | **3.0** | **3.1** | **3.2** |
    * | glHint | ✔ | ✔ | ✔ | ✔ |
    * 
    * Copyright
    * ---------
    * 
    * Copyright © 1991-2006 Silicon Graphics, Inc. Copyright © 2010-2015 Khronos Group. This document is licensed under the SGI Free Software B License. For details, see [https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt](https://khronos.org/registry/OpenGL-Refpages/LICENSES/LicenseRef-FreeB.txt).
    * 
    * @see de.dasbabypixel.gamelauncher.gles.es20.glHint.glHint
    */
    fun glHint(target: Int, mode: Int)
}