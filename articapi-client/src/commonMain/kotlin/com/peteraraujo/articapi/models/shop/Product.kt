package com.peteraraujo.articapi.models.shop

import com.peteraraujo.articapi.models.collections.commons.suggestautocomplete.SuggestAutocomplete
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An item available for purchase in the museum shop.
 *
 * @property id Unique identifier of this resource. Taken from the source system.
 * @property apiModel REST API resource type or endpoint.
 * @property apiLink REST API link for this resource.
 * @property title The name of this resource.
 * @property score Search score.
 * @property externalSku Numeric product identification code of a machine-readable barcode, when the customer sku differs from our internal one.
 * @property imageUrl URL of an image for this product.
 * @property webUrl URL of this product in the shop.
 * @property description Explanation of what this product is.
 * @property priceDisplay Explanation of what this product is.
 * @property minCompareAtPrice Number indicating how much the least expensive variant of a product cost before a sale.
 * @property maxCompareAtPrice Number indicating how much the most expensive variant of a product cost before a sale.
 * @property minCurrentPrice Number indicating how much the least expensive variant of a product costs right now.
 * @property maxCurrentPrice Number indicating how much the most expensive variant of a product costs right now.
 * @property artistIds Unique identifiers of the artists associated with this product.
 * @property artworkIds Unique identifiers of the artworks associated with this product.
 * @property exhibitionIds Unique identifiers of the exhibitions associated with this product.
 * @property suggestAutocompleteBoosted Internal field to power the /autocomplete endpoint. Do not use directly.
 * @property suggestAutocompleteAll Internal field to power the /autosuggest endpoint. Do not use directly.
 * @property sourceUpdatedAt Date and time the resource was updated in the source system.
 * @property updatedAt Date and time the record was updated in the aggregator database.
 * @property timestamp Date and time the record was updated in the aggregator search index.
 */
@Serializable
data class Product(
    @SerialName("id")
    val id: Int? = null,
    @SerialName("api_model")
    val apiModel: String? = null,
    @SerialName("api_link")
    val apiLink: String? = null,
    @SerialName("title")
    val title: String? = null,
    @SerialName("_score")
    val score: Float? = null,
    @SerialName("external_sku")
    val externalSku: Int? = null,
    @SerialName("image_url")
    val imageUrl: String? = null,
    @SerialName("web_url")
    val webUrl: String? = null,
    @SerialName("description")
    val description: String? = null,
    @SerialName("price_display")
    val priceDisplay: String? = null,
    @SerialName("min_compare_at_price")
    val minCompareAtPrice: Float? = null,
    @SerialName("max_compare_at_price")
    val maxCompareAtPrice: Float? = null,
    @SerialName("min_current_price")
    val minCurrentPrice: Float? = null,
    @SerialName("max_current_price")
    val maxCurrentPrice: Float? = null,
    @SerialName("artist_ids")
    val artistIds: List<Int>? = null,
    @SerialName("artwork_ids")
    val artworkIds: List<Int>? = null,
    @SerialName("exhibition_ids")
    val exhibitionIds: List<Int>? = null,
    @SerialName("suggest_autocomplete_boosted")
    val suggestAutocompleteBoosted: String? = null,
    @SerialName("suggest_autocomplete_all")
    val suggestAutocompleteAll: List<SuggestAutocomplete>? = null,
    @SerialName("source_updated_at")
    val sourceUpdatedAt: String? = null,
    @SerialName("updated_at")
    val updatedAt: String? = null,
    @SerialName("timestamp")
    val timestamp: String? = null,
)
