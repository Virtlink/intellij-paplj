package org.metaborg.paplj

import com.intellij.openapi.project.Project
import com.intellij.psi.PsiFile
import com.virtlink.editorservices.IDocument
import com.virtlink.editorservices.IProject
import org.metaborg.paplj.psi.PapljFile

/**
 * Manages the PAPLJ documents.
 */
object PapljDocumentManager {

    fun toAesiDocument(file: PapljFile): IDocument {
        return AesiDocument(file)
    }

    private data class AesiDocument(val file: PapljFile): IDocument {
        override val path: String
            get() = file.originalFile.virtualFile.path
    }

}