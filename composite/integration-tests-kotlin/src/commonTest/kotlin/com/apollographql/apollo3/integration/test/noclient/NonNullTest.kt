package com.apollographql.apollo3.integration.test.noclient

import com.apollographql.apollo3.api.fromJson
import com.apollographql.apollo3.api.parseData
import com.apollographql.apollo3.integration.normalizer.NonNullHeroQuery
import com.apollographql.apollo3.integration.normalizer.NullableHeroQuery
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.fail

class NonNullTest {
  private val responseData = """
      {
        "hero": null
      }
    """.trimIndent()

  @Test
  fun failsWithAnnotation() {
    try {
      NonNullHeroQuery().parseData(responseData)
      fail("An exception was expected")
    } catch (e: Exception) {
      // We might want a more personalized message at some point
      check(e.message?.contains("but was NULL at path hero") == true)
    }
  }

  @Test
  fun succeedsWithoutAnnotation() {
    val data = NullableHeroQuery().parseData(responseData)
    assertEquals(null, data.hero)
  }

  @Test
  fun queryDocumentDoesNotContainNonNull() {
    assertFalse(NullableHeroQuery.OPERATION_DOCUMENT.contains("nonnull"))
  }
}