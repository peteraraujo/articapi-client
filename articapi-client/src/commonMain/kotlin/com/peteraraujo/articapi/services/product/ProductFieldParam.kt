package com.peteraraujo.articapi.services.product

import com.peteraraujo.articapi.services.commons.Param

/**
 * Param field options..
 */
enum class ProductFieldParam(override val value: String) : Param {

    /**
     * Unique identifier of this resource. Taken from the source system.
     */
    Id("id"),

    /**
     * REST API resource type or endpoint.
     */
    ApiModel("api_model"),

    /**
     * REST API link for this resource.
     */
    ApiLink("api_link"),

    /** Search score. */
    Score("_score"),

    /**
     * The name of this resource.
     */
    Title("title"),

    /**
     * Numeric product identification code of a machine-readable barcode, when the customer SKU differs from our internal one.
     */
    ExternalSku("external_sku"),

    /**
     * URL of an image for this product.
     */
    ImageUrl("image_url"),

    /**
     * URL of this product in the shop.
     */
    WebUrl("web_url"),

    /**
     * Explanation of what this product is.
     */
    Description("description"),

    /**
     * Explanation of what this product is.
     */
    PriceDisplay("price_display"),

    /**
     * Number indicating how much the least expensive variant of a product cost before a sale.
     */
    MinCompareAtPrice("min_compare_at_price"),

    /**
     * Number indicating how much the most expensive variant of a product cost before a sale.
     */
    MaxCompareAtPrice("max_compare_at_price"),

    /**
     * Number indicating how much the least expensive variant of a product costs right now.
     */
    MinCurrentPrice("min_current_price"),

    /**
     * Number indicating how much the most expensive variant of a product costs right now.
     */
    MaxCurrentPrice("max_current_price"),

    /**
     * Unique identifiers of the artists associated with this product.
     */
    ArtistIds("artist_ids"),

    /**
     * Unique identifiers of the artworks associated with this product.
     */
    ArtworkIds("artwork_ids"),

    /**
     * Unique identifiers of the exhibitions associated with this product.
     */
    ExhibitionIds("exhibition_ids"),

    /**
     * Internal field to power the /autocomplete endpoint. Do not use directly.
     */
    SuggestAutocompleteBoosted("suggest_autocomplete_boosted"),

    /**
     * Internal field to power the /autosuggest endpoint. Do not use directly.
     */
    SuggestAutocompleteAll("suggest_autocomplete_all"),

    /**
     * Date and time the resource was updated in the source system.
     */
    SourceUpdatedAt("source_updated_at"),

    /**
     * Date and time the record was updated in the aggregator database.
     */
    UpdatedAt("updated_at"),

    /**
     * Date and time the record was updated in the aggregator search index.
     */
    Timestamp("timestamp");
}
