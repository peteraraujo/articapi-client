package com.peteraraujo.articapi.models.collections.artwork

import com.peteraraujo.articapi.models.collections.commons.Color
import com.peteraraujo.articapi.models.collections.commons.suggestautocomplete.SuggestAutocomplete
import com.peteraraujo.articapi.models.staticarchive.Site
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Represents a work of art in the collections.
 *
 * @property id Unique identifier of this resource. Taken from the source system.
 * @property apiModel REST API resource type or endpoint.
 * @property apiLink REST API link for this resource.
 * @property isBoosted Whether this document should be boosted in search.
 * @property title The name of this resource.
 * @property score Search score.
 * @property altTitles Alternate names for this work.
 * @property thumbnail Metadata about the image referenced by image_id.
 * @property mainReferenceNumber Unique identifier assigned to the artwork upon acquisition.
 * @property hasNotBeenViewedMuch Whether the artwork hasn't been visited on our website very much.
 * @property boostRank Manual indication of what rank this artwork should take in search results. Noncontiguous.
 * @property dateStart The year of the period of time associated with the creation of this work.
 * @property dateEnd The year of the period of time associated with the creation of this work.
 * @property dateDisplay Readable, free-text description of the period of time associated with the creation of this work.
 * @property dateQualifierTitle Readable, text qualifier to the dates provided for this record.
 * @property dateQualifierId Unique identifier of the qualifier to the dates provided for this record.
 * @property artistDisplay Readable description of the creator of this work. Includes artist names, nationality, and lifespan dates.
 * @property placeOfOrigin The location where the creation, design, or production of the work took place, or the original location of the work.
 * @property description Description of this artwork.
 * @property shortDescription Short description of this artwork.
 * @property dimensions The size, shape, scale, and dimensions of the work.
 * @property dimensionsDetail The height, width, depth, and/or diameter of each section of the work in centimeters.
 * @property mediumDisplay The substances or materials used in the creation of a work.
 * @property inscriptions A description of distinguishing or identifying physical markings that are on the work.
 * @property creditLine Brief statement indicating how the work came into the collection.
 * @property catalogueDisplay Brief text listing all the catalogues raisonnés which include this work. This isn't an exhaustive list of publications where the work has been mentioned.
 * @property publicationHistory Bibliographic list of all the places this work has been published.
 * @property exhibitionHistory List of all the places this work has been exhibited.
 * @property provenanceText Ownership/collecting history of the work. May include names of owners, dates, and possibly methods of transfer of ownership. Free-form text formatted in a house style.
 * @property edition Statement notifying how the work is protected by copyright. Applies to the work itself, not image or other related assets.
 * @property publishingVerificationLevel Indicator of how much metadata on the work is published. Web Basic is the least amount, Web Everything is the greatest.
 * @property internalDepartmentId An internal department id we use for analytics. Does not correspond to departments on the website.
 * @property fiscalYear The fiscal year in which the work was acquired.
 * @property fiscalYearDeaccession The fiscal year in which the work was deaccessioned.
 * @property isPublicDomain Whether the work is in the public domain, meaning it was created before copyrights existed or has left the copyright term.
 * @property isZoomable Whether images of the work are allowed to be displayed in a zoomable interface.
 * @property maxZoomWindowSize The maximum size of the window the image is allowed to be viewed in, in pixels.
 * @property copyrightNotice Statement notifying how the work is protected by copyright. Applies to the work itself, not image or other related assets.
 * @property hasMultimediaResources Whether this artwork has any associated microsites, digital publications, or documents tagged as multimedia.
 * @property hasEducationalResources Whether this artwork has any documents tagged as educational.
 * @property hasAdvancedImaging Whether this artwork has any advanced imaging techniques applied to it.
 * @property colorfulness Unbounded positive float representing an abstract measure of colorfulness.
 * @property color Dominant color of this artwork in HSL.
 * @property latitude Latitude coordinate of the location of this work in our galleries.
 * @property longitude Longitude coordinate of the location of this work in our galleries.
 * @property latlon Latitude and longitude coordinates of the location of this work in our galleries.
 * @property isOnView Whether the work is on display.
 * @property onLoanDisplay If an artwork is on loan, this contains details about the loan.
 * @property galleryTitle The location of this work in our museum.
 * @property nomismaId Unique identifier in the Nomisma system.
 * @property galleryId Unique identifier of the location of this work in our museum.
 * @property artworkTypeTitle The kind of object or work (e.g. Painting, Sculpture, Book).
 * @property artworkTypeId Unique identifier of the kind of object or work.
 * @property departmentTitle Name of the curatorial department that this work belongs to.
 * @property departmentId Unique identifier of the curatorial department that this work belongs to.
 * @property artistId Unique identifier of the preferred artist/culture associated with this work.
 * @property artistTitle Name of the preferred artist/culture associated with this work.
 * @property altArtistIds Unique identifiers of the non-preferred artists/cultures associated with this work.
 * @property artistIds Unique identifiers of all artist/cultures associated with this work.
 * @property artistTitles Names of all artist/cultures associated with this work.
 * @property categoryIds Unique identifiers of the categories this work is a part of.
 * @property categoryTitles Names of the categories this artwork is a part of.
 * @property termTitles The names of the taxonomy tags for this work.
 * @property styleId Unique identifier of the preferred style term for this work.
 * @property styleTitle The name of the preferred style term for this work.
 * @property altStyleIds Unique identifiers of all non-preferred style terms for this work.
 * @property styleIds Unique identifiers of all style terms for this work.
 * @property styleTitles The names of all style terms related to this artwork.
 * @property classificationId Unique identifier of the preferred classification term for this work.
 * @property classificationTitle The name of the preferred classification term for this work.
 * @property altClassificationIds Unique identifiers of all other non-preferred classification terms for this work.
 * @property classificationIds Unique identifiers of all classification terms for this work.
 * @property classificationTitles The names of all classification terms related to this artwork.
 * @property subjectId Unique identifier of the preferred subject term for this work.
 * @property altSubjectIds Unique identifiers of all other non-preferred subject terms for this work.
 * @property subjectIds Unique identifiers of all subject terms for this work.
 * @property subjectTitles The names of all subject terms related to this artwork.
 * @property materialId Unique identifier of the preferred material term for this work.
 * @property altMaterialIds Unique identifiers of all other non-preferred material terms for this work.
 * @property materialIds Unique identifiers of all material terms for this work.
 * @property materialTitles The names of all material terms related to this artwork.
 * @property techniqueId Unique identifier of the preferred technique term for this work.
 * @property altTechniqueIds Unique identifiers of all other non-preferred technique terms for this work.
 * @property techniqueIds Unique identifiers of all technique terms for this work.
 * @property techniqueTitles The names of all technique terms related to this artwork.
 * @property themeTitles The names of all thematic publish categories related to this artwork.
 * @property imageId Unique identifier of the preferred image to use to represent this work.
 * @property altImageIds Unique identifiers of all non-preferred images of this work.
 * @property documentIds Unique identifiers of assets that serve as documentation for this artwork.
 * @property soundIds Unique identifiers of the audio about this work.
 * @property videoIds Unique identifiers of the videos about this work.
 * @property textIds Unique identifiers of the texts about this work.
 * @property sectionIds Unique identifiers of the digital publication chapters this work is included in.
 * @property sectionTitles Names of the digital publication chapters this work is included in.
 * @property siteIds Unique identifiers of the microsites this work is a part of.
 * @property suggestAutocompleteBoosted Internal field to power the /autocomplete endpoint. Do not use directly.
 * @property suggestAutocompleteAll Internal field to power the /autosuggest endpoint. Do not use directly.
 * @property sourceUpdatedAt Date and time the resource was updated in the source system.
 * @property updatedAt Date and time the record was updated in the aggregator database.
 * @property timestamp Date and time the record was updated in the aggregator search index.
 * @property sites Optional site list that can be added with 'include' param when available.
 * @property artistPivots Optional artist list that can be added with 'include' param when available.
 * @property placePivots Optional place pivots list that can be added with 'include' param when available.
 * @property dates Optional date list that can be added with 'include' param when available.
 */
@Serializable
data class Artwork(

    @SerialName("id")
    val id: Int? = null,

    @SerialName("api_model")
    val apiModel: String? = null,

    @SerialName("api_link")
    val apiLink: String? = null,

    @SerialName("is_boosted")
    val isBoosted: Boolean? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("_score")
    val score: Float? = null,

    @SerialName("alt_titles")
    val altTitles: List<String>? = null,

    @SerialName("thumbnail")
    val thumbnail: Thumbnail? = null,

    @SerialName("main_reference_number")
    val mainReferenceNumber: String? = null,

    @SerialName("has_not_been_viewed_much")
    val hasNotBeenViewedMuch: Boolean? = null,

    @SerialName("boost_rank")
    val boostRank: Int? = null,

    @SerialName("date_start")
    val dateStart: Int? = null,

    @SerialName("date_end")
    val dateEnd: Int? = null,

    @SerialName("date_display")
    val dateDisplay: String? = null,

    @SerialName("date_qualifier_title")
    val dateQualifierTitle: String? = null,

    @SerialName("date_qualifier_id")
    val dateQualifierId: Int? = null,

    @SerialName("artist_display")
    val artistDisplay: String? = null,

    @SerialName("place_of_origin")
    val placeOfOrigin: String? = null,

    @SerialName("description")
    val description: String? = null,

    @SerialName("short_description")
    val shortDescription: String? = null,

    @SerialName("dimensions")
    val dimensions: String? = null,

    @SerialName("dimensions_detail")
    val dimensionsDetail: List<DimensionDetail>? = null,

    @SerialName("medium_display")
    val mediumDisplay: String? = null,

    @SerialName("inscriptions")
    val inscriptions: String? = null,

    @SerialName("credit_line")
    val creditLine: String? = null,

    @SerialName("catalogue_display")
    val catalogueDisplay: String? = null,

    @SerialName("publication_history")
    val publicationHistory: String? = null,

    @SerialName("exhibition_history")
    val exhibitionHistory: String? = null,

    @SerialName("provenance_text")
    val provenanceText: String? = null,

    @SerialName("edition")
    val edition: String? = null,

    @SerialName("publishing_verification_level")
    val publishingVerificationLevel: String? = null,

    @SerialName("internal_department_id")
    val internalDepartmentId: Int? = null,

    @SerialName("fiscal_year")
    val fiscalYear: Int? = null,

    @SerialName("fiscal_year_deaccession")
    val fiscalYearDeaccession: Int? = null,

    @SerialName("is_public_domain")
    val isPublicDomain: Boolean? = null,

    @SerialName("is_zoomable")
    val isZoomable: Boolean? = null,

    @SerialName("max_zoom_window_size")
    val maxZoomWindowSize: Int? = null,

    @SerialName("copyright_notice")
    val copyrightNotice: String? = null,

    @SerialName("has_multimedia_resources")
    val hasMultimediaResources: Boolean? = null,

    @SerialName("has_educational_resources")
    val hasEducationalResources: Boolean? = null,

    @SerialName("has_advanced_imaging")
    val hasAdvancedImaging: Boolean? = null,

    @SerialName("colorfulness")
    val colorfulness: Float? = null,

    @SerialName("color")
    val color: Color? = null,

    @SerialName("latitude")
    val latitude: Float? = null,

    @SerialName("longitude")
    val longitude: Float? = null,

    @SerialName("latlon")
    val latlon: String? = null,

    @SerialName("is_on_view")
    val isOnView: Boolean? = null,

    @SerialName("on_loan_display")
    val onLoanDisplay: String? = null,

    @SerialName("gallery_title")
    val galleryTitle: String? = null,

    @SerialName("nomisma_id")
    val nomismaId: String? = null,

    @SerialName("gallery_id")
    val galleryId: Int? = null,

    @SerialName("artwork_type_title")
    val artworkTypeTitle: String? = null,

    @SerialName("artwork_type_id")
    val artworkTypeId: Int? = null,

    @SerialName("department_title")
    val departmentTitle: String? = null,

    @SerialName("department_id")
    val departmentId: String? = null,

    @SerialName("artist_id")
    val artistId: Int? = null,

    @SerialName("artist_title")
    val artistTitle: String? = null,

    @SerialName("alt_artist_ids")
    val altArtistIds: List<Int>? = null,

    @SerialName("artist_ids")
    val artistIds: List<Int>? = null,

    @SerialName("artist_titles")
    val artistTitles: List<String>? = null,

    @SerialName("category_ids")
    val categoryIds: List<String>? = null,

    @SerialName("category_titles")
    val categoryTitles: List<String>? = null,

    @SerialName("term_titles")
    val termTitles: List<String>? = null,

    @SerialName("style_id")
    val styleId: String? = null,

    @SerialName("style_title")
    val styleTitle: String? = null,

    @SerialName("alt_style_ids")
    val altStyleIds: List<String>? = null,

    @SerialName("style_ids")
    val styleIds: List<String>? = null,

    @SerialName("style_titles")
    val styleTitles: List<String>? = null,

    @SerialName("classification_id")
    val classificationId: String? = null,

    @SerialName("classification_title")
    val classificationTitle: String? = null,

    @SerialName("alt_classification_ids")
    val altClassificationIds: List<String>? = null,

    @SerialName("classification_ids")
    val classificationIds: List<String>? = null,

    @SerialName("classification_titles")
    val classificationTitles: List<String>? = null,

    @SerialName("subject_id")
    val subjectId: String? = null,

    @SerialName("alt_subject_ids")
    val altSubjectIds: List<String>? = null,

    @SerialName("subject_ids")
    val subjectIds: List<String>? = null,

    @SerialName("subject_titles")
    val subjectTitles: List<String>? = null,

    @SerialName("material_id")
    val materialId: String? = null,

    @SerialName("alt_material_ids")
    val altMaterialIds: List<String>? = null,

    @SerialName("material_ids")
    val materialIds: List<String>? = null,

    @SerialName("material_titles")
    val materialTitles: List<String>? = null,

    @SerialName("technique_id")
    val techniqueId: String? = null,

    @SerialName("alt_technique_ids")
    val altTechniqueIds: List<String>? = null,

    @SerialName("technique_ids")
    val techniqueIds: List<String>? = null,

    @SerialName("technique_titles")
    val techniqueTitles: List<String>? = null,

    @SerialName("theme_titles")
    val themeTitles: List<String>? = null,

    @SerialName("image_id")
    val imageId: String? = null,

    @SerialName("alt_image_ids")
    val altImageIds: List<String>? = null,

    @SerialName("document_ids")
    val documentIds: List<String>? = null,

    @SerialName("sound_ids")
    val soundIds: List<String>? = null,

    @SerialName("video_ids")
    val videoIds: List<String>? = null,

    @SerialName("text_ids")
    val textIds: List<String>? = null,

    @SerialName("section_ids")
    val sectionIds: List<Long>? = null,

    @SerialName("section_titles")
    val sectionTitles: List<String>? = null,

    @SerialName("site_ids")
    val siteIds: List<Int>? = null,

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

    @SerialName("sites")
    val sites: List<Site>? = null,

    @SerialName("artist_pivots")
    val artistPivots: List<ArtistPivot>? = null,

    @SerialName("place_pivots")
    val placePivots: List<PlacePivot>? = null,

    @SerialName("dates")
    val dates: List<Date>? = null,
)