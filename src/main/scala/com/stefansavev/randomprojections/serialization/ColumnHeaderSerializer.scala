package com.stefansavev.randomprojections.serialization

import java.io.OutputStream

import com.stefansavev.core.serialization.{NamedSerializer, StreamExtensions, TypedSerializer}
import com.stefansavev.randomprojections.datarepr.dense.{ColumnHeader, ColumnHeaderImpl}

object ColumnHeaderSerialization {

  implicit object ColumnHeaderSerializer extends NamedSerializer[ColumnHeader] {

    import StreamExtensions._

    def toBinary(stream: OutputStream, header: ColumnHeader): Unit = {
      stream.writeInt(header.numCols)
    }

    def fromBinary(stream: java.io.InputStream): ColumnHeader = {
      val numCols = stream.readInt()
      new ColumnHeaderImpl(numCols, null, null, null, false)
    }

  }

}

