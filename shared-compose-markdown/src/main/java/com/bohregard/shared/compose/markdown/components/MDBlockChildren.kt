package com.bohregard.shared.compose.markdown.components

import androidx.compose.runtime.Composable
import org.commonmark.ext.gfm.tables.TableBlock
import org.commonmark.node.*

@Composable
internal fun MDBlockChildren(parent: Node) {
    var child = parent.firstChild
    while (child != null) {
        when (child) {
            is Heading -> MDHeading(child)
            is Paragraph -> MDParagraph(child)
            is ThematicBreak -> {
            }
            is BlockQuote -> MDBlockQuote(child)
            is TableBlock -> MDTable(child)
            is Image -> MDImage(child)
            else -> println("Child: $child")
        }
        child = child.next
    }
}