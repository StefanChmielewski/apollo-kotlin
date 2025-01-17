import com.apollographql.apollo3.compiler.operationoutput.OperationOutput
import com.apollographql.apollo3.compiler.operationoutput.OperationDescriptor
import com.apollographql.apollo3.compiler.OperationOutputGenerator

plugins {
  alias(libs.plugins.kotlin.jvm)
  alias(libs.plugins.apollo)
}

apollo {
  val customOperationOutputGenerator = object: OperationOutputGenerator {
    override fun generate(operationDescriptorList: Collection<OperationDescriptor>): OperationOutput {
      return operationDescriptorList.map {
        "${it.name}CustomId" to it
      }.toMap()
    }

    override val version = "OperationOutputGenerator-v1"
  }

  packageNamesFromFilePaths()
  operationOutputGenerator.set(customOperationOutputGenerator)
}