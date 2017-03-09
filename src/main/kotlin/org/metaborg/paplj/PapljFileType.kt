package org.metaborg.paplj

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object PapljFileType : LanguageFileType(PapljLanguage) {

    override fun getName(): String {
        return "PAPLJ"
    }

    override fun getDefaultExtension(): String {
        return "pj"
    }

    override fun getDescription(): String {
        return "PAPLJ file"
    }

    override fun getIcon(): Icon? {
        return PapljIcons.FILE
    }

}
