package com.stefansavev.randomprojections.implementation

import com.stefansavev.randomprojections.datarepr.dense.ColumnHeader
import com.stefansavev.randomprojections.interface.Index

class RandomTrees(val signatureVecs: SignatureVectors, val datasetSplitStrategy: DatasetSplitStrategy, val header: ColumnHeader, val invertedIndex: Index, val trees: Array[RandomTree]){
}

object RandomTrees{

}
